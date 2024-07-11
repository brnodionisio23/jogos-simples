package application;

public class GameSelector {

    static GameList gameList = new GameList();

    public static void addGameList() {
        gameList.addGame("Par ou impar");
        gameList.addGame("Adivinhe o número");
        gameList.addGame("teste");
        gameList.addGame("teste");
    }

    public static void gameSelector(){
        addGameList();
        gameList.printGames();
    }



}
