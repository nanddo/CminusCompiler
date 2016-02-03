/* This file was generated by SableCC (http://www.sablecc.org/). */

package Cminus.node;

import Cminus.analysis.*;

@SuppressWarnings("nls")
public final class TEndOfLine extends Token
{
    public TEndOfLine(String text)
    {
        setText(text);
    }

    public TEndOfLine(String text, int line, int pos)
    {
        setText(text);
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEndOfLine(getText(), getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEndOfLine(this);
    }
}