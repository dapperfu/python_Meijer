package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class Z9 implements InterfaceC7708ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f72929a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f72930b;

    Z9(C7814ca c7814ca, Activity activity, Bundle bundle) {
        this.f72929a = activity;
        this.f72930b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7708ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f72929a, this.f72930b);
    }
}
