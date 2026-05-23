public class IfElseIf {
    public static void main(String[] args) {

        int marks = 90;
        boolean passTest = true;
        String grade = "A";

        if(marks < 90 && grade == "B") {
            System.out.println("Your score was less than 90");
        } else if(marks >= 90 && grade == "A") {
            System.out.println("Your score was greater than 90");
        } else {
            System.out.println("Your score is exactly 90");
        }
    }
    
}
