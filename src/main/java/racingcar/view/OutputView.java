package racingcar.view;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import racingcar.domain.Name;

public class OutputView {

    private OutputView() {

    }

    public static void printResult() {
        System.out.println("\n실행 결과");
    }

    public static void printCarNamesAndMovingDistances(
        LinkedHashMap<Name, Integer> carNameAndDrivingDistance) {
        for (Entry<Name, Integer> entrySet : carNameAndDrivingDistance.entrySet()) {
            System.out.println(
                entrySet.getKey().getName() + " : " + "-".repeat(entrySet.getValue()));
        }
        System.out.println();
    }

    public static void printWinners(List<Name> winners) {
        String winnerNamesJoinByComma = winners.stream()
            .map(Name::getName)
            .collect(Collectors.joining(", "));

        System.out.print("최종 우승자 : " + winnerNamesJoinByComma);
    }
}
