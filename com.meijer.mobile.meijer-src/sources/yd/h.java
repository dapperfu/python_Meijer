package yd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes7.dex */
public final class h extends Z1.b {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent q(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i10;
        if (g.a()) {
            if (true != g.a()) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            return context.registerReceiver(broadcastReceiver, intentFilter, i10);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
