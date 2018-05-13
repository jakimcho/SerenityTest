package net.jakim.automation.pages.elements;


import net.serenitybdd.core.annotations.ImplementedBy;
import net.serenitybdd.core.pages.WebElementFacade;

@ImplementedBy (TestMainMenu.class)
public interface TestMainMenuInterface extends WebElementFacade
{
    String getAllMenuItems();
}
