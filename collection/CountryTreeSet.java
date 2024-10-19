package com.yash.collection;

import java.util.HashSet;
import java.util.TreeSet;

class CountryTree
{
    private TreeSet<String> H1=new TreeSet<>();
    //This is the method which is used to save the country names
    public TreeSet<String> saveCountryNames(String CountryName)
    {
        H1.add(CountryName);
        return H1;
    }
    public String getCountry(String countryName)
    {
        for(String country:H1)
        {
            if(country.equalsIgnoreCase(countryName))
            {
                return country;
            }

        }
        return null;
    }

}

public class CountryTreeSet {

    public static void main(String args[])
    {
        CountryTree country=new CountryTree();
        country.saveCountryNames("USA");
        country.saveCountryNames("Ind");
        System.out.println(country.getCountry("USA"));
        System.out.println(country.getCountry("India"));
    }
}
