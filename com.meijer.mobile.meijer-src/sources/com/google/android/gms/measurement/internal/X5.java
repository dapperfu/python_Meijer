package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class X5 extends AbstractC15707a {
    public static final Parcelable.Creator<X5> CREATOR = new Y5();

    /* renamed from: a, reason: collision with root package name */
    public final long f86146a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f86147b;

    /* renamed from: c, reason: collision with root package name */
    public final String f86148c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f86149d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86150e;

    /* renamed from: f, reason: collision with root package name */
    public final long f86151f;

    /* renamed from: g, reason: collision with root package name */
    public String f86152g;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f86146a;
        int iA = C15708b.a(parcel);
        C15708b.s(parcel, 1, j10);
        C15708b.g(parcel, 2, this.f86147b, false);
        C15708b.w(parcel, 3, this.f86148c, false);
        C15708b.e(parcel, 4, this.f86149d, false);
        C15708b.n(parcel, 5, this.f86150e);
        C15708b.s(parcel, 6, this.f86151f);
        C15708b.w(parcel, 7, this.f86152g, false);
        C15708b.b(parcel, iA);
    }

    X5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f86146a = j10;
        this.f86147b = bArr;
        this.f86148c = str;
        this.f86149d = bundle;
        this.f86150e = i10;
        this.f86151f = j11;
        this.f86152g = str2;
    }
}
