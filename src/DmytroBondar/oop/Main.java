package DmytroBondar.oop;

import java.util.ArrayList;
import java.util.List;

/*
Поля структуры

Фамилия
Амплуа
Возраст
Количество игр
Количество голов

Задача
Определить лучшего форварда, и вывести сведения о футболистах, сыгравших менее 5-ти игр.
*/
public class Main {
    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("LastName1", "forward", 30, 10, 3);
        FootballPlayer player2 = new FootballPlayer("LastName2", "forward", 28, 1, 3);
        FootballPlayer player3 = new FootballPlayer("LastName3", "forward", 33, 7, 10);
        FootballPlayer player4 = new FootballPlayer("LastName4", "forward", 27, 3, 5);
        FootballPlayer player5 = new FootballPlayer("LastName5", "forward", 27, 2, 9);

        FootballPlayer[] players = {player1, player2, player3, player4, player5};

        System.out.println("The best forward:");
        System.out.println(getBestForward(players));
        System.out.println();

        System.out.println("Football players who have played less than 5 games:");
        printPlayersWhereGamesLess5(players);
        System.out.println();

        System.out.println("Football players who have played less than 5 games(the second version):");
        printFootballPlayers(getPlayersWhereGamesLess5(players));
        System.out.println();

        System.out.println("Football players who have played less than 5 games(using Collection Framework):");
        System.out.println(getPlayersWhereGamesLess5UsingCollection(players));
    }

    static FootballPlayer getBestForward(FootballPlayer[] players) {
        FootballPlayer temp = players[0];
        for (int i = 1; i < players.length; i++) {
            if (temp.getGoalsCount() < players[i].getGoalsCount()){
                temp = players[i];
            }
        }
        return temp;
    }

    static void printPlayersWhereGamesLess5(FootballPlayer[] players) {
        for (FootballPlayer player : players) {
            if (player.getGamesCount() < 5) {
                System.out.println(player);
            }
        }
    }

    static FootballPlayer[] getPlayersWhereGamesLess5(FootballPlayer[] players) {
        FootballPlayer[] footballPlayers = new FootballPlayer[players.length];
        int count = 0;
        for (FootballPlayer player : players) {
            if (player.getGamesCount() < 5) {
                footballPlayers[count++] = player;
            }
        }
        return footballPlayers;
    }

    static void printFootballPlayers(FootballPlayer[] players) {
        for (FootballPlayer player : players) {
            if (player != null) {
                System.out.println(player);
            }
        }
    }

    static List<FootballPlayer> getPlayersWhereGamesLess5UsingCollection(FootballPlayer[] players) {
        List<FootballPlayer> footballPlayers = new ArrayList<>();
        for (FootballPlayer player : players) {
            if (player.getGamesCount() < 5) {
                footballPlayers.add(player);
            }
        }
        return footballPlayers;
    }
}