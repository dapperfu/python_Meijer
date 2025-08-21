package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class u extends w1<Long> {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f93912h = "com.medallia.digital.mobilesdk.AppRatingLastTriggerTimestampCollectorFilter";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f93913i = "com.medallia.digital.mobilesdk.AppRatingLastTriggerTimestampCollector";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f93914g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(u.f93913i)) {
                        u.this.a((u) Long.valueOf(intent.getLongExtra(u.f93913i, 0L)));
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
        this.f93914g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93762Q;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f93914g, new IntentFilter(f93912h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f93914g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
