import java.util.ArrayList;
import java.util.List;

public class UserNumber {

    private final List<Integer> number;

    public UserNumber(String input) {
        this.number = validateUserNumber(input);
    }

    /**
     * 사용자 입력 예외처리
     */
    private List<Integer> validateUserNumber(String input) {
        if (input.length() != 3 || !input.matches("\\d+")) {
            throw new IllegalArgumentException("입력은 1부터 9까지 서로 다른 3자리 숫자여야 합니다.");
        }

        List<Integer> userNum = new ArrayList<>();

        for (char c : input.toCharArray()) {
            int number = Character.getNumericValue(c);

            if (number < 1 || number > 9 || userNum.contains(number)) {
                throw new IllegalArgumentException("0은 사용할 수 없습니다.");
            }

            userNum.add(number);
        }

        return userNum;
    }

    private List<Integer> getUserNumbers() {
        return number;
    }
}
