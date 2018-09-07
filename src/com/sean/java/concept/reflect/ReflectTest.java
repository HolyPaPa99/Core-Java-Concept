package com.sean.java.concept.reflect;

import com.sean.java.concept.classPractice.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
        try {
            Class clazz = Person.class;
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields){
                System.out.println(field.getName());
            }
            Field nameField = clazz.getDeclaredField("name");
            nameField.setAccessible(true);
            Person person = (Person)clazz.newInstance();
            nameField.set(person,"sean");
            Object name = nameField.get(person);
            System.out.println("name:"+name);

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void getMethod(){
        try {
            Class clazz = Person.class;
            Method[] methods = clazz.getDeclaredMethods();
            for(Method method : methods){
                System.out.println(method.getName());
            }
            Method setName = clazz.getMethod("setName",String.class);
            Person person = (Person)clazz.newInstance();
            setName.invoke(person,"Sean");
            System.out.println("name:"+person.getName());

        }catch(Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args){
        getConstructor();
        getFields();
        getMethod();
    }

}
