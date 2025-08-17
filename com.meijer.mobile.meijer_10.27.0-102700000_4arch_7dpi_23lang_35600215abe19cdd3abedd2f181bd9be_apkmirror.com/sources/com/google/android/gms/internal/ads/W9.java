package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes6.dex */
final class W9 implements InterfaceC7583ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f71019a;

    W9(C7689ca c7689ca, Activity activity) {
        this.f71019a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7583ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f71019a);
    }
}
