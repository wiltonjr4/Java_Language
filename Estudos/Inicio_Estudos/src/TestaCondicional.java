public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("Testing Conditional");
        int age = 16;
        //int amountPeople = 1;
        boolean accompanied = true;

        if (age >= 18 || accompanied){
            System.out.println("Welcome!");
        //} else if (amountPeople >= 2){
        //    System.out.println("You're fewer 18, however are accompanied. Welcome!");
        } else {
            System.out.println("You're fewer 18 and not accompanied. Forbidden Enter!");
        }

    }
}
