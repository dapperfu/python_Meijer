package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Bb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6705Bb implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f66401a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f66402b;

    C6705Bb(C6977Jb c6977Jb, Activity activity, Bundle bundle) {
        this.f66401a = activity;
        this.f66402b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f66401a, this.f66402b);
    }
}
