package cn.bean.impl;


import cn.bean.Animal;
import cn.bean.People;
import org.springframework.stereotype.Component;

@Component(value = "peopleimpl")
public class PeopleImp implements People {

    private String name;
    private int age;
    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PeopleImp(){

    }
    public PeopleImp(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void speak1() {
        System.out.println("1" + name + age);
        animal.run();
    }
}
