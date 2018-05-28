import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpaceAgeCalculatorTest {


    Person person;
    Planet mercury;
    Planet venus;
    Planet mars;
    Planet jupiter;
    Planet saturn;
    Planet neptune;
    Planet uranus;
    Planet pluto;
    SpaceAgeCalculator spaceAgeCalculator;

    @Before
    public void setUp() {
        person = new Person("Sarah", 1000000000);
        mercury = new Planet("Mercury", 0.2408467);
        venus = new Planet("Venus", 0.61519726 );
        mars = new Planet("Mars", 1.8808158);
        jupiter = new Planet("Jupiter", 11.862615);
        saturn = new Planet("Saturn", 29.447498);
        uranus = new Planet("Uranus", 84.016846);
        neptune = new Planet("Neptune", 164.79132);
        pluto = new Planet("Pluto", 248.00);

    }

    @Test
    public void hasPerson(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, pluto);
        assertEquals(person, spaceAgeCalculator.getPerson());
    }

    @Test
    public void ageOnMercury() {
        spaceAgeCalculator = new SpaceAgeCalculator(person, mercury);
        assertEquals(131.56, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnVenus(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, venus);
        assertEquals(565, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnMars(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, mars);
        assertEquals(15.95, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnJupiter(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, jupiter);
        assertEquals(2.52, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnSaturn(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, saturn);
        assertEquals(1, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnUranus(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, uranus);
        assertEquals(0.35, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnNeptune(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, neptune);
        assertEquals(0.18, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

    @Test
    public void ageOnPluto(){
        spaceAgeCalculator = new SpaceAgeCalculator(person, pluto);
        assertEquals(0.12, spaceAgeCalculator.ageOnPlanet(), 0.1);
    }

}
