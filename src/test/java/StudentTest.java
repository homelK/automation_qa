import org.testng.Assert;
import org.testng.annotations.Test;



public class StudentTest {

    @Test
    public void testStudent() {
        String Testparam1 = "Kost";
        String Testparam2 = "Homel";

        Student studentOne = new Student(Testparam1, Testparam2);
        studentOne.printName();
        int[] a = {1, 3, 4, 4};
        studentOne.grades = a;
        System.out.println(studentOne.grades);
        studentOne.graduate();

        Assert.assertEquals(studentOne.name, "Kost");
    }
}
