public class GameResult {

    private final int strike;
    private final int ball;

    public GameResult(int strike, int ball) {
        this.strike = strike;
        this.ball = ball;
    }

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public boolean isGameEnd() {
        return strike == 3;
    }

    public String getResultMessage() {
        if (strike == 0 && ball == 0) {
            return "낫싱";
        }
        if (strike == 3) {
            return "3스트라이크";
        }

        StringBuilder sb = new StringBuilder();
        if (ball > 0) {
            sb.append(ball).append("볼");
        }
        if (strike > 0 && ball > 0) {
            sb.append(" ");
        }
        if (strike > 0) {
            sb.append(strike);
        }

        return sb.toString();
    }
}
