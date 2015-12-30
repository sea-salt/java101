package com.scratchpad.generics;

import com.scratchpad.generics.country.America;
import com.scratchpad.generics.country.Germany;
import com.scratchpad.generics.currency.Currency;

public class Main {

    public static void main(String[] args) {
        America america = new America();
        Pair<America, Currency> americaInfo = new Pair<America, Currency>(america, america.getCurrency());

        Germany germany = new Germany();
        Pair<Germany, Currency> germanyInfo = new Pair<>(germany, germany.getCurrency());

        System.out.println(americaInfo);
        System.out.println(germanyInfo);
    }
}
