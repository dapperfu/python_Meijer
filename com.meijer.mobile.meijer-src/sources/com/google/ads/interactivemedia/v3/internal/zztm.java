package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
final class zztm extends zzto {
    @Override // com.google.ads.interactivemedia.v3.internal.zzto
    final /* bridge */ /* synthetic */ Object zzs(Object obj, Object obj2) throws Exception {
        zzgn zzgnVar = (zzgn) obj;
        zzai zzaiVar = zzgnVar.zza;
        ExecutorService executorService = zzgnVar.zzb;
        final Context context = zzgnVar.zzc;
        String str = (String) obj2;
        zzuu zzuuVarZzb = (!zzqm.zzc(str) || zzaiVar.zzf()) ? zzuk.zzb(str) : zzvb.zza(executorService).zza(new Callable() { // from class: com.google.ads.interactivemedia.v3.internal.zzgo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzgq.zzc(context);
            }
        });
        if (zzuuVarZzb != null) {
            return zzuuVarZzb;
        }
        throw new NullPointerException(zzqm.zzb("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzgnVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzto
    final /* synthetic */ void zzt(Object obj) {
        zzq((zzuu) obj);
    }

    zztm(zzuu zzuuVar, zzgn zzgnVar) {
        super(zzuuVar, zzgnVar);
    }
}
