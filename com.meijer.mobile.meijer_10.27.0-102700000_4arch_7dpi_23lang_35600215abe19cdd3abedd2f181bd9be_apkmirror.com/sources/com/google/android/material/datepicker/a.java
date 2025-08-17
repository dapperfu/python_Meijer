package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1268a();

    /* renamed from: a, reason: collision with root package name */
    private final k f86873a;

    /* renamed from: b, reason: collision with root package name */
    private final k f86874b;

    /* renamed from: c, reason: collision with root package name */
    private final c f86875c;

    /* renamed from: d, reason: collision with root package name */
    private k f86876d;

    /* renamed from: e, reason: collision with root package name */
    private final int f86877e;

    /* renamed from: f, reason: collision with root package name */
    private final int f86878f;

    /* renamed from: g, reason: collision with root package name */
    private final int f86879g;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C1268a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((k) parcel.readParcelable(k.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (k) parcel.readParcelable(k.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }

        C1268a() {
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        static final long f86880f = q.a(k.b(1900, 0).f86912f);

        /* renamed from: g, reason: collision with root package name */
        static final long f86881g = q.a(k.b(2100, 11).f86912f);

        /* renamed from: a, reason: collision with root package name */
        private long f86882a;

        /* renamed from: b, reason: collision with root package name */
        private long f86883b;

        /* renamed from: c, reason: collision with root package name */
        private Long f86884c;

        /* renamed from: d, reason: collision with root package name */
        private int f86885d;

        /* renamed from: e, reason: collision with root package name */
        private c f86886e;

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f86886e);
            k kVarE = k.e(this.f86882a);
            k kVarE2 = k.e(this.f86883b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f86884c;
            return new a(kVarE, kVarE2, cVar, l10 == null ? null : k.e(l10.longValue()), this.f86885d, null);
        }

        b(a aVar) {
            this.f86882a = f86880f;
            this.f86883b = f86881g;
            this.f86886e = f.a(Long.MIN_VALUE);
            this.f86882a = aVar.f86873a.f86912f;
            this.f86883b = aVar.f86874b.f86912f;
            this.f86884c = Long.valueOf(aVar.f86876d.f86912f);
            this.f86885d = aVar.f86877e;
            this.f86886e = aVar.f86875c;
        }

        public b b(long j10) {
            this.f86884c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean b1(long j10);
    }

    /* synthetic */ a(k kVar, k kVar2, c cVar, k kVar3, int i10, C1268a c1268a) {
        this(kVar, kVar2, cVar, kVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f86873a.equals(aVar.f86873a) && this.f86874b.equals(aVar.f86874b) && o2.c.a(this.f86876d, aVar.f86876d) && this.f86877e == aVar.f86877e && this.f86875c.equals(aVar.f86875c);
    }

    private a(k kVar, k kVar2, c cVar, k kVar3, int i10) {
        Objects.requireNonNull(kVar, "start cannot be null");
        Objects.requireNonNull(kVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f86873a = kVar;
        this.f86874b = kVar2;
        this.f86876d = kVar3;
        this.f86877e = i10;
        this.f86875c = cVar;
        if (kVar3 != null && kVar.compareTo(kVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kVar3 != null && kVar3.compareTo(kVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > q.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f86879g = kVar.G(kVar2) + 1;
        this.f86878f = (kVar2.f86909c - kVar.f86909c) + 1;
    }

    k f(k kVar) {
        return kVar.compareTo(this.f86873a) < 0 ? this.f86873a : kVar.compareTo(this.f86874b) > 0 ? this.f86874b : kVar;
    }

    public c g() {
        return this.f86875c;
    }

    k h() {
        return this.f86874b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f86873a, this.f86874b, this.f86876d, Integer.valueOf(this.f86877e), this.f86875c});
    }

    int i() {
        return this.f86877e;
    }

    int j() {
        return this.f86879g;
    }

    k k() {
        return this.f86876d;
    }

    k n() {
        return this.f86873a;
    }

    int o() {
        return this.f86878f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f86873a, 0);
        parcel.writeParcelable(this.f86874b, 0);
        parcel.writeParcelable(this.f86876d, 0);
        parcel.writeParcelable(this.f86875c, 0);
        parcel.writeInt(this.f86877e);
    }
}
