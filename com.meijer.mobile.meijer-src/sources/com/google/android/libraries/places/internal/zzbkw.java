package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class zzbkw {
    final /* synthetic */ zzblb zza;
    private final zzbhr zzb;
    private zzbia zzc;
    private zzbic zzd;

    public final zzbia zzc() {
        return this.zzc;
    }

    final void zzb() {
        this.zzc.zzc();
        this.zzc = null;
    }

    zzbkw(zzblb zzblbVar, zzbhr zzbhrVar) {
        Objects.requireNonNull(zzblbVar);
        this.zza = zzblbVar;
        this.zzb = zzbhrVar;
        zzbic zzbicVarZzb = zzblbVar.zzc().zzb(zzblbVar.zzd());
        this.zzd = zzbicVarZzb;
        if (zzbicVarZzb != null) {
            this.zzc = zzbicVarZzb.zza(zzbhrVar);
            return;
        }
        String strZzd = zzblbVar.zzd();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strZzd).length() + 182);
        sb2.append("Could not find policy '");
        sb2.append(strZzd);
        sb2.append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(sb2.toString());
    }

    final zzbjv zza(zzbhw zzbhwVar) {
        zzbvy zzbvyVar = (zzbvy) zzbhwVar.zze();
        byte[] bArr = null;
        if (zzbvyVar == null) {
            try {
                zzblb zzblbVar = this.zza;
                zzbvyVar = new zzbvy(zzblbVar.zzb(zzblbVar.zzd(), "using default policy"), null);
            } catch (zzbla e10) {
                this.zzb.zzb(zzbfy.TRANSIENT_FAILURE, new zzbky(zzbjv.zzh.zze(e10.getMessage())));
                this.zzc.zzc();
                this.zzd = null;
                this.zzc = new zzbkz(bArr);
                return zzbjv.zza;
            }
        }
        if (this.zzd == null || !zzbvyVar.zza.zzd().equals(this.zzd.zzd())) {
            zzbhr zzbhrVar = this.zzb;
            zzbhrVar.zzb(zzbfy.CONNECTING, new zzbkx(bArr));
            this.zzc.zzc();
            zzbic zzbicVar = zzbvyVar.zza;
            this.zzd = zzbicVar;
            zzbia zzbiaVar = this.zzc;
            this.zzc = zzbicVar.zza(zzbhrVar);
            ((zzbrf) zzbhrVar).zzb.zzV().zzb(2, "Load balancer changed from {0} to {1}", zzbiaVar.getClass().getSimpleName(), this.zzc.getClass().getSimpleName());
        }
        Object obj = zzbvyVar.zzb;
        if (obj != null) {
            ((zzbrf) this.zzb).zzb.zzV().zzb(1, "Load-balancing config: {0}", obj);
        }
        zzbia zzbiaVar2 = this.zzc;
        zzbhv zzbhvVarZza = zzbhw.zza();
        zzbhvVarZza.zza(zzbhwVar.zzc());
        zzbhvVarZza.zzb(zzbhwVar.zzd());
        zzbhvVarZza.zzc(obj);
        return zzbiaVar2.zza(zzbhvVarZza.zzd());
    }
}
