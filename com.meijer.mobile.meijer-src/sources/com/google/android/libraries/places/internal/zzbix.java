package com.google.android.libraries.places.internal;

import De.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes6.dex */
public final class zzbix {
    private Integer zza;
    private zzbjn zzb;
    private zzbkd zzc;
    private zzbje zzd;
    private ScheduledExecutorService zze;
    private zzbfg zzf;
    private Executor zzg;
    private zzbiw zzh;
    private zzbjj zzi;

    zzbix() {
    }

    public final zzbix zzg(Executor executor) {
        this.zzg = executor;
        return this;
    }

    public final zzbix zzh(zzbiw zzbiwVar) {
        this.zzh = zzbiwVar;
        return this;
    }

    public final zzbix zzi(zzbjj zzbjjVar) {
        this.zzi = zzbjjVar;
        return this;
    }

    final /* synthetic */ Integer zzk() {
        return this.zza;
    }

    final /* synthetic */ zzbjn zzl() {
        return this.zzb;
    }

    final /* synthetic */ zzbkd zzm() {
        return this.zzc;
    }

    final /* synthetic */ zzbje zzn() {
        return this.zzd;
    }

    final /* synthetic */ ScheduledExecutorService zzo() {
        return this.zze;
    }

    final /* synthetic */ zzbfg zzp() {
        return this.zzf;
    }

    final /* synthetic */ Executor zzq() {
        return this.zzg;
    }

    final /* synthetic */ zzbiw zzr() {
        return this.zzh;
    }

    final /* synthetic */ zzbjj zzs() {
        return this.zzi;
    }

    public final zzbix zza(int i10) {
        this.zza = 443;
        return this;
    }

    public final zzbiy zzj() {
        return new zzbiy(this, null);
    }

    public final zzbix zzb(zzbjn zzbjnVar) {
        this.zzb = (zzbjn) p.q(zzbjnVar);
        return this;
    }

    public final zzbix zzc(zzbkd zzbkdVar) {
        this.zzc = (zzbkd) p.q(zzbkdVar);
        return this;
    }

    public final zzbix zzd(ScheduledExecutorService scheduledExecutorService) {
        this.zze = (ScheduledExecutorService) p.q(scheduledExecutorService);
        return this;
    }

    public final zzbix zze(zzbje zzbjeVar) {
        this.zzd = (zzbje) p.q(zzbjeVar);
        return this;
    }

    public final zzbix zzf(zzbfg zzbfgVar) {
        this.zzf = (zzbfg) p.q(zzbfgVar);
        return this;
    }
}
