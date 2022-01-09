import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        ArrayList<String> listOfBracketStructures = new ArrayList<>();

        Logic.getBracketStructure(listOfBracketStructures, 2 * n, 0, 0, "");
        System.out.println(listOfBracketStructures);
    }

}