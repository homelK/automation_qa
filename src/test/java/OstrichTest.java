import org.testng.annotations.Test;

public class OstrichTest {

    @Test
    public void testOstrih() {

        Ostrich africanOstrich = new Ostrich("Struthio camelus", "Linnaeus", "Africa", false, "Struthioniformes");

        africanOstrich.actionOnThreat();
        africanOstrich.fly();
        int lifeSpan = africanOstrich.getLifeSpan();
        String weight= africanOstrich.getWeight();
        String area = africanOstrich.getArea();
        africanOstrich.run();
        String species = africanOstrich.getSpecies();

        System.out.println(species);
        System.out.println(lifeSpan);
        System.out.println(weight);
        System.out.println(area);

    }
}
