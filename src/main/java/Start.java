public class Start {
    public static void main(String[] args) {
        System.out.println("Program has started!");

        JsonBuilder jsonBuilder = new JsonBuilder();
        JsonLine jsonLine = new JsonLine("title", "complexMod1");

        String inner = jsonBuilder.createIndentThing(jsonLine.toString(), "{}");
        String outer = jsonBuilder.createIndentThing(inner, "{}");

        System.out.println(inner);
        System.out.println(outer);
    }
}