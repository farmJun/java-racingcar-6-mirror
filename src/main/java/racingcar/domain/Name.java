package racingcar.domain;

public class Name {

    private final String name;

    public Name(String name) {
        validate(name);
        this.name = name;
    }

    private void validate(String name) {
        if (name.length() > 5 || name.length() < 1) {
            throw new IllegalArgumentException();
        }
    }

    public String getName() {
        return name;
    }
}
