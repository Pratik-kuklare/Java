public class MethodChallenge2 {
     public static int pizzaPrice(String size, boolean extraCheese) {
        int price = 0;
        if(size.equals("small")) {
            price = 5;
        } else if(size.equals("medium")) {
            price = 8;
        } else if(size.equals("large")) {
            price = 12;
        }

        if(extraCheese) {
            price = price + 2;
        } 
            return price;
    }

    public static void main(String[] args) {
        System.out.println("Small no cheese: " + pizzaPrice("small", false));
        System.out.println("medium with cheese: " + pizzaPrice("medium", true));
        System.out.println("Large with cheese: " + pizzaPrice("large", true));
    }
}
