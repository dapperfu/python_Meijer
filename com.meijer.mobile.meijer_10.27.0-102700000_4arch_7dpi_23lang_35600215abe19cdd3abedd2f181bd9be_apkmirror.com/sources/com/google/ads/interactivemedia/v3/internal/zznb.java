package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class zznb extends AbstractC15136a {
    public static final Parcelable.Creator<zznb> CREATOR = new zznc();
    private final String zza;
    private final int zzb;
    private final String zzc;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iA = C15137b.a(parcel);
        C15137b.w(parcel, 1, str, false);
        C15137b.n(parcel, 2, this.zzb);
        C15137b.w(parcel, 3, this.zzc, false);
        C15137b.b(parcel, iA);
    }

    public zznb(String str, int i10, String str2) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = str2;
    }
}
