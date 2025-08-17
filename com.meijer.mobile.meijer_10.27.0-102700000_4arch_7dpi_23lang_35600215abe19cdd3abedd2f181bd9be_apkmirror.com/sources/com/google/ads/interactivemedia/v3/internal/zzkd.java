package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkd extends zzkx {
    private final zzjk zzh;

    public zzkd(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, zzjk zzjkVar) {
        super(zzjjVar, "MYxgDIrh+gy86kN1XY6ylXIPeNjoW1IMoZZuWIGwGNUEplJDYFOwysCZ/m/vn5Hd", "SSWkXiA6wy65+39wH1IAu/x4WRBY+euODs95Kr/RwrI=", zzanVar, i10, 85);
        this.zzh = zzjkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = (long[]) this.zze.invoke(null, Long.valueOf(this.zzh.zzd()), Long.valueOf(this.zzh.zzh()), Long.valueOf(this.zzh.zzb()), Long.valueOf(this.zzh.zzf()));
        synchronized (this.zzd) {
            this.zzd.zzv(jArr[0]);
            this.zzd.zzu(jArr[1]);
        }
    }
}
