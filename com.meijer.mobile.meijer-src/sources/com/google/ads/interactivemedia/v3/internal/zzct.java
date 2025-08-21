package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class zzct implements Application.ActivityLifecycleCallbacks {
    protected boolean zza;
    private boolean zzb;
    private zzcs zzc;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zza(true);
    }

    protected void zzb(boolean z10) {
    }

    protected boolean zzc() {
        return false;
    }

    public final void zze(zzcs zzcsVar) {
        this.zzc = zzcsVar;
    }

    public final void zzf() {
        this.zzb = true;
        boolean zZzh = zzh();
        this.zza = zZzh;
        zzb(zZzh);
    }

    public final void zzg() {
        this.zzb = false;
        this.zzc = null;
    }

    private final void zza(boolean z10) {
        if (this.zza != z10) {
            this.zza = z10;
            if (this.zzb) {
                zzb(z10);
                zzcs zzcsVar = this.zzc;
                if (zzcsVar != null) {
                    zzcsVar.zzc(z10);
                }
            }
        }
    }

    private final boolean zzh() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100 || zzc();
    }

    public final void zzd(Context context) {
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        zza(zzh());
    }
}
