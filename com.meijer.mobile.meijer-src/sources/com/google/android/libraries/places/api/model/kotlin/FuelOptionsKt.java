package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.FuelOptions;
import com.google.android.libraries.places.api.model.FuelPrice;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"fuelOptions", "Lcom/google/android/libraries/places/api/model/FuelOptions;", "fuelPrices", "", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FuelOptionsKt {
    public static final FuelOptions fuelOptions(@RecentlyNonNull List<? extends FuelPrice> fuelPrices) {
        Intrinsics.j(fuelPrices, "fuelPrices");
        FuelOptions fuelOptionsNewInstance = FuelOptions.newInstance(fuelPrices);
        Intrinsics.i(fuelOptionsNewInstance, "newInstance(...)");
        return fuelOptionsNewInstance;
    }
}
