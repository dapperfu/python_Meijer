package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class zzpa extends AbstractC15136a {
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
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.g(parcel, 2, this.zzb, false);
        C15137b.n(parcel, 3, this.zzc);
        C15137b.b(parcel, iA);
    }

    public zzpa(byte[] bArr, int i10) {
        this(1, null, 1);
    }
}
