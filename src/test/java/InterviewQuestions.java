import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class InterviewQuestions {


    @Test
    public void swapTwoNumbersInArray() {
        int[] masive = {0,4,5,10,20};
        swap(masive, 3, 4);
        System.out.println(Arrays.toString(masive));
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        if (array.length <= (secondIndex) || (firstIndex) >= array.length) {
            System.out.println("Out of boundaries");
        }
        else {
            int temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
        }
    }

    @Test
    public void twoDimensionalArrays() {
        String[][] census = {
                {"Mallard", "Snipe", "Partridge"},
                {"Sparow", "Swan", "Raven"}
        };

        for(String[] eachCensus : census) {
            for(String bird : eachCensus) {
                System.out.println(bird);
            }
        }
        System.out.println(Arrays.deepToString(census));

    }

    @Test
    public void twoDimensionalArraysVerTwo() {
        String[][] census = {
                {"Mallard", "Snipe", "Partridge"},
                {"Sparow", "Swan", "Raven"}
        };

        String birdToFind = "Snipe";

       boolean result = methodForTwoDimArray(census, birdToFind);

        Assert.assertTrue(result);

    }

    private boolean methodForTwoDimArray(String[][] census, String bird) {
        boolean caught = false;

        for(int i = 0; i < census.length; i++) {

            String[] item = census[i];

            for(int e = 0; e < item.length; e++) {
                System.out.println(item[e]);

                if(item[e] == bird) {
                    System.out.println("I've caught it");
                    caught = true;

                }
            }
        }

        return caught;
    }
}
