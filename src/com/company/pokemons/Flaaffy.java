package com.company.pokemons;

import ru.ifmo.se.pokemon.*;
import com.company.actions.*;

public class Flaaffy extends Mareep  {
    public Flaaffy(String name,int level){
        super(name,level);
        setType(Type.ELECTRIC);
        setStats(70D,55D,55D,80D,60D,45D);
        setMove(new Confide(),new DoubleTeam(), new DreamEater());
    }
}
