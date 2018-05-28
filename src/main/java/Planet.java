public class Planet {

    private String name;
    private double planetaryYearLength;

    public Planet(String name, double planetaryYearLength) {
        this.name = name;
        this.planetaryYearLength = planetaryYearLength;
    }

    public String getName() {
        return name;
    }

//    seconds in 1 earth year = 31,557,600
    public double getPlanetaryYearLength() {
        return 31557600 * this.planetaryYearLength;
    }
}


