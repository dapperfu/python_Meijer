package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
class t extends w1<Long> {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f93866h = "com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollectorFilter";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f93867i = "com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollector";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f93868g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(t.f93867i)) {
                        t.this.a((t) Long.valueOf(intent.getLongExtra(t.f93867i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > App Rating Last decline timestamp : %d", t.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected t(n0 n0Var) {
        super(n0Var);
        this.f93868g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93758M;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f93868g, new IntentFilter(f93866h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f93868g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
