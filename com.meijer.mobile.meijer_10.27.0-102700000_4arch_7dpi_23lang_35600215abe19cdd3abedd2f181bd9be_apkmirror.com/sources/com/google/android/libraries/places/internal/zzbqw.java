package com.google.android.libraries.places.internal;

import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqw extends zzbvl {
    final /* synthetic */ zzbiu zza;
    final /* synthetic */ zzbfd zzb;
    final /* synthetic */ zzbgd zzc;
    final /* synthetic */ zzbqx zzd;

    /* JADX WARN: Illegal instructions before constructor call */
    zzbqw(zzbqx zzbqxVar, zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbvm zzbvmVar, zzbpg zzbpgVar, zzbgd zzbgdVar) {
        this.zza = zzbiuVar;
        this.zzb = zzbfdVar;
        this.zzc = zzbgdVar;
        Objects.requireNonNull(zzbqxVar);
        this.zzd = zzbqxVar;
        zzbrx zzbrxVar = zzbqxVar.zzb;
        super(zzbiuVar, zzbipVar, zzbrxVar.zzad(), zzbrxVar.zzae(), zzbrxVar.zzaf(), zzbrxVar.zzp(zzbfdVar), zzbqxVar.zzb.zzu().zzb(), zzbvmVar, zzbpgVar, zzbqxVar.zza);
    }

    @Override // com.google.android.libraries.places.internal.zzbvl
    final zzbjv zze() {
        zzbrw zzbrwVarZzL = this.zzd.zzb.zzL();
        synchronized (zzbrwVarZzL.zza) {
            try {
                zzbjv zzbjvVar = zzbrwVarZzL.zzc;
                if (zzbjvVar != null) {
                    return zzbjvVar;
                }
                zzbrwVarZzL.zzb.add(this);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvl
    final void zzg() {
        zzbjv zzbjvVar;
        zzbrw zzbrwVarZzL = this.zzd.zzb.zzL();
        synchronized (zzbrwVarZzL.zza) {
            try {
                zzbrwVarZzL.zzb.remove(this);
                if (zzbrwVarZzL.zzb.isEmpty()) {
                    zzbjvVar = zzbrwVarZzL.zzc;
                    zzbrwVarZzL.zzb = new HashSet();
                } else {
                    zzbjvVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (zzbjvVar != null) {
            zzbrwVarZzL.zzd.zzK().zzd(zzbjvVar);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbvl
    final zzblr zzh(zzbip zzbipVar, zzbfm zzbfmVar, int i10, boolean z10) {
        zzbfd zzbfdVarZzf = this.zzb.zzf(zzbfmVar);
        zzbfp[] zzbfpVarArrZzf = zzbpf.zzf(zzbfdVarZzf, zzbipVar, i10, z10);
        zzbgd zzbgdVarZzb = this.zzc.zzb();
        try {
            return this.zzd.zzb.zzK().zzb(this.zza, zzbipVar, zzbfdVarZzf, zzbfpVarArrZzf);
        } finally {
            this.zzc.zzc(zzbgdVarZzb);
        }
    }
}
