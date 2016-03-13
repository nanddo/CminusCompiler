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
    public void caseAADeclarationList(AADeclarationList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABDeclarationList(ABDeclarationList node)
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
    public void caseAAVarDeclaration(AAVarDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABVarDeclaration(ABVarDeclaration node)
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
    public void caseAFuncDeclaration(AFuncDeclaration node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAParams(AAParams node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABParams(ABParams node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAParamList(AAParamList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABParamList(ABParamList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAParam(AAParam node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABParam(ABParam node)
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
    public void caseAAExpressionStatement(AAExpressionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABExpressionStatement(ABExpressionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseASelectionStatement(ASelectionStatement node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAIterationStatement(AIterationStatement node)
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
    public void caseAAExpression(AAExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABExpression(ABExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAVar(AAVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABVar(ABVar node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAASimpleExpression(AASimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABSimpleExpression(ABSimpleExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAARelop(AARelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABRelop(ABRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseACRelop(ACRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseADRelop(ADRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAERelop(AERelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAFRelop(AFRelop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAdditiveExpression(AAAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABAdditiveExpression(ABAdditiveExpression node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAAddop(AAAddop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABAddop(ABAddop node)
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
    public void caseAAMulop(AAMulop node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABMulop(ABMulop node)
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
    public void caseAAArgs(AAArgs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABArgs(ABArgs node)
    {
        defaultCase(node);
    }

    @Override
    public void caseAAArgsList(AAArgsList node)
    {
        defaultCase(node);
    }

    @Override
    public void caseABArgsList(ABArgsList node)
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
    public void caseTBlank(TBlank node)
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
