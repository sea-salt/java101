package com.scratchpad.generics.country;

import com.scratchpad.generics.currency.Currency;
import com.scratchpad.generics.currency.Euro;

public class Germany implements Country {
    private Currency currency;

    public Germany() {
        currency = new Euro();
    }

    @Override
    public String getName() {
        return "Germany";
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }
}
