package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzke extends zzkx {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context contextZzb = this.zzj;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, contextZzb, this.zzi);
        long j10 = jArr2[0];
        this.zzh.put(1, Long.valueOf(jArr2[1]));
        long j11 = jArr2[2];
        this.zzh.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzv(j10);
            this.zzd.zzu(j11);
        }
    }

    public zzke(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, Map map, View view, Context context) {
        super(zzjjVar, "CySZ92smVj1VEbgo+eF7z9VJhaK3iCCfIVA3l/ENPWde309cuYGU/6wJ84OShHXw", "6FIIxFiGgkuuKEaa3ojkyxNzol7dOTz9phQiHKYrz68=", zzanVar, i10, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzc(int i10) {
        Map map = this.zzh;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.zzh.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
