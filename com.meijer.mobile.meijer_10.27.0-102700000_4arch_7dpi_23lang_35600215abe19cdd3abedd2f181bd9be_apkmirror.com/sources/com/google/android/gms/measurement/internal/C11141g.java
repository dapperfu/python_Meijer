package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.measurement.internal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11141g extends AbstractC15136a {
    public static final Parcelable.Creator<C11141g> CREATOR = new C11149h();

    /* renamed from: a, reason: collision with root package name */
    public final long f85558a;

    /* renamed from: b, reason: collision with root package name */
    public final int f85559b;

    /* renamed from: c, reason: collision with root package name */
    public final long f85560c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        long j10 = this.f85558a;
        int iA = C15137b.a(parcel);
        C15137b.s(parcel, 1, j10);
        C15137b.n(parcel, 2, this.f85559b);
        C15137b.s(parcel, 3, this.f85560c);
        C15137b.b(parcel, iA);
    }

    C11141g(long j10, int i10, long j11) {
        this.f85558a = j10;
        this.f85559b = i10;
        this.f85560c = j11;
    }
}
