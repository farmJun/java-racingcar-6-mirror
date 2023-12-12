package racingcar.domain;

public class Name {

    private final static int MINIMUM_LENGTH = 1;
    private final static int MAXIMUM_LENGTH = 5;
    private final String name;

    public Name(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > MAXIMUM_LENGTH || name.length() < MINIMUM_LENGTH) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
}
