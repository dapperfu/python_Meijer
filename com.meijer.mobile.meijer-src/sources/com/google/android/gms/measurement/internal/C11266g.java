package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11266g extends AbstractC15707a {
    public static final Parcelable.Creator<C11266g> CREATOR = new C11274h();

    /* renamed from: a, reason: collision with root package name */
    public final long f86398a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86399b;

    /* renamed from: c, reason: collision with root package name */
    public final long f86400c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f86398a;
        int iA = C15708b.a(parcel);
        C15708b.s(parcel, 1, j10);
        C15708b.n(parcel, 2, this.f86399b);
        C15708b.s(parcel, 3, this.f86400c);
        C15708b.b(parcel, iA);
    }

    C11266g(long j10, int i10, long j11) {
        this.f86398a = j10;
        this.f86399b = i10;
        this.f86400c = j11;
    }
}
