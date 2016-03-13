/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AAStatement extends PStatement
{
    private PExpressionStatement _expressionStatement_;

    public AAStatement()
    {
        // Constructor
    }

    public AAStatement(
        @SuppressWarnings("hiding") PExpressionStatement _expressionStatement_)
    {
        // Constructor
        setExpressionStatement(_expressionStatement_);

    }

    @Override
    public Object clone()
    {
        return new AAStatement(
            cloneNode(this._expressionStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAStatement(this);
    }

    public PExpressionStatement getExpressionStatement()
    {
        return this._expressionStatement_;
    }

    public void setExpressionStatement(PExpressionStatement node)
    {
        if(this._expressionStatement_ != null)
        {
            this._expressionStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expressionStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._expressionStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._expressionStatement_ == child)
        {
            this._expressionStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._expressionStatement_ == oldChild)
        {
            setExpressionStatement((PExpressionStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
