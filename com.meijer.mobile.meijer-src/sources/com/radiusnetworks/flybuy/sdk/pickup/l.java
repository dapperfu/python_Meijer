package com.radiusnetworks.flybuy.sdk.pickup;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class l extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PickupManager f120975a;

    public l(PickupManager pickupManager) {
        this.f120975a = pickupManager;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.j(context, "context");
        Intrinsics.j(intent, "intent");
        if (Intrinsics.e("android.location.PROVIDERS_CHANGED", intent.getAction())) {
            m.a(this.f120975a);
        }
    }
}
