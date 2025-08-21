package Rc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* loaded from: classes4.dex */
final class B0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D0 f32292a;

    /* synthetic */ B0(D0 d02, C0 c02) {
        this.f32292a = d02;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.f32292a.f32300e = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f32292a.f32300e = false;
        }
    }
}
