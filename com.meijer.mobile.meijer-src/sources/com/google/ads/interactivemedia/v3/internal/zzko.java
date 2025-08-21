package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzko extends zzkx {
    private final boolean zzh;

    public zzko(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "8Ypoat4hJmb20CWBS2vm1Bwj5rMbit3AiLM5WASq9kLQGiCpUdBOaxuIoDBxCVKn", "vUHFjnocTkwTSea4TN+zEmhwStt81G8dz02qs1gtO4U=", zzanVar, i10, 61);
        this.zzh = zzjjVar.zzs();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, this.zza.zzb(), Boolean.valueOf(this.zzh))).longValue();
        synchronized (this.zzd) {
            this.zzd.zzE(jLongValue);
        }
    }
}
