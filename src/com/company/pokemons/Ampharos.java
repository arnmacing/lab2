package com.company.pokemons;

import ru.ifmo.se.pokemon.*;
import com.company.actions.*;

public class Ampharos extends Flaaffy  {
    public Ampharos(String name,int level){
        super(name,level);
        setType(Type.ELECTRIC);
        setStats(90D,75D,85D,115D,90D,55D);
        setMove(new Confide(),new DoubleTeam(), new DreamEater(), new FlameCharge());
    }
}
