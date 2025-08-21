package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Tc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7319Tc0 extends AbstractC15707a {
    public static final Parcelable.Creator<C7319Tc0> CREATOR = new C7353Uc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f71262a;

    /* renamed from: b, reason: collision with root package name */
    public final int f71263b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71264c;

    /* renamed from: d, reason: collision with root package name */
    public final String f71265d;

    /* renamed from: e, reason: collision with root package name */
    public final int f71266e;

    C7319Tc0(int i10, int i11, int i12, String str, String str2) {
        this.f71262a = i10;
        this.f71263b = i11;
        this.f71264c = str;
        this.f71265d = str2;
        this.f71266e = i12;
    }

    public C7319Tc0(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f71262a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, this.f71263b);
        C15708b.w(parcel, 3, this.f71264c, false);
        C15708b.w(parcel, 4, this.f71265d, false);
        C15708b.n(parcel, 5, this.f71266e);
        C15708b.b(parcel, iA);
    }
}
