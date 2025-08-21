package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Cb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6739Cb implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f66650a;

    C6739Cb(C6977Jb c6977Jb, Activity activity) {
        this.f66650a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.f66650a);
    }
}
