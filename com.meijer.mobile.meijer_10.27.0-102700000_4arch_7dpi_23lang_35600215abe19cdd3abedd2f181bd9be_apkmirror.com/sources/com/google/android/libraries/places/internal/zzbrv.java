package com.google.android.libraries.places.internal;

import Be.p;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbrv extends zzbkr {
    final zzbho zza;
    final zzbhf zzb;
    final zzbli zzc;
    final zzblj zzd;
    List zze;
    zzbqg zzf;
    boolean zzg;
    boolean zzh;
    zzbkc zzi;
    final /* synthetic */ zzbrx zzj;

    public final String toString() {
        return this.zzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzbhx
    public final void zza(zzbhz zzbhzVar) {
        zzbrx zzbrxVar = this.zzj;
        zzbkd zzbkdVar = zzbrxVar.zze;
        zzbkdVar.zzc();
        p.x(!this.zzg, "already started");
        p.x(!this.zzh, "already shutdown");
        p.x(!zzbrxVar.zzP(), "Channel is being terminated");
        this.zzg = true;
        zzblw zzblwVarZzu = zzbrxVar.zzu();
        String strZzb = zzbrxVar.zzb();
        ScheduledExecutorService scheduledExecutorServiceZzb = zzblwVarZzu.zzb();
        zzbrt zzbrtVar = new zzbrt(this, zzbhzVar);
        zzblg zzblgVarZzS = zzbrxVar.zzS();
        zzbgy zzbgyVarZzW = zzbrxVar.zzW();
        zzblh zzblhVarZza = zzblgVarZzS.zza();
        zzblj zzbljVar = this.zzd;
        zzbhf zzbhfVar = this.zzb;
        zzbli zzbliVar = this.zzc;
        List listZzB = zzbrxVar.zzB();
        zzbqg zzbqgVar = new zzbqg(this.zza, strZzb, zzbrxVar.zzC(), zzbrxVar.zzal(), zzbrxVar.zzu(), scheduledExecutorServiceZzb, zzbrxVar.zzz(), zzbkdVar, zzbrtVar, zzbgyVarZzW, zzblhVarZza, zzbljVar, zzbhfVar, zzbliVar, listZzB);
        zzbgu zzbguVar = new zzbgu();
        zzbguVar.zza("Child Subchannel started");
        zzbguVar.zzc(zzbgv.CT_INFO);
        zzbguVar.zzb(zzbrxVar.zzx().zza());
        zzbguVar.zzd(zzbqgVar);
        zzbrxVar.zzU().zza(zzbguVar.zze());
        this.zzf = zzbqgVar;
        zzbrxVar.zzW().zzb(zzbqgVar);
        zzbrxVar.zzG().add(zzbqgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbhx
    public final void zzb() {
        zzbkc zzbkcVar;
        zzbrx zzbrxVar = this.zzj;
        zzbkd zzbkdVar = zzbrxVar.zze;
        zzbkdVar.zzc();
        if (this.zzf == null) {
            this.zzh = true;
            return;
        }
        if (!this.zzh) {
            this.zzh = true;
        } else {
            if (!zzbrxVar.zzP() || (zzbkcVar = this.zzi) == null) {
                return;
            }
            zzbkcVar.zza();
            this.zzi = null;
        }
        if (zzbrxVar.zzP()) {
            this.zzf.zzd(zzbrx.zzc);
        } else {
            this.zzi = zzbkdVar.zzd(new zzbql(new zzbru(this)), 5L, TimeUnit.SECONDS, zzbrxVar.zzu().zzb());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbhx
    public final void zzc() {
        this.zzj.zze.zzc();
        p.x(this.zzg, "not started");
        this.zzf.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbhx
    public final void zzd(List list) {
        this.zzj.zze.zzc();
        this.zze = list;
        this.zzf.zzb(list);
    }

    @Override // com.google.android.libraries.places.internal.zzbhx
    public final Object zze() {
        p.x(this.zzg, "Subchannel is not started");
        return this.zzf;
    }

    zzbrv(zzbrx zzbrxVar, zzbho zzbhoVar) {
        Objects.requireNonNull(zzbrxVar);
        this.zzj = zzbrxVar;
        p.r(zzbhoVar, "args");
        this.zze = zzbhoVar.zza();
        this.zza = zzbhoVar;
        zzbhf zzbhfVarZzb = zzbhf.zzb("Subchannel", zzbrxVar.zzb());
        this.zzb = zzbhfVarZzb;
        zzblj zzbljVar = new zzblj(zzbhfVarZzb, 0, zzbrxVar.zzx().zza(), "Subchannel for ".concat(String.valueOf(zzbhoVar.zza())));
        this.zzd = zzbljVar;
        this.zzc = new zzbli(zzbljVar, zzbrxVar.zzx());
    }
}
