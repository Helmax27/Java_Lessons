package Lesson11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Human human = new Human();
        Computer computer = new Computer("PC");
        Game game = new Game(human, computer);
        game.play();

    }
}

abstract class Player {
    String name;
    String move;
    int points;

    public String getName() {
        return name;
    }

    public String getMove() {
        return move;
    }

    public abstract void addPoint();

    public int getPoints() {
        return points;
    }

}

class Human extends Player {
    private String name;
    private String move;
    private int points;

    public Human() {
        this.points = 0;
    }


    public String getName() {
        System.out.println("Введите имя игрока");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        this.name = name;
        return name;
    }

    @Override
    public String getMove() {
        System.out.println("Введите действие: Камень, Ножницы, Бумага");
        Scanner sc = new Scanner(System.in);
        String move = sc.nextLine();
        this.move = move;
        return move;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void addPoint() {
        points++;
    }
}

class Computer extends Player {
    private String name;
    private String move;
    private int points;

    public Computer(String name) {
        this.name = name;
        this.points = 0;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getMove() {
        String moves[] = new String[]{"Камень", "Ножницы", "Бумага"};
        int a = (int) Math.random() * 3;
        this.move = moves[a];
        return move;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void addPoint() {
        points++;
    }
}

class Game {
    private Player player1;
    private Player player2;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        String p1 = player1.getName();
        String p2 = player2.getName();
        while (true) {
            String mv1 = player1.getMove().toLowerCase();
            String mv2 = player2.getMove().toLowerCase();
            if (mv1.equals("камень") && mv2.equals("ножницы")) {
                player1.addPoint();
                System.out.println("Победил игрок с именем: " + p1);
                System.out.println("Количество очков у " + p1 + " игрока " + player1.getPoints() + " " + p2 + " игрока " + player2.getPoints());
            } else if (mv1.equals("ножницы") && mv2.equals("бумага")) {
                player1.addPoint();
                System.out.println("Победил игрок с именем: " + p1);
                System.out.println("Количество очков у " + p1 + " игрока " + player1.getPoints() + " " + p2 + " игрока " + player2.getPoints());
            } else if (mv1.equals("ножницы") && mv2.equals("камень")) {
                player2.addPoint();
                System.out.println("Победил игрок с именем: " + p2);
                System.out.println("Количество очков у " + p2 + " игрока " + player2.getPoints() + " " + p1 + " игрока " + player1.getPoints());
            } else if (mv2.equals("ножницы") && mv1.equals("бумага")) {
                player2.addPoint();
                System.out.println("Победил игрок с именем: " + p2);
                System.out.println("Количество очков у " + p2 + " игрока " + player2.getPoints() + " " + p1 + " игрока " + player1.getPoints());
            } else if (mv1.equals(mv2)) {
                System.out.println("Ничья\n" + "Количество очков у " + p2 + " игрока " + player2.getPoints() + " " + p1 + " игрока " + player1.getPoints());
            } else if (mv1.equals("камень") && mv2.equals("бумага")) {
                player2.addPoint();
                System.out.println("Победил игрок с именем: " + p2);
                System.out.println("Количество очков у " + p2 + " игрока " + player2.getPoints() + " " + p1 + " игрока " + player1.getPoints());
            } else if (mv2.equals("камень") && mv1.equals("бумага")) {
                player2.addPoint();
                System.out.println("Победил игрок с именем: " + p2);
                System.out.println("Количество очков у " + p2 + " игрока " + player2.getPoints() + " " + p1 + " игрока " + player1.getPoints());
            }
            System.out.println("Продолжаем игру? \n да / нет ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if (!answer.toLowerCase().equals("да")) {
                break;
            }
        }

    }
}
