package token;

public enum TokenType {
    ILLEGAL("ILLEGAL"),
    EOF("EOF"),
    IDENT("IDENT"),
    INTEGER("INTEGER"),
    FLOATINGPOINT("FLOATINGPOINT"),
    TRUE("TRUE"),
    FALSE("FALSE"),
    CHARACTER("CHARACTER"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    MODULO("%"),
    GREAT(">"),
    LESS("<"),
    GREATEQ(">="),
    ASSIGN("="),
    LPARA("("),
    RPARA(")"),
    PLUS("+"),
    LESSEQ("<="),
    EQUAL("=="),
    NOTEQUAL("<>"),
    ESCAPE("["),
    START("BEGIN"),
    END("END"),
    INT("INT"),
    CHAR("CHAR"),
    BOOL("BOOL"),
    FLOAT("FLOAT"),
    DISPLAY("DISPLAY"),
    COLON(":"),
    LBRACE("{"),
    RBRACE("}"),
    COMMA(","),
    EOL("$"),
    INDEXOPEN("|"),
    INDEXCLOSE("\\"),
    CONCAT("&"),
    SCAN("SCAN"),

    STRING("STRING"),
    WHILE("WHILE"),
    RETURN("RETURN"),
    HASH("HASH"),
    COMMENT("#");


    private final String literal;

    private TokenType(String literal){
        this.literal = literal;
    }

    public String getLiteral(){
        return literal;
    }
}