package ast;

import java.util.ArrayList;
import java.util.List;

import token.Token;

public class BlockStatement implements Statement{
    Token token;
    List<Statement> statements;

    public BlockStatement(Token token) {
        this.token = token;
        this.statements = new ArrayList<>();
    }


    public void setStatements(List<Statement> statements) {
        this.statements = statements;
    }

    public void addStatement(Statement statement){
        this.statements.add(statement);
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

        for(Statement s: statements){
            out.append(s.string());
        }

        return out.toString();
    }

    
    

    
}
