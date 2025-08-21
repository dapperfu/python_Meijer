package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzks extends zzkx {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzks(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "tcR33IRFUbyN40xqCgABnI/9LsQindHOMS174YFQDeQf7OxZ+1/XT6alWsupn6gv", "9MshwtT+S3va52FSe6SYgVUb3QNeeYys8AoyRUVWlrg=", zzanVar, i10, 33);
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
            this.zzd.zzV(zzh.longValue());
        }
    }
}
