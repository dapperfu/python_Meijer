package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Uj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7239Uj extends AbstractC15136a {
    public static final Parcelable.Creator<C7239Uj> CREATOR = new C7305Wj();

    /* renamed from: a, reason: collision with root package name */
    public final int f70685a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70686b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70687c;

    /* renamed from: d, reason: collision with root package name */
    public final int f70688d;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f70686b;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, this.f70687c, false);
        C15137b.n(parcel, 3, this.f70688d);
        C15137b.n(parcel, 1000, this.f70685a);
        C15137b.b(parcel, iA);
    }

    public C7239Uj(int i10, int i11, String str, int i12) {
        this.f70685a = i10;
        this.f70686b = i11;
        this.f70687c = str;
        this.f70688d = i12;
    }
}
