package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6784Hb implements InterfaceC6818Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f67470a;

    C6784Hb(C6852Jb c6852Jb, Activity activity) {
        this.f67470a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6818Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f67470a);
    }
}
