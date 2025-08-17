package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class a7 extends w1<String> {

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f91617g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra("com.medallia.digital.mobilesdk.SESSION_ID_VALUE")) {
                        a7.this.a((a7) intent.getStringExtra("com.medallia.digital.mobilesdk.SESSION_ID_VALUE"));
                        a4.b(String.format(Locale.US, "New session created, id : %s", a7.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected a7(n0 n0Var) {
        super(n0Var);
        this.f91617g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92950u;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        q4.a(i4.c().b()).a(this.f91617g, new IntentFilter("com.medallia.digital.mobilesdk.SESSION_STARTED"));
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f91617g);
        } catch (IllegalArgumentException e10) {
            a4.c(e10.getMessage());
        }
    }
}
