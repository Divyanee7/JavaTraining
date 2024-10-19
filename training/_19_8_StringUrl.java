package com.yash.training;
class StringUtil
{
    public String getCommand(String url)
    {
        if(url==null || !url.contains("/"))
        {
            return null;
        }
        String[] urlParts=url.split("/"); //urlParts=[www.sample.com, admin, createProject.html]

        String lastPart=urlParts[urlParts.length-1];  //lastPart=createProject.html

        if(lastPart.endsWith(".html"))
        {
            return lastPart.substring(0,lastPart.length()-5); //It will remove the .html part
        }
        return  null;
    }
}

public class _19_8_StringUrl {
    public static void main(String[] args) {
       StringUtil util=new StringUtil();
       String url="www.sample.com/admin/createProject.html";
       String webSite=util.getCommand(url);
        System.out.println(webSite);
    }
}
