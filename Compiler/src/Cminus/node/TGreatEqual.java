/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class TGreatEqual extends Token
{
    public TGreatEqual()
    {
        super.setText(">=");
    }

    public TGreatEqual(int line, int pos)
    {
        super.setText(">=");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TGreatEqual(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTGreatEqual(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TGreatEqual text.");
    }
}
