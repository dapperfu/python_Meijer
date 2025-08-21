package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.kC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8638kC0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8852mC0 f76435a;

    /* synthetic */ C8638kC0(C8852mC0 c8852mC0, C8745lC0 c8745lC0) {
        this.f76435a = c8852mC0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            C8852mC0 c8852mC0 = this.f76435a;
            c8852mC0.j(C8319hC0.d(context, intent, c8852mC0.f77602h, c8852mC0.f77601g));
        }
    }
}
