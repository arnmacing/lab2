package com.company;

import com.company.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
	Battle b = new Battle();
        b.addAlly(new Yveltal("Yveltal", 306));
        b.addAlly(new Sentret("Sentret", 43));
        b.addAlly(new Furret("Furret", 145));
        b.addFoe(new Mareep("Mareep", 56));
        b.addFoe(new Flaaffy("Flaaffy", 128));
        b.addFoe(new Ampharos("Ampharos", 230));

        b.go();
    }
}
