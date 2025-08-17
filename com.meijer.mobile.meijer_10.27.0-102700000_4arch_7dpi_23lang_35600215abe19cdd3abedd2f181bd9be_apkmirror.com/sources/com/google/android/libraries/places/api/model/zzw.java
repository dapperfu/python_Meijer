package com.google.android.libraries.places.api.model;

import java.util.List;

/* loaded from: classes6.dex */
abstract class zzw extends FuelOptions {
    private final List zza;

    @Override // com.google.android.libraries.places.api.model.FuelOptions
    public final List<FuelPrice> getFuelPrices() {
        return this.zza;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FuelOptions) {
            return this.zza.equals(((FuelOptions) obj).getFuelPrices());
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() ^ 1000003;
    }

    public final String toString() {
        String string = this.zza.toString();
        StringBuilder sb2 = new StringBuilder(string.length() + 24);
        sb2.append("FuelOptions{fuelPrices=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    zzw(List list) {
        if (list != null) {
            this.zza = list;
            return;
        }
        throw new NullPointerException("Null fuelPrices");
    }
}
