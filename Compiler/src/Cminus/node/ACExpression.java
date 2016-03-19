/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class ACExpression extends PExpression
{
    private PSimpleExpression _simpleExpression_;

    public ACExpression()
    {
        // Constructor
    }

    public ACExpression(
        @SuppressWarnings("hiding") PSimpleExpression _simpleExpression_)
    {
        // Constructor
        setSimpleExpression(_simpleExpression_);

    }

    @Override
    public Object clone()
    {
        return new ACExpression(
            cloneNode(this._simpleExpression_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseACExpression(this);
    }

    public PSimpleExpression getSimpleExpression()
    {
        return this._simpleExpression_;
    }

    public void setSimpleExpression(PSimpleExpression node)
    {
        if(this._simpleExpression_ != null)
        {
            this._simpleExpression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._simpleExpression_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._simpleExpression_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._simpleExpression_ == child)
        {
            this._simpleExpression_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._simpleExpression_ == oldChild)
        {
            setSimpleExpression((PSimpleExpression) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
