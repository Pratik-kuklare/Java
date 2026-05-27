public class MethodChallenge1 {

     public static String calculateGrade(String name, int marks) {

        if(marks >= 50) {
            return "Pass";
        }
        return "Fail";
    }
    public static void main(String[] args) {
        System.out.println(calculateGrade("Alex", 40));
        System.out.println(calculateGrade("Pratik", 60));
    } 
 }
