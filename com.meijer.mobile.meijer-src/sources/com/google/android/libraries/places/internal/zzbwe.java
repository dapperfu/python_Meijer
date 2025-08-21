package com.google.android.libraries.places.internal;

import De.p;
import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzbwe {
    private static final zzbwe zza = new zzbwe(new zzbwa());
    private final IdentityHashMap zzb = new IdentityHashMap();
    private ScheduledExecutorService zzc;

    final synchronized Object zzc(zzbwd zzbwdVar) {
        zzbwc zzbwcVar;
        try {
            IdentityHashMap identityHashMap = this.zzb;
            zzbwcVar = (zzbwc) identityHashMap.get(zzbwdVar);
            if (zzbwcVar == null) {
                zzbwcVar = new zzbwc(zzbwdVar.zzb());
                identityHashMap.put(zzbwdVar, zzbwcVar);
            }
            ScheduledFuture scheduledFuture = zzbwcVar.zzc;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                zzbwcVar.zzc = null;
            }
            zzbwcVar.zzb++;
        } catch (Throwable th2) {
            throw th2;
        }
        return zzbwcVar.zza;
    }

    final synchronized Object zzd(zzbwd zzbwdVar, Object obj) {
        try {
            zzbwc zzbwcVar = (zzbwc) this.zzb.get(zzbwdVar);
            if (zzbwcVar == null) {
                throw new IllegalArgumentException("No cached instance found for ".concat(String.valueOf(zzbwdVar)));
            }
            p.e(obj == zzbwcVar.zza, "Releasing the wrong instance");
            p.x(zzbwcVar.zzb > 0, "Refcount has already reached zero");
            int i10 = zzbwcVar.zzb - 1;
            zzbwcVar.zzb = i10;
            if (i10 == 0) {
                p.x(zzbwcVar.zzc == null, "Destroy task already scheduled");
                if (this.zzc == null) {
                    this.zzc = Executors.newSingleThreadScheduledExecutor(zzbpf.zzd("grpc-shared-destroyer-%d", true));
                }
                zzbwcVar.zzc = this.zzc.schedule(new zzbql(new zzbwb(this, zzbwcVar, zzbwdVar, obj)), 1L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return null;
    }

    final /* synthetic */ IdentityHashMap zze() {
        return this.zzb;
    }

    final /* synthetic */ ScheduledExecutorService zzf() {
        return this.zzc;
    }

    final /* synthetic */ void zzg(ScheduledExecutorService scheduledExecutorService) {
        this.zzc = null;
    }

    public static Object zza(zzbwd zzbwdVar) {
        return zza.zzc(zzbwdVar);
    }

    public static Object zzb(zzbwd zzbwdVar, Object obj) {
        zza.zzd(zzbwdVar, obj);
        return null;
    }

    zzbwe(zzbwa zzbwaVar) {
    }
}
