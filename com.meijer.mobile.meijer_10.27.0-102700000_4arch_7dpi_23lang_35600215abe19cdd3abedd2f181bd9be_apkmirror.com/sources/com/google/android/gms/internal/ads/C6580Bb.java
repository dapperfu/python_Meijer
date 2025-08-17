package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Bb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6580Bb implements InterfaceC6818Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f65561a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f65562b;

    C6580Bb(C6852Jb c6852Jb, Activity activity, Bundle bundle) {
        this.f65561a = activity;
        this.f65562b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6818Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f65561a, this.f65562b);
    }
}
