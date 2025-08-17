package com.google.maps.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes7.dex */
public class Fare implements Serializable {
    private static final long serialVersionUID = 1;
    public Currency currency;
    public BigDecimal value;

    public String toString() {
        return String.format("%s %s", this.value, this.currency);
    }
}
