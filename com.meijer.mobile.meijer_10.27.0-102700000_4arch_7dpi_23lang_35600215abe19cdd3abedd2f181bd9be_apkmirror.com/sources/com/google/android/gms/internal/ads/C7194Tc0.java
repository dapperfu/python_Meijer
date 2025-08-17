package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Tc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7194Tc0 extends AbstractC15136a {
    public static final Parcelable.Creator<C7194Tc0> CREATOR = new C7228Uc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f70422a;

    /* renamed from: b, reason: collision with root package name */
    public final int f70423b;

    /* renamed from: c, reason: collision with root package name */
    public final String f70424c;

    /* renamed from: d, reason: collision with root package name */
    public final String f70425d;

    /* renamed from: e, reason: collision with root package name */
    public final int f70426e;

    C7194Tc0(int i10, int i11, int i12, String str, String str2) {
        this.f70422a = i10;
        this.f70423b = i11;
        this.f70424c = str;
        this.f70425d = str2;
        this.f70426e = i12;
    }

    public C7194Tc0(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f70422a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.f70423b);
        C15137b.w(parcel, 3, this.f70424c, false);
        C15137b.w(parcel, 4, this.f70425d, false);
        C15137b.n(parcel, 5, this.f70426e);
        C15137b.b(parcel, iA);
    }
}
