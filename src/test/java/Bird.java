public class Bird {

   private String species;
    private String author;
    private String area;
    private String order;
    private boolean song;

    public Bird(String species, String author, String area, boolean song, String order) {
        this.species = species;
        this.author = author;
        this.area = area;
        this.song = song;
        this.order = order;
    }

    public void fly(){
        System.out.println(species + " " + "flies");
    }

    public void swim() {
        if(order == "Anseriformes") {
            System.out.println("Bird is swimming");
        }
        else {
            System.out.println("Bird cannot swim");
        }

    }

    public void sing(){
        if(song) {
            System.out.println("(:)< ***");
        }
        else {
            System.out.println("(:)>");
        }

    }

    public String getArea() {
        return area;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isSong() {
        return song;
    }
}
