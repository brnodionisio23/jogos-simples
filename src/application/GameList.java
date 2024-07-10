package application;

import java.util.ArrayList;
import java.util.List;

public class GameList {

    static List<String> games = new ArrayList<>();

    public static void addGame() {
        games.add("teste");
        games.add("teste");
        games.add("teste");
        games.add("teste");
        games.add("teste");
        games.add("teste");
        games.add("teste");
        games.add("teste");
    }

    public static void list() {
        addGame();
        int n = 0;
        for (String game : games) {
            System.out.println("[" + (n + 1) + "] " + game);
            n++;
        }
    }
}
