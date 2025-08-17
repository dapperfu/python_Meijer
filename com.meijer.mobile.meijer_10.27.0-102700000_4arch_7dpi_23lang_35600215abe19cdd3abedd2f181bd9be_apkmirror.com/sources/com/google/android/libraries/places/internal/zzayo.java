package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public abstract class zzayo implements zzbbt {
    static {
        int i10 = zzazp.zzb;
        int i11 = zzbbv.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbbt
    public final /* bridge */ /* synthetic */ Object zza(zzazc zzazcVar, zzazp zzazpVar) throws zzbar {
        zzbcl zzbclVar;
        zzbbl zzbblVar = (zzbbl) zzb(zzazcVar, zzazpVar);
        if (zzbblVar != null && !zzbblVar.zzbA()) {
            if (!(zzbblVar instanceof zzaym)) {
                if (zzbblVar instanceof zzayn) {
                    throw null;
                }
                zzbclVar = new zzbcl(zzbblVar);
            } else {
                zzbclVar = new zzbcl((zzaym) zzbblVar);
            }
            throw zzbclVar.zza();
        }
        return zzbblVar;
    }
}
