package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes4.dex */
final class zziv implements zzix {
    final /* synthetic */ Activity zza;
    final /* synthetic */ Bundle zzb;

    zziv(zziy zziyVar, Activity activity, Bundle bundle) {
        this.zza = activity;
        this.zzb = bundle;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzix
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.zza, this.zzb);
    }
}
