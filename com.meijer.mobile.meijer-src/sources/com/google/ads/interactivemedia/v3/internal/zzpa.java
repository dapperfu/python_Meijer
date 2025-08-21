package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class zzpa extends AbstractC15707a {
    public static final Parcelable.Creator<zzpa> CREATOR = new zzpb();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    zzpa(int i10, byte[] bArr, int i11) {
        this.zza = i10;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.g(parcel, 2, this.zzb, false);
        C15708b.n(parcel, 3, this.zzc);
        C15708b.b(parcel, iA);
    }

    public zzpa(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
