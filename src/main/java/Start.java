public class Start {
    public static void main(String[] args) {
        System.out.println("Program has started!");

        JsonBuilder jsonBuilder = new JsonBuilder();
        JsonLine jsonLine = new JsonLine("title", "complexMod1");

        String inner = jsonBuilder.createIndentThing(jsonLine.toString(), Brackets.CURLY_BRACES);
        String outer = jsonBuilder.createIndentThing(inner, Brackets.CURLY_BRACES);

        System.out.println(inner);
        System.out.println("------");
        System.out.println(outer);
    }
}