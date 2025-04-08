package ast;


import token.Token;

public class CharStatement implements Statement {

    private Token token;
    private Identifier name;
    private Expression value;

    public CharStatement(Token token, Identifier name, Expression value){
        this.token = token;
        this.name = name;
        this.value = value;
    }

    public CharStatement() {

    }


    @Override
    public void statementNode() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getTokenLiteral() {
        return token.getLiteral();
    }
    @Override
    public String string() {
        StringBuilder out = new StringBuilder();
        out.append(token.getLiteral() + " ");
        out.append(name.string());
        out.append(" = ");
        if(value != null){
            out.append(value.string());
        }
        out.append("$");

        return out.toString();

    }

    
}
