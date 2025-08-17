package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6716Fb implements InterfaceC6818Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f66831a;

    C6716Fb(C6852Jb c6852Jb, Activity activity) {
        this.f66831a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6818Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f66831a);
    }
}
