package com.google.android.libraries.places.internal;

import java.io.IOException;

/* loaded from: classes6.dex */
abstract class zzbcm {
    private static volatile int zza = 100;

    zzbcm() {
    }

    abstract void zza(Object obj, int i10, long j10);

    abstract void zzb(Object obj, int i10, int i11);

    abstract void zzc(Object obj, int i10, long j10);

    abstract void zzd(Object obj, int i10, zzayz zzayzVar);

    abstract void zze(Object obj, int i10, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzbby zzbbyVar, int i10) throws IOException {
        int iZzc = zzbbyVar.zzc();
        int i11 = iZzc >>> 3;
        int i12 = iZzc & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                zzb(obj, i11, zzbbyVar.zzk());
                                return true;
                            }
                            throw new zzbaq("Protocol message tag had invalid wire type.");
                        }
                        if (i10 != 0) {
                            return false;
                        }
                        throw new zzbar("Protocol message end-group tag did not match expected tag.");
                    }
                    Object objZzf = zzf();
                    int i13 = i11 << 3;
                    int i14 = i10 + 1;
                    if (i14 < zza) {
                        while (zzbbyVar.zzb() != Integer.MAX_VALUE && zzk(objZzf, zzbbyVar, i14)) {
                        }
                        if ((i13 | 4) == zzbbyVar.zzc()) {
                            zze(obj, i11, zzg(objZzf));
                            return true;
                        }
                        throw new zzbar("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzbar("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzd(obj, i11, zzbbyVar.zzs());
                return true;
            }
            zzc(obj, i11, zzbbyVar.zzj());
            return true;
        }
        zza(obj, i11, zzbbyVar.zzh());
        return true;
    }
}
