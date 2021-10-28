package com.company.actions;

import ru.ifmo.se.pokemon.*;

public class DracoMeteor extends SpecialMove
{
public DracoMeteor()
{ super(Type.DRAGON, 130, 90); }

@Override
protected String describe()
{
return "Uses DracoMeteor";
}
}