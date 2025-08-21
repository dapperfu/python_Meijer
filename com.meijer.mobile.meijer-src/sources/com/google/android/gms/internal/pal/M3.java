package com.google.android.gms.internal.pal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class M3 implements O3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f83603a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f83604b;

    M3(P3 p32, Activity activity, Bundle bundle) {
        this.f83603a = activity;
        this.f83604b = bundle;
    }

    @Override // com.google.android.gms.internal.pal.O3
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f83603a, this.f83604b);
    }
}
