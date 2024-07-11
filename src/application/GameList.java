package application;

import java.util.ArrayList;
import java.util.List;

public class GameList {

    private List<String> games;

    public GameList(){
        this.games = new ArrayList<>();
    }

    public void addGame(String nameOfGame) {
        games.add(nameOfGame);
    }

    public void printGames() {
        int n = 0;
        for (String game : games) {
            System.out.println("[" + (n + 1) + "] " + game);
            n++;
        }
    }
}
