package com.google.android.libraries.places.api.model;

import De.p;
import Ee.j0;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes6.dex */
public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    @Override // java.lang.Comparable
    public int compareTo(@RecentlyNonNull LocalTime localTime) {
        int hours;
        int hours2;
        p.r(localTime, "compare must not be null.");
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public abstract int getHours();

    public abstract int getMinutes();

    @RecentlyNonNull
    public static LocalTime newInstance(int i10, int i11) {
        try {
            zzac zzacVar = new zzac();
            zzacVar.zza(i10);
            zzacVar.zzb(i11);
            LocalTime localTimeZzc = zzacVar.zzc();
            int hours = localTimeZzc.getHours();
            p.y(j0.d(0, 23).g(Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = localTimeZzc.getMinutes();
            p.y(j0.d(0, 59).g(Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return localTimeZzc;
        } catch (IllegalStateException e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
