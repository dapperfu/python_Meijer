package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class M3 implements O3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f82763a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f82764b;

    M3(P3 p32, Activity activity, Bundle bundle) {
        this.f82763a = activity;
        this.f82764b = bundle;
    }

    @Override // com.google.android.gms.internal.pal.O3
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f82763a, this.f82764b);
    }
}
