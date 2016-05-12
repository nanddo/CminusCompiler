/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import java.util.*;
import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionMainDeclaration extends PDeclaration
{
    private PType _type_;
    private TMain _main_;
    private final LinkedList<PStatement> _statement_ = new LinkedList<PStatement>();

    public AFunctionMainDeclaration()
    {
        // Constructor
    }

    public AFunctionMainDeclaration(
        @SuppressWarnings("hiding") PType _type_,
        @SuppressWarnings("hiding") TMain _main_,
        @SuppressWarnings("hiding") List<?> _statement_)
    {
        // Constructor
        setType(_type_);

        setMain(_main_);

        setStatement(_statement_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionMainDeclaration(
            cloneNode(this._type_),
            cloneNode(this._main_),
            cloneList(this._statement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionMainDeclaration(this);
    }

    public PType getType()
    {
        return this._type_;
    }

    public void setType(PType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public TMain getMain()
    {
        return this._main_;
    }

    public void setMain(TMain node)
    {
        if(this._main_ != null)
        {
            this._main_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._main_ = node;
    }

    public LinkedList<PStatement> getStatement()
    {
        return this._statement_;
    }

    public void setStatement(List<?> list)
    {
        for(PStatement e : this._statement_)
        {
            e.parent(null);
        }
        this._statement_.clear();

        for(Object obj_e : list)
        {
            PStatement e = (PStatement) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._statement_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._main_)
            + toString(this._statement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._main_ == child)
        {
            this._main_ = null;
            return;
        }

        if(this._statement_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((PType) newChild);
            return;
        }

        if(this._main_ == oldChild)
        {
            setMain((TMain) newChild);
            return;
        }

        for(ListIterator<PStatement> i = this._statement_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PStatement) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}