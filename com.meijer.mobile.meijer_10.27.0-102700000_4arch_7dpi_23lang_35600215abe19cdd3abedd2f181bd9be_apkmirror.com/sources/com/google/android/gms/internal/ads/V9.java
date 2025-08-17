package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes6.dex */
final class V9 implements InterfaceC7583ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f70808a;

    V9(C7689ca c7689ca, Activity activity) {
        this.f70808a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7583ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f70808a);
    }
}
