/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class ABArgs extends PArgs
{
    private PEpsilon _epsilon_;

    public ABArgs()
    {
        // Constructor
    }

    public ABArgs(
        @SuppressWarnings("hiding") PEpsilon _epsilon_)
    {
        // Constructor
        setEpsilon(_epsilon_);

    }

    @Override
    public Object clone()
    {
        return new ABArgs(
            cloneNode(this._epsilon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABArgs(this);
    }

    public PEpsilon getEpsilon()
    {
        return this._epsilon_;
    }

    public void setEpsilon(PEpsilon node)
    {
        if(this._epsilon_ != null)
        {
            this._epsilon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._epsilon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._epsilon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._epsilon_ == child)
        {
            this._epsilon_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._epsilon_ == oldChild)
        {
            setEpsilon((PEpsilon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
