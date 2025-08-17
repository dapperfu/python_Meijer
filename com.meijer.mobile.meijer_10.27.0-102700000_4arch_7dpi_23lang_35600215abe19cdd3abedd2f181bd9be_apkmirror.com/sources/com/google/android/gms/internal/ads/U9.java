package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class U9 implements InterfaceC7583ba {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f70550a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f70551b;

    U9(C7689ca c7689ca, Activity activity, Bundle bundle) {
        this.f70550a = activity;
        this.f70551b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7583ba
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f70550a, this.f70551b);
    }
}
