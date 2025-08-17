package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzadk {
    static final zzadk zza = new zzadk(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc;
    private static volatile zzadk zzd;
    private final Map zze;

    zzadk() {
        this.zze = new HashMap();
    }

    zzadk(boolean z10) {
        this.zze = Collections.EMPTY_MAP;
    }

    public static zzadk zza() {
        int i10 = zzafi.zza;
        return zza;
    }

    public static zzadk zzb() {
        zzadk zzadkVar = zzd;
        if (zzadkVar != null) {
            return zzadkVar;
        }
        synchronized (zzadk.class) {
            try {
                zzadk zzadkVar2 = zzd;
                if (zzadkVar2 != null) {
                    return zzadkVar2;
                }
                int i10 = zzafi.zza;
                zzadk zzadkVarZzb = zzads.zzb(zzadk.class);
                zzd = zzadkVarZzb;
                return zzadkVarZzb;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzadx zzc(zzafb zzafbVar, int i10) {
        return (zzadx) this.zze.get(new zzadj(zzafbVar, i10));
    }
}
