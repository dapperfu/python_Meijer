package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7364Uj extends AbstractC15707a {
    public static final Parcelable.Creator<C7364Uj> CREATOR = new C7430Wj();

    /* renamed from: a, reason: collision with root package name */
    public final int f71525a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71526b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71527c;

    /* renamed from: d, reason: collision with root package name */
    public final int f71528d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f71526b;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, this.f71527c, false);
        C15708b.n(parcel, 3, this.f71528d);
        C15708b.n(parcel, 1000, this.f71525a);
        C15708b.b(parcel, iA);
    }

    public C7364Uj(int i10, int i11, String str, int i12) {
        this.f71525a = i10;
        this.f71526b = i11;
        this.f71527c = str;
        this.f71528d = i12;
    }
}
