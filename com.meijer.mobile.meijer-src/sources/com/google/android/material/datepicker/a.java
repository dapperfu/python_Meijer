package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1277a();

    /* renamed from: a, reason: collision with root package name */
    private final k f87713a;

    /* renamed from: b, reason: collision with root package name */
    private final k f87714b;

    /* renamed from: c, reason: collision with root package name */
    private final c f87715c;

    /* renamed from: d, reason: collision with root package name */
    private k f87716d;

    /* renamed from: e, reason: collision with root package name */
    private final int f87717e;

    /* renamed from: f, reason: collision with root package name */
    private final int f87718f;

    /* renamed from: g, reason: collision with root package name */
    private final int f87719g;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C1277a implements Parcelable.Creator<a> {
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

        C1277a() {
        }
    }

    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        static final long f87720f = q.a(k.b(1900, 0).f87752f);

        /* renamed from: g, reason: collision with root package name */
        static final long f87721g = q.a(k.b(2100, 11).f87752f);

        /* renamed from: a, reason: collision with root package name */
        private long f87722a;

        /* renamed from: b, reason: collision with root package name */
        private long f87723b;

        /* renamed from: c, reason: collision with root package name */
        private Long f87724c;

        /* renamed from: d, reason: collision with root package name */
        private int f87725d;

        /* renamed from: e, reason: collision with root package name */
        private c f87726e;

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f87726e);
            k kVarE = k.e(this.f87722a);
            k kVarE2 = k.e(this.f87723b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f87724c;
            return new a(kVarE, kVarE2, cVar, l10 == null ? null : k.e(l10.longValue()), this.f87725d, null);
        }

        b(a aVar) {
            this.f87722a = f87720f;
            this.f87723b = f87721g;
            this.f87726e = f.a(Long.MIN_VALUE);
            this.f87722a = aVar.f87713a.f87752f;
            this.f87723b = aVar.f87714b.f87752f;
            this.f87724c = Long.valueOf(aVar.f87716d.f87752f);
            this.f87725d = aVar.f87717e;
            this.f87726e = aVar.f87715c;
        }

        public b b(long j10) {
            this.f87724c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean a1(long j10);
    }

    /* synthetic */ a(k kVar, k kVar2, c cVar, k kVar3, int i10, C1277a c1277a) {
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
        return this.f87713a.equals(aVar.f87713a) && this.f87714b.equals(aVar.f87714b) && o2.c.a(this.f87716d, aVar.f87716d) && this.f87717e == aVar.f87717e && this.f87715c.equals(aVar.f87715c);
    }

    private a(k kVar, k kVar2, c cVar, k kVar3, int i10) {
        Objects.requireNonNull(kVar, "start cannot be null");
        Objects.requireNonNull(kVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f87713a = kVar;
        this.f87714b = kVar2;
        this.f87716d = kVar3;
        this.f87717e = i10;
        this.f87715c = cVar;
        if (kVar3 != null && kVar.compareTo(kVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (kVar3 != null && kVar3.compareTo(kVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > q.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f87719g = kVar.G(kVar2) + 1;
        this.f87718f = (kVar2.f87749c - kVar.f87749c) + 1;
    }

    k f(k kVar) {
        return kVar.compareTo(this.f87713a) < 0 ? this.f87713a : kVar.compareTo(this.f87714b) > 0 ? this.f87714b : kVar;
    }

    public c g() {
        return this.f87715c;
    }

    k h() {
        return this.f87714b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f87713a, this.f87714b, this.f87716d, Integer.valueOf(this.f87717e), this.f87715c});
    }

    int i() {
        return this.f87717e;
    }

    int j() {
        return this.f87719g;
    }

    k k() {
        return this.f87716d;
    }

    k n() {
        return this.f87713a;
    }

    int o() {
        return this.f87718f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f87713a, 0);
        parcel.writeParcelable(this.f87714b, 0);
        parcel.writeParcelable(this.f87716d, 0);
        parcel.writeParcelable(this.f87715c, 0);
        parcel.writeInt(this.f87717e);
    }
}
