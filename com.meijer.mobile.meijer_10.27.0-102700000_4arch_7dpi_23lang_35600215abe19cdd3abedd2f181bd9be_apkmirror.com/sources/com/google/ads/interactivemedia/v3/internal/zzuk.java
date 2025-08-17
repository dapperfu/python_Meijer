package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes4.dex */
public final class zzuk extends zzum {
    @SafeVarargs
    public static zzuj zza(zzuu... zzuuVarArr) {
        return new zzuj(false, zzrm.zzl(zzuuVarArr), null);
    }

    public static zzuu zzb(Object obj) {
        return obj == null ? zzun.zza : new zzun(obj);
    }

    public static zzuu zzc(zzuu zzuuVar, zzpz zzpzVar, Executor executor) {
        zztn zztnVar = new zztn(zzuuVar, zzpzVar);
        zzuuVar.zzo(zztnVar, zzvb.zzc(executor, zztnVar));
        return zztnVar;
    }

    public static void zze(zzuu zzuuVar, zzug zzugVar, Executor executor) {
        zzuuVar.zzo(new zzuh(zzuuVar, zzugVar), executor);
    }

    public static zzuu zzf(zzuu zzuuVar, zzgn zzgnVar, Executor executor) {
        int i10 = zzto.zze;
        executor.getClass();
        zztm zztmVar = new zztm(zzuuVar, zzgnVar);
        zzuuVar.zzo(zztmVar, zzvb.zzc(executor, zztmVar));
        return zztmVar;
    }

    public static Object zzd(Future future) throws ExecutionException {
        Object obj;
        if (future.isDone()) {
            boolean z10 = false;
            while (true) {
                try {
                    obj = future.get();
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                } catch (Throwable th2) {
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    throw th2;
                }
            }
            if (z10) {
                Thread.currentThread().interrupt();
            }
            return obj;
        }
        throw new IllegalStateException(zzqm.zzb("Future was expected to be done: %s", future));
    }
}
