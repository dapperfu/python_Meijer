package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkh extends zzkx {
    private final zzjb zzh;

    public zzkh(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, zzjb zzjbVar) {
        super(zzjjVar, "Fus2TIottASqUG+EGDCyGO+axdDK4SxdbOtAeYlmTQFyRNCoSHhhJulqJwIS8hGd", "ll+J41g6Bvm1JCdBcQ1AcuCOT9Ou/f0f9V5bVMwdM4A=", zzanVar, i10, 94);
        this.zzh = zzjbVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(zzbc.zza(iIntValue));
        }
    }
}
