package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzblp implements zzblt {
    final /* synthetic */ zzblq zza;
    private final zzbfh zzb;
    private zzbjv zzc;

    final /* synthetic */ zzbfh zzf() {
        return this.zzb;
    }

    final /* synthetic */ zzbjv zzg() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zza(zzbip zzbipVar) {
        int i10 = zzcba.zza;
        this.zza.zzj().execute(new zzbll(this, zzcba.zzb(), zzbipVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzb(zzbwi zzbwiVar) {
        int i10 = zzcba.zza;
        this.zza.zzj().execute(new zzblm(this, zzcba.zzb(), zzbwiVar));
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zzc(zzbjv zzbjvVar, zzbls zzblsVar, zzbip zzbipVar) {
        int i10 = zzcba.zza;
        zzblq zzblqVar = this.zza;
        zzbgg zzbggVarZzg = zzblqVar.zzg();
        if (zzbjvVar.zzg() == zzbjs.CANCELLED && zzbggVarZzg != null && zzbggVarZzg.zzb()) {
            zzbjvVar = zzblqVar.zzm().zzc();
            zzbipVar = new zzbip();
        }
        zzblqVar.zzj().execute(new zzbln(this, zzcba.zzb(), zzbjvVar, zzbipVar));
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzd() {
        zzblq zzblqVar = this.zza;
        zzbis zzbisVarZza = zzblqVar.zzi().zza();
        if (zzbisVarZza == zzbis.UNARY || zzbisVarZza == zzbis.SERVER_STREAMING) {
            return;
        }
        zzblqVar.zzj().execute(new zzblo(this, zzcba.zzb()));
    }

    final /* synthetic */ void zze(zzbjv zzbjvVar) {
        this.zzc = zzbjvVar;
        this.zza.zzo().zzl(zzbjvVar);
    }

    public zzblp(zzblq zzblqVar, zzbfh zzbfhVar) {
        Objects.requireNonNull(zzblqVar);
        this.zza = zzblqVar;
        this.zzb = (zzbfh) p.r(zzbfhVar, "observer");
    }
}
