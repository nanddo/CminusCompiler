/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AIterationStatement extends PIterationStatement
{
    private TWhile _while_;
    private TLeftPar _leftPar_;
    private PRelationalExpression _relationalExpression_;
    private TRightPar _rightPar_;
    private PStatement _statement_;

    public AIterationStatement()
    {
        // Constructor
    }

    public AIterationStatement(
        @SuppressWarnings("hiding") TWhile _while_,
        @SuppressWarnings("hiding") TLeftPar _leftPar_,
        @SuppressWarnings("hiding") PRelationalExpression _relationalExpression_,
        @SuppressWarnings("hiding") TRightPar _rightPar_,
        @SuppressWarnings("hiding") PStatement _statement_)
    {
        // Constructor
        setWhile(_while_);

        setLeftPar(_leftPar_);

        setRelationalExpression(_relationalExpression_);

        setRightPar(_rightPar_);

        setStatement(_statement_);

    }

    @Override
    public Object clone()
    {
        return new AIterationStatement(
            cloneNode(this._while_),
            cloneNode(this._leftPar_),
            cloneNode(this._relationalExpression_),
            cloneNode(this._rightPar_),
            cloneNode(this._statement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIterationStatement(this);
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

    public PRelationalExpression getRelationalExpression()
    {
        return this._relationalExpression_;
    }

    public void setRelationalExpression(PRelationalExpression node)
    {
        if(this._relationalExpression_ != null)
        {
            this._relationalExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relationalExpression_ = node;
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

    public PStatement getStatement()
    {
        return this._statement_;
    }

    public void setStatement(PStatement node)
    {
        if(this._statement_ != null)
        {
            this._statement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._statement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._while_)
            + toString(this._leftPar_)
            + toString(this._relationalExpression_)
            + toString(this._rightPar_)
            + toString(this._statement_);
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

        if(this._relationalExpression_ == child)
        {
            this._relationalExpression_ = null;
            return;
        }

        if(this._rightPar_ == child)
        {
            this._rightPar_ = null;
            return;
        }

        if(this._statement_ == child)
        {
            this._statement_ = null;
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

        if(this._relationalExpression_ == oldChild)
        {
            setRelationalExpression((PRelationalExpression) newChild);
            return;
        }

        if(this._rightPar_ == oldChild)
        {
            setRightPar((TRightPar) newChild);
            return;
        }

        if(this._statement_ == oldChild)
        {
            setStatement((PStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
