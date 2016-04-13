/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import java.util.*;
import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AProgram extends PProgram
{
    private final LinkedList<PDeclaration> _declaration_ = new LinkedList<PDeclaration>();
    private PMainDeclaration _mainDeclaration_;

    public AProgram()
    {
        // Constructor
    }

    public AProgram(
        @SuppressWarnings("hiding") List<?> _declaration_,
        @SuppressWarnings("hiding") PMainDeclaration _mainDeclaration_)
    {
        // Constructor
        setDeclaration(_declaration_);

        setMainDeclaration(_mainDeclaration_);

    }

    @Override
    public Object clone()
    {
        return new AProgram(
            cloneList(this._declaration_),
            cloneNode(this._mainDeclaration_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAProgram(this);
    }

    public LinkedList<PDeclaration> getDeclaration()
    {
        return this._declaration_;
    }

    public void setDeclaration(List<?> list)
    {
        for(PDeclaration e : this._declaration_)
        {
            e.parent(null);
        }
        this._declaration_.clear();

        for(Object obj_e : list)
        {
            PDeclaration e = (PDeclaration) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._declaration_.add(e);
        }
    }

    public PMainDeclaration getMainDeclaration()
    {
        return this._mainDeclaration_;
    }

    public void setMainDeclaration(PMainDeclaration node)
    {
        if(this._mainDeclaration_ != null)
        {
            this._mainDeclaration_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._mainDeclaration_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._declaration_)
            + toString(this._mainDeclaration_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._declaration_.remove(child))
        {
            return;
        }

        if(this._mainDeclaration_ == child)
        {
            this._mainDeclaration_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        for(ListIterator<PDeclaration> i = this._declaration_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PDeclaration) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        if(this._mainDeclaration_ == oldChild)
        {
            setMainDeclaration((PMainDeclaration) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
