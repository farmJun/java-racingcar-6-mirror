package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Engine {

    private static final int ZERO = 0;
    private static final int NINE = 9;

    public static int on() {
        return Randoms.pickNumberInRange(ZERO, NINE);
    }
}
