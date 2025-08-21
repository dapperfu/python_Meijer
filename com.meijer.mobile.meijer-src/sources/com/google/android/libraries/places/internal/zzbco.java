package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbco extends zzbcm {
    zzbco() {
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ Object zzf() {
        return zzbcn.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* bridge */ /* synthetic */ void zza(Object obj, int i10, long j10) {
        ((zzbcn) obj).zzk(i10 << 3, Long.valueOf(j10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* bridge */ /* synthetic */ void zzb(Object obj, int i10, int i11) {
        ((zzbcn) obj).zzk((i10 << 3) | 5, Integer.valueOf(i11));
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* bridge */ /* synthetic */ void zzc(Object obj, int i10, long j10) {
        ((zzbcn) obj).zzk((i10 << 3) | 1, Long.valueOf(j10));
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* bridge */ /* synthetic */ void zzd(Object obj, int i10, zzayz zzayzVar) {
        ((zzbcn) obj).zzk((i10 << 3) | 2, zzayzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* bridge */ /* synthetic */ void zze(Object obj, int i10, Object obj2) {
        ((zzbcn) obj).zzk((i10 << 3) | 3, (zzbcn) obj2);
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ Object zzg(Object obj) {
        zzbcn zzbcnVar = (zzbcn) obj;
        zzbcnVar.zzd();
        return zzbcnVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* bridge */ /* synthetic */ Object zzh(Object obj) {
        zzbae zzbaeVar = (zzbae) obj;
        zzbcn zzbcnVar = zzbaeVar.zzc;
        if (zzbcnVar != zzbcn.zza()) {
            return zzbcnVar;
        }
        zzbcn zzbcnVarZzb = zzbcn.zzb();
        zzbaeVar.zzc = zzbcnVarZzb;
        return zzbcnVarZzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final /* synthetic */ void zzi(Object obj, Object obj2) {
        ((zzbae) obj).zzc = (zzbcn) obj2;
    }

    @Override // com.google.android.libraries.places.internal.zzbcm
    final void zzj(Object obj) {
        ((zzbae) obj).zzc.zzd();
    }
}
