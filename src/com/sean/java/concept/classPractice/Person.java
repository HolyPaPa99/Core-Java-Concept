package com.sean.java.concept.classPractice;

/**
 * person class
 */
public class Person {
    /**
     * the gender of this person
     */
    private String gender;
    /**
     * the age of this person
     */
    private int age;
    /**
     * the height of this person
     */
    private int height;
    /**
     * the weight of this person
     */
    private int weight;
    /**
     * the name of this person
     */
    private String name;

    /**
     * constructor
     */
    public Person(){

    }

    /**
     * Constractor
     * @param gender
     * @param age
     * @param height
     * @param weight
     * @param name
     */
    public Person(String gender, int age, int height, int weight, String name){
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.name = name;

    }

    /**
     * person can eat
     */
    public void eat(){
        System.out.println(this.name + "is eating...");

    }

    /**
     * person can sleep
     */
    public void sleep(){
        System.out.println(this.name + "is sleeping...");

    }

//getter and setter

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeigh(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args){
        Person sean = new Person("male",33,162,60,"Sean");
        sean.eat();
        sean.sleep();


        Person jany = new Person("female",24,168,50,"Jany");
        jany.eat();
        jany.sleep();
    }
}
