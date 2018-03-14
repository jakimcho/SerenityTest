package net.jakim.automation.pages.elements;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.pagefactory.ElementLocator;

@ImplementedBy( ModalDialogGeneralImpl.class  )
public interface ModalDialogElement
    extends WebElementFacade
{

    WebDriver getWrappedDriver( );
    ElementLocator getLocator( );
}
