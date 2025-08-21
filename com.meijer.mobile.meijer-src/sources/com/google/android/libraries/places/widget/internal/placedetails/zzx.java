package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.FuelPrice;
import j$.time.Instant;
import j$.time.temporal.ChronoUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class zzx {
    public static final boolean zza(FuelPrice.FuelType fuelType) {
        Intrinsics.j(fuelType, "<this>");
        return fuelType == FuelPrice.FuelType.REGULAR_UNLEADED || fuelType == FuelPrice.FuelType.MIDGRADE || fuelType == FuelPrice.FuelType.PREMIUM || fuelType == FuelPrice.FuelType.DIESEL;
    }

    public static final boolean zzb(FuelPrice fuelPrice, Instant instant) {
        Intrinsics.j(fuelPrice, "<this>");
        if (instant == null) {
            return false;
        }
        Instant instantC = instant.c(24L, ChronoUnit.HOURS);
        Intrinsics.i(instantC, "minus(...)");
        return fuelPrice.getUpdateTime().isBefore(instantC);
    }
}
