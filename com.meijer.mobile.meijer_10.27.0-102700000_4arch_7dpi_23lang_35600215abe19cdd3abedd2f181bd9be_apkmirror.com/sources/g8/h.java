package g8;

import com.medallia.digital.mobilesdk.l8;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: h, reason: collision with root package name */
    private static final String f133059h = x.f133195a + "ConnectionAttemptMonitor";

    /* renamed from: a, reason: collision with root package name */
    private long f133060a;

    /* renamed from: b, reason: collision with root package name */
    private long f133061b;

    /* renamed from: c, reason: collision with root package name */
    private Timer f133062c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f133063d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f133064e;

    /* renamed from: f, reason: collision with root package name */
    private AtomicBoolean f133065f;

    /* renamed from: g, reason: collision with root package name */
    private Date f133066g;

    private class b extends TimerTask {
        private b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (h.this) {
                h.this.f133065f.set(true);
                h hVar = h.this;
                hVar.k(hVar.d());
            }
        }
    }

    synchronized void c() {
        Timer timer = this.f133062c;
        if (timer != null) {
            timer.cancel();
            this.f133062c.purge();
            this.f133062c = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r6.f133061b >= 3420000) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    synchronized boolean f() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.f133065f     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto Lc
            monitor-exit(r6)
            return r1
        Lc:
            boolean r0 = r6.f133064e     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2b
            java.util.Timer r0 = r6.f133062c     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2b
            long r2 = r6.f133060a     // Catch: java.lang.Throwable -> L26
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L28
            long r2 = r6.f133061b     // Catch: java.lang.Throwable -> L26
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
        throw new UnsupportedOperationException("Method not decompiled: g8.h.f():boolean");
    }

    public synchronized void g(boolean z10, boolean z11) {
        try {
            this.f133064e = z10;
            this.f133065f.set(false);
            if (z10) {
                if (x.f133196b) {
                    x8.f.u(f133059h, "Connection ok notification");
                }
                this.f133063d = true;
                this.f133060a = -1L;
                this.f133061b = 0L;
                c();
            } else {
                if (x.f133196b) {
                    x8.f.u(f133059h, "No connection notification");
                }
                if (this.f133063d && this.f133062c == null && this.f133061b == 0) {
                    this.f133061b = l8.b.f92525b;
                    k(d());
                } else if (z11 && this.f133062c == null) {
                    k(d());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h(int i10) {
        try {
            this.f133064e = false;
            this.f133065f.set(false);
            if (this.f133063d && this.f133062c == null && this.f133061b == 0) {
                this.f133061b = l8.b.f92525b;
            }
            if (this.f133062c != null || d() != null) {
                k(new Date(C14217B.a() + (i10 * 1000)));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void j() {
        k(this.f133066g);
    }

    synchronized void k(Date date) {
        c();
        this.f133066g = date;
        if (date != null) {
            String str = f133059h;
            Timer timer = new Timer(str);
            this.f133062c = timer;
            try {
                timer.schedule(new b(), this.f133066g);
                if (x.f133196b) {
                    x8.f.u(str, "Connection attempt is scheduled for " + this.f133066g);
                }
            } catch (Exception e10) {
                if (x.f133196b) {
                    x8.f.u(f133059h, "Failed to schedule a connection attempt ... " + e10.toString());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date d() {
        Date date = new Date(C14217B.a() + this.f133061b);
        long j10 = this.f133060a - 1;
        this.f133060a = j10;
        if (j10 > 0) {
            this.f133061b = l8.b.f92525b;
            return date;
        }
        if (j10 == 0) {
            this.f133061b = 0L;
            return null;
        }
        long j11 = this.f133061b;
        if (j11 == 1920000) {
            this.f133061b = 3420000L;
            return date;
        }
        if (j11 == 3420000 || j11 <= 0) {
            return null;
        }
        this.f133061b = j11 * 2;
        return date;
    }

    boolean e() {
        return this.f133065f.getAndSet(false);
    }

    boolean i() {
        return this.f133063d && !this.f133064e && this.f133061b > 0;
    }

    h(int i10) {
        if (i10 >= 1) {
            this.f133060a = i10 + 1;
            this.f133065f = new AtomicBoolean(true);
            this.f133061b = 0L;
            k(d());
            return;
        }
        throw new IllegalArgumentException("Connection attempts must be greater than zero");
    }
}
