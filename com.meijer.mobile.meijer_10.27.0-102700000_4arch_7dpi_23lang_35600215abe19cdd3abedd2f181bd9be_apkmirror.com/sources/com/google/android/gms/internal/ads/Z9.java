package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class Z9 implements InterfaceC7583ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f72089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f72090b;

    Z9(C7689ca c7689ca, Activity activity, Bundle bundle) {
        this.f72089a = activity;
        this.f72090b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7583ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f72089a, this.f72090b);
    }
}
