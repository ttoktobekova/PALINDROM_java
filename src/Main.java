import java.util.Scanner;

public class Main {
    public static void main(String[] args) {









        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String inputString = scanner.nextLine();
        scanner.close();


        // replaceAll чтобы пк читал большие и маленькие буквы ( ещё [^а-яА-Я]  руские буквы)а toLowerCase() чтобы это печатать
        inputString = inputString.replaceAll("[^а-яА-Я] ", " ").toLowerCase();

        //
        int left = 0; // индекс номер начинается с нуля
        int right = inputString.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                // a man a plan a canal panama
                isPalindrome = false;
                break;
            }
            left++;  // left= left+1
            right--;
        }

        if (isPalindrome) {
            System.out.println("Эта строка - палиндром.");
        } else {
            System.out.println("Эта строка - не палиндром.");
        }
    }
}