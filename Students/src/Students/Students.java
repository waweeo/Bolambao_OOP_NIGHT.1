package Students;

public class Students {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMinor;

    public Students(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }

    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }

    public String toString() {
        String agegroup = isMinor ? "minor" : "adult";
        return getName() + " - " + age + " - " + agegroup;
    }
}

