import org.testng.Assert;
import org.testng.annotations.Test;

public class BirdsTest {

    @Test
    public void testBird() {

        String birdName = "Troglodytes troglodytes";
        String authorOfBirdName = "Linnaeus";
        String orderOfbird = "Passeriformes";
        String areaOfBird = "Palearctic";
        boolean isBirdSing = true;

        Bird eurasianWren = new Bird(birdName, authorOfBirdName, areaOfBird, isBirdSing, orderOfbird);

        eurasianWren.swim();
        eurasianWren.sing();
        eurasianWren.fly();

        String areaOfEurasianWren = eurasianWren.getArea();
        System.out.println(areaOfEurasianWren);

        Assert.assertEquals(eurasianWren.getSpecies(), "Troglodytes troglodytes");
        Assert.assertTrue(eurasianWren.isSong());
        Assert.assertFalse(eurasianWren.getSpecies() == "Raven");

    }
}
