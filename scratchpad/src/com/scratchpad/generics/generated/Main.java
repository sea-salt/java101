package com.scratchpad.generics.generated;

import com.scratchpad.generics.country.America;
import com.scratchpad.generics.country.Germany;

public class Main {

    public static void main(String[] args) {
        America america = new America();
        Pair$523 americaInfo = new Pair$523(america, america.getCurrency());

        Germany germany = new Germany();
        Pair$815 germanyInfo = new Pair$815(germany, germany.getCurrency());

        System.out.println(americaInfo);
        System.out.println(germanyInfo);
    }
}
