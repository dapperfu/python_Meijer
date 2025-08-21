package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6841Fb implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f67671a;

    C6841Fb(C6977Jb c6977Jb, Activity activity) {
        this.f67671a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.f67671a);
    }
}
