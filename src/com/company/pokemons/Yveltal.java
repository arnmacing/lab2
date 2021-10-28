package com.company.pokemons;

import ru.ifmo.se.pokemon.*;
import com.company.actions.*;

public class Yveltal extends Pokemon  {
    public Yveltal(String name,int level){
        super(name,level);
        setType(Type.DARK, Type.FLYING);
        setStats(126D,131D,95D,131D,98D,99D);
        setMove( new DracoMeteor(),new DualChop(), new StoneEdge(), new Tackle());
    }
}