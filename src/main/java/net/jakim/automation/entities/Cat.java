package net.jakim.automation.entities;

public class Cat
{
    private String name;
    private String color;
    private int tailLength;

    public Cat( String name,
                String color,
                int tailLength )
    {
        this.name = name;
        this.color = color;
        this.tailLength = tailLength;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor( String color )
    {
        this.color = color;
    }

    public int getTailLength()
    {
        return tailLength;
    }

    public void setTailLength( int tailLength )
    {
        this.tailLength = tailLength;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append( "Myauuu!!! I'm a cat named: " )
          .append( name )
          .append( " with color " )
          .append( color )
          .append( " and my tail is " )
          .append( tailLength )
          .append( "long" );

        return sb.toString();
    }
}
