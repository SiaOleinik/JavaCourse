package day7;


public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public void run(Player player) {
        if (getStamina() == MIN_STAMINA) {
            return;
        }
        stamina--;
        if (getStamina() == MIN_STAMINA) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды не полные, на поле еще есть " + (6 - countPlayers) + " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест.");
        }
    }

}

