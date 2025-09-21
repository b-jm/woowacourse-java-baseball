public class GameResult {

    private final int strike;
    private final int ball;

    public GameResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public boolean isThreeStrikes() {
        return strike == 3;
    }

    public void printResult() {
        if (strike == 0 && ball == 0) {
            System.out.println("낫싱");
        } else if (strike == 3) {
            System.out.println("3스트라이크");
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else {
            System.out.printf("%d볼 %d스트라이크\n", ball, strike);
        }
    }
}
