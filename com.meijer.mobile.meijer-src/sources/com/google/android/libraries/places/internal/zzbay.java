package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
final class zzbay {
    zzbay() {
    }

    public static final List zza(Object obj, long j10) {
        int i10;
        zzbao zzbaoVar = (zzbao) zzbct.zzn(obj, j10);
        if (!zzbaoVar.zza()) {
            int size = zzbaoVar.size();
            if (size == 0) {
                i10 = 10;
            } else {
                i10 = size + size;
            }
            zzbao zzbaoVarZzg = zzbaoVar.zzg(i10);
            zzbct.zzo(obj, j10, zzbaoVarZzg);
            return zzbaoVarZzg;
        }
        return zzbaoVar;
    }
}
