package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
class s extends w1<Long> {

    /* renamed from: h, reason: collision with root package name */
    protected static final String f92901h = "com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollectorFilter";

    /* renamed from: i, reason: collision with root package name */
    protected static final String f92902i = "com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollector";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f92903g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(s.f92902i)) {
                        s.this.a((s) Long.valueOf(intent.getLongExtra(s.f92902i, 0L)));
                        a4.b(String.format(Locale.US, "Collectors > App Rating Last accepted timestamp : %d", s.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected s(n0 n0Var) {
        super(n0Var);
        this.f92903g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92921O;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f92903g, new IntentFilter(f92901h));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f92903g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
