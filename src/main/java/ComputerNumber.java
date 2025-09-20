import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNumber {

    private List<Integer> computerNumber;

    public ComputerNumber() {
        this.computerNumber = computerRandomNum();
    }

    /**
     * 랜덤 숫자 생성
     */
    private List<Integer> computerRandomNum() {
        List<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 3) {
            int randomNum = Randoms.pickNumberInRange(1, 9);
            // 서로 다른 숫자만 추가
            if (!numbers.contains(randomNum)) {
                numbers.add(randomNum);
            }
        }
        return numbers;
    }
}
