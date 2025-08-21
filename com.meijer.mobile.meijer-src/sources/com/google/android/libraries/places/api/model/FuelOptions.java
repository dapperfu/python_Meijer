package com.google.android.libraries.places.api.model;

import Ee.L;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FuelOptions implements Parcelable {
    @RecentlyNonNull
    public abstract List<FuelPrice> getFuelPrices();

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract List<FuelPrice> getFuelPrices();

        @RecentlyNonNull
        public abstract Builder setFuelPrices(@RecentlyNonNull List<FuelPrice> list);

        abstract FuelOptions zza();

        @RecentlyNonNull
        public FuelOptions build() {
            setFuelPrices(L.s(getFuelPrices()));
            return zza();
        }
    }

    @RecentlyNonNull
    public static FuelOptions newInstance(@RecentlyNonNull List<FuelPrice> list) {
        zzv zzvVar = new zzv();
        zzvVar.setFuelPrices(list);
        return zzvVar.build();
    }
}
