package com.medallia.digital.mobilesdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes8.dex */
public class n5 extends w1<Integer> {

    /* renamed from: h, reason: collision with root package name */
    static final String f93451h = "com.medallia.digital.mobilesdk.NPSCollector";

    /* renamed from: i, reason: collision with root package name */
    static final String f93452i = "com.medallia.digital.mobilesdk.NPSCollectorFilter";

    /* renamed from: g, reason: collision with root package name */
    private final BroadcastReceiver f93453g;

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(n5.f93451h)) {
                        n5.this.a((n5) Integer.valueOf(intent.getIntExtra(n5.f93451h, -1)));
                        a4.b(String.format(Locale.US, "Collectors > NPS : %S", n5.this.f()));
                    }
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
        }
    }

    protected n5(n0 n0Var) {
        super(n0Var);
        this.f93453g = new a();
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
        return s0.a.f93756K;
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void l() {
        super.l();
        if (h()) {
            q4.a(i4.c().b()).a(this.f93453g, new IntentFilter(f93452i));
        }
    }

    @Override // com.medallia.digital.mobilesdk.w1
    protected void m() {
        super.m();
        try {
            q4.a(i4.c().b()).a(this.f93453g);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
