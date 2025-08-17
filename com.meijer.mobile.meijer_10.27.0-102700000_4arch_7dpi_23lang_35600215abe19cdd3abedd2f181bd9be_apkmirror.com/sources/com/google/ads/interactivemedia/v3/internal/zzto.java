package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* loaded from: classes4.dex */
abstract class zzto extends zzub implements Runnable {
    public static final /* synthetic */ int zze = 0;
    zzuu zza;
    Object zzd;

    abstract Object zzs(Object obj, Object obj2) throws Exception;

    abstract void zzt(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        zzuu zzuuVar = this.zza;
        Object obj = this.zzd;
        if ((isCancelled() | (zzuuVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzuuVar.isCancelled()) {
            zzq(zzuuVar);
            return;
        }
        try {
            try {
                Object objZzs = zzs(obj, zzuk.zzd(zzuuVar));
                this.zzd = null;
                zzt(objZzs);
            } catch (Throwable th2) {
                try {
                    zzvc.zza(th2);
                    zzd(th2);
                } finally {
                    this.zzd = null;
                }
            }
        } catch (Error e10) {
            zzd(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzd(e11.getCause());
        } catch (Exception e12) {
            zzd(e12);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final String zza() {
        String str;
        zzuu zzuuVar = this.zza;
        Object obj = this.zzd;
        String strZza = super.zza();
        if (zzuuVar != null) {
            str = "inputFuture=[" + zzuuVar.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zztg
    protected final void zzb() {
        zzuu zzuuVar = this.zza;
        if ((zzuuVar != null) & isCancelled()) {
            zzuuVar.cancel(zzr());
        }
        this.zza = null;
        this.zzd = null;
    }

    zzto(zzuu zzuuVar, Object obj) {
        this.zza = zzuuVar;
        this.zzd = obj;
    }
}
