import org.testng.annotations.Test;

public class SecondExample {

    @Test
    public void testName() {
        int varOne = 1;
        int varTwo = 2;

        printNumberTest(varOne, varTwo);

    }

    public void printNumberTest(int firstParam, int secondParam) {
        System.out.println(firstParam + " " + secondParam);
    }

    @Test
    public void test001() {
        boolean b = false;
        b = true;

        boolean tobe = false;
        b = tobe;

        if (b) {
            System.out.println(tobe);
        }
        else {
            System.out.println("not to be");
        }

     }

     public boolean isTestTrue(int currentTime, int timeSinceResting) {
        boolean result = false;

        result = (currentTime - timeSinceResting) > 1000;

        return result;
     }

     @Test
     public void test002() {
        int a = 2;
        int b = 3;

        boolean c = a == b;
         System.out.println(c);
     }

}
