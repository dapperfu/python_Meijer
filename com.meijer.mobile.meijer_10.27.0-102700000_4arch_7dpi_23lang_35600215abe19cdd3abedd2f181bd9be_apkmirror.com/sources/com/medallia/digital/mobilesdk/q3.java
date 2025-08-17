package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class q3 extends w1<Long> {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f92725h = "com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f92726i = "com.medallia.digital.mobilesdk.LastDeclineTimestampCollector";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f92727g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(q3.f92726i)) {
                        q3.this.a((q3) Long.valueOf(intent.getLongExtra(q3.f92726i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > Last decline timestamp : %d", q3.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected q3(n0 n0Var) {
        super(n0Var);
        this.f92727g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92955z;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f92727g, new IntentFilter(f92725h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f92727g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
