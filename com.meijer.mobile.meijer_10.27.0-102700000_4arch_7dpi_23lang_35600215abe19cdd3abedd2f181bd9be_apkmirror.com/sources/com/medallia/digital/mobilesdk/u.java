package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class u extends w1<Long> {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f93073h = "com.medallia.digital.mobilesdk.AppRatingLastTriggerTimestampCollectorFilter";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f93074i = "com.medallia.digital.mobilesdk.AppRatingLastTriggerTimestampCollector";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f93075g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(u.f93074i)) {
                        u.this.a((u) Long.valueOf(intent.getLongExtra(u.f93074i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > App Rating Last trigger timestamp : %d", u.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected u(n0 n0Var) {
        super(n0Var);
        this.f93075g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92923Q;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f93075g, new IntentFilter(f93073h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f93075g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
