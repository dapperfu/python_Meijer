package Rc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Rc.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5198k0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C5200l0 f32365a;

    C5198k0(C5200l0 c5200l0) {
        this.f32365a = c5200l0;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f32365a.e(context, intent);
    }
}
