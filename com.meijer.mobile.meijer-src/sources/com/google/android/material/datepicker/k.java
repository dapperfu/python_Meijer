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
    private final Calendar f87747a;

    /* renamed from: b, reason: collision with root package name */
    final int f87748b;

    /* renamed from: c, reason: collision with root package name */
    final int f87749c;

    /* renamed from: d, reason: collision with root package name */
    final int f87750d;

    /* renamed from: e, reason: collision with root package name */
    final int f87751e;

    /* renamed from: f, reason: collision with root package name */
    final long f87752f;

    /* renamed from: g, reason: collision with root package name */
    private String f87753g;

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
        return this.f87748b == kVar.f87748b && this.f87749c == kVar.f87749c;
    }

    static k o() {
        return new k(q.g());
    }

    int B(long j10) {
        Calendar calendarC = q.c(this.f87747a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String C() {
        if (this.f87753g == null) {
            this.f87753g = e.f(this.f87747a.getTimeInMillis());
        }
        return this.f87753g;
    }

    long E() {
        return this.f87747a.getTimeInMillis();
    }

    k F(int i10) {
        Calendar calendarC = q.c(this.f87747a);
        calendarC.add(2, i10);
        return new k(calendarC);
    }

    int G(k kVar) {
        if (this.f87747a instanceof GregorianCalendar) {
            return ((kVar.f87749c - this.f87749c) * 12) + (kVar.f87748b - this.f87748b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return this.f87747a.compareTo(kVar.f87747a);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f87748b), Integer.valueOf(this.f87749c)});
    }

    int t(int i10) {
        int i11 = this.f87747a.get(7);
        if (i10 <= 0) {
            i10 = this.f87747a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f87750d : i12;
    }

    long w(int i10) {
        Calendar calendarC = q.c(this.f87747a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f87749c);
        parcel.writeInt(this.f87748b);
    }

    private k(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = q.c(calendar);
        this.f87747a = calendarC;
        this.f87748b = calendarC.get(2);
        this.f87749c = calendarC.get(1);
        this.f87750d = calendarC.getMaximum(7);
        this.f87751e = calendarC.getActualMaximum(5);
        this.f87752f = calendarC.getTimeInMillis();
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
