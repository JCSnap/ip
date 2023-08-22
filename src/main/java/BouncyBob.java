import java.util.Scanner;
public class BouncyBob {
    private static final String TOP_BORDER = "╔══════════════════════════════════════════════╗";
    private static final String MIDDLE_BORDER = "║                                              ║";
    private static final String BOTTOM_BORDER = "╚══════════════════════════════════════════════╝";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] database = new String[100];
        int pointer = 0;
        System.out.println(TOP_BORDER);
        System.out.println(MIDDLE_BORDER);
        System.out.println("║                   Hey there! 🎈              ║");
        System.out.println("║      I'm BouncyBob, your bubbly chatbot!     ║");
        System.out.println("║ Wow you look very round today, like a ball!  ║");
        System.out.println(MIDDLE_BORDER);
        System.out.println(BOTTOM_BORDER);

        while (true) {
            System.out.println("Enter something: ");
            String userInput = scanner.nextLine();
            System.out.println(TOP_BORDER);
            if (userInput.equals("bye")) {
                System.out.println(MIDDLE_BORDER);
                System.out.println("║        BouncyBob: Bye! Bounce back soon!     ║");
                System.out.println(MIDDLE_BORDER);
                System.out.println(BOTTOM_BORDER);
                break;
            } else if (userInput.equals("list")) {
                for (int i = 0; i < pointer; i++) {
                    System.out.println(database[i]);
                }
                System.out.println(BOTTOM_BORDER);
            } else {
                System.out.println("Added to database: " + userInput);
                database[pointer] = userInput;
                pointer++;
                System.out.println(BOTTOM_BORDER);
            }
        }
    }
}
