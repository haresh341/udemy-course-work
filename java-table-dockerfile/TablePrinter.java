public class TablePrinter {
    public static void main(String[] args) {
        String input = System.getenv("input");

        if (input == null || input.isEmpty()) {
            System.out.println("No input provided.");
            return;
        }

        int num = Integer.parseInt(input);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

   
}