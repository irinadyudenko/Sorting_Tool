package sorting;

import java.io.PrintWriter;

public class Sorter {
    private SortingType sortingType;
    private DataType dataType;
    private Sorting sortingMethod;

    public Sorter() {
        this.sortingType = SortingType.NATURAL;
        this.dataType = DataType.LONG;
    }


    public void setSortingType(SortingType sortingType) {
        this.sortingType = sortingType;
    }
    public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

    public void setSortingMethod() {
        switch (this.sortingType) {
            case NATURAL -> {
                switch (this.dataType) {
                    case LINE -> sortingMethod = new SortingNaturalStringLines();
                    case WORD -> sortingMethod = new SortingNaturalStringWords();
                    case LONG -> sortingMethod = new SortingNaturalLong();
                }
            }
            case COUNT -> sortingMethod = this.dataType.equals(DataType.LONG) ?
                    new SortingCountedLongs()
                    : (this.dataType.equals(DataType.LINE) ?
                    new SortingCountedLines()
                    : new SortingCountedWords());
        }
    }

    public void sort() {
        this.sortingMethod.sort();
    }

    public void proceedInputLine(String line) {
        switch (dataType) {
            case LONG -> {
                long number;
                String[] numberStrings = line.split(" ");
                for (String numberString : numberStrings) {
                    if (!numberString.equals("")) {
                        try {
                            number = Long.parseLong(numberString);
                        }
                        catch (Exception e) {
                            System.out.println("\"" + numberString + "\" is not a long. It will be skipped.");
                            continue;
                        }
                        this.sortingMethod.addElement(number);
                    }
                }
            }
            case WORD -> {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (!word.equals((""))) {
                        this.sortingMethod.addElement(word);
                    }
                }
            }
            case LINE -> this.sortingMethod.addElement(line);
        }
    }

    public void print(String outputFileName) {
        if (!outputFileName.equals("")) {
            try {
                try (PrintWriter writer = new PrintWriter(outputFileName)) {
                    writer.print(this.sortingMethod);
                }
            } catch (Exception e) {
                System.out.println("Can't write to the file!");
            }
        }
        System.out.println(this.sortingMethod);
    }

}
