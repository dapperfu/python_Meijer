package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: com.google.android.gms.internal.ads.Vc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7261Vc0 extends AbstractC15136a {
    public static final Parcelable.Creator<C7261Vc0> CREATOR = new C7294Wc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f70895a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f70896b;

    /* renamed from: c, reason: collision with root package name */
    public final int f70897c;

    C7261Vc0(int i10, byte[] bArr, int i11) {
        this.f70895a = i10;
        this.f70896b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f70897c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f70895a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.g(parcel, 2, this.f70896b, false);
        C15137b.n(parcel, 3, this.f70897c);
        C15137b.b(parcel, iA);
    }

    public C7261Vc0(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
