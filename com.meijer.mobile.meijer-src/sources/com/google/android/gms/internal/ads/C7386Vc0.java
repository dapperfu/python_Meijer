package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: com.google.android.gms.internal.ads.Vc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7386Vc0 extends AbstractC15707a {
    public static final Parcelable.Creator<C7386Vc0> CREATOR = new C7419Wc0();

    /* renamed from: a, reason: collision with root package name */
    public final int f71735a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f71736b;

    /* renamed from: c, reason: collision with root package name */
    public final int f71737c;

    C7386Vc0(int i10, byte[] bArr, int i11) {
        this.f71735a = i10;
        this.f71736b = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f71737c = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f71735a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.g(parcel, 2, this.f71736b, false);
        C15708b.n(parcel, 3, this.f71737c);
        C15708b.b(parcel, iA);
    }

    public C7386Vc0(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
