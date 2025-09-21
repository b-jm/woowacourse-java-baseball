import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;

public class ComputerNumber {

    private final List<Integer> number;

    public ComputerNumber() {
        this.number = computerRandomNum();
    }

    /**
     * 랜덤 숫자 생성
     */
    private List<Integer> computerRandomNum() {
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNum = Randoms.pickNumberInRange(1, 9);
            // 서로 다른 숫자만 추가
            if (!computer.contains(randomNum)) {
                computer.add(randomNum);
            }
        }
        return computer;
    }

    public List<Integer> getNumber() {
        return number;
    }
}
