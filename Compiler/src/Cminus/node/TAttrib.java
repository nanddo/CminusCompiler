/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class TAttrib extends Token
{
    public TAttrib()
    {
        super.setText("=");
    }

    public TAttrib(int line, int pos)
    {
        super.setText("=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TAttrib(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTAttrib(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TAttrib text.");
    }
}