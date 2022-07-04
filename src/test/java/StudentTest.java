import model.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void toStringTest(){
        //given
        Student student=new Student("Martin", "Mueller", 35);

        //when
        String actual=student.toString();
        String expected="Firstname: Martin Lastname: Mueller Age: 35";

        //then
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void testEqualsFromStudent(){
        //given
        Student student1=new Student("Jan", "hoffmann", 25);
        Student student2=new Student("Jan", "hoffmann", 25);

        //when
        boolean actual=student1.equals(student2);

        //then
        Assertions.assertEquals(true, actual);
    }

    @Test
    void testEquals(){
        //given
        Student student1=new Student("Jan", "hoffmann", 25);
        Student student2=new Student("Jan", "hoffmann", 25);

        //then
        Assertions.assertEquals(student1, student2);
    }

    @Test
    void testNotEquals(){
        //given
        Student student1=new Student("Jan", "hoffmann", 25);
        Student student2=new Student("Ja", "hoffmann", 25);

        //then
        Assertions.assertNotEquals(student1, student2);
    }
}
