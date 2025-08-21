package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Hc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6912Hc0 extends AbstractC15707a {
    public static final Parcelable.Creator<C6912Hc0> CREATOR = new C6946Ic0();

    /* renamed from: a, reason: collision with root package name */
    public final int f68318a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f68319b;

    C6912Hc0(int i10, byte[] bArr) {
        this.f68318a = i10;
        this.f68319b = bArr;
    }

    public C6912Hc0(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f68318a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.g(parcel, 2, this.f68319b, false);
        C15708b.b(parcel, iA);
    }
}
