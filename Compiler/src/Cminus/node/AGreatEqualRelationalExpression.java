/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AGreatEqualRelationalExpression extends PRelationalExpression
{
    private PExp _left_;
    private TGreatEqual _greatEqual_;
    private PExp _right_;

    public AGreatEqualRelationalExpression()
    {
        // Constructor
    }

    public AGreatEqualRelationalExpression(
        @SuppressWarnings("hiding") PExp _left_,
        @SuppressWarnings("hiding") TGreatEqual _greatEqual_,
        @SuppressWarnings("hiding") PExp _right_)
    {
        // Constructor
        setLeft(_left_);

        setGreatEqual(_greatEqual_);

        setRight(_right_);

    }

    @Override
    public Object clone()
    {
        return new AGreatEqualRelationalExpression(
            cloneNode(this._left_),
            cloneNode(this._greatEqual_),
            cloneNode(this._right_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAGreatEqualRelationalExpression(this);
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

    public TGreatEqual getGreatEqual()
    {
        return this._greatEqual_;
    }

    public void setGreatEqual(TGreatEqual node)
    {
        if(this._greatEqual_ != null)
        {
            this._greatEqual_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._greatEqual_ = node;
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
            + toString(this._greatEqual_)
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

        if(this._greatEqual_ == child)
        {
            this._greatEqual_ = null;
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

        if(this._greatEqual_ == oldChild)
        {
            setGreatEqual((TGreatEqual) newChild);
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
