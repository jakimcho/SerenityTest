package net.jakim.automation.pages.objects;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductCategoryPage extends GeneraPage{

    @FindBy(css = "#default_products_page_container .productcol")
    List<WebElement> itemsList;

    public void addItemToCart(String itemName) {
        WebElement targetElement = null;

        for (WebElement item : itemsList){
            System.out.println("Link has text " + item.getText());
            if (item.getText().toLowerCase().trim().contains(itemName.toLowerCase().trim())){
                targetElement = item;
                break;
            }
        }

        if(null == targetElement){
            throw new ElementNotFoundException(itemName, "", "");
        }else{
            targetElement.findElement(By.cssSelector("input[value='Add To Cart']")).click();
        }
    }
}
