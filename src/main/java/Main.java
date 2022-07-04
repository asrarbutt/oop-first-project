public class Main {

    public static void main(String[] args) {

        Student student=new Student();

        student.setFirstName("Jan");
        student.setLastName("Mueller");
        student.setAge(35);

        System.out.println(student.getFirstName() + " " + student.getLastName() + " "+ student.getAge());



    }
}
