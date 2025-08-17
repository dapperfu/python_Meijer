package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6524f extends AbstractC15136a {
    public static final Parcelable.Creator<C6524f> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final C6537t f64856a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f64857b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f64858c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f64859d;

    /* renamed from: e, reason: collision with root package name */
    private final int f64860e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f64861f;

    public C6524f(C6537t c6537t, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f64856a = c6537t;
        this.f64857b = z10;
        this.f64858c = z11;
        this.f64859d = iArr;
        this.f64860e = i10;
        this.f64861f = iArr2;
    }

    public int B() {
        return this.f64860e;
    }

    public boolean K0() {
        return this.f64858c;
    }

    public int[] T() {
        return this.f64859d;
    }

    public final C6537t W0() {
        return this.f64856a;
    }

    public int[] c0() {
        return this.f64861f;
    }

    public boolean q0() {
        return this.f64857b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.u(parcel, 1, this.f64856a, i10, false);
        C15137b.c(parcel, 2, q0());
        C15137b.c(parcel, 3, K0());
        C15137b.o(parcel, 4, T(), false);
        C15137b.n(parcel, 5, B());
        C15137b.o(parcel, 6, c0(), false);
        C15137b.b(parcel, iA);
    }
}
