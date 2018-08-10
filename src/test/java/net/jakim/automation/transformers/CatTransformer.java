package net.jakim.automation.transformers;

import cucumber.api.TypeRegistry;
import cucumber.api.TypeRegistryConfigurer;
import io.cucumber.datatable.DataTableType;
import net.jakim.automation.entities.Cat;

import java.util.Locale;
import java.util.Map;

public class CatTransformer
        implements TypeRegistryConfigurer
{
    @Override
    public Locale locale()
    {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry( TypeRegistry typeRegistry )
    {
        typeRegistry.defineDataTableType( new DataTableType( Cat.class,
                                                             ( Map<String, String> row )->
                                                             {
                                                                 String name  = row.get( "name" );
                                                                 String color = row.get( "color" );
                                                                 Integer tailLength
                                                                         = Integer.parseInt( row.get( "tailLength" ) );

                                                                 return new Cat( name,
                                                                                 color,
                                                                                 tailLength );
                                                             } )
                                        );

    }
}
