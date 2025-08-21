package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkf extends zzkx {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzkf(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "Yg7XTmV44rTPXCawjL+LLnad7Fgn9Aqg1oEqF/5ILJmBvjYFNR2q4oPr2MLzmzFr", "OmskNefI5KGTHj+9JnPSsNTlAsLQMDTHxEai8PMBc7Y=", zzanVar, i10, 22);
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
            this.zzd.zzy(zzh.longValue());
        }
    }
}
