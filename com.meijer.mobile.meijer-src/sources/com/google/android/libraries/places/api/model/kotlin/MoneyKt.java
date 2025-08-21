package com.google.android.libraries.places.api.model.kotlin;

import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.api.model.Money;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"money", "Lcom/google/android/libraries/places/api/model/Money;", "currencyCode", "", "units", "", "nanos", "", "java.com.google.android.libraries.places.api.model.kotlin_kotlin_3p"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MoneyKt {
    public static final Money money(@RecentlyNonNull String currencyCode, long j10, int i10) {
        Intrinsics.j(currencyCode, "currencyCode");
        Money moneyNewInstance = Money.newInstance(currencyCode, Long.valueOf(j10), Integer.valueOf(i10));
        Intrinsics.i(moneyNewInstance, "newInstance(...)");
        return moneyNewInstance;
    }
}
