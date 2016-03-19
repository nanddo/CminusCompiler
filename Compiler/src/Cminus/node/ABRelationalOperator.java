/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class ABRelationalOperator extends PRelationalOperator
{
    private TLessEqual _lessEqual_;

    public ABRelationalOperator()
    {
        // Constructor
    }

    public ABRelationalOperator(
        @SuppressWarnings("hiding") TLessEqual _lessEqual_)
    {
        // Constructor
        setLessEqual(_lessEqual_);

    }

    @Override
    public Object clone()
    {
        return new ABRelationalOperator(
            cloneNode(this._lessEqual_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABRelationalOperator(this);
    }

    public TLessEqual getLessEqual()
    {
        return this._lessEqual_;
    }

    public void setLessEqual(TLessEqual node)
    {
        if(this._lessEqual_ != null)
        {
            this._lessEqual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lessEqual_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lessEqual_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lessEqual_ == child)
        {
            this._lessEqual_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lessEqual_ == oldChild)
        {
            setLessEqual((TLessEqual) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
