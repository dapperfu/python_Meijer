package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqe implements zzbsi {
    final zzbmg zza;
    boolean zzb;
    final /* synthetic */ zzbqg zzc;

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final zzbez zza(zzbez zzbezVar) {
        Iterator it = this.zzc.zzp().iterator();
        if (!it.hasNext()) {
            return zzbezVar;
        }
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zzb() {
        zzbqg zzbqgVar = this.zzc;
        zzbqgVar.zzo().zza(2, "READY");
        zzbqb zzbqbVar = new zzbqb(this);
        zzbkd zzbkdVarZzq = zzbqgVar.zzq();
        zzbkdVarZzq.zzb(zzbqbVar);
        zzbkdVarZzq.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zzc(boolean z10) {
        this.zzc.zzj(this.zza, z10);
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zzd(zzbjv zzbjvVar) {
        Object[] objArr = {this.zza.zzc(), zzbqg.zzM(zzbjvVar)};
        zzbqg zzbqgVar = this.zzc;
        zzbqgVar.zzo().zzb(2, "{0} SHUTDOWN with {1}", objArr);
        this.zzb = true;
        zzbqc zzbqcVar = new zzbqc(this, zzbjvVar);
        zzbkd zzbkdVarZzq = zzbqgVar.zzq();
        zzbkdVarZzq.zzb(zzbqcVar);
        zzbkdVarZzq.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbsi
    public final void zze() {
        p.x(this.zzb, "transportShutdown() must be called before transportTerminated().");
        zzbmg zzbmgVar = this.zza;
        Object[] objArr = {zzbmgVar.zzc()};
        zzbqg zzbqgVar = this.zzc;
        zzbqgVar.zzo().zzb(2, "{0} Terminated", objArr);
        zzbqgVar.zzn().zzg(zzbmgVar);
        zzbqgVar.zzj(zzbmgVar, false);
        Iterator it = zzbqgVar.zzp().iterator();
        if (it.hasNext()) {
            zzbmgVar.zzf();
            throw null;
        }
        zzbkd zzbkdVarZzq = zzbqgVar.zzq();
        zzbkdVarZzq.zzb(new zzbqd(this));
        zzbkdVarZzq.zza();
    }

    zzbqe(zzbqg zzbqgVar, zzbmg zzbmgVar) {
        Objects.requireNonNull(zzbqgVar);
        this.zzc = zzbqgVar;
        this.zzb = false;
        this.zza = zzbmgVar;
    }
}
