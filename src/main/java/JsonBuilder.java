public class JsonBuilder {

    public JsonBuilder() {
        //create new file
    }

    //change that shit to private
    public String createIndentThing(String whatToPutIn, Brackets brackets) {
        whatToPutIn = whatToPutIn.replace(System.getProperty("line.separator"), "\n\t");
        return "" + brackets.getOpeningBracket()
                + "\n\t" + whatToPutIn
                + "\n" + brackets.getClosingBracket();
    }

    public void indent(String brackets) {
        // create indentation
    }

    public void writeLine(JsonLine jsonLine) {
        this.writeLine(jsonLine.toString());
    }

    public void writeLine(String line) {
        //write line (one tag and one value)
    }
}