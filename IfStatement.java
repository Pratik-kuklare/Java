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
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if(newValue == 50) { // using = gives error always use == for comparison
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar = true) { // in this case = is working because it is boolean but always use ==
            System.out.println("This is not supposed to happen");
        }

        if(!isCar) {
            System.out.println("This is supposed to happen");
        }
    }
    
}
