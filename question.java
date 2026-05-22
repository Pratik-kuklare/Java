public class question {
    public static void main(String[] args) {
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myTotalValue = (myFirstValue + mySecondValue) * 100;
        System.out.println(myTotalValue);

        double myRemainder = myTotalValue % 40.00d;
        System.out.println(myRemainder);

        boolean myValue = myRemainder == 0.00 ? true : false;
        System.out.println(myValue);

        if(!myValue) {
            System.out.println("Got some remainder");
        }
    }
    
}
