/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.analysis;

import java.util.*;
import Cminus.node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    @Override
    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    @Override
    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    @Override
    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    @Override
    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    @Override
    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAADeclaration(AADeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABDeclaration(ABDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAMainDeclaration(AMainDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariableDeclaration(AVariableDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayDeclaration(AArrayDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAATypeSpecifier(AATypeSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABTypeSpecifier(ABTypeSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACTypeSpecifier(ACTypeSpecifier node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFunctionDeclaration(AFunctionDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAParameters(AAParameters node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABParameters(ABParameters node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAParametersList(AAParametersList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABParametersList(ABParametersList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASingleParameter(ASingleParameter node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayParameter(AArrayParameter node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAStatementList(AAStatementList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABStatementList(ABStatementList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAStatement(AAStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABStatement(ABStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACStatement(ACStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADStatement(ADStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEStatement(AEStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFStatement(AFStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAStatementWithElse(AAStatementWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABStatementWithElse(ABStatementWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACStatementWithElse(ACStatementWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADStatementWithElse(ADStatementWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEStatementWithElse(AEStatementWithElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAttributionStatement(AAAttributionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABAttributionStatement(ABAttributionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACAttributionStatement(ACAttributionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADAttributionStatement(ADAttributionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACompoundStatement(ACompoundStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAALocalDeclarations(AALocalDeclarations node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABLocalDeclarations(ABLocalDeclarations node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfStatement(AIfStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElseStatement(AIfElseStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIfElseStatement2(AIfElseStatement2 node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStatement(AIterationStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStatementElse(AIterationStatementElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAReturnStatement(AAReturnStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABReturnStatement(ABReturnStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAVariable(AVariable node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAArrayExpression(AArrayExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAARelationalExpression(AARelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABRelationalExpression(ABRelationalExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAARelationalOperator(AARelationalOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABRelationalOperator(ABRelationalOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACRelationalOperator(ACRelationalOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADRelationalOperator(ADRelationalOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAERelationalOperator(AERelationalOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFRelationalOperator(AFRelationalOperator node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAInputFunction(AAInputFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABInputFunction(ABInputFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAOutputFunction(AAOutputFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABOutputFunction(ABOutputFunction node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAExp(AAExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABExp(ABExp node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAdd(AAAdd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABAdd(ABAdd node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAATerm(AATerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABTerm(ABTerm node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAMult(AAMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABMult(ABMult node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAFactor(AAFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABFactor(ABFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACFactor(ACFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADFactor(ADFactor node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACall(ACall node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAArgumentsList(AAArgumentsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABArgumentsList(ABArgumentsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAArguments(AAArguments node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABArguments(ABArguments node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAEpsilon(AEpsilon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTElse(TElse node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTIf(TIf node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInt(TInt node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTReturn(TReturn node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTVoid(TVoid node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTWhile(TWhile node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMain(TMain node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTInput(TInput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOutput(TOutput node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTNum(TNum node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTStringValue(TStringValue node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTPlus(TPlus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTMinus(TMinus node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSlash(TSlash node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAsterisk(TAsterisk node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessThan(TLessThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLessEqual(TLessEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreatThan(TGreatThan node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTGreatEqual(TGreatEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEqual(TEqual node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTDifferent(TDifferent node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTAttribution(TAttribution node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTComma(TComma node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSemicolon(TSemicolon node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftPar(TLeftPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightPar(TRightPar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftBracket(TLeftBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightBracket(TRightBracket node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLeftBrace(TLeftBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTRightBrace(TRightBrace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTOpenComment(TOpenComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTCloseComment(TCloseComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTBlockComment(TBlockComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTSpace(TSpace node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTEndLine(TEndLine node)
    {
        defaultCase(node);
    }

    @Override
    public void caseTLineComment(TLineComment node)
    {
        defaultCase(node);
    }

    @Override
    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    @Override
    public void caseInvalidToken(InvalidToken node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
