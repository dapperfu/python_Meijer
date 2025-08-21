package com.google.ads.interactivemedia.v3.impl;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage;

/* loaded from: classes4.dex */
final class zza implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzb zza;

    zza(zzb zzbVar) {
        this.zza = zzbVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zzb zzbVar = this.zza;
        if (zzbVar.zze == activity) {
            zzbVar.zze = null;
            this.zza.zzi();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzb zzbVar = this.zza;
        if (zzbVar.zze == null || zzbVar.zze == activity) {
            zzbVar.zze = activity;
            zzb zzbVar2 = this.zza;
            zzbVar2.zza.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.activityMonitor, JavaScriptMessage.MsgType.appStateChanged, zzbVar2.zzb, zzbVar2.zzc("", "", "inactive")));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzb zzbVar = this.zza;
        if (zzbVar.zze == activity) {
            zzbVar.zza.zzn(new JavaScriptMessage(JavaScriptMessage.MsgChannel.activityMonitor, JavaScriptMessage.MsgType.appStateChanged, zzbVar.zzb, zzbVar.zzc("", "", "active")));
        }
    }
}
