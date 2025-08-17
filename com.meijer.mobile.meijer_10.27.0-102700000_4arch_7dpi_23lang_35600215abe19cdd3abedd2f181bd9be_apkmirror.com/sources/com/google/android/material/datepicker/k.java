package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes4.dex */
final class k implements Comparable<k>, Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f86907a;

    /* renamed from: b, reason: collision with root package name */
    final int f86908b;

    /* renamed from: c, reason: collision with root package name */
    final int f86909c;

    /* renamed from: d, reason: collision with root package name */
    final int f86910d;

    /* renamed from: e, reason: collision with root package name */
    final int f86911e;

    /* renamed from: f, reason: collision with root package name */
    final long f86912f;

    /* renamed from: g, reason: collision with root package name */
    private String f86913g;

    class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k[] newArray(int i10) {
            return new k[i10];
        }

        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public k createFromParcel(Parcel parcel) {
            return k.b(parcel.readInt(), parcel.readInt());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f86908b == kVar.f86908b && this.f86909c == kVar.f86909c;
    }

    static k o() {
        return new k(q.g());
    }

    int B(long j10) {
        Calendar calendarC = q.c(this.f86907a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String C() {
        if (this.f86913g == null) {
            this.f86913g = e.f(this.f86907a.getTimeInMillis());
        }
        return this.f86913g;
    }

    long E() {
        return this.f86907a.getTimeInMillis();
    }

    k F(int i10) {
        Calendar calendarC = q.c(this.f86907a);
        calendarC.add(2, i10);
        return new k(calendarC);
    }

    int G(k kVar) {
        if (this.f86907a instanceof GregorianCalendar) {
            return ((kVar.f86909c - this.f86909c) * 12) + (kVar.f86908b - this.f86908b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return this.f86907a.compareTo(kVar.f86907a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f86908b), Integer.valueOf(this.f86909c)});
    }

    int t(int i10) {
        int i11 = this.f86907a.get(7);
        if (i10 <= 0) {
            i10 = this.f86907a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f86910d : i12;
    }

    long w(int i10) {
        Calendar calendarC = q.c(this.f86907a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f86909c);
        parcel.writeInt(this.f86908b);
    }

    private k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = q.c(calendar);
        this.f86907a = calendarC;
        this.f86908b = calendarC.get(2);
        this.f86909c = calendarC.get(1);
        this.f86910d = calendarC.getMaximum(7);
        this.f86911e = calendarC.getActualMaximum(5);
        this.f86912f = calendarC.getTimeInMillis();
    }

    static k b(int i10, int i11) {
        Calendar calendarI = q.i();
        calendarI.set(1, i10);
        calendarI.set(2, i11);
        return new k(calendarI);
    }

    static k e(long j10) {
        Calendar calendarI = q.i();
        calendarI.setTimeInMillis(j10);
        return new k(calendarI);
    }
}
