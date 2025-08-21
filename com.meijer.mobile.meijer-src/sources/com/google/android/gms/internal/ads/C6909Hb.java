package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6909Hb implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f68310a;

    C6909Hb(C6977Jb c6977Jb, Activity activity) {
        this.f68310a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f68310a);
    }
}
