package com.zipcodewilmington.person;

import com.sun.org.apache.xpath.internal.operations.Bool;
import jdk.internal.org.objectweb.asm.tree.InnerClassNode;

/**
 * Created by leon on 2/12/18.
 */
public class Person {


    private String name;
    private int age;
    private int height;
    private int weight;
    private Boolean hasGlasses;
    private String[] hobbies;
    private String hairColor;

    public Person(String name, int age, int height, int weight,
                  Boolean hasGlasses, String[] hobbies, String hairColor) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hasGlasses = hasGlasses;
        this.hobbies = hobbies;
        this.hairColor = hairColor;
    }


    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
        height = 67;
        weight = 120;
        hasGlasses = true;
        hairColor = "black";
    }

    public Person(int age) {
        this.name = "";
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Boolean getHasGlasses() {
        return hasGlasses;
    }

    public void setHasGlasses(Boolean hasGlasses) {
        this.hasGlasses = hasGlasses;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
