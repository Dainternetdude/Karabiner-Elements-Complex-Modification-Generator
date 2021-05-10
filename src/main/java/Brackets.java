public class Brackets {

    private char openingBracket;
    private char closingBracket;
    public static final String CURLY_BRACES_STRING = "{}";
    public static final String SQUARE_BRACKETS_STRING = "[]";
    public static final String PARENTHESES_STRING = "()";
    public static final String ANGLE_BRACKETS_STRING = "<>";
    public static final Brackets CURLY_BRACES = new Brackets(CURLY_BRACES_STRING);
    public static final Brackets SQUARE_BRACKETS = new Brackets(SQUARE_BRACKETS_STRING);
    public static final Brackets PARENTHESES = new Brackets(PARENTHESES_STRING);
    public static final Brackets ANGLE_BRACKETS = new Brackets(ANGLE_BRACKETS_STRING);

    public Brackets(String bracketsIn) {
        this.setBrackets(bracketsIn);
    }

    public Brackets(char openingBracketIn, char closingBracketIn) {
        this.setBrackets(openingBracketIn, closingBracketIn);
    }

    public char getOpeningBracket() {
        return openingBracket;
    }

    public char getClosingBracket() {
        return closingBracket;
    }

    public void setBrackets(String bracketsIn) {
        if (bracketsIn.length() != 2) {
            throw new RuntimeException("problem: number of brackets provided was not 2");
        }
        this.openingBracket = bracketsIn.charAt(0);
        this.closingBracket = bracketsIn.charAt(1);
    }

    public void setBrackets(char openingBracketIn, char closingBracketIn) {
        this.openingBracket = openingBracketIn;
        this.closingBracket = closingBracketIn;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject.getClass() != this.getClass()) {
            return false;
        }
        Brackets otherBrackets = (Brackets)otherObject;

        if (otherBrackets.getOpeningBracket() == this.getOpeningBracket() && otherBrackets.getClosingBracket() == this.getClosingBracket()) {
            return true;
        }
        return false;
    }

    @Override
    public Brackets clone() {
        return new Brackets(this.getOpeningBracket(), this.getClosingBracket());
    }
}
