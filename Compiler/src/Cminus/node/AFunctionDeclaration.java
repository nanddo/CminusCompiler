/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionDeclaration extends PFunctionDeclaration
{
    private PImplicitTypeSpecifier _implicitTypeSpecifier_;
    private TId _id_;
    private TLeftPar _leftPar_;
    private PParameters _parameters_;
    private TRightPar _rightPar_;
    private PCompoundStatement _compoundStatement_;

    public AFunctionDeclaration()
    {
        // Constructor
    }

    public AFunctionDeclaration(
        @SuppressWarnings("hiding") PImplicitTypeSpecifier _implicitTypeSpecifier_,
        @SuppressWarnings("hiding") TId _id_,
        @SuppressWarnings("hiding") TLeftPar _leftPar_,
        @SuppressWarnings("hiding") PParameters _parameters_,
        @SuppressWarnings("hiding") TRightPar _rightPar_,
        @SuppressWarnings("hiding") PCompoundStatement _compoundStatement_)
    {
        // Constructor
        setImplicitTypeSpecifier(_implicitTypeSpecifier_);

        setId(_id_);

        setLeftPar(_leftPar_);

        setParameters(_parameters_);

        setRightPar(_rightPar_);

        setCompoundStatement(_compoundStatement_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionDeclaration(
            cloneNode(this._implicitTypeSpecifier_),
            cloneNode(this._id_),
            cloneNode(this._leftPar_),
            cloneNode(this._parameters_),
            cloneNode(this._rightPar_),
            cloneNode(this._compoundStatement_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDeclaration(this);
    }

    public PImplicitTypeSpecifier getImplicitTypeSpecifier()
    {
        return this._implicitTypeSpecifier_;
    }

    public void setImplicitTypeSpecifier(PImplicitTypeSpecifier node)
    {
        if(this._implicitTypeSpecifier_ != null)
        {
            this._implicitTypeSpecifier_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._implicitTypeSpecifier_ = node;
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

    public PParameters getParameters()
    {
        return this._parameters_;
    }

    public void setParameters(PParameters node)
    {
        if(this._parameters_ != null)
        {
            this._parameters_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameters_ = node;
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

    public PCompoundStatement getCompoundStatement()
    {
        return this._compoundStatement_;
    }

    public void setCompoundStatement(PCompoundStatement node)
    {
        if(this._compoundStatement_ != null)
        {
            this._compoundStatement_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._compoundStatement_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._implicitTypeSpecifier_)
            + toString(this._id_)
            + toString(this._leftPar_)
            + toString(this._parameters_)
            + toString(this._rightPar_)
            + toString(this._compoundStatement_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._implicitTypeSpecifier_ == child)
        {
            this._implicitTypeSpecifier_ = null;
            return;
        }

        if(this._id_ == child)
        {
            this._id_ = null;
            return;
        }

        if(this._leftPar_ == child)
        {
            this._leftPar_ = null;
            return;
        }

        if(this._parameters_ == child)
        {
            this._parameters_ = null;
            return;
        }

        if(this._rightPar_ == child)
        {
            this._rightPar_ = null;
            return;
        }

        if(this._compoundStatement_ == child)
        {
            this._compoundStatement_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._implicitTypeSpecifier_ == oldChild)
        {
            setImplicitTypeSpecifier((PImplicitTypeSpecifier) newChild);
            return;
        }

        if(this._id_ == oldChild)
        {
            setId((TId) newChild);
            return;
        }

        if(this._leftPar_ == oldChild)
        {
            setLeftPar((TLeftPar) newChild);
            return;
        }

        if(this._parameters_ == oldChild)
        {
            setParameters((PParameters) newChild);
            return;
        }

        if(this._rightPar_ == oldChild)
        {
            setRightPar((TRightPar) newChild);
            return;
        }

        if(this._compoundStatement_ == oldChild)
        {
            setCompoundStatement((PCompoundStatement) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
