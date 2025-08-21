package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbiq {
    private zzbir zza;
    private zzbir zzb;
    private zzbis zzc;
    private String zzd;
    private boolean zze;

    private zzbiq() {
        throw null;
    }

    public final zzbiq zza(zzbir zzbirVar) {
        this.zza = zzbirVar;
        return this;
    }

    public final zzbiq zzb(zzbir zzbirVar) {
        this.zzb = zzbirVar;
        return this;
    }

    public final zzbiq zzc(zzbis zzbisVar) {
        this.zzc = zzbisVar;
        return this;
    }

    public final zzbiq zzd(String str) {
        this.zzd = str;
        return this;
    }

    public final zzbiq zze(boolean z10) {
        this.zze = true;
        return this;
    }

    /* synthetic */ zzbiq(byte[] bArr) {
    }

    public final zzbiu zzf() {
        return new zzbiu(this.zzc, this.zzd, this.zza, this.zzb, null, false, false, this.zze, null);
    }
}
