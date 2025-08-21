package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class S5 extends AbstractC15707a {
    public static final Parcelable.Creator<S5> CREATOR = new T5();

    /* renamed from: a, reason: collision with root package name */
    public final String f86059a;

    /* renamed from: b, reason: collision with root package name */
    public final long f86060b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86061c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f86059a;
        int iA = C15708b.a(parcel);
        C15708b.w(parcel, 1, str, false);
        C15708b.s(parcel, 2, this.f86060b);
        C15708b.n(parcel, 3, this.f86061c);
        C15708b.b(parcel, iA);
    }

    S5(String str, long j10, int i10) {
        this.f86059a = str;
        this.f86060b = j10;
        this.f86061c = i10;
    }
}
