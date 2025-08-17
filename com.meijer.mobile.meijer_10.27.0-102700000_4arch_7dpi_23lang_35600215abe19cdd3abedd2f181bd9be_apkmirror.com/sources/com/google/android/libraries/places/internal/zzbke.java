package com.google.android.libraries.places.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbke extends zzbgc {
    private static final Logger zzb = Logger.getLogger(zzbke.class.getName());
    static final ThreadLocal zza = new ThreadLocal();

    zzbke() {
    }

    @Override // com.google.android.libraries.places.internal.zzbgc
    public final zzbgd zzc() {
        zzbgd zzbgdVar = (zzbgd) zza.get();
        return zzbgdVar == null ? zzbgd.zzb : zzbgdVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbgc
    public final zzbgd zza(zzbgd zzbgdVar) {
        zzbgd zzbgdVarZzc = zzc();
        zza.set(zzbgdVar);
        return zzbgdVarZzc;
    }

    @Override // com.google.android.libraries.places.internal.zzbgc
    public final void zzb(zzbgd zzbgdVar, zzbgd zzbgdVar2) {
        if (zzc() != zzbgdVar) {
            zzb.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (zzbgdVar2 != zzbgd.zzb) {
            zza.set(zzbgdVar2);
        } else {
            zza.set(null);
        }
    }
}
