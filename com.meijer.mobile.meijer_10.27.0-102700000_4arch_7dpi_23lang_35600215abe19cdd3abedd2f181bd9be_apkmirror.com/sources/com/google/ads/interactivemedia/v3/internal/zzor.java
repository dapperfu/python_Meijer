package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class zzor extends AbstractC15136a {
    public static final Parcelable.Creator<zzor> CREATOR = new zzos();
    public final int zza;
    private zzbp zzb = null;
    private byte[] zzc;

    private final void zzb() {
        zzbp zzbpVar = this.zzb;
        if (zzbpVar != null || this.zzc == null) {
            if (zzbpVar == null || this.zzc != null) {
                if (zzbpVar != null && this.zzc != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzbpVar != null || this.zzc != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zza;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        byte[] bArrZzav = this.zzc;
        if (bArrZzav == null) {
            bArrZzav = this.zzb.zzav();
        }
        C15137b.g(parcel, 2, bArrZzav, false);
        C15137b.b(parcel, iA);
    }

    public final zzbp zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzbp.zzd(this.zzc, zzadk.zza());
                this.zzc = null;
            } catch (zzaeg | NullPointerException e10) {
                throw new IllegalStateException(e10);
            }
        }
        zzb();
        return this.zzb;
    }

    zzor(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzc = bArr;
        zzb();
    }
}
