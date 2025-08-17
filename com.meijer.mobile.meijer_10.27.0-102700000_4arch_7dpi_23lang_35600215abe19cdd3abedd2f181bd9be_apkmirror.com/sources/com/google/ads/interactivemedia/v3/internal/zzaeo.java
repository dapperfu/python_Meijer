package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* loaded from: classes4.dex */
final class zzaeo {
    zzaeo() {
    }

    public static final List zza(Object obj, long j10) {
        int i10;
        zzaed zzaedVar = (zzaed) zzago.zzf(obj, j10);
        if (!zzaedVar.zzc()) {
            int size = zzaedVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzaed zzaedVarZzd = zzaedVar.zzd(i10);
            zzago.zzs(obj, j10, zzaedVarZzd);
            return zzaedVarZzd;
        }
        return zzaedVar;
    }
}
