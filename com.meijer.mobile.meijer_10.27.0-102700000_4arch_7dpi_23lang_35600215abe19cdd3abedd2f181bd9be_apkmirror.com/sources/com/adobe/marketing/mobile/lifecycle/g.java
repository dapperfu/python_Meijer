package com.adobe.marketing.mobile.lifecycle;

import com.adobe.marketing.mobile.InterfaceC6418a;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
class g {

    /* renamed from: c, reason: collision with root package name */
    private TimerTask f62576c;

    /* renamed from: d, reason: collision with root package name */
    private Timer f62577d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6418a<Boolean> f62578e;

    /* renamed from: f, reason: collision with root package name */
    private final String f62579f;

    /* renamed from: b, reason: collision with root package name */
    private long f62575b = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f62574a = false;

    /* renamed from: g, reason: collision with root package name */
    private final Object f62580g = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.f62574a = false;
            if (g.this.f62578e != null) {
                g.this.f62578e.a(Boolean.TRUE);
            }
        }
    }

    void c() {
        synchronized (this.f62580g) {
            Timer timer = this.f62577d;
            if (timer != null) {
                try {
                    timer.cancel();
                    Q5.t.e("Lifecycle", "LifecycleTimerState", "%s timer was canceled", this.f62579f);
                } catch (Exception e10) {
                    Q5.t.f("Lifecycle", "LifecycleTimerState", "Error cancelling %s timer, failed with error: (%s)", this.f62579f, e10);
                }
                this.f62576c = null;
                this.f62574a = false;
            } else {
                this.f62574a = false;
            }
        }
    }

    boolean d() {
        boolean z10;
        synchronized (this.f62580g) {
            try {
                z10 = this.f62576c != null && this.f62574a;
            } finally {
            }
        }
        return z10;
    }

    void e(long j10, InterfaceC6418a<Boolean> interfaceC6418a) {
        synchronized (this.f62580g) {
            try {
                if (this.f62576c != null) {
                    Q5.t.a("Lifecycle", "LifecycleTimerState", "Timer has already started.", new Object[0]);
                    return;
                }
                this.f62575b = j10;
                this.f62574a = true;
                this.f62578e = interfaceC6418a;
                try {
                    this.f62576c = new a();
                    Timer timer = new Timer(this.f62579f);
                    this.f62577d = timer;
                    timer.schedule(this.f62576c, j10);
                    Q5.t.e("Lifecycle", "LifecycleTimerState", "%s timer scheduled having timeout %s ms", this.f62579f, Long.valueOf(this.f62575b));
                } catch (Exception e10) {
                    Q5.t.f("Lifecycle", "LifecycleTimerState", "Error creating %s timer, failed with error: (%s)", this.f62579f, e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    g(String str) {
        this.f62579f = str;
    }
}
