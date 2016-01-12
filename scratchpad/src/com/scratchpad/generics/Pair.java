package com.scratchpad.generics;

import com.scratchpad.generics.country.Country;
import com.scratchpad.generics.currency.Currency;

public class Pair<K extends Object, V extends Object> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public <C extends Country, R extends Currency> R getCountryCurrency(C country) {
        return (R) country.getCurrency();
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
