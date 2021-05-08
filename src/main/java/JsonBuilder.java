public class JsonBuilder {

    public JsonBuilder() {
        //create new file
    }

    //change that shit to private
    public String createIndentThing(String whatToPutIn, String brackets) {
        if (brackets.length() != 2) {
            throw new RuntimeException("brackets in wrong format, must be in form: \"{}\"");
        }

        whatToPutIn = whatToPutIn.replace(System.getProperty("line.separator"), "\n\t");
        return "" + brackets.charAt(0)
                + "\n\t" + whatToPutIn
                + "\n" + brackets.charAt(1);
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