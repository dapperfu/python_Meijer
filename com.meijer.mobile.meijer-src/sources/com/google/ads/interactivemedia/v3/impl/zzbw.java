package com.google.ads.interactivemedia.v3.impl;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
abstract class zzbw {
    private final List zzb = new ArrayList(1);
    private final Handler zza = new Handler(Looper.getMainLooper());

    abstract VideoProgressUpdate zza();

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        List list = this.zzb;
        VideoProgressUpdate videoProgressUpdateZza = zza();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzbv) it.next()).zzw(videoProgressUpdateZza);
        }
        this.zza.postDelayed(new Runnable() { // from class: com.google.ads.interactivemedia.v3.impl.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzg();
            }
        }, 200L);
    }

    final void zzc(zzbv zzbvVar) {
        this.zzb.add(zzbvVar);
    }

    final void zzd(zzbv zzbvVar) {
        this.zzb.remove(zzbvVar);
    }

    final void zze() {
        this.zza.removeCallbacksAndMessages(null);
        zzg();
    }

    final void zzf() {
        this.zza.removeCallbacksAndMessages(null);
    }

    zzbw(long j10) {
    }
}
