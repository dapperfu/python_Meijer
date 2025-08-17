package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzboh implements Runnable {
    final /* synthetic */ zzbok zza;
    private final zzbjb zzb;

    final /* synthetic */ void zza(IOException iOException) {
        String strZzh = this.zza.zzh();
        zzbjc zzbjcVarZza = zzbjd.zza();
        zzbjcVarZza.zza(zzbjx.zzb(zzbjv.zzi.zze("Unable to resolve host ".concat(String.valueOf(strZzh))).zzd(iOException)));
        this.zzb.zza(zzbjcVarZza.zzc());
    }

    final /* synthetic */ void zzb(zzbjc zzbjcVar) {
        this.zzb.zza(zzbjcVar.zzc());
    }

    zzboh(zzbok zzbokVar, zzbjb zzbjbVar) {
        Objects.requireNonNull(zzbokVar);
        this.zza = zzbokVar;
        this.zzb = (zzbjb) p.r(zzbjbVar, "savedListener");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ea A[DONT_GENERATE] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzboh.run():void");
    }

    final /* synthetic */ void zzc(zzbob zzbobVar) {
        zzbjv zzbjvVarZza = zzbobVar.zza();
        zzbjc zzbjcVarZza = zzbjd.zza();
        zzbjcVarZza.zza(zzbjx.zzb(zzbjvVarZza));
        this.zzb.zza(zzbjcVarZza.zzc());
    }
}
