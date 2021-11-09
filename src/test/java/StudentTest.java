import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class StudentTest {

    @Test
    public void testStudent() {
        String Testparam1 = "Kost";
        String Testparam2 = "Homel";

        Student studentOne = new Student(Testparam1, Testparam2);

        studentOne.printName();

        int[] a = {1, 3, 4, 4};
        studentOne.grades = a;
        String Studentgrades;
        Studentgrades = Arrays.toString(studentOne.grades);
        System.out.println(Studentgrades);

        studentOne.graduate();

         Assert.assertEquals(studentOne.name, "Kost");
    }
}
