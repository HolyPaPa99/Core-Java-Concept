package com.sean.java.concept.reflect;

import com.sean.java.concept.classPractice.Person;

import java.lang.reflect.Constructor;

public class ReflectTest {
    /**
     * use reflect to get constructors
     */
    public static void getConstructor(){
        try {
            Class clazz = Person.class;
            Constructor<Person> constructor1 = clazz.getConstructor();
            Constructor<Person> constructor2 = clazz.getConstructor(String.class, int.class, int.class, int.class, String.class);
            Person person1 = constructor1.newInstance();
            Person person2 = constructor2.newInstance("male",33,162,60,"Sean");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void getFields(){


    }
    public static void getMethod(){

    }
    public static void main(String[] args){
        getConstructor();
    }

}
