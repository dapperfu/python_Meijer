package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class H0 extends AbstractC15707a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* renamed from: a, reason: collision with root package name */
    public final long f82614a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82615b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f82616c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f82617d;

    /* renamed from: e, reason: collision with root package name */
    public final String f82618e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f82614a;
        int iA = C15708b.a(parcel);
        C15708b.s(parcel, 1, j10);
        C15708b.s(parcel, 2, this.f82615b);
        C15708b.c(parcel, 3, this.f82616c);
        C15708b.e(parcel, 7, this.f82617d, false);
        C15708b.w(parcel, 8, this.f82618e, false);
        C15708b.b(parcel, iA);
    }

    public H0(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f82614a = j10;
        this.f82615b = j11;
        this.f82616c = z10;
        this.f82617d = bundle;
        this.f82618e = str;
    }
}
