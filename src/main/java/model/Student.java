package model;

public class Student {

   private String firstName, lastName;

    private int age;


    //Constructur


    public Student() {
    }

    public Student(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;

    }

    public String getfullName(){
        return firstName + " " + lastName;
    }

    public void setFullName(String name){
        this.firstName=name.split(" ")[0];
        this.lastName=name.split(" ")[1];
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString(){
        return "Firstname: " + getFirstName()  + "Lastname: " + getLastName() + "Age: " + getLastName();
    }

}
