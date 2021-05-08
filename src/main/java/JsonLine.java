public class JsonLine {
    private String name;
    private String value;

    public JsonLine(String nameIn, String valueIn) {
        name = nameIn;
        value = valueIn;
    }

    @Override
    public String toString() {
        return "\"" + name + "\": \"" + value + "\"";
    }
}
