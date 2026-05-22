public class IfStatement {
    public static void main(String[] args) {

        boolean isRaining = false;
        if(isRaining == false) {
            System.out.println("Today is not Raining.");
            System.out.println("I don't have umbrella with me");
        }

        int topScore = 90;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 80;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
    
}
