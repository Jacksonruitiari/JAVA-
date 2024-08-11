public class MultiplesFinder {
    public static void main(String[] args) {
        // Loop through the range
        for (int i = 71; i <= 150; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 7 == 0) {
                System.out.println(i + " is a multiple of 2, 3, or 7.");
            }
        }
    }
}
