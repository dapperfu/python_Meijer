package com.google.android.libraries.places.internal;

import Be.j;
import Be.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class zzbiy {
    private final int zza;
    private final zzbjn zzb;
    private final zzbkd zzc;
    private final zzbje zzd;
    private final ScheduledExecutorService zze;
    private final zzbfg zzf;
    private final Executor zzg;
    private final zzbiw zzh;
    private final zzbjj zzi;

    public static zzbix zzg() {
        return new zzbix();
    }

    public final int zza() {
        return this.zza;
    }

    public final zzbjn zzb() {
        return this.zzb;
    }

    public final zzbkd zzc() {
        return this.zzc;
    }

    public final zzbje zze() {
        return this.zzd;
    }

    public final Executor zzf() {
        return this.zzg;
    }

    public final ScheduledExecutorService zzd() {
        ScheduledExecutorService scheduledExecutorService = this.zze;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        throw new IllegalStateException("ScheduledExecutorService not set in Builder");
    }

    /* synthetic */ zzbiy(zzbix zzbixVar, byte[] bArr) {
        this.zza = ((Integer) p.r(zzbixVar.zzk(), "defaultPort not set")).intValue();
        this.zzb = (zzbjn) p.r(zzbixVar.zzl(), "proxyDetector not set");
        this.zzc = (zzbkd) p.r(zzbixVar.zzm(), "syncContext not set");
        this.zzd = (zzbje) p.r(zzbixVar.zzn(), "serviceConfigParser not set");
        this.zze = zzbixVar.zzo();
        this.zzf = zzbixVar.zzp();
        this.zzg = zzbixVar.zzq();
        this.zzh = zzbixVar.zzr();
        this.zzi = zzbixVar.zzs();
    }

    public final String toString() {
        return j.c(this).b("defaultPort", this.zza).d("proxyDetector", this.zzb).d("syncContext", this.zzc).d("serviceConfigParser", this.zzd).d("customArgs", null).d("scheduledExecutorService", this.zze).d("channelLogger", this.zzf).d("executor", this.zzg).d("overrideAuthority", null).d("metricRecorder", this.zzh).d("nameResolverRegistry", this.zzi).toString();
    }
}
