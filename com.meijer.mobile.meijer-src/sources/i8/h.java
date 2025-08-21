package i8;

import com.medallia.digital.mobilesdk.l8;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    private static final String f137275h = x.f137411a + "ConnectionAttemptMonitor";

    /* renamed from: a, reason: collision with root package name */
    private long f137276a;

    /* renamed from: b, reason: collision with root package name */
    private long f137277b;

    /* renamed from: c, reason: collision with root package name */
    private Timer f137278c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f137279d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f137280e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f137281f;

    /* renamed from: g, reason: collision with root package name */
    private Date f137282g;

    private class b extends TimerTask {
        private b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (h.this) {
                h.this.f137281f.set(true);
                h hVar = h.this;
                hVar.k(hVar.d());
            }
        }
    }

    synchronized void c() {
        Timer timer = this.f137278c;
        if (timer != null) {
            timer.cancel();
            this.f137278c.purge();
            this.f137278c = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r6.f137277b >= 3420000) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized boolean f() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f137281f     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto Lc
            monitor-exit(r6)
            return r1
        Lc:
            boolean r0 = r6.f137280e     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2b
            java.util.Timer r0 = r6.f137278c     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2b
            long r2 = r6.f137276a     // Catch: java.lang.Throwable -> L26
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L28
            long r2 = r6.f137277b     // Catch: java.lang.Throwable -> L26
            r4 = 3420000(0x342f60, double:1.6897045E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L2b
            goto L28
        L26:
            r0 = move-exception
            goto L2d
        L28:
            monitor-exit(r6)
            r0 = 0
            return r0
        L2b:
            monitor-exit(r6)
            return r1
        L2d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L26
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.h.f():boolean");
    }

    public synchronized void g(boolean z10, boolean z11) {
        try {
            this.f137280e = z10;
            this.f137281f.set(false);
            if (z10) {
                if (x.f137412b) {
                    z8.f.u(f137275h, "Connection ok notification");
                }
                this.f137279d = true;
                this.f137276a = -1L;
                this.f137277b = 0L;
                c();
            } else {
                if (x.f137412b) {
                    z8.f.u(f137275h, "No connection notification");
                }
                if (this.f137279d && this.f137278c == null && this.f137277b == 0) {
                    this.f137277b = l8.b.f93364b;
                    k(d());
                } else if (z11 && this.f137278c == null) {
                    k(d());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(int i10) {
        try {
            this.f137280e = false;
            this.f137281f.set(false);
            if (this.f137279d && this.f137278c == null && this.f137277b == 0) {
                this.f137277b = l8.b.f93364b;
            }
            if (this.f137278c != null || d() != null) {
                k(new Date(C14693B.a() + (i10 * 1000)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void j() {
        k(this.f137282g);
    }

    synchronized void k(Date date) {
        c();
        this.f137282g = date;
        if (date != null) {
            String str = f137275h;
            Timer timer = new Timer(str);
            this.f137278c = timer;
            try {
                timer.schedule(new b(), this.f137282g);
                if (x.f137412b) {
                    z8.f.u(str, "Connection attempt is scheduled for " + this.f137282g);
                }
            } catch (Exception e10) {
                if (x.f137412b) {
                    z8.f.u(f137275h, "Failed to schedule a connection attempt ... " + e10.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date d() {
        Date date = new Date(C14693B.a() + this.f137277b);
        long j10 = this.f137276a - 1;
        this.f137276a = j10;
        if (j10 > 0) {
            this.f137277b = l8.b.f93364b;
            return date;
        }
        if (j10 == 0) {
            this.f137277b = 0L;
            return null;
        }
        long j11 = this.f137277b;
        if (j11 == 1920000) {
            this.f137277b = 3420000L;
            return date;
        }
        if (j11 == 3420000 || j11 <= 0) {
            return null;
        }
        this.f137277b = j11 * 2;
        return date;
    }

    boolean e() {
        return this.f137281f.getAndSet(false);
    }

    boolean i() {
        return this.f137279d && !this.f137280e && this.f137277b > 0;
    }

    h(int i10) {
        if (i10 >= 1) {
            this.f137276a = i10 + 1;
            this.f137281f = new AtomicBoolean(true);
            this.f137277b = 0L;
            k(d());
            return;
        }
        throw new IllegalArgumentException("Connection attempts must be greater than zero");
    }
}
