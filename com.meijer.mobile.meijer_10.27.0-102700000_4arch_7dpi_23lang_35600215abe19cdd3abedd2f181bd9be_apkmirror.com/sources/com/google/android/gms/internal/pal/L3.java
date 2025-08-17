package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes6.dex */
final class L3 implements O3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f82738a;

    L3(P3 p32, Activity activity) {
        this.f82738a = activity;
    }

    @Override // com.google.android.gms.internal.pal.O3
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f82738a);
    }
}
