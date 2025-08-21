package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes4.dex */
final class zzit implements zzix {
    final /* synthetic */ Activity zza;

    zzit(zziy zziyVar, Activity activity) {
        this.zza = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzix
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.zza);
    }
}
