/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AIfelseStatement extends PStatement
{
    private PRelExp _relExp_;
    private PStatement _right_;
    private PStatement _left_;

    public AIfelseStatement()
    {
        // Constructor
    }

    public AIfelseStatement(
        @SuppressWarnings("hiding") PRelExp _relExp_,
        @SuppressWarnings("hiding") PStatement _right_,
        @SuppressWarnings("hiding") PStatement _left_)
    {
        // Constructor
        setRelExp(_relExp_);

        setRight(_right_);

        setLeft(_left_);

    }

    @Override
    public Object clone()
    {
        return new AIfelseStatement(
            cloneNode(this._relExp_),
            cloneNode(this._right_),
            cloneNode(this._left_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIfelseStatement(this);
    }

    public PRelExp getRelExp()
    {
        return this._relExp_;
    }

    public void setRelExp(PRelExp node)
    {
        if(this._relExp_ != null)
        {
            this._relExp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._relExp_ = node;
    }

    public PStatement getRight()
    {
        return this._right_;
    }

    public void setRight(PStatement node)
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

    public PStatement getLeft()
    {
        return this._left_;
    }

    public void setLeft(PStatement node)
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

    @Override
    public String toString()
    {
        return ""
            + toString(this._relExp_)
            + toString(this._right_)
            + toString(this._left_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._relExp_ == child)
        {
            this._relExp_ = null;
            return;
        }

        if(this._right_ == child)
        {
            this._right_ = null;
            return;
        }

        if(this._left_ == child)
        {
            this._left_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._relExp_ == oldChild)
        {
            setRelExp((PRelExp) newChild);
            return;
        }

        if(this._right_ == oldChild)
        {
            setRight((PStatement) newChild);
            return;
        }

        if(this._left_ == oldChild)
        {
            setLeft((PStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
