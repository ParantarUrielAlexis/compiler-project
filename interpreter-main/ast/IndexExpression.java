package ast;

import token.Token;

public class IndexExpression implements Expression{
    Token token;
    Expression left;
    Expression index;
    public IndexExpression() {
    }
    public IndexExpression(Token token, Expression left, Expression index) {
        this.token = token;
        this.left = left;
        this.index = index;
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
        // TODO Auto-generated method stub
        return null;
    }

    
    
}
