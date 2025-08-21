package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7601aa implements InterfaceC7708ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f73285a;

    C7601aa(C7814ca c7814ca, Activity activity) {
        this.f73285a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7708ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f73285a);
    }
}
