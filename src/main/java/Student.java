public class Student {

   private String firstName, lastName;

    private int age;

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


}
