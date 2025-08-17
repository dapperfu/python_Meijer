package com.google.android.libraries.places.internal;

import Be.p;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
final class zzbvi implements zzblt {
    final zzbvj zza;
    final /* synthetic */ zzbvl zzb;

    private static final Integer zze(zzbip zzbipVar) {
        String str = (String) zzbipVar.zzb(zzbvl.zzf);
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblt
    public final void zza(zzbip zzbipVar) {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        zzbvj zzbvjVar = this.zza;
        int i12 = zzbvjVar.zzd;
        if (i12 > 0) {
            zzbil zzbilVar = zzbvl.zze;
            zzbipVar.zzd(zzbilVar);
            zzbipVar.zzc(zzbilVar, String.valueOf(i12));
        }
        zzbvl zzbvlVar = this.zzb;
        zzbvlVar.zzp(zzbvjVar);
        if (zzbvlVar.zzQ().zzf == zzbvjVar) {
            if (zzbvlVar.zzO() != null) {
                zzbvk zzbvkVarZzO = zzbvlVar.zzO();
                do {
                    atomicInteger = zzbvkVarZzO.zzd;
                    i10 = atomicInteger.get();
                    i11 = zzbvkVarZzO.zza;
                    if (i10 == i11) {
                        break;
                    }
                } while (!atomicInteger.compareAndSet(i10, Math.min(zzbvkVarZzO.zzc + i10, i11)));
            }
            zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
            zzbkdVar.zzb(new zzbvb(this, zzbipVar));
            zzbkdVar.zza();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzb(zzbwi zzbwiVar) throws IOException {
        zzbvl zzbvlVar = this.zzb;
        zzbvj zzbvjVar = zzbvlVar.zzQ().zzf;
        p.x(zzbvjVar != null, "Headers should be received prior to messages.");
        if (zzbvjVar != this.zza) {
            zzbpf.zzg(zzbwiVar);
            return;
        }
        zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
        zzbkdVar.zzb(new zzbvg(this, zzbwiVar));
        zzbkdVar.zza();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ae  */
    @Override // com.google.android.libraries.places.internal.zzblt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzc(com.google.android.libraries.places.internal.zzbjv r21, com.google.android.libraries.places.internal.zzbls r22, com.google.android.libraries.places.internal.zzbip r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbvi.zzc(com.google.android.libraries.places.internal.zzbjv, com.google.android.libraries.places.internal.zzbls, com.google.android.libraries.places.internal.zzbip):void");
    }

    @Override // com.google.android.libraries.places.internal.zzbwj
    public final void zzd() {
        zzbvl zzbvlVar = this.zzb;
        if (zzbvlVar.zzm()) {
            zzbkd zzbkdVar = (zzbkd) zzbvlVar.zzF();
            zzbkdVar.zzb(new zzbvh(this));
            zzbkdVar.zza();
        }
    }

    zzbvi(zzbvl zzbvlVar, zzbvj zzbvjVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zzb = zzbvlVar;
        this.zza = zzbvjVar;
    }
}
