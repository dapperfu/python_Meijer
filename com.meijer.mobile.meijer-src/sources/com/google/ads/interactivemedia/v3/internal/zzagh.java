package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
abstract class zzagh {
    private static volatile int zza = 100;

    zzagh() {
    }

    abstract Object zza(Object obj);

    abstract Object zzb();

    abstract Object zzc(Object obj);

    abstract void zzd(Object obj, int i10, int i11);

    abstract void zze(Object obj, int i10, long j10);

    abstract void zzf(Object obj, int i10, Object obj2);

    abstract void zzg(Object obj, int i10, zzacw zzacwVar);

    abstract void zzh(Object obj, int i10, long j10);

    abstract void zzi(Object obj);

    abstract void zzj(Object obj, Object obj2);

    final boolean zzk(Object obj, zzafl zzaflVar, int i10) throws IOException {
        int iZzd = zzaflVar.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                zzd(obj, i11, zzaflVar.zzf());
                                return true;
                            }
                            throw new zzaef("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    Object objZzb = zzb();
                    int i13 = i11 << 3;
                    int i14 = i10 + 1;
                    if (i14 < zza) {
                        while (zzaflVar.zzc() != Integer.MAX_VALUE && zzk(objZzb, zzaflVar, i14)) {
                        }
                        if ((i13 | 4) == zzaflVar.zzd()) {
                            zzf(obj, i11, zzc(objZzb));
                            return true;
                        }
                        throw new zzaeg("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzaeg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                zzg(obj, i11, zzaflVar.zzp());
                return true;
            }
            zze(obj, i11, zzaflVar.zzk());
            return true;
        }
        zzh(obj, i11, zzaflVar.zzl());
        return true;
    }
}
