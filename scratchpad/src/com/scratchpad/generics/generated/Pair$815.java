package com.scratchpad.generics.generated;

import com.scratchpad.generics.country.America;
import com.scratchpad.generics.country.Germany;
import com.scratchpad.generics.currency.Currency;
import com.scratchpad.generics.currency.USD;

public class Pair$815 {
    private Germany key;
    private Currency value;

    public Pair$815(Germany key, Currency value) {
        this.key = key;
        this.value = value;
    }

    public Germany getKey() {
        return key;
    }

    public Currency getValue() {
        return value;
    }

    public USD getCountryCurrency(America country) {
        return (USD) country.getCurrency();
    }

    public Currency getCountryCurrency(Germany country) {
        return country.getCurrency();
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
