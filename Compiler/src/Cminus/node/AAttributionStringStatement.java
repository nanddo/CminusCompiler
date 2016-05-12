/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AAttributionStringStatement extends PStatement
{
    private PName _name_;
    private TStringValue _stringValue_;

    public AAttributionStringStatement()
    {
        // Constructor
    }

    public AAttributionStringStatement(
        @SuppressWarnings("hiding") PName _name_,
        @SuppressWarnings("hiding") TStringValue _stringValue_)
    {
        // Constructor
        setName(_name_);

        setStringValue(_stringValue_);

    }

    @Override
    public Object clone()
    {
        return new AAttributionStringStatement(
            cloneNode(this._name_),
            cloneNode(this._stringValue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAAttributionStringStatement(this);
    }

    public PName getName()
    {
        return this._name_;
    }

    public void setName(PName node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TStringValue getStringValue()
    {
        return this._stringValue_;
    }

    public void setStringValue(TStringValue node)
    {
        if(this._stringValue_ != null)
        {
            this._stringValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._stringValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._name_)
            + toString(this._stringValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._stringValue_ == child)
        {
            this._stringValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._name_ == oldChild)
        {
            setName((PName) newChild);
            return;
        }

        if(this._stringValue_ == oldChild)
        {
            setStringValue((TStringValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}