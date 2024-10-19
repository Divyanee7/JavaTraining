package com.yash.collection;

import java.util.HashSet;

class CountrySet
{
    private HashSet<String> H1=new HashSet<>();
    //This is the method which is used to save the country names
    public HashSet<String> saveCountryNames(String CountryName)
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


public class HashSetCountryName {
    public static void main(String[] args) {
        CountrySet countryset=new CountrySet();
        countryset.saveCountryNames("India");
        countryset.saveCountryNames("USA");
        System.out.println(countryset.getCountry("India"));
        System.out.println(countryset.getCountry("U"));
    }
}
