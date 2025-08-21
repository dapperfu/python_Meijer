package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class U9 implements InterfaceC7708ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f71390a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f71391b;

    U9(C7814ca c7814ca, Activity activity, Bundle bundle) {
        this.f71390a = activity;
        this.f71391b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7708ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f71390a, this.f71391b);
    }
}
