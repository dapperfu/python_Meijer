package Eg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes7.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8999a;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f9003e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9004f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9001c = false;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f9000b = new b();

    /* renamed from: d, reason: collision with root package name */
    private Handler f9002d = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                h.this.f9002d.post(new Runnable() { // from class: Eg.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.f(z10);
                    }
                });
            }
        }
    }

    private void e() {
        this.f9002d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z10) {
        this.f9004f = z10;
        if (this.f9001c) {
            c();
        }
    }

    private void g() {
        if (this.f9001c) {
            return;
        }
        this.f8999a.registerReceiver(this.f9000b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f9001c = true;
    }

    private void i() {
        if (this.f9001c) {
            this.f8999a.unregisterReceiver(this.f9000b);
            this.f9001c = false;
        }
    }

    public h(Context context, Runnable runnable) {
        this.f8999a = context;
        this.f9003e = runnable;
    }

    public void c() {
        e();
        if (this.f9004f) {
            this.f9002d.postDelayed(this.f9003e, 300000L);
        }
    }

    public void d() {
        e();
        i();
    }

    public void h() {
        g();
        c();
    }
}
