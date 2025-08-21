package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* renamed from: com.google.android.gms.internal.ads.Eb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6807Eb implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f67327a;

    C6807Eb(C6977Jb c6977Jb, Activity activity) {
        this.f67327a = activity;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f67327a);
    }
}
