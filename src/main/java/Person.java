public class Person {

    String name;
    int ageInSeconds;

    public Person(String name, int ageInSeconds) {
        this.name = name;
        this.ageInSeconds = ageInSeconds;
    }

    public String getName() {
        return name;
    }

    public int getAgeInSeconds() {
        return ageInSeconds;
    }
}
