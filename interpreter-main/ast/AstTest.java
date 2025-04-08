package ast;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import token.Token;
import token.TokenType;

public class AstTest {
    Program program;

    private CharStatement createCharStatement(String tokenLiteral, String name, String value){
        CharStatement statement = new CharStatement();
        statement.setToken(new Token(TokenType.CHAR, tokenLiteral));
        statement.setName(new Identifier(new Token(TokenType.IDENT, name), name));
        statement.setValue(new Identifier(new Token(TokenType.IDENT, value), value));
        return statement;
    }
    
}
