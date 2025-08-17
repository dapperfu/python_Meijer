package com.google.android.libraries.places.internal;

import Be.j;
import java.util.Arrays;

/* loaded from: classes6.dex */
public abstract class zzbgm extends zzbih {
    protected zzbgm() {
    }

    protected abstract zzbih zza();

    public final String toString() {
        return j.c(this).d("delegate", zza()).toString();
    }

    public final zzbih zzb(zzbfj... zzbfjVarArr) {
        ((zzbsc) zza()).zza(Arrays.asList(zzbfjVarArr));
        return this;
    }

    public final zzbih zzc(String str) {
        ((zzbsc) zza()).zzb(str);
        return this;
    }

    @Override // com.google.android.libraries.places.internal.zzbih
    public final zzbif zzd() {
        return zza().zzd();
    }
}
