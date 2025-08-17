package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.ads.kC0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8513kC0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8727mC0 f75595a;

    /* synthetic */ C8513kC0(C8727mC0 c8727mC0, C8620lC0 c8620lC0) {
        this.f75595a = c8727mC0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!isInitialStickyBroadcast()) {
            C8727mC0 c8727mC0 = this.f75595a;
            c8727mC0.j(C8194hC0.d(context, intent, c8727mC0.f76762h, c8727mC0.f76761g));
        }
    }
}
