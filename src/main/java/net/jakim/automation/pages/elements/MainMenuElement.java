package net.jakim.automation.pages.elements;

import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy ( MainMenuElementImpl.class )
public interface MainMenuElement
    extends WebElementFacade
{
    String getAllMenuItems( );
}
