package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes6.dex */
final class W9 implements InterfaceC7708ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f71859a;

    W9(C7814ca c7814ca, Activity activity) {
        this.f71859a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7708ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f71859a);
    }
}
