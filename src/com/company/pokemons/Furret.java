package com.company.pokemons;

import ru.ifmo.se.pokemon.*;
import com.company.actions.*;

public class Furret extends Sentret  {
    public Furret(String name,int level){
        super(name,level);
        setType(Type.NORMAL);
        setStats(85D,76D,64D,45D,55D,90D);
        setMove(new Facade(),new DoubleTeam(), new Confide(), new SmartStrike());
    }
}
