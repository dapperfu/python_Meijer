package com.google.android.libraries.places.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes6.dex */
public final class zzbfv {
    public static final /* synthetic */ int zza = 0;
    private static final zzbfv zzb = new zzbfv(new zzbfr(), zzbfs.zza);
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzbfv zza() {
        return zzb;
    }

    zzbfv(zzbfu... zzbfuVarArr) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzbfu zzbfuVar = zzbfuVarArr[i10];
            this.zzc.put(zzbfuVar.zza(), zzbfuVar);
        }
    }
}
