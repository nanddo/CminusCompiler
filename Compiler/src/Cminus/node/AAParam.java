/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AAParam extends PParam
{
    private PTypeSpecifier _typeSpecifier_;
    private TId _id_;

    public AAParam()
    {
        // Constructor
    }

    public AAParam(
        @SuppressWarnings("hiding") PTypeSpecifier _typeSpecifier_,
        @SuppressWarnings("hiding") TId _id_)
    {
        // Constructor
        setTypeSpecifier(_typeSpecifier_);

        setId(_id_);

    }

    @Override
    public Object clone()
    {
        return new AAParam(
            cloneNode(this._typeSpecifier_),
            cloneNode(this._id_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAParam(this);
    }

    public PTypeSpecifier getTypeSpecifier()
    {
        return this._typeSpecifier_;
    }

    public void setTypeSpecifier(PTypeSpecifier node)
    {
        if(this._typeSpecifier_ != null)
        {
            this._typeSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._typeSpecifier_ = node;
    }

    public TId getId()
    {
        return this._id_;
    }

    public void setId(TId node)
    {
        if(this._id_ != null)
        {
            this._id_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._id_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._typeSpecifier_)
            + toString(this._id_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._typeSpecifier_ == child)
        {
            this._typeSpecifier_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._typeSpecifier_ == oldChild)
        {
            setTypeSpecifier((PTypeSpecifier) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}