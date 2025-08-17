package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6537t extends AbstractC15136a {
    public static final Parcelable.Creator<C6537t> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    private final int f64938a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f64939b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64940c;

    /* renamed from: d, reason: collision with root package name */
    private final int f64941d;

    /* renamed from: e, reason: collision with root package name */
    private final int f64942e;

    public C6537t(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f64938a = i10;
        this.f64939b = z10;
        this.f64940c = z11;
        this.f64941d = i11;
        this.f64942e = i12;
    }

    public int B() {
        return this.f64941d;
    }

    public int K0() {
        return this.f64938a;
    }

    public int T() {
        return this.f64942e;
    }

    public boolean c0() {
        return this.f64939b;
    }

    public boolean q0() {
        return this.f64940c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, K0());
        C15137b.c(parcel, 2, c0());
        C15137b.c(parcel, 3, q0());
        C15137b.n(parcel, 4, B());
        C15137b.n(parcel, 5, T());
        C15137b.b(parcel, iA);
    }
}
