package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzdw implements Runnable {
    zzdw() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (zzdz.zzc != null) {
            zzdz.zzc.post(zzdz.zzd);
            zzdz.zzc.postDelayed(zzdz.zze, 200L);
        }
    }
}
