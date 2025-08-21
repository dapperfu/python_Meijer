package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
abstract class zzbmj implements Runnable {
    private final zzbgd zza;

    protected zzbmj(zzbgd zzbgdVar) {
        this.zza = zzbgdVar;
    }

    public abstract void zza();

    @Override // java.lang.Runnable
    public final void run() {
        zzbgd zzbgdVarZzb = this.zza.zzb();
        try {
            zza();
        } finally {
            this.zza.zzc(zzbgdVarZzb);
        }
    }
}
