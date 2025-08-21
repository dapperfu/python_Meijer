package com.google.ads.interactivemedia.pal;

import android.os.Handler;
import com.google.android.gms.internal.pal.C10783e2;

/* loaded from: classes4.dex */
public final class zzav {
    private final Handler zza;
    private final C10783e2 zzb;
    private Runnable zzc;

    public zzav(Handler handler, C10783e2 c10783e2) {
        this.zza = handler;
        this.zzb = c10783e2;
    }

    public final void zzc(Runnable runnable) {
        if (this.zzc != null) {
            return;
        }
        zzau zzauVar = new zzau(this, runnable);
        this.zzc = zzauVar;
        this.zza.postDelayed(zzauVar, this.zzb.zzd());
    }

    public final void zzd() {
        Runnable runnable = this.zzc;
        if (runnable == null) {
            return;
        }
        this.zza.removeCallbacks(runnable);
        this.zzc = null;
    }

    protected final void finalize() throws Throwable {
        zzd();
        super.finalize();
    }
}
