package Pc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Pc.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4577k0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C4579l0 f25151a;

    C4577k0(C4579l0 c4579l0) {
        this.f25151a = c4579l0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f25151a.e(context, intent);
    }
}
