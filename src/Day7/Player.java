package Day7;

public class Player {

    private int stamina;
    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }}


        public int getStamina () {
            return stamina;
        }

        public static int getCountPlayers () {
            return countPlayers;
        }

        public void run () {
            if (stamina == 0)
                return;

        System.out.println("Player is running");
        stamina--;
        System.out.println("Выносливость= " + stamina);
        if (stamina == 0) {
            countPlayers--;
            System.out.println("Player is go out");
        }}

    public static void info() {
        if (countPlayers < 6 && countPlayers == 5) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
        } else if (countPlayers < 6 && countPlayers == 4) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
        } else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        }
        }
    }
