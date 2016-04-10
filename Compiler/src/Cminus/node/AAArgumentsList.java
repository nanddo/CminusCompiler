/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AAArgumentsList extends PArgumentsList
{
    private PArgumentsList _argumentsList_;
    private TComma _comma_;
    private PExpression _expression_;

    public AAArgumentsList()
    {
        // Constructor
    }

    public AAArgumentsList(
        @SuppressWarnings("hiding") PArgumentsList _argumentsList_,
        @SuppressWarnings("hiding") TComma _comma_,
        @SuppressWarnings("hiding") PExpression _expression_)
    {
        // Constructor
        setArgumentsList(_argumentsList_);

        setComma(_comma_);

        setExpression(_expression_);

    }

    @Override
    public Object clone()
    {
        return new AAArgumentsList(
            cloneNode(this._argumentsList_),
            cloneNode(this._comma_),
            cloneNode(this._expression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAArgumentsList(this);
    }

    public PArgumentsList getArgumentsList()
    {
        return this._argumentsList_;
    }

    public void setArgumentsList(PArgumentsList node)
    {
        if(this._argumentsList_ != null)
        {
            this._argumentsList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._argumentsList_ = node;
    }

    public TComma getComma()
    {
        return this._comma_;
    }

    public void setComma(TComma node)
    {
        if(this._comma_ != null)
        {
            this._comma_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comma_ = node;
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._argumentsList_)
            + toString(this._comma_)
            + toString(this._expression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._argumentsList_ == child)
        {
            this._argumentsList_ = null;
            return;
        }

        if(this._comma_ == child)
        {
            this._comma_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._argumentsList_ == oldChild)
        {
            setArgumentsList((PArgumentsList) newChild);
            return;
        }

        if(this._comma_ == oldChild)
        {
            setComma((TComma) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}