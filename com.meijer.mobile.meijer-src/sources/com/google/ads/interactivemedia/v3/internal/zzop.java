package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class zzop extends AbstractC15707a {
    public static final Parcelable.Creator<zzop> CREATOR = new zzoq();
    public final int zza;
    public final String zzb;
    public final String zzc;

    zzop(int i10, String str, String str2) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
    }

    public zzop(String str, String str2) {
        this(1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.w(parcel, 2, this.zzb, false);
        C15708b.w(parcel, 3, this.zzc, false);
        C15708b.b(parcel, iA);
    }
}
