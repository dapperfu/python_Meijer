package com.google.android.libraries.places.api.model;

import Be.p;
import Ce.j0;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes6.dex */
public abstract class LocalDate implements Parcelable, Comparable<LocalDate> {
    @Override // java.lang.Comparable
    public int compareTo(@RecentlyNonNull LocalDate localDate) {
        int day;
        int day2;
        p.r(localDate, "dateToCompare must not be null.");
        if (this == localDate) {
            return 0;
        }
        if (getYear() != localDate.getYear()) {
            day = getYear();
            day2 = localDate.getYear();
        } else if (getMonth() != localDate.getMonth()) {
            day = getMonth();
            day2 = localDate.getMonth();
        } else {
            day = getDay();
            day2 = localDate.getDay();
        }
        return day - day2;
    }

    public abstract int getDay();

    public abstract int getMonth();

    public abstract int getYear();

    @RecentlyNonNull
    public static LocalDate newInstance(int i10, int i11, int i12) {
        zzaa zzaaVar = new zzaa();
        zzaaVar.zza(i10);
        zzaaVar.zzb(i11);
        zzaaVar.zzc(i12);
        LocalDate localDateZzd = zzaaVar.zzd();
        int month = localDateZzd.getMonth();
        j0 j0VarD = j0.d(1, 12);
        Integer numValueOf = Integer.valueOf(month);
        p.h(j0VarD.g(numValueOf), "Month must not be out of range of 1 to 12, but was: %s.", month);
        int day = localDateZzd.getDay();
        j0 j0VarD2 = j0.d(1, 31);
        Integer numValueOf2 = Integer.valueOf(day);
        p.h(j0VarD2.g(numValueOf2), "Day must not be out of range of 1 to 31, but was: %s.", day);
        if (Arrays.asList(4, 6, 9, 11).contains(numValueOf)) {
            p.i(j0.d(1, 30).g(numValueOf2), "%s is not a valid day for month %s.", day, month);
        }
        if (month == 2) {
            int year = localDateZzd.getYear();
            p.n(j0.d(1, Integer.valueOf(year % 4 == 0 ? 29 : 28)).g(numValueOf2), "%s is not a valid day for month %s in year %s.", numValueOf2, 2, Integer.valueOf(year));
        }
        return localDateZzd;
    }

    @RecentlyNonNull
    public final String toString() {
        return String.format(Locale.getDefault(), "%s-%s-%s", Integer.valueOf(getYear()), String.format(Locale.getDefault(), "%02d", Integer.valueOf(getMonth())), String.format(Locale.getDefault(), "%02d", Integer.valueOf(getDay())));
    }
}
