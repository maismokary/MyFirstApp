import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ما اسمك؟ ");
        String name = scanner.nextLine();
        System.out.println("أهلاً " + name);
        scanner.close();
    }
}