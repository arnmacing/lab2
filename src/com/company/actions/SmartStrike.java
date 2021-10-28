package com.company.actions;

import ru.ifmo.se.pokemon.*;

public class SmartStrike extends PhysicalMove
{
public SmartStrike()
{ super(Type.STEEL, 70, 0); }

@Override
protected String describe()
{
return "Uses Smart Strike";
}
}