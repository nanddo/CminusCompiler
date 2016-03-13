/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class ABVarDeclaration extends PVarDeclaration
{
    private PTypeSpecifier _typeSpecifier_;
    private TId _id_;
    private TLeftBracket _leftBracket_;
    private TNum _num_;
    private TRightBracket _rightBracket_;
    private TSemicolon _semicolon_;

    public ABVarDeclaration()
    {
        // Constructor
    }

    public ABVarDeclaration(
        @SuppressWarnings("hiding") PTypeSpecifier _typeSpecifier_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLeftBracket _leftBracket_,
        @SuppressWarnings("hiding") TNum _num_,
        @SuppressWarnings("hiding") TRightBracket _rightBracket_,
        @SuppressWarnings("hiding") TSemicolon _semicolon_)
    {
        // Constructor
        setTypeSpecifier(_typeSpecifier_);

        setId(_id_);

        setLeftBracket(_leftBracket_);

        setNum(_num_);

        setRightBracket(_rightBracket_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new ABVarDeclaration(
            cloneNode(this._typeSpecifier_),
            cloneNode(this._id_),
            cloneNode(this._leftBracket_),
            cloneNode(this._num_),
            cloneNode(this._rightBracket_),
            cloneNode(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseABVarDeclaration(this);
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

    public TLeftBracket getLeftBracket()
    {
        return this._leftBracket_;
    }

    public void setLeftBracket(TLeftBracket node)
    {
        if(this._leftBracket_ != null)
        {
            this._leftBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._leftBracket_ = node;
    }

    public TNum getNum()
    {
        return this._num_;
    }

    public void setNum(TNum node)
    {
        if(this._num_ != null)
        {
            this._num_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._num_ = node;
    }

    public TRightBracket getRightBracket()
    {
        return this._rightBracket_;
    }

    public void setRightBracket(TRightBracket node)
    {
        if(this._rightBracket_ != null)
        {
            this._rightBracket_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rightBracket_ = node;
    }

    public TSemicolon getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(TSemicolon node)
    {
        if(this._semicolon_ != null)
        {
            this._semicolon_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolon_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._typeSpecifier_)
            + toString(this._id_)
            + toString(this._leftBracket_)
            + toString(this._num_)
            + toString(this._rightBracket_)
            + toString(this._semicolon_);
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

        if(this._leftBracket_ == child)
        {
            this._leftBracket_ = null;
            return;
        }

        if(this._num_ == child)
        {
            this._num_ = null;
            return;
        }

        if(this._rightBracket_ == child)
        {
            this._rightBracket_ = null;
            return;
        }

        if(this._semicolon_ == child)
        {
            this._semicolon_ = null;
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

        if(this._leftBracket_ == oldChild)
        {
            setLeftBracket((TLeftBracket) newChild);
            return;
        }

        if(this._num_ == oldChild)
        {
            setNum((TNum) newChild);
            return;
        }

        if(this._rightBracket_ == oldChild)
        {
            setRightBracket((TRightBracket) newChild);
            return;
        }

        if(this._semicolon_ == oldChild)
        {
            setSemicolon((TSemicolon) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
