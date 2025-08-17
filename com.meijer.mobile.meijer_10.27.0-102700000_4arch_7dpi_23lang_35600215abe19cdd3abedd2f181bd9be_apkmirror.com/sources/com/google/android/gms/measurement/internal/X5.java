package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class X5 extends AbstractC15136a {
    public static final Parcelable.Creator<X5> CREATOR = new Y5();

    /* renamed from: a, reason: collision with root package name */
    public final long f85306a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f85307b;

    /* renamed from: c, reason: collision with root package name */
    public final String f85308c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f85309d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85310e;

    /* renamed from: f, reason: collision with root package name */
    public final long f85311f;

    /* renamed from: g, reason: collision with root package name */
    public String f85312g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f85306a;
        int iA = C15137b.a(parcel);
        C15137b.s(parcel, 1, j10);
        C15137b.g(parcel, 2, this.f85307b, false);
        C15137b.w(parcel, 3, this.f85308c, false);
        C15137b.e(parcel, 4, this.f85309d, false);
        C15137b.n(parcel, 5, this.f85310e);
        C15137b.s(parcel, 6, this.f85311f);
        C15137b.w(parcel, 7, this.f85312g, false);
        C15137b.b(parcel, iA);
    }

    X5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f85306a = j10;
        this.f85307b = bArr;
        this.f85308c = str;
        this.f85309d = bundle;
        this.f85310e = i10;
        this.f85311f = j11;
        this.f85312g = str2;
    }
}
