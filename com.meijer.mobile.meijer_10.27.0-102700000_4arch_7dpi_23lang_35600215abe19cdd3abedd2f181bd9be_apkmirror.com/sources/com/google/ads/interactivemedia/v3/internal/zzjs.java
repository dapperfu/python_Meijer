package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzjs {
    private static final String[] zza = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long zzb = 0;
    private long zzc = 0;
    private long zzd = -1;
    private boolean zze = false;

    public final long zzb() {
        long j10 = this.zzd;
        this.zzd = -1L;
        return j10;
    }

    public final long zzc() {
        if (this.zze) {
            return this.zzc - this.zzb;
        }
        return -1L;
    }

    public static zzjs zzd(Context context, Executor executor) {
        return new zzjs(context, executor, zza);
    }

    public final void zzh() {
        if (this.zze) {
            this.zzc = System.currentTimeMillis();
        }
    }

    zzjs(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new zzjr(this));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
    }
}
