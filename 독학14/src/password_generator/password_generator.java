package password_generator;

public class password_generator {

	public static String generatePassword(int length) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = upper.toLowerCase();
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_=+[]{};:,.<>?";
        String allChars = upper + lower + digits + symbols;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        return password.toString();
    }

    // 메인 함수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Random Password Generator ===");
        System.out.print("Enter password length (default 12): ");

        String input = sc.nextLine();
        int length = 12;

        if (!input.isEmpty()) {
            try {
                length = Integer.parseInt(input);
                if (length < 4) {
                    System.out.println("Password too short! Minimum length is 4.");
                    sc.close();
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                sc.close();
                return;
            }
        }

        String password = generatePassword(length);
        System.out.println("\nYour random password is:\n👉 " + password);

        sc.close();
    }
}
