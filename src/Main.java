import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Alphabet.txt");
        fileWriter.write("a ");
        fileWriter.write("b ");
        fileWriter.write("c ");
        fileWriter.write("d ");
        fileWriter.write("e ");
        fileWriter.write("f ");
        fileWriter.write("g ");
        fileWriter.write("h ");
        fileWriter.write("i ");
        fileWriter.write("j ");
        fileWriter.write("k ");
        fileWriter.write("l ");
        fileWriter.write("m ");
        fileWriter.write("n ");
        fileWriter.write("o ");
        fileWriter.write("p ");
        fileWriter.write("q ");
        fileWriter.write("r ");
        fileWriter.write("s ");
        fileWriter.write("t ");
        fileWriter.write("u ");
        fileWriter.write("v ");
        fileWriter.write("w ");
        fileWriter.write("x ");
        fileWriter.write("y ");
        fileWriter.write("z ");
        fileWriter.write("0 ");
        fileWriter.write("1 ");
        fileWriter.write("2 ");
        fileWriter.write("3 ");
        fileWriter.write("4 ");
        fileWriter.write("5 ");
        fileWriter.write("6 ");
        fileWriter.write("7 ");
        fileWriter.write("8 ");
        fileWriter.write("9 ");
        fileWriter.close();
        FileReader fileReader = new FileReader("Alphabet.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            System.out.print(scanner.nextLine());
        }
    }
}