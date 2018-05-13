package net.jakim.automation.util;

import net.jakim.automation.pages.JackLandingPage;
import net.jakim.automation.pages.objects.AllProductsPage;
import net.jakim.automation.pages.objects.GeneraPage;
import net.jakim.automation.pages.objects.HomePage;
import net.jakim.automation.pages.objects.ProductCategoryPage;

public enum Pages {
    HOME("Home", new HomePage()),
    ALL_PRODUCTS("All Products", new AllProductsPage()),
    PRODUCT_CATEGORY("Product Category", new ProductCategoryPage());

    private String pageName;
    private GeneraPage page;

    private Pages(String pageName, GeneraPage page){
        this.pageName = pageName;
        this.page = page;
    }

    public GeneraPage getPage(){
        return this.page;
    }

    public static GeneraPage resolvePage(String pageName){
        return Pages.valueOf(pageName).getPage();
    }

}
