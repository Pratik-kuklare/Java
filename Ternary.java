public class Ternary {
    public static void main(String[] args) {
        int a = 10;
        boolean isTrue = (a == 9) ? false : true;

        if(isTrue) {
            System.out.println("This is false"); // this is false because a is not equal to 9
        }

    String makeOfCar = "Tata";
    boolean isDomestic = makeOfCar == "Tata" ? false : true;

    if (isDomestic) {
        System.out.println("This car is domestic to our country");
    }
    String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
    System.out.println(s);
    
   
    int ageOfClient = 20;
    String ageText = ageOfClient >= 18 ? "Over 18" : "Still a Kid";
    System.out.println("Our client is " + ageText);
  }
}
