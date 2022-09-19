package ClassWork.regex3;

import org.junit.jupiter.api.Test;

import java.util.jar.Attributes;

import static org.junit.jupiter.api.Assertions.*;

class StudentGradesTest {

    @Test
    void studentExist(){
        StudentGrades studentOne = new StudentGrades("Mojiza", 90.0);
        studentOne.setName("Mojiza");
        assertEquals("Mojiza",studentOne.getName());

    }
    @Test
    void studentCanFail(){
        StudentGrades studentTwo = new StudentGrades("victor",30.0);
        studentTwo.setAverage(30.0);
        assertEquals("F",studentTwo.getLetterGrades());
    }
    @Test
    void studentCanPass(){
        StudentGrades studentThree = new StudentGrades("Mark", 70.0);
        studentThree.setLetterGrades("C");
        assertEquals("C",studentThree.getLetterGrades());
    }
    @Test
    void fiftyNineIsD(){
        StudentGrades studentFour = new StudentGrades("Ranbo",59.0);
        assertEquals("D",studentFour.getLetterGrades());
    }
    @Test
    void studentCanGetB(){
        StudentGrades studentfive = new StudentGrades("riri",80.0);
        assertEquals("B", studentfive.getLetterGrades());
    }
    @Test
    void studentCanGetA(){
        StudentGrades studentSix = new StudentGrades("Fufu",99);
        assertEquals("A", studentSix.getLetterGrades());
    }

}