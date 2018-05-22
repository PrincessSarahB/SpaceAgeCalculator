import java.util.ArrayList;

public class SpaceAgeCalculator {

    private Person person;
    private Planet planet;

    public SpaceAgeCalculator(Person person, Planet planet) {
        this.person = person;
        this.planet = planet;
    }

    public Person getPerson() {
        return person;
    }

    public Planet getPlanet() {
        return planet;
    }

    public double ageOnPlanet(){
        return this.person.getAge()/this.planet.getEarthYears();
    }
}
