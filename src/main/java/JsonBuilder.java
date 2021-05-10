import java.io.*;

public class JsonBuilder {

    private String jsonContent;
    private String jsonName;
    private int indentLevel = 0;

    public JsonBuilder(String jsonNameIn) {
        this.jsonName = jsonNameIn;
        try {
            File json = new File(jsonName + ".txt");
            if (json.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("There was an issue creating the json file");
            e.printStackTrace();
        }

        jsonContent = "";
    }

    //change that shit to private
    public String createIndentThing(String whatToPutIn, Brackets brackets) {
        whatToPutIn = whatToPutIn.replace(System.getProperty("line.separator"), "\n\t");
        return brackets.getOpeningBracket()
                + "\n\t" + whatToPutIn
                + "\n" + brackets.getClosingBracket();
    }

    public void indent(String brackets) {
        // create indentation
    }

    public void buildLine(JsonLine jsonLine) {
        this.buildLine(jsonLine.toString());
    }

    public void buildLine(String text) {
        jsonContent = jsonContent + "\n";
        for (int i = 0; i < this.indentLevel; i++) {
            jsonContent = jsonContent + "\t";
        }
        jsonContent = jsonContent + text;
    }

    //TODO deprecate that shit
    //better to only open brackets of the right style, by inference
    public void openBrackets(Brackets brackets) {
        this.buildLine(String.valueOf(brackets.getOpeningBracket()));
        this.indentLevel++;
    }

    //closebrackets could keep track of which brackets are open in an array and infer which type to close
    public void closeBrackets(Brackets brackets) {
        this.indentLevel--;
        this.buildLine(String.valueOf(brackets.getClosingBracket()));
    }

    public void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter(jsonName + ".txt");
            myWriter.write(jsonContent);
            myWriter.close();
            System.out.println("Wrote file.");
        } catch (IOException e) {
            System.out.println("problem: unable to write file due to");
            e.printStackTrace();
        }
    }
}