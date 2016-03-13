/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AALocalDeclarations extends PLocalDeclarations
{
    private PLocalDeclarations _localDeclarations_;
    private PVarDeclaration _varDeclaration_;

    public AALocalDeclarations()
    {
        // Constructor
    }

    public AALocalDeclarations(
        @SuppressWarnings("hiding") PLocalDeclarations _localDeclarations_,
        @SuppressWarnings("hiding") PVarDeclaration _varDeclaration_)
    {
        // Constructor
        setLocalDeclarations(_localDeclarations_);

        setVarDeclaration(_varDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AALocalDeclarations(
            cloneNode(this._localDeclarations_),
            cloneNode(this._varDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAALocalDeclarations(this);
    }

    public PLocalDeclarations getLocalDeclarations()
    {
        return this._localDeclarations_;
    }

    public void setLocalDeclarations(PLocalDeclarations node)
    {
        if(this._localDeclarations_ != null)
        {
            this._localDeclarations_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._localDeclarations_ = node;
    }

    public PVarDeclaration getVarDeclaration()
    {
        return this._varDeclaration_;
    }

    public void setVarDeclaration(PVarDeclaration node)
    {
        if(this._varDeclaration_ != null)
        {
            this._varDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._varDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._localDeclarations_)
            + toString(this._varDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._localDeclarations_ == child)
        {
            this._localDeclarations_ = null;
            return;
        }

        if(this._varDeclaration_ == child)
        {
            this._varDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._localDeclarations_ == oldChild)
        {
            setLocalDeclarations((PLocalDeclarations) newChild);
            return;
        }

        if(this._varDeclaration_ == oldChild)
        {
            setVarDeclaration((PVarDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}