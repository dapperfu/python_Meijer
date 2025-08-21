package com.google.android.libraries.places.internal;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbgd {
    static final Logger zza = Logger.getLogger(zzbgd.class.getName());
    public static final zzbgd zzb = new zzbgd();

    private zzbgd() {
    }

    public static zzbgd zza() {
        zzbgd zzbgdVarZzc = zzbgb.zza.zzc();
        return zzbgdVarZzc == null ? zzb : zzbgdVarZzc;
    }

    static Object zze(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public final zzbgd zzb() {
        zzbgd zzbgdVarZza = zzbgb.zza.zza(this);
        return zzbgdVarZza == null ? zzb : zzbgdVarZza;
    }

    public final void zzc(zzbgd zzbgdVar) {
        zze(zzbgdVar, "toAttach");
        zzbgb.zza.zzb(this, zzbgdVar);
    }

    public final void zzd(zzbga zzbgaVar, Executor executor) {
        zze(executor, "executor");
    }
}
