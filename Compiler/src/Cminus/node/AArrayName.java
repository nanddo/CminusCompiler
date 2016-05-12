/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import java.util.*;
import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AArrayName extends PName
{
    private TId _id_;
    private final LinkedList<PArray> _array_ = new LinkedList<PArray>();

    public AArrayName()
    {
        // Constructor
    }

    public AArrayName(
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") List<?> _array_)
    {
        // Constructor
        setId(_id_);

        setArray(_array_);

    }

    @Override
    public Object clone()
    {
        return new AArrayName(
            cloneNode(this._id_),
            cloneList(this._array_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAArrayName(this);
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

    public LinkedList<PArray> getArray()
    {
        return this._array_;
    }

    public void setArray(List<?> list)
    {
        for(PArray e : this._array_)
        {
            e.parent(null);
        }
        this._array_.clear();

        for(Object obj_e : list)
        {
            PArray e = (PArray) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._array_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._id_)
            + toString(this._array_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._array_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        for(ListIterator<PArray> i = this._array_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((PArray) newChild);
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
