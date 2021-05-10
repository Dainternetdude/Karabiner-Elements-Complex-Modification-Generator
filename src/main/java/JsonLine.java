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

    @Override
    public boolean equals(Object otherObject) {
        if (this.getClass() != otherObject.getClass()) {
            return false;
        }
        JsonLine otherJsonLine = (JsonLine)otherObject;

        if (this.toString().equals(otherJsonLine.toString())) {
            return true;
        }
        return false;
    }
}
