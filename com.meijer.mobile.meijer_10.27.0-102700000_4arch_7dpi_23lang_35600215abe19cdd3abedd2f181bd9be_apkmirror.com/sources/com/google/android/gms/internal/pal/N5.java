package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes6.dex */
public final class N5 extends AbstractC15136a {
    public static final Parcelable.Creator<N5> CREATOR = new O5();

    /* renamed from: a, reason: collision with root package name */
    public final int f82785a;

    /* renamed from: b, reason: collision with root package name */
    public final String f82786b;

    /* renamed from: c, reason: collision with root package name */
    public final String f82787c;

    N5(int i10, String str, String str2) {
        this.f82785a = i10;
        this.f82786b = str;
        this.f82787c = str2;
    }

    public N5(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, this.f82785a);
        C15137b.w(parcel, 2, this.f82786b, false);
        C15137b.w(parcel, 3, this.f82787c, false);
        C15137b.b(parcel, iA);
    }
}
