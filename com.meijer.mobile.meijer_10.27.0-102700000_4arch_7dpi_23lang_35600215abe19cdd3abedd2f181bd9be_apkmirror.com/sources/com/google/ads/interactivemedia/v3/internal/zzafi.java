package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes4.dex */
final class zzafi {
    public static final /* synthetic */ int zza = 0;
    private static final zzafi zzb = new zzafi();
    private final ConcurrentMap zzd = new ConcurrentHashMap();
    private final zzafu zzc = new zzaet();

    public static zzafi zza() {
        return zzb;
    }

    public final zzaft zzb(Class cls) {
        zzaee.zzc(cls, "messageType");
        zzaft zzaftVar = (zzaft) this.zzd.get(cls);
        if (zzaftVar != null) {
            return zzaftVar;
        }
        zzaft zzaftVarZza = this.zzc.zza(cls);
        zzaee.zzc(cls, "messageType");
        zzaft zzaftVar2 = (zzaft) this.zzd.putIfAbsent(cls, zzaftVarZza);
        return zzaftVar2 == null ? zzaftVarZza : zzaftVar2;
    }

    private zzafi() {
    }
}
