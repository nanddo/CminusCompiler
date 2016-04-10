/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AIterationStatementElse extends PIterationStatementElse
{
    private TWhile _while_;
    private TLeftPar _leftPar_;
    private PExpression _expression_;
    private TRightPar _rightPar_;
    private PStatementWithElse _statementWithElse_;

    public AIterationStatementElse()
    {
        // Constructor
    }

    public AIterationStatementElse(
        @SuppressWarnings("hiding") TWhile _while_,
        @SuppressWarnings("hiding") TLeftPar _leftPar_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") TRightPar _rightPar_,
        @SuppressWarnings("hiding") PStatementWithElse _statementWithElse_)
    {
        // Constructor
        setWhile(_while_);

        setLeftPar(_leftPar_);

        setExpression(_expression_);

        setRightPar(_rightPar_);

        setStatementWithElse(_statementWithElse_);

    }

    @Override
    public Object clone()
    {
        return new AIterationStatementElse(
            cloneNode(this._while_),
            cloneNode(this._leftPar_),
            cloneNode(this._expression_),
            cloneNode(this._rightPar_),
            cloneNode(this._statementWithElse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIterationStatementElse(this);
    }

    public TWhile getWhile()
    {
        return this._while_;
    }

    public void setWhile(TWhile node)
    {
        if(this._while_ != null)
        {
            this._while_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._while_ = node;
    }

    public TLeftPar getLeftPar()
    {
        return this._leftPar_;
    }

    public void setLeftPar(TLeftPar node)
    {
        if(this._leftPar_ != null)
        {
            this._leftPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftPar_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public TRightPar getRightPar()
    {
        return this._rightPar_;
    }

    public void setRightPar(TRightPar node)
    {
        if(this._rightPar_ != null)
        {
            this._rightPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightPar_ = node;
    }

    public PStatementWithElse getStatementWithElse()
    {
        return this._statementWithElse_;
    }

    public void setStatementWithElse(PStatementWithElse node)
    {
        if(this._statementWithElse_ != null)
        {
            this._statementWithElse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statementWithElse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._while_)
            + toString(this._leftPar_)
            + toString(this._expression_)
            + toString(this._rightPar_)
            + toString(this._statementWithElse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._while_ == child)
        {
            this._while_ = null;
            return;
        }

        if(this._leftPar_ == child)
        {
            this._leftPar_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._rightPar_ == child)
        {
            this._rightPar_ = null;
            return;
        }

        if(this._statementWithElse_ == child)
        {
            this._statementWithElse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._while_ == oldChild)
        {
            setWhile((TWhile) newChild);
            return;
        }

        if(this._leftPar_ == oldChild)
        {
            setLeftPar((TLeftPar) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        if(this._rightPar_ == oldChild)
        {
            setRightPar((TRightPar) newChild);
            return;
        }

        if(this._statementWithElse_ == oldChild)
        {
            setStatementWithElse((PStatementWithElse) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}