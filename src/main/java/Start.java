public class Start {
    public static void main(String[] args) {
        System.out.println("Program has started!");

        JsonBuilder jsonBuilder = new JsonBuilder("complex-mod-test");
        JsonLine jsonLine = new JsonLine("title", "complexMod1");

        String inner = jsonBuilder.createIndentThing(jsonLine.toString(), Brackets.CURLY_BRACES);
        String outer = jsonBuilder.createIndentThing(inner, Brackets.CURLY_BRACES);

        jsonBuilder.buildLine(outer);

        jsonBuilder.buildLine("");
        jsonBuilder.buildLine("");
        jsonBuilder.openBrackets(Brackets.CURLY_BRACES);
        jsonBuilder.buildLine(jsonLine);
        jsonBuilder.openBrackets(Brackets.SQUARE_BRACKETS);
        jsonBuilder.buildLine(new JsonLine("modification", "ur_mom"));
        jsonBuilder.closeBrackets(Brackets.SQUARE_BRACKETS);
        jsonBuilder.closeBrackets(Brackets.CURLY_BRACES);

        jsonBuilder.writeToFile();
    }
}