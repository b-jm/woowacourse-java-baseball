import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserNumber {

    private final List<Integer> userNumbers;

    public UserNumber(String input) {
        this.userNumbers = validateUserNumber(input);
    }

    /**
     * 사용자 입력 예외처리
     */
    private List<Integer> validateUserNumber(String input) {
        if (input.length() != 3) throw new IllegalArgumentException("3자리 숫자를 입력해주세요.");

        List<Integer> userNumbers = new ArrayList<>();

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) throw new IllegalArgumentException("숫자만 입력해주세요.");

            int number = Character.getNumericValue(c);

            if (number == 0) throw new IllegalArgumentException("0은 사용할 수 없습니다.");

            userNumbers.add(number);
        }

        Set<Integer> userNumberSet = new HashSet<>(userNumbers);
        if (userNumberSet.size() != 3) throw new IllegalArgumentException("서로 다른 3개의 숫자를 입력해주세요.");
        return userNumbers;
    }
}
