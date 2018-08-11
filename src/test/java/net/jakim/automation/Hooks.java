package net.jakim.automation;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

public class Hooks
{
    Log log = new Log4JLogger(  );

    @cucumber.api.java.Before
    public void setup()
    {
        log.info( "Hello From setup method" );
        Serenity.recordReportData()
                .withTitle( "Jakim Custom Content" )
                .andContents( "My custom contnt" );

        EnvironmentVariables ev = SystemEnvironmentVariables.createEnvironmentVariables();
        ev.setProperty( "sysinfo.set.from.hooks",
                        "32" );
    }
}
