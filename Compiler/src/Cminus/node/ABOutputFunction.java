/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class ABOutputFunction extends POutputFunction
{
    private TVoid _void_;
    private TInput _input_;
    private TLeftPar _leftPar_;
    private TString _string_;
    private TId _id_;
    private TRightPar _rightPar_;

    public ABOutputFunction()
    {
        // Constructor
    }

    public ABOutputFunction(
        @SuppressWarnings("hiding") TVoid _void_,
        @SuppressWarnings("hiding") TInput _input_,
        @SuppressWarnings("hiding") TLeftPar _leftPar_,
        @SuppressWarnings("hiding") TString _string_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TRightPar _rightPar_)
    {
        // Constructor
        setVoid(_void_);

        setInput(_input_);

        setLeftPar(_leftPar_);

        setString(_string_);

        setId(_id_);

        setRightPar(_rightPar_);

    }

    @Override
    public Object clone()
    {
        return new ABOutputFunction(
            cloneNode(this._void_),
            cloneNode(this._input_),
            cloneNode(this._leftPar_),
            cloneNode(this._string_),
            cloneNode(this._id_),
            cloneNode(this._rightPar_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABOutputFunction(this);
    }

    public TVoid getVoid()
    {
        return this._void_;
    }

    public void setVoid(TVoid node)
    {
        if(this._void_ != null)
        {
            this._void_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._void_ = node;
    }

    public TInput getInput()
    {
        return this._input_;
    }

    public void setInput(TInput node)
    {
        if(this._input_ != null)
        {
            this._input_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._input_ = node;
    }

    public TLeftPar getLeftPar()
    {
        return this._leftPar_;
    }

    public void setLeftPar(TLeftPar node)
    {
        if(this._leftPar_ != null)
        {
            this._leftPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftPar_ = node;
    }

    public TString getString()
    {
        return this._string_;
    }

    public void setString(TString node)
    {
        if(this._string_ != null)
        {
            this._string_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._string_ = node;
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

    public TRightPar getRightPar()
    {
        return this._rightPar_;
    }

    public void setRightPar(TRightPar node)
    {
        if(this._rightPar_ != null)
        {
            this._rightPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightPar_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._void_)
            + toString(this._input_)
            + toString(this._leftPar_)
            + toString(this._string_)
            + toString(this._id_)
            + toString(this._rightPar_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._void_ == child)
        {
            this._void_ = null;
            return;
        }

        if(this._input_ == child)
        {
            this._input_ = null;
            return;
        }

        if(this._leftPar_ == child)
        {
            this._leftPar_ = null;
            return;
        }

        if(this._string_ == child)
        {
            this._string_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._rightPar_ == child)
        {
            this._rightPar_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._void_ == oldChild)
        {
            setVoid((TVoid) newChild);
            return;
        }

        if(this._input_ == oldChild)
        {
            setInput((TInput) newChild);
            return;
        }

        if(this._leftPar_ == oldChild)
        {
            setLeftPar((TLeftPar) newChild);
            return;
        }

        if(this._string_ == oldChild)
        {
            setString((TString) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._rightPar_ == oldChild)
        {
            setRightPar((TRightPar) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
