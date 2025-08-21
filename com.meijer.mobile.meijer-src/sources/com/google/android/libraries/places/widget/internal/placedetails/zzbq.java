package com.google.android.libraries.places.widget.internal.placedetails;

import kotlin.ranges.OpenEndRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes6.dex */
public final class zzbq {
    public static final zzbr zza(double d10) {
        int i10 = (int) d10;
        if (i10 <= 0 || i10 >= 5) {
            return i10 == 5 ? new zzbr(5, false) : new zzbr(0, false);
        }
        OpenEndRange<Double> openEndRangeC = RangesKt.c(0.0d, 0.25d);
        Double dValueOf = Double.valueOf(d10 - i10);
        return openEndRangeC.contains(dValueOf) ? new zzbr(i10, false) : RangesKt.c(0.25d, 0.75d).contains(dValueOf) ? new zzbr(i10, true) : new zzbr(i10 + 1, false);
    }
}
