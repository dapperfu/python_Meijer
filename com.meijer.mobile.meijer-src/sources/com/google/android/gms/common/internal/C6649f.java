package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6649f extends AbstractC15707a {
    public static final Parcelable.Creator<C6649f> CREATOR = new j0();

    /* renamed from: a, reason: collision with root package name */
    private final C6662t f65696a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f65697b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f65698c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f65699d;

    /* renamed from: e, reason: collision with root package name */
    private final int f65700e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f65701f;

    public C6649f(C6662t c6662t, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f65696a = c6662t;
        this.f65697b = z10;
        this.f65698c = z11;
        this.f65699d = iArr;
        this.f65700e = i10;
        this.f65701f = iArr2;
    }

    public int B() {
        return this.f65700e;
    }

    public boolean I0() {
        return this.f65698c;
    }

    public int[] T() {
        return this.f65699d;
    }

    public final C6662t U0() {
        return this.f65696a;
    }

    public int[] b0() {
        return this.f65701f;
    }

    public boolean r0() {
        return this.f65697b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.u(parcel, 1, this.f65696a, i10, false);
        C15708b.c(parcel, 2, r0());
        C15708b.c(parcel, 3, I0());
        C15708b.o(parcel, 4, T(), false);
        C15708b.n(parcel, 5, B());
        C15708b.o(parcel, 6, b0(), false);
        C15708b.b(parcel, iA);
    }
}
