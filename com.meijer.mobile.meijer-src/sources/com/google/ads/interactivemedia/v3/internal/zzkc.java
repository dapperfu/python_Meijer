package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzkc implements Callable {
    private final zzjj zza;
    private final zzan zzb;

    public zzkc(zzjj zzjjVar, zzan zzanVar) {
        this.zza = zzjjVar;
        this.zzb = zzanVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzbp zzbpVarZzc = this.zza.zzc();
        if (zzbpVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                zzan zzanVar = this.zzb;
                byte[] bArrZzav = zzbpVarZzc.zzav();
                zzanVar.zzak(bArrZzav, 0, bArrZzav.length, zzadk.zza());
            }
            return null;
        } catch (zzaeg | NullPointerException unused) {
            return null;
        }
    }
}
