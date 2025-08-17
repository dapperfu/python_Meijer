package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9950xj extends AbstractC15136a {
    public static final Parcelable.Creator<C9950xj> CREATOR = new C10057yj();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f79832a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79833b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79834c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f79835d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f79836e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f79837f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f79838g;

    /* renamed from: h, reason: collision with root package name */
    public final long f79839h;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        boolean z10 = this.f79832a;
        int iA = C15137b.a(parcel);
        C15137b.c(parcel, 1, z10);
        C15137b.w(parcel, 2, this.f79833b, false);
        C15137b.n(parcel, 3, this.f79834c);
        C15137b.g(parcel, 4, this.f79835d, false);
        C15137b.x(parcel, 5, this.f79836e, false);
        C15137b.x(parcel, 6, this.f79837f, false);
        C15137b.c(parcel, 7, this.f79838g);
        C15137b.s(parcel, 8, this.f79839h);
        C15137b.b(parcel, iA);
    }

    C9950xj(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.f79832a = z10;
        this.f79833b = str;
        this.f79834c = i10;
        this.f79835d = bArr;
        this.f79836e = strArr;
        this.f79837f = strArr2;
        this.f79838g = z11;
        this.f79839h = j10;
    }
}
