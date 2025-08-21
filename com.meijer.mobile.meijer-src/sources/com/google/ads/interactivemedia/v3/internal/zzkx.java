package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public abstract class zzkx implements Callable {
    protected final zzjj zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzan zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public zzkx(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        this.zza = zzjjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzanVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zze();
        return null;
    }

    public Void zze() throws Exception {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = methodZzj;
            if (methodZzj != null) {
                zza();
                zzhz zzhzVarZzd = this.zza.zzd();
                if (zzhzVarZzd != null && (i10 = this.zzf) != Integer.MIN_VALUE) {
                    zzhzVarZzd.zzc(this.zzg, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
                    return null;
                }
                return null;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
