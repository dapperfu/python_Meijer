package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzjz extends zzkx {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzjz(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "cjSsFcxVax6EwbsuZafYPPxAHkUT7a2SIb/oCbet6iQURCCVL9GhJgHBmqsITnDG", "2GoTKU7iwzLx50MI3wGMB3wuOh4ehkqUJCToqX/EZgk=", zzanVar, i10, 44);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzo(zzh.longValue());
        }
    }
}
