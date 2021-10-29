package com.design_patterns;

public class Singleton {
    private static Singleton obj;

    private Singleton(){
        System.out.println("Ctor");
    }

    //We can use this method without the synchronized keyword (in cases we are using only one thread)
    public static synchronized Singleton getInstance(){
        if(obj==null)
            obj=new Singleton();
        return obj;
    }
}
