/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class TOutput extends Token
{
    public TOutput()
    {
        super.setText("output");
    }

    public TOutput(int line, int pos)
    {
        super.setText("output");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TOutput(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTOutput(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TOutput text.");
    }
}
