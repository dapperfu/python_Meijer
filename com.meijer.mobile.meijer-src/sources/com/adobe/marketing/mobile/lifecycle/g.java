package com.adobe.marketing.mobile.lifecycle;

import com.adobe.marketing.mobile.InterfaceC6543a;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
class g {

    /* renamed from: c, reason: collision with root package name */
    private TimerTask f63415c;

    /* renamed from: d, reason: collision with root package name */
    private Timer f63416d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC6543a<Boolean> f63417e;

    /* renamed from: f, reason: collision with root package name */
    private final String f63418f;

    /* renamed from: b, reason: collision with root package name */
    private long f63414b = 0;

    /* renamed from: a, reason: collision with root package name */
    private boolean f63413a = false;

    /* renamed from: g, reason: collision with root package name */
    private final Object f63419g = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.f63413a = false;
            if (g.this.f63417e != null) {
                g.this.f63417e.a(Boolean.TRUE);
            }
        }
    }

    void c() {
        synchronized (this.f63419g) {
            Timer timer = this.f63416d;
            if (timer != null) {
                try {
                    timer.cancel();
                    R5.t.e("Lifecycle", "LifecycleTimerState", "%s timer was canceled", this.f63418f);
                } catch (Exception e10) {
                    R5.t.f("Lifecycle", "LifecycleTimerState", "Error cancelling %s timer, failed with error: (%s)", this.f63418f, e10);
                }
                this.f63415c = null;
                this.f63413a = false;
            } else {
                this.f63413a = false;
            }
        }
    }

    boolean d() {
        boolean z10;
        synchronized (this.f63419g) {
            try {
                z10 = this.f63415c != null && this.f63413a;
            } finally {
            }
        }
        return z10;
    }

    void e(long j10, InterfaceC6543a<Boolean> interfaceC6543a) {
        synchronized (this.f63419g) {
            try {
                if (this.f63415c != null) {
                    R5.t.a("Lifecycle", "LifecycleTimerState", "Timer has already started.", new Object[0]);
                    return;
                }
                this.f63414b = j10;
                this.f63413a = true;
                this.f63417e = interfaceC6543a;
                try {
                    this.f63415c = new a();
                    Timer timer = new Timer(this.f63418f);
                    this.f63416d = timer;
                    timer.schedule(this.f63415c, j10);
                    R5.t.e("Lifecycle", "LifecycleTimerState", "%s timer scheduled having timeout %s ms", this.f63418f, Long.valueOf(this.f63414b));
                } catch (Exception e10) {
                    R5.t.f("Lifecycle", "LifecycleTimerState", "Error creating %s timer, failed with error: (%s)", this.f63418f, e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    g(String str) {
        this.f63418f = str;
    }
}
