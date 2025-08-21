package com.google.android.libraries.places.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzazp {
    static final zzazp zza = new zzazp(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private final Map zzd;

    zzazp() {
        this.zzd = new HashMap();
    }

    zzazp(boolean z10) {
        this.zzd = Collections.EMPTY_MAP;
    }

    public static zzazp zza() {
        int i10 = zzbbv.zza;
        return zza;
    }

    public final zzbad zzb(zzbbl zzbblVar, int i10) {
        return (zzbad) this.zzd.get(new zzazo(zzbblVar, i10));
    }
}
