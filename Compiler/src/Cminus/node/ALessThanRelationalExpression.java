/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class ALessThanRelationalExpression extends PRelationalExpression
{
    private PExp _left_;
    private TLessThan _lessThan_;
    private PExp _right_;

    public ALessThanRelationalExpression()
    {
        // Constructor
    }

    public ALessThanRelationalExpression(
        @SuppressWarnings("hiding") PExp _left_,
        @SuppressWarnings("hiding") TLessThan _lessThan_,
        @SuppressWarnings("hiding") PExp _right_)
    {
        // Constructor
        setLeft(_left_);

        setLessThan(_lessThan_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new ALessThanRelationalExpression(
            cloneNode(this._left_),
            cloneNode(this._lessThan_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALessThanRelationalExpression(this);
    }

    public PExp getLeft()
    {
        return this._left_;
    }

    public void setLeft(PExp node)
    {
        if(this._left_ != null)
        {
            this._left_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._left_ = node;
    }

    public TLessThan getLessThan()
    {
        return this._lessThan_;
    }

    public void setLessThan(TLessThan node)
    {
        if(this._lessThan_ != null)
        {
            this._lessThan_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lessThan_ = node;
    }

    public PExp getRight()
    {
        return this._right_;
    }

    public void setRight(PExp node)
    {
        if(this._right_ != null)
        {
            this._right_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._right_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._left_)
            + toString(this._lessThan_)
            + toString(this._right_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        if(this._lessThan_ == child)
        {
            this._lessThan_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._left_ == oldChild)
        {
            setLeft((PExp) newChild);
            return;
        }

        if(this._lessThan_ == oldChild)
        {
            setLessThan((TLessThan) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PExp) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
