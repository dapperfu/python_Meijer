package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;

/* loaded from: classes4.dex */
abstract class zzzm {
    final String zzg;
    final Field zzh;
    final String zzi;

    abstract void zza(zzacc zzaccVar, int i10, Object[] objArr) throws zzwa, IOException;

    abstract void zzb(zzacc zzaccVar, Object obj) throws IllegalAccessException, IOException;

    abstract void zzc(zzace zzaceVar, Object obj) throws IllegalAccessException, IOException;

    protected zzzm(String str, Field field) {
        this.zzg = str;
        this.zzh = field;
        this.zzi = field.getName();
    }
}
