package net.jakim.automation;

import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public class SetEnv
{
    public static Logger log = LoggerFactory.getLogger( SetEnv.class );

    public static void main( String... arg )
    {
        log.info( "Hello from the main setup class" );
        EnvironmentVariables variables = SystemEnvironmentVariables.createEnvironmentVariables();
        variables.setProperty( "sysinfo.set.from.code",
                               "3243" );
        Properties props = System.getProperties();
        props.setProperty( "sysinfo.properties",
                           "432423" );
        System.setProperties( props );

        log.info( "Bye-bye from all setup class" );
    }

}
