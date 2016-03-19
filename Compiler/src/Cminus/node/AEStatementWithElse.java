/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AEStatementWithElse extends PStatementWithElse
{
    private PIterationStatementElse _iterationStatementElse_;

    public AEStatementWithElse()
    {
        // Constructor
    }

    public AEStatementWithElse(
        @SuppressWarnings("hiding") PIterationStatementElse _iterationStatementElse_)
    {
        // Constructor
        setIterationStatementElse(_iterationStatementElse_);

    }

    @Override
    public Object clone()
    {
        return new AEStatementWithElse(
            cloneNode(this._iterationStatementElse_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEStatementWithElse(this);
    }

    public PIterationStatementElse getIterationStatementElse()
    {
        return this._iterationStatementElse_;
    }

    public void setIterationStatementElse(PIterationStatementElse node)
    {
        if(this._iterationStatementElse_ != null)
        {
            this._iterationStatementElse_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._iterationStatementElse_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._iterationStatementElse_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._iterationStatementElse_ == child)
        {
            this._iterationStatementElse_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._iterationStatementElse_ == oldChild)
        {
            setIterationStatementElse((PIterationStatementElse) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
