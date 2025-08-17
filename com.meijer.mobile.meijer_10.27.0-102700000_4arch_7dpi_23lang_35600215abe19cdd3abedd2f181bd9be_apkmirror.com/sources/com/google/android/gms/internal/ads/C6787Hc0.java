package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Hc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6787Hc0 extends AbstractC15136a {
    public static final Parcelable.Creator<C6787Hc0> CREATOR = new C6821Ic0();

    /* renamed from: a, reason: collision with root package name */
    public final int f67478a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f67479b;

    C6787Hc0(int i10, byte[] bArr) {
        this.f67478a = i10;
        this.f67479b = bArr;
    }

    public C6787Hc0(byte[] bArr) {
        this(1, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f67478a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.g(parcel, 2, this.f67479b, false);
        C15137b.b(parcel, iA);
    }
}
