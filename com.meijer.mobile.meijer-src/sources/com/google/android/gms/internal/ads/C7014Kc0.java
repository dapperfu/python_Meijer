package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Kc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7014Kc0 extends AbstractC15707a {
    public static final Parcelable.Creator<C7014Kc0> CREATOR = new C7048Lc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f68972a;

    /* renamed from: b, reason: collision with root package name */
    public final String f68973b;

    /* renamed from: c, reason: collision with root package name */
    public final String f68974c;

    C7014Kc0(int i10, String str, String str2) {
        this.f68972a = i10;
        this.f68973b = str;
        this.f68974c = str2;
    }

    public C7014Kc0(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f68972a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, this.f68973b, false);
        C15708b.w(parcel, 3, this.f68974c, false);
        C15708b.b(parcel, iA);
    }
}
