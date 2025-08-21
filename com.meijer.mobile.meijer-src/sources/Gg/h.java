package Gg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f12551a;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f12555e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12556f;

    /* renamed from: c, reason: collision with root package name */
    private boolean f12553c = false;

    /* renamed from: b, reason: collision with root package name */
    private final BroadcastReceiver f12552b = new b();

    /* renamed from: d, reason: collision with root package name */
    private Handler f12554d = new Handler();

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z10 = intent.getIntExtra("plugged", -1) <= 0;
                h.this.f12554d.post(new Runnable() { // from class: Gg.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.this.f(z10);
                    }
                });
            }
        }
    }

    private void e() {
        this.f12554d.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z10) {
        this.f12556f = z10;
        if (this.f12553c) {
            c();
        }
    }

    private void g() {
        if (this.f12553c) {
            return;
        }
        this.f12551a.registerReceiver(this.f12552b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f12553c = true;
    }

    private void i() {
        if (this.f12553c) {
            this.f12551a.unregisterReceiver(this.f12552b);
            this.f12553c = false;
        }
    }

    public h(Context context, Runnable runnable) {
        this.f12551a = context;
        this.f12555e = runnable;
    }

    public void c() {
        e();
        if (this.f12556f) {
            this.f12554d.postDelayed(this.f12555e, 300000L);
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
