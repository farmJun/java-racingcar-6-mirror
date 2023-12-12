package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Winners {

    private final List<Winner> winners;

    public Winners(List<Winner> winners) {
        this.winners = winners;
    }

    public List<Name> getNames() {
        List<Name> winnersName = new ArrayList<>();
        for (Winner winner : winners) {
            winnersName.add(winner.getWinnerName());
        }
        return winnersName;
    }
}
