package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class H3 implements O3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f82638a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f82639b;

    H3(P3 p32, Activity activity, Bundle bundle) {
        this.f82638a = activity;
        this.f82639b = bundle;
    }

    @Override // com.google.android.gms.internal.pal.O3
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f82638a, this.f82639b);
    }
}
