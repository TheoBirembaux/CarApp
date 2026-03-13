public class Driver {
    private final String name;

    public String getName() {
        return this.name;
    }

    private final int age;
    private static final int LEGAL_AGE = 10;

    public Driver(final String name, final int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return LEGAL_AGE <= this.age;
    }
}

