package exam03;

public class NumberFormat {

    public static void main(String[] args) {
        String age1 = "23";
        String age2 = "abc";

        int ageValue1 = Integer.parseInt(age1);
        int ageValue2 = Integer.parseInt(age2);

        System.out.println("Your age1: " + ageValue1);
        System.out.println("Your age2: " + ageValue2);
    }
}
