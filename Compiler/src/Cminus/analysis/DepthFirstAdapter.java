/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.analysis;

import java.util.*;
import Cminus.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inAProgram(AProgram node)
    {
        defaultIn(node);
    }

    public void outAProgram(AProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAProgram(AProgram node)
    {
        inAProgram(node);
        {
            List<PDeclaration> copy = new ArrayList<PDeclaration>(node.getDeclaration());
            for(PDeclaration e : copy)
            {
                e.apply(this);
            }
        }
        outAProgram(node);
    }

    public void inAVariableDeclaration(AVariableDeclaration node)
    {
        defaultIn(node);
    }

    public void outAVariableDeclaration(AVariableDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVariableDeclaration(AVariableDeclaration node)
    {
        inAVariableDeclaration(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outAVariableDeclaration(node);
    }

    public void inAFunctionDeclaration(AFunctionDeclaration node)
    {
        defaultIn(node);
    }

    public void outAFunctionDeclaration(AFunctionDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionDeclaration(AFunctionDeclaration node)
    {
        inAFunctionDeclaration(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAFunctionDeclaration(node);
    }

    public void inAFunctionMainDeclaration(AFunctionMainDeclaration node)
    {
        defaultIn(node);
    }

    public void outAFunctionMainDeclaration(AFunctionMainDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionMainDeclaration(AFunctionMainDeclaration node)
    {
        inAFunctionMainDeclaration(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getMain() != null)
        {
            node.getMain().apply(this);
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAFunctionMainDeclaration(node);
    }

    public void inAFunctionArgDeclaration(AFunctionArgDeclaration node)
    {
        defaultIn(node);
    }

    public void outAFunctionArgDeclaration(AFunctionArgDeclaration node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFunctionArgDeclaration(AFunctionArgDeclaration node)
    {
        inAFunctionArgDeclaration(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PArg> copy = new ArrayList<PArg>(node.getArg());
            for(PArg e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outAFunctionArgDeclaration(node);
    }

    public void inAIntType(AIntType node)
    {
        defaultIn(node);
    }

    public void outAIntType(AIntType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntType(AIntType node)
    {
        inAIntType(node);
        if(node.getInt() != null)
        {
            node.getInt().apply(this);
        }
        outAIntType(node);
    }

    public void inAStringType(AStringType node)
    {
        defaultIn(node);
    }

    public void outAStringType(AStringType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringType(AStringType node)
    {
        inAStringType(node);
        if(node.getString() != null)
        {
            node.getString().apply(this);
        }
        outAStringType(node);
    }

    public void inAVoidType(AVoidType node)
    {
        defaultIn(node);
    }

    public void outAVoidType(AVoidType node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAVoidType(AVoidType node)
    {
        inAVoidType(node);
        if(node.getVoid() != null)
        {
            node.getVoid().apply(this);
        }
        outAVoidType(node);
    }

    public void inAArg(AArg node)
    {
        defaultIn(node);
    }

    public void outAArg(AArg node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArg(AArg node)
    {
        inAArg(node);
        if(node.getType() != null)
        {
            node.getType().apply(this);
        }
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAArg(node);
    }

    public void inASingleName(ASingleName node)
    {
        defaultIn(node);
    }

    public void outASingleName(ASingleName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASingleName(ASingleName node)
    {
        inASingleName(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outASingleName(node);
    }

    public void inAArrayName(AArrayName node)
    {
        defaultIn(node);
    }

    public void outAArrayName(AArrayName node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArrayName(AArrayName node)
    {
        inAArrayName(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PArray> copy = new ArrayList<PArray>(node.getArray());
            for(PArray e : copy)
            {
                e.apply(this);
            }
        }
        outAArrayName(node);
    }

    public void inAEmptyArray(AEmptyArray node)
    {
        defaultIn(node);
    }

    public void outAEmptyArray(AEmptyArray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyArray(AEmptyArray node)
    {
        inAEmptyArray(node);
        outAEmptyArray(node);
    }

    public void inADimArray(ADimArray node)
    {
        defaultIn(node);
    }

    public void outADimArray(ADimArray node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADimArray(ADimArray node)
    {
        inADimArray(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outADimArray(node);
    }

    public void inAAttributionStatement(AAttributionStatement node)
    {
        defaultIn(node);
    }

    public void outAAttributionStatement(AAttributionStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAttributionStatement(AAttributionStatement node)
    {
        inAAttributionStatement(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAAttributionStatement(node);
    }

    public void inAAttributionStringStatement(AAttributionStringStatement node)
    {
        defaultIn(node);
    }

    public void outAAttributionStringStatement(AAttributionStringStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAttributionStringStatement(AAttributionStringStatement node)
    {
        inAAttributionStringStatement(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        if(node.getStringValue() != null)
        {
            node.getStringValue().apply(this);
        }
        outAAttributionStringStatement(node);
    }

    public void inABlockStatement(ABlockStatement node)
    {
        defaultIn(node);
    }

    public void outABlockStatement(ABlockStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseABlockStatement(ABlockStatement node)
    {
        inABlockStatement(node);
        {
            List<PDeclaration> copy = new ArrayList<PDeclaration>(node.getDeclaration());
            for(PDeclaration e : copy)
            {
                e.apply(this);
            }
        }
        {
            List<PStatement> copy = new ArrayList<PStatement>(node.getStatement());
            for(PStatement e : copy)
            {
                e.apply(this);
            }
        }
        outABlockStatement(node);
    }

    public void inADeclarationStatement(ADeclarationStatement node)
    {
        defaultIn(node);
    }

    public void outADeclarationStatement(ADeclarationStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADeclarationStatement(ADeclarationStatement node)
    {
        inADeclarationStatement(node);
        if(node.getDeclaration() != null)
        {
            node.getDeclaration().apply(this);
        }
        outADeclarationStatement(node);
    }

    public void inACallStatement(ACallStatement node)
    {
        defaultIn(node);
    }

    public void outACallStatement(ACallStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACallStatement(ACallStatement node)
    {
        inACallStatement(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        {
            List<PExp> copy = new ArrayList<PExp>(node.getExp());
            for(PExp e : copy)
            {
                e.apply(this);
            }
        }
        outACallStatement(node);
    }

    public void inAIfStatement(AIfStatement node)
    {
        defaultIn(node);
    }

    public void outAIfStatement(AIfStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfStatement(AIfStatement node)
    {
        inAIfStatement(node);
        if(node.getRelExp() != null)
        {
            node.getRelExp().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAIfStatement(node);
    }

    public void inAIfelseStatement(AIfelseStatement node)
    {
        defaultIn(node);
    }

    public void outAIfelseStatement(AIfelseStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIfelseStatement(AIfelseStatement node)
    {
        inAIfelseStatement(node);
        if(node.getRelExp() != null)
        {
            node.getRelExp().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        outAIfelseStatement(node);
    }

    public void inAWhileStatement(AWhileStatement node)
    {
        defaultIn(node);
    }

    public void outAWhileStatement(AWhileStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAWhileStatement(AWhileStatement node)
    {
        inAWhileStatement(node);
        if(node.getRelExp() != null)
        {
            node.getRelExp().apply(this);
        }
        if(node.getStatement() != null)
        {
            node.getStatement().apply(this);
        }
        outAWhileStatement(node);
    }

    public void inAReturnStatement(AReturnStatement node)
    {
        defaultIn(node);
    }

    public void outAReturnStatement(AReturnStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAReturnStatement(AReturnStatement node)
    {
        inAReturnStatement(node);
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAReturnStatement(node);
    }

    public void inAEmptyStatement(AEmptyStatement node)
    {
        defaultIn(node);
    }

    public void outAEmptyStatement(AEmptyStatement node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyStatement(AEmptyStatement node)
    {
        inAEmptyStatement(node);
        outAEmptyStatement(node);
    }

    public void inALessThanRelExp(ALessThanRelExp node)
    {
        defaultIn(node);
    }

    public void outALessThanRelExp(ALessThanRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessThanRelExp(ALessThanRelExp node)
    {
        inALessThanRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALessThanRelExp(node);
    }

    public void inALessEqualRelExp(ALessEqualRelExp node)
    {
        defaultIn(node);
    }

    public void outALessEqualRelExp(ALessEqualRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessEqualRelExp(ALessEqualRelExp node)
    {
        inALessEqualRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outALessEqualRelExp(node);
    }

    public void inAGreatThanRelExp(AGreatThanRelExp node)
    {
        defaultIn(node);
    }

    public void outAGreatThanRelExp(AGreatThanRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreatThanRelExp(AGreatThanRelExp node)
    {
        inAGreatThanRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGreatThanRelExp(node);
    }

    public void inAGreatEqualRelExp(AGreatEqualRelExp node)
    {
        defaultIn(node);
    }

    public void outAGreatEqualRelExp(AGreatEqualRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreatEqualRelExp(AGreatEqualRelExp node)
    {
        inAGreatEqualRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAGreatEqualRelExp(node);
    }

    public void inAEqualRelExp(AEqualRelExp node)
    {
        defaultIn(node);
    }

    public void outAEqualRelExp(AEqualRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualRelExp(AEqualRelExp node)
    {
        inAEqualRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAEqualRelExp(node);
    }

    public void inADifferentRelExp(ADifferentRelExp node)
    {
        defaultIn(node);
    }

    public void outADifferentRelExp(ADifferentRelExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADifferentRelExp(ADifferentRelExp node)
    {
        inADifferentRelExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADifferentRelExp(node);
    }

    public void inAPlusExp(APlusExp node)
    {
        defaultIn(node);
    }

    public void outAPlusExp(APlusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusExp(APlusExp node)
    {
        inAPlusExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAPlusExp(node);
    }

    public void inAMinusExp(AMinusExp node)
    {
        defaultIn(node);
    }

    public void outAMinusExp(AMinusExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusExp(AMinusExp node)
    {
        inAMinusExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMinusExp(node);
    }

    public void inAMultExp(AMultExp node)
    {
        defaultIn(node);
    }

    public void outAMultExp(AMultExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultExp(AMultExp node)
    {
        inAMultExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outAMultExp(node);
    }

    public void inADivExp(ADivExp node)
    {
        defaultIn(node);
    }

    public void outADivExp(ADivExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivExp(ADivExp node)
    {
        inADivExp(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outADivExp(node);
    }

    public void inANumExp(ANumExp node)
    {
        defaultIn(node);
    }

    public void outANumExp(ANumExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumExp(ANumExp node)
    {
        inANumExp(node);
        if(node.getNum() != null)
        {
            node.getNum().apply(this);
        }
        outANumExp(node);
    }

    public void inAIdExp(AIdExp node)
    {
        defaultIn(node);
    }

    public void outAIdExp(AIdExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdExp(AIdExp node)
    {
        inAIdExp(node);
        if(node.getId() != null)
        {
            node.getId().apply(this);
        }
        outAIdExp(node);
    }

    public void inANameExp(ANameExp node)
    {
        defaultIn(node);
    }

    public void outANameExp(ANameExp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANameExp(ANameExp node)
    {
        inANameExp(node);
        if(node.getName() != null)
        {
            node.getName().apply(this);
        }
        outANameExp(node);
    }
}
