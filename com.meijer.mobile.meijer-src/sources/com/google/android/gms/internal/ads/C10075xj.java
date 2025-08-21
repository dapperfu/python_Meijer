package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10075xj extends AbstractC15707a {
    public static final Parcelable.Creator<C10075xj> CREATOR = new C10182yj();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f80672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f80673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80674c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f80675d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f80676e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f80677f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f80678g;

    /* renamed from: h, reason: collision with root package name */
    public final long f80679h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f80672a;
        int iA = C15708b.a(parcel);
        C15708b.c(parcel, 1, z10);
        C15708b.w(parcel, 2, this.f80673b, false);
        C15708b.n(parcel, 3, this.f80674c);
        C15708b.g(parcel, 4, this.f80675d, false);
        C15708b.x(parcel, 5, this.f80676e, false);
        C15708b.x(parcel, 6, this.f80677f, false);
        C15708b.c(parcel, 7, this.f80678g);
        C15708b.s(parcel, 8, this.f80679h);
        C15708b.b(parcel, iA);
    }

    C10075xj(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.f80672a = z10;
        this.f80673b = str;
        this.f80674c = i10;
        this.f80675d = bArr;
        this.f80676e = strArr;
        this.f80677f = strArr2;
        this.f80678g = z11;
        this.f80679h = j10;
    }
}
