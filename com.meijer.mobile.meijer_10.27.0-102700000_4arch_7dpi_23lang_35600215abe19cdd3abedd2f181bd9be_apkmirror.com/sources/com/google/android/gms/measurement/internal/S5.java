package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class S5 extends AbstractC15136a {
    public static final Parcelable.Creator<S5> CREATOR = new T5();

    /* renamed from: a, reason: collision with root package name */
    public final String f85219a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f85221c;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f85219a;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.s(parcel, 2, this.f85220b);
        C15137b.n(parcel, 3, this.f85221c);
        C15137b.b(parcel, iA);
    }

    S5(String str, long j10, int i10) {
        this.f85219a = str;
        this.f85220b = j10;
        this.f85221c = i10;
    }
}
