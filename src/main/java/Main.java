import model.Student;

public class Main {

    public static void main(String[] args) {

        Student student=new Student("Ja", "hoffmann", 26);
        Student student2=new Student("Jan", "hoffmann", 26);


        System.out.println(student.equals(student2));




    }
}
