package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class H0 extends AbstractC15136a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* renamed from: a, reason: collision with root package name */
    public final long f81774a;

    /* renamed from: b, reason: collision with root package name */
    public final long f81775b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81776c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f81777d;

    /* renamed from: e, reason: collision with root package name */
    public final String f81778e;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f81774a;
        int iA = C15137b.a(parcel);
        C15137b.s(parcel, 1, j10);
        C15137b.s(parcel, 2, this.f81775b);
        C15137b.c(parcel, 3, this.f81776c);
        C15137b.e(parcel, 7, this.f81777d, false);
        C15137b.w(parcel, 8, this.f81778e, false);
        C15137b.b(parcel, iA);
    }

    public H0(long j10, long j11, boolean z10, Bundle bundle, String str) {
        this.f81774a = j10;
        this.f81775b = j11;
        this.f81776c = z10;
        this.f81777d = bundle;
        this.f81778e = str;
    }
}
