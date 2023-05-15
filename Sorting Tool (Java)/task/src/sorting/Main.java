package sorting;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(final String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sorter sorter = new Sorter();
        PrintWriter writer;
        String inputFileName = "";
        String outputFileName = "";

        Set<String> params = new HashSet<>(Arrays.asList(args));
        if (params.contains("-sortingType")) {
            if (params.contains("byCount")) {
                sorter.setSortingType(SortingType.COUNT);
            }
            else if (!params.contains("natural")) {
                System.out.println("No sorting type defined!");
                return;
            }
        }


        if (params.contains("-dataType")) {
            if (params.contains("word")) {
                sorter.setDataType(DataType.WORD);
            }
            else if (params.contains("line")) {
                sorter.setDataType(DataType.LINE);
            }
            else if (!params.contains("long")) {
                System.out.println("No data type defined!");
                return;
            }
        }

        if (params.contains("-inputFile")) {
            inputFileName = args[Arrays.asList(args).indexOf("-inputFile")+1];
            scanner = new Scanner (inputFileName);
        }

        if (params.contains("-outputFile")) {
            outputFileName = args[Arrays.asList(args).indexOf("-inputFile")+1];
        }

        params.removeAll(List.of("-dataType", "word", "line", "long",
                "-sortingType", "byCount", "natural",
                "-inputFile", inputFileName,
                "-outputFile", outputFileName));
        for (String param : params) {
            System.out.println("\"" + param + "\" is not a valid parameter. It will be skipped.");
        }
        sorter.setSortingMethod();
        while (scanner.hasNext()) {
            sorter.proceedInputLine(scanner.nextLine());
        }
        sorter.sort();
        sorter.print(outputFileName);

    }
}