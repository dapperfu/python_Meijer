package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes7.dex */
abstract class d0 {
    d0() {
    }

    private void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        e();
        q4.a(i4.c().b()).a(broadcastReceiver, intentFilter);
    }

    protected abstract String a();

    protected abstract void a(Object obj);

    protected abstract Object b();

    protected abstract BroadcastReceiver c();

    protected void d() {
        if (i4.c().b() != null) {
            a(c(), new IntentFilter(a()));
        }
    }

    protected void e() {
        try {
            q4.a(i4.c().b()).a(c());
        } catch (Exception e10) {
            a4.f(e10.getMessage());
        }
    }
}
