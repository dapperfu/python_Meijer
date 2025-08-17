package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class zzoy extends AbstractC15136a {
    public static final Parcelable.Creator<zzoy> CREATOR = new zzoz();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    zzoy(int i10, int i11, int i12, String str, String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    public zzoy(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, this.zzb);
        C15137b.w(parcel, 3, this.zzc, false);
        C15137b.w(parcel, 4, this.zzd, false);
        C15137b.n(parcel, 5, this.zze);
        C15137b.b(parcel, iA);
    }
}
