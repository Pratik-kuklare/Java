public class main {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here"); // Got here
        }

        if(!gameover) {
            System.out.println("You lose game");
        } else {
            System.out.println("You won game"); // You won game
        }
    }
    
}
