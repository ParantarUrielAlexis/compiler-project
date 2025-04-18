package ast;

import token.Token;

public class CharacterExpression implements Expression{
    private Token token;
    private char value;

    public CharacterExpression() {
    }
    public CharacterExpression(Token token, char value) {
        this.token = token;
        this.value = value;
    }

    @Override
    public void expressionNode() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public String getTokenLiteral() {
        return token.getLiteral();
    }
    @Override
    public String string() {
        return token.getLiteral();
    }
}
