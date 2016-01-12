package com.scratchpad.generics.generated;

import com.scratchpad.generics.country.America;
import com.scratchpad.generics.country.Germany;
import com.scratchpad.generics.currency.Euro;
import com.scratchpad.generics.currency.Currency;

public class Pair$523 {
    private America key;
    private Currency value;

    public Pair$523(America key, Currency value) {
        this.key = key;
        this.value = value;
    }

    public America getKey() {
        return key;
    }

    public Currency getValue() {
        return value;
    }

    public Currency getCountryCurrency(America country) {
        return country.getCurrency();
    }

    public Euro getCountryCurrency(Germany country) {
        return (Euro) country.getCurrency();
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
