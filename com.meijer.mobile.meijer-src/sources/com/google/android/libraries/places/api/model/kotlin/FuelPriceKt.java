package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.FuelPrice;
import com.google.android.libraries.places.api.model.Money;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;", "type", "Lcom/google/android/libraries/places/api/model/Money;", "price", "j$/time/Instant", "updateTime", "Lcom/google/android/libraries/places/api/model/FuelPrice;", "fuelPrice", "(Lcom/google/android/libraries/places/api/model/FuelPrice$FuelType;Lcom/google/android/libraries/places/api/model/Money;Lj$/time/Instant;)Lcom/google/android/libraries/places/api/model/FuelPrice;", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FuelPriceKt {
    public static final FuelPrice fuelPrice(@RecentlyNonNull FuelPrice.FuelType type, @RecentlyNonNull Money price, @RecentlyNonNull Instant updateTime) {
        Intrinsics.j(type, "type");
        Intrinsics.j(price, "price");
        Intrinsics.j(updateTime, "updateTime");
        FuelPrice fuelPriceNewInstance = FuelPrice.newInstance(type, price, updateTime);
        Intrinsics.i(fuelPriceNewInstance, "newInstance(...)");
        return fuelPriceNewInstance;
    }
}
