package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7476aa implements InterfaceC7583ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f72445a;

    C7476aa(C7689ca c7689ca, Activity activity) {
        this.f72445a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7583ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f72445a);
    }
}
