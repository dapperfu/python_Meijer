package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Gb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6750Gb implements InterfaceC6818Ib {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f67238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f67239b;

    C6750Gb(C6852Jb c6852Jb, Activity activity, Bundle bundle) {
        this.f67238a = activity;
        this.f67239b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6818Ib
    public final void zza(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f67238a, this.f67239b);
    }
}
