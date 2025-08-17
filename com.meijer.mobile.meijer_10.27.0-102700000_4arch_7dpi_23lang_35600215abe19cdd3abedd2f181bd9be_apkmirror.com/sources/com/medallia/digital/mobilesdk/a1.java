package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes7.dex */
public class a1 extends w1<Integer> {

    /* renamed from: h, reason: collision with root package name */
    static final String f91599h = "com.medallia.digital.mobilesdk.CSATCollector";

    /* renamed from: i, reason: collision with root package name */
    static final String f91600i = "com.medallia.digital.mobilesdk.CSATCollectorFilter";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f91601g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !intent.hasExtra(a1.f91599h)) {
                return;
            }
            a1.this.a((a1) Integer.valueOf(intent.getIntExtra(a1.f91599h, -1)));
            a4.b(String.format(Locale.US, "Collectors > CSAT : %S", a1.this.f()));
        }
    }

    protected a1(n0 n0Var) {
        super(n0Var);
        this.f91601g = new a();
    }

    @Override // com.medallia.digital.mobilesdk.w1
    public /* bridge */ /* synthetic */ void a(o0 o0Var) {
        super.a(o0Var);
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f92918L;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f91601g, new IntentFilter(f91600i));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f91601g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
