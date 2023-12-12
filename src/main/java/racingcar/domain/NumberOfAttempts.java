package racingcar.domain;

public class NumberOfAttempts {

    private int numberOfAttempts;

    public NumberOfAttempts(int numberOfAttempts) {
        validate(numberOfAttempts);
        this.numberOfAttempts = numberOfAttempts;
    }

    private void validate(int numberOfAttempts) {
        if (numberOfAttempts <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public boolean hasNext() {
        return numberOfAttempts != 0;
    }

    public void finish() {
        numberOfAttempts--;
    }
}
