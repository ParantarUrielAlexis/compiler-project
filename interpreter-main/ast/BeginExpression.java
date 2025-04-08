package ast;

import token.Token;

public class BeginExpression implements Expression{
    Token token;
    BlockStatement body;

    public BeginExpression(Token token,Identifier ident, BlockStatement body) {
        this.token = token;
        this.body = body;
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
        StringBuilder out = new StringBuilder();

        out.append("BEGIN CODE");
        out.append(body.string());

        return out.toString();

    }
  
    

    
}
