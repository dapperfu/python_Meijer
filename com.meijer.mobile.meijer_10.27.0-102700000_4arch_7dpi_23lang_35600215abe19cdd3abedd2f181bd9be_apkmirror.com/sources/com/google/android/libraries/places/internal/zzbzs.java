package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbzs {
    private zzbzr zza;
    private final zzbyn zzb = new zzbyn();

    public final zzbzs zza(zzbzr zzbzrVar) {
        this.zza = zzbzrVar;
        return this;
    }

    final /* synthetic */ zzbzr zzd() {
        return this.zza;
    }

    final /* synthetic */ zzbyn zze() {
        return this.zzb;
    }

    public final zzbzs zzb(String str, String str2) {
        this.zzb.zza(str, str2);
        return this;
    }

    public final zzbzt zzc() {
        if (this.zza != null) {
            return new zzbzt(this, null);
        }
        throw new IllegalStateException("url == null");
    }
}
