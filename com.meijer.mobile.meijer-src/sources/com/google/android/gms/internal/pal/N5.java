package com.google.android.gms.internal.pal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes6.dex */
public final class N5 extends AbstractC15707a {
    public static final Parcelable.Creator<N5> CREATOR = new O5();

    /* renamed from: a, reason: collision with root package name */
    public final int f83625a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83626b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83627c;

    N5(int i10, String str, String str2) {
        this.f83625a = i10;
        this.f83626b = str;
        this.f83627c = str2;
    }

    public N5(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, this.f83625a);
        C15708b.w(parcel, 2, this.f83626b, false);
        C15708b.w(parcel, 3, this.f83627c, false);
        C15708b.b(parcel, iA);
    }
}
