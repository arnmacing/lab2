package com.company.pokemons;

import ru.ifmo.se.pokemon.*;
import com.company.actions.*;

public class Sentret extends Pokemon  {
    public Sentret(String name,int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(35D,46D,34D,35D,45D,20D);
        setMove(new Facade(),new DoubleTeam(), new Confide());
    }
}