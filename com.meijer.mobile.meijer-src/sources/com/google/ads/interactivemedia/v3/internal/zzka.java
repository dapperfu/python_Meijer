package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzka extends zzkx {
    private final long zzh;

    public zzka(zzjj zzjjVar, String str, String str2, zzan zzanVar, long j10, int i10, int i11) {
        super(zzjjVar, "M15xBiwjCN96Wfw63Rr/fs0Y0GhtAeawHW/RMMdlzRuKFoPsxc8VRKvehmju67Mq", "pi9ztiAbRuPTirdH6Q55wZRVdhOPRi3ZtgfWyCi26hI=", zzanVar, i10, 25);
        this.zzh = j10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, null)).longValue();
        synchronized (this.zzd) {
            try {
                this.zzd.zzt(jLongValue);
                long j10 = this.zzh;
                if (j10 != 0) {
                    this.zzd.zzT(jLongValue - j10);
                    this.zzd.zzU(this.zzh);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
