public class Ostrich extends Bird {

    public Ostrich(String species, String author, String area, boolean song, String order) {
        super(species, author, area, song, order);

    }

            private String weight = "heaviest living birds";
            private int toesNumbers = 2;
            private int lifeSpan = 60;


            public void fly(){
                System.out.println("Cannot fly");
            }

            public void run(){
                System.out.println("Run very fast - 70 km/h");
            }

            public void actionOnThreat(){
                System.out.println("Put head into ground");
            }


            public String getWeight() {
                return weight;
            }

            public int getToesNumbers() {
                return toesNumbers;
            }

            public int getLifeSpan() {
                return lifeSpan;
            }


}
