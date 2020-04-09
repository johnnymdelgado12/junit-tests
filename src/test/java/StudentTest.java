import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    Student studentOne = new Student("Johnny");
    Student studentTwo = new Student("Joanna");
    Student studentThree = new Student("Travis");

    @Test
    public void testGetStudentId(){
        assertNotNull(studentOne);
    }

    @Test
    public void testGetName(){
        assertEquals("Johnny", studentOne.getName());
        assertEquals("Joanna", studentTwo.getName());
        assertEquals("Travis", studentThree.getName());
    }

    @Test
    public void testAddStudentGrade(){
        studentOne.addGrade(100);
        assertEquals(1, studentOne.getGrade().size());
    }

    @Test
    public void testAverageStudentGrade(){
        studentOne.addGrade(100);
        studentOne.addGrade(88);
        assertEquals(94, studentOne.getGradeAverage());
    }

}
