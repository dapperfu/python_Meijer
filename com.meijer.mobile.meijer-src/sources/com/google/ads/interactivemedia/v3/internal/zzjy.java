package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzjy extends zzkx {
    public zzjy(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "9AapCvSXzV8coBAg7sVelaiXfAsx9AWmDDIfeprqYS1mc42o+3U7/Q/ITW6cj3Q0", "GaGK7jWkEusMCurSk2Iqvi/xAbfN6zA5X3MQPC18/40=", zzanVar, i10, 5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzm(-1L);
        this.zzd.zzl(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (this.zzd) {
            try {
                this.zzd.zzm(iArr[0]);
                this.zzd.zzl(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    this.zzd.zzk(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
