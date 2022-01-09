import java.util.List;

public class Logic {
    public static void getBracketStructure(List<String> listOfBracketStructures, int length, int numberOfOpeningBrackets, int numberOfClosingBrackets, String bracketStructure) {

        if (numberOfOpeningBrackets < length / 2) {
            getBracketStructure(listOfBracketStructures, length, numberOfOpeningBrackets + 1, numberOfClosingBrackets, bracketStructure + '(');
        }
        if (numberOfOpeningBrackets > numberOfClosingBrackets) {
            getBracketStructure(listOfBracketStructures, length, numberOfOpeningBrackets, numberOfClosingBrackets + 1, bracketStructure + ')');
        }
        if (numberOfOpeningBrackets + numberOfClosingBrackets == length) {
            listOfBracketStructures.add(bracketStructure);
        }

    }
}