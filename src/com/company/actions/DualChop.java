package com.company.actions;

import ru.ifmo.se.pokemon.*;

public class DualChop extends PhysicalMove
{
public DualChop()
{ super(Type.DRAGON, 40, 90); }

@Override
protected String describe()
{
return "Uses Dual Chop";
}
}