/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class TGreat extends Token
{
    public TGreat()
    {
        super.setText(">");
    }

    public TGreat(int line, int pos)
    {
        super.setText(">");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGreat(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGreat(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TGreat text.");
    }
}
