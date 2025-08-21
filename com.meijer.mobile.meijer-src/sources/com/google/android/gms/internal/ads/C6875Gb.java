package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6875Gb implements InterfaceC6943Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f68078a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f68079b;

    C6875Gb(C6977Jb c6977Jb, Activity activity, Bundle bundle) {
        this.f68078a = activity;
        this.f68079b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6943Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f68078a, this.f68079b);
    }
}
