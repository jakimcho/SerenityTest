package net.jakim.automation.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class Element
    implements WebElement
{
    protected WebElement element;

    public WebElement getElementWrapper( ){
        return this.element;
    }

    @Override

    public int hashCode( )
    {
        return super.hashCode( );
    }

    @Override
    public String getTagName( )
    {
        return element.getTagName();
    }

    @Override
    public String getAttribute( final String s )
    {
        return null;
    }

    @Override
    public String getText( )
    {
        return null;
    }

    @Override
    public List<WebElement> findElements( final By by )
    {
        return null;
    }

    @Override
    public WebElement findElement( final By by )
    {
        return null;
    }

    @Override
    public boolean isDisplayed( )
    {
        return false;
    }

    @Override
    public Point getLocation( )
    {
        return null;
    }

    @Override
    public Dimension getSize( )
    {
        return null;
    }

    @Override
    public Rectangle getRect( )
    {
        return null;
    }

    @Override
    public String getCssValue( final String s )
    {
        return null;
    }

    @Override
    public <X> X getScreenshotAs( final OutputType<X> outputType )
        throws
        WebDriverException
    {
        return null;
    }
}
