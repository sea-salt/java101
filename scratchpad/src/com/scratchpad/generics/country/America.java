package com.scratchpad.generics.country;

import com.scratchpad.generics.currency.Currency;
import com.scratchpad.generics.currency.USD;

public class America implements Country {

    private Currency currency;

    public America() {
        currency = new USD();
    }

    @Override
    public String getName() {
        return "America";
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

}
