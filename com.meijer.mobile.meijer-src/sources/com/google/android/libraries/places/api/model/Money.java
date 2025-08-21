package com.google.android.libraries.places.api.model;

import De.p;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class Money implements Parcelable {
    @RecentlyNonNull
    public abstract String getCurrencyCode();

    @RecentlyNonNull
    public abstract Integer getNanos();

    @RecentlyNonNull
    public abstract Long getUnits();

    public static abstract class Builder {
        @RecentlyNonNull
        public abstract Integer getNanos();

        @RecentlyNonNull
        public abstract Long getUnits();

        @RecentlyNonNull
        public abstract Builder setCurrencyCode(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setNanos(@RecentlyNonNull Integer num);

        @RecentlyNonNull
        public abstract Builder setUnits(@RecentlyNonNull Long l10);

        abstract Money zza();

        @RecentlyNonNull
        public Money build() {
            long jLongValue = getUnits().longValue();
            Integer nanos = getNanos();
            boolean z10 = false;
            if (jLongValue > 0) {
                if (nanos.intValue() >= 0) {
                    z10 = true;
                }
                p.l(z10, "Unit is positive and nano must be positive or zero, but was: %s.", nanos);
            } else if (jLongValue < 0) {
                if (nanos.intValue() <= 0) {
                    z10 = true;
                }
                p.l(z10, "Unit is negative and nano must be negative or zero, but was: %s.", nanos);
            }
            return zza();
        }
    }

    @RecentlyNonNull
    public static Money newInstance(@RecentlyNonNull String str, @RecentlyNonNull Long l10, @RecentlyNonNull Integer num) {
        zzae zzaeVar = new zzae();
        zzaeVar.setCurrencyCode(str);
        zzaeVar.setUnits(l10);
        zzaeVar.setNanos(num);
        return zzaeVar.build();
    }
}
