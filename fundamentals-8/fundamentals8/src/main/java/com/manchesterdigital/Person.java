package com.manchesterdigital;

public abstract class Person {
    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final Address address; //final means final. Even creating a setter causes issues.

    public Person(String firstName, String lastName, Integer age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public abstract void haveLunch(); //abstract method, must be implemented by all subclasses.

    public final String sayHello(){
        return "Hello";
    } //can't make another version of this function. Immutable. Can't be overrided.

    public void printAddress(){
        System.out.println(address.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
