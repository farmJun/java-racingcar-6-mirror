package racingcar.domain;

public class NumberOfAttempts {

    private static final int ZERO = 0;
    private int numberOfAttempts;

    public NumberOfAttempts(int numberOfAttempts) {
        validate(numberOfAttempts);
        this.numberOfAttempts = numberOfAttempts;
    }

    private void validate(int numberOfAttempts) {
        if (numberOfAttempts <= ZERO) {
            throw new IllegalArgumentException();
        }
    }

    public boolean hasNext() {
        return numberOfAttempts != ZERO;
    }

    public void finish() {
        numberOfAttempts--;
    }
}
