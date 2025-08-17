package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class r3 extends w1<Long> {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f92806h = "com.medallia.digital.mobilesdk.LastSubmitTimestampCollectorFilter";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f92807i = "com.medallia.digital.mobilesdk.LastSubmitTimestampCollector";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f92808g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(r3.f92807i)) {
                        r3.this.a((r3) Long.valueOf(intent.getLongExtra(r3.f92807i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > Last submit timestamp : %d", r3.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected r3(n0 n0Var) {
        super(n0Var);
        this.f92808g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92907A;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f92808g, new IntentFilter(f92806h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f92808g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
