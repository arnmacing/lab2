package com.company.pokemons;

import ru.ifmo.se.pokemon.*;
import com.company.actions.*;

public class Mareep extends Pokemon  {
    public Mareep(String name,int level){
        super(name,level);
        setType(Type.ELECTRIC);
        setStats(55D,40D,40D,65D,45D,35D);
        setMove(new Confide(),new DoubleTeam());
    }
}