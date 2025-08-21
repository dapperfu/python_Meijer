package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Ij, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6958Ij extends AbstractC15707a {
    public static final Parcelable.Creator<C6958Ij> CREATOR = new C6992Jj();

    /* renamed from: a, reason: collision with root package name */
    public final String f68512a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68513b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68514c;

    /* renamed from: d, reason: collision with root package name */
    public final String f68515d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f68512a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.c(parcel, 2, this.f68513b);
        C15708b.n(parcel, 3, this.f68514c);
        C15708b.w(parcel, 4, this.f68515d, false);
        C15708b.b(parcel, iA);
    }

    public C6958Ij(String str, boolean z10, int i10, String str2) {
        this.f68512a = str;
        this.f68513b = z10;
        this.f68514c = i10;
        this.f68515d = str2;
    }
}
