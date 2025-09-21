import java.util.List;

public class NumberComparator {

    public static GameResult compare(List<Integer> computerNumber, List<Integer> userNumber) {
        int strike = 0;
        int ball = 0;

        for (int i = 0; i < 3; i++) {
            if (computerNumber.get(i).equals(userNumber.get(i))) {
                strike++;
            } else if (userNumber.contains(computerNumber.get(i))) {
                ball++;
            }
        }

        return new GameResult(strike, ball);
    }
}
