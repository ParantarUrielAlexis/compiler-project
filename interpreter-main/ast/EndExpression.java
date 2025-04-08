package ast;

import token.Token;

public class EndExpression implements Expression{
     Token token;
    Identifier ident;

    
    
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
        StringBuilder out = new StringBuilder();

        out.append("END CODE");

        return out.toString();

    }


}
