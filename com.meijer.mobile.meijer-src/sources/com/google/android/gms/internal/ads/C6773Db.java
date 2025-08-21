package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Db, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6773Db implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f67102a;

    C6773Db(C6977Jb c6977Jb, Activity activity) {
        this.f67102a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.f67102a);
    }
}
