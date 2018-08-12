package net.jakim.automation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import net.jakim.automation.util.DeployedMicroserviceProject;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import static net.serenitybdd.rest.SerenityRest.given;

public class SetEnv
{
    public static Logger log = LoggerFactory.getLogger( SetEnv.class );

    public static void main( String... arg )
    {
        log.info( "Hello from the main setup class" );
        Properties props = System.getProperties();

        System.setProperties( props );


        List<DeployedMicroserviceProject> microservices = getMicroservicesFromOctopus();
        updateMicroservicesReleaseVersions( microservices );

        for ( DeployedMicroserviceProject microservice : microservices )
        {
            props.setProperty( "sysinfo." + microservice.getName()
                                                        .toLowerCase()
                                                        .replace( " ",
                                                                  "." ),
                               microservice.getVersion() );
        }

        System.setProperties( props );

        log.info( "Bye-bye from all setup class" );
    }

    private static List<DeployedMicroserviceProject> getMicroservicesFromOctopus()
    {
        List<DeployedMicroserviceProject> result = new ArrayList<>();
        Response response = given()
                .contentType( ContentType.JSON )
                .header( "X-Octopus-ApiKey",
                         "API-KSVAMT5PBYIW6UQPEVDCAGVE" )
                .when()
                .get( "https://deploy.gemseek.com/api/projectgroups/ProjectGroups-41/projects" );
        try
        {
            JsonNode node = ( new ObjectMapper() ).readTree( response.getBody()
                                                                     .print() );
            JsonNode currentNode;
            Iterator<JsonNode> nodes = node.get( "Items" )
                                           .iterator();
            while ( nodes.hasNext() )
            {
                currentNode = nodes.next();

                DeployedMicroserviceProject microserviceProject = new DeployedMicroserviceProject();
                microserviceProject.setId( currentNode.get( "Id" )
                                                      .asText() );
                microserviceProject.setName( currentNode.get( "Name" )
                                                        .asText() );
                microserviceProject.setSlug( currentNode.get( "Slug" )
                                                        .asText() );

                result.add( microserviceProject );
            }
        } catch ( IOException e )
        {
            e.printStackTrace();
        }


        return result;
    }

    private static void updateMicroservicesReleaseVersions( List<DeployedMicroserviceProject> microserviceProjects )
    {

        for ( DeployedMicroserviceProject microserviceProject : microserviceProjects )
        {
            Response response = given()
                    .queryParam( "take",
                                 "1" )
                    .pathParam( "project-id",
                                microserviceProject.getId() )
                    .contentType( ContentType.JSON )
                    .header( "X-Octopus-ApiKey",
                             "API-KSVAMT5PBYIW6UQPEVDCAGVE" )
                    .when()
                    .get( "https://deploy.gemseek.com/api/projects/{project-id}/releases" );

            try
            {
                JsonNode node = ( new ObjectMapper() ).readTree( response.getBody()
                                                                         .print() );
                String version = node.get( "Items" )
                                     .get( 0 )
                                     .get( "Version" )
                                     .asText();
                microserviceProject.setVersion( version );
            } catch ( IOException e )
            {
                e.printStackTrace();
            }


        }

    }

}
