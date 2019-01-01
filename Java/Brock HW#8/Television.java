/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.problems;

/**
 *
 * @author kingm
 */

import java.text.DecimalFormat;

public class Television
{
    private String brand;
    private double price;
    
    public Television( )
    {
        brand = "unknown";
    }
    
    public Television( String startBrand ,
                        double startPrice)
    {
        brand = startBrand;
        setPrice( startPrice );
    }
    
    public String getBrand( )
    {
        return brand;
    }
    
    public double getPrice( )
    {
        return price;
    }
    
    public void setBrand( String newBrand)
    {
        brand = newBrand;
    }
    
    public void setPrice( double newPrice)
    {
        if( newPrice >= 0.0)
            price = newPrice;
        else
        {
            System.err.println("Price cannot be negative.");
            System.err.println("Value not changed.");
        }
    }
    
    public String toString( )
    {
        DecimalFormat priceFormat = new DecimalFormat( "#0.0");
        return "Brand: " + brand 
                + "; price: "
                + priceFormat.format( price );
    }
    
    public boolean equals( Object o)
    {
        if( ! ( o instanceof Television ) )
            return false;
        else
        {
            Television objTelevision = ( Television ) o;
            if ( brand.equals(objTelevision.brand) && Math.abs(price - objTelevision.price < 0.0001))
                return true;
            else
                return false;
        }
    }
}

