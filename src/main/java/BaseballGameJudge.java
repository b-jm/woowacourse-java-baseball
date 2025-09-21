import static camp.nextstep.edu.missionutils.Console.readLine;

public class BaseballGameJudge {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private static final String END_MESSAGE = "게임이 종료 되었습니다.";

    public void startGame() {

        boolean GAMEAGAIN = true;

        while (GAMEAGAIN) {
            ComputerNumber computer = new ComputerNumber();
            System.out.println(START_MESSAGE);

            boolean GAMEOVER = false;

            while (!GAMEOVER) {
                try {
                    System.out.print(INPUT_MESSAGE);
                    String input = readLine();
                    UserNumber user = new UserNumber(input);

                    GameResult result = NumberComparator.compare(computer.getNumber(), user.getNumber());

                    result.printResult();

                    if (result.isThreeStrikes()) {
                        GAMEOVER = true;
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.println(RESTART_MESSAGE);
            String restart = readLine();

            if (restart.equals("1")) {
                GAMEAGAIN = true;
            } else if (restart.equals("2")) {
                GAMEAGAIN = false;
                System.out.println(END_MESSAGE);
            }
        }
    }
}
