package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class zzop extends AbstractC15136a {
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
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.w(parcel, 2, this.zzb, false);
        C15137b.w(parcel, 3, this.zzc, false);
        C15137b.b(parcel, iA);
    }
}
