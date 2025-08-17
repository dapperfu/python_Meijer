package vf;

import Td.C5233k;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lf.g;
import of.C;
import of.P;
import of.d0;
import pc.AbstractC16280d;
import pc.EnumC16282f;
import pc.InterfaceC16285i;
import pc.InterfaceC16287k;
import rc.l;
import rf.AbstractC16777F;
import wf.C17818d;

/* renamed from: vf.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C17566e {

    /* renamed from: a, reason: collision with root package name */
    private final double f164698a;

    /* renamed from: b, reason: collision with root package name */
    private final double f164699b;

    /* renamed from: c, reason: collision with root package name */
    private final long f164700c;

    /* renamed from: d, reason: collision with root package name */
    private final long f164701d;

    /* renamed from: e, reason: collision with root package name */
    private final int f164702e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f164703f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f164704g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC16285i<AbstractC16777F> f164705h;

    /* renamed from: i, reason: collision with root package name */
    private final P f164706i;

    /* renamed from: j, reason: collision with root package name */
    private int f164707j;

    /* renamed from: k, reason: collision with root package name */
    private long f164708k;

    /* renamed from: vf.e$b */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C f164709a;

        /* renamed from: b, reason: collision with root package name */
        private final C5233k<C> f164710b;

        private b(C c10, C5233k<C> c5233k) {
            this.f164709a = c10;
            this.f164710b = c5233k;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            C17566e.this.n(this.f164709a, this.f164710b);
            C17566e.this.f164706i.c();
            double dG = C17566e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f164709a.d());
            C17566e.o(dG);
        }
    }

    C17566e(InterfaceC16285i<AbstractC16777F> interfaceC16285i, C17818d c17818d, P p10) {
        this(c17818d.f166068f, c17818d.f166069g, c17818d.f166070h * 1000, interfaceC16285i, p10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d10) throws InterruptedException {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    C17566e(double d10, double d11, long j10, InterfaceC16285i<AbstractC16777F> interfaceC16285i, P p10) {
        this.f164698a = d10;
        this.f164699b = d11;
        this.f164700c = j10;
        this.f164705h = interfaceC16285i;
        this.f164706i = p10;
        this.f164701d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f164702e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f164703f = arrayBlockingQueue;
        this.f164704g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f164707j = 0;
        this.f164708k = 0L;
    }

    private int h() {
        if (this.f164708k == 0) {
            this.f164708k = m();
        }
        int iM = (int) ((m() - this.f164708k) / this.f164700c);
        int iMin = l() ? Math.min(100, this.f164707j + iM) : Math.max(0, this.f164707j - iM);
        if (this.f164707j != iMin) {
            this.f164707j = iMin;
            this.f164708k = m();
        }
        return iMin;
    }

    private boolean k() {
        return this.f164703f.size() < this.f164702e;
    }

    private boolean l() {
        return this.f164703f.size() == this.f164702e;
    }

    C5233k<C> i(C c10, boolean z10) {
        synchronized (this.f164703f) {
            try {
                C5233k<C> c5233k = new C5233k<>();
                if (!z10) {
                    n(c10, c5233k);
                    return c5233k;
                }
                this.f164706i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + c10.d());
                    this.f164706i.a();
                    c5233k.e(c10);
                    return c5233k;
                }
                g.f().b("Enqueueing report: " + c10.d());
                g.f().b("Queue size: " + this.f164703f.size());
                this.f164704g.execute(new b(c10, c5233k));
                g.f().b("Closing task for report: " + c10.d());
                c5233k.e(c10);
                return c5233k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: vf.d
            @Override // java.lang.Runnable
            public final void run() {
                C17566e.b(this.f164696a, countDownLatch);
            }
        }).start();
        d0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public static /* synthetic */ void a(C17566e c17566e, C5233k c5233k, boolean z10, C c10, Exception exc) {
        c17566e.getClass();
        if (exc != null) {
            c5233k.d(exc);
            return;
        }
        if (z10) {
            c17566e.j();
        }
        c5233k.e(c10);
    }

    public static /* synthetic */ void b(C17566e c17566e, CountDownLatch countDownLatch) {
        c17566e.getClass();
        try {
            l.a(c17566e.f164705h, EnumC16282f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    private long m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final C c10, final C5233k<C> c5233k) {
        final boolean z10;
        g.f().b("Sending report through Google DataTransport: " + c10.d());
        if (SystemClock.elapsedRealtime() - this.f164701d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f164705h.b(AbstractC16280d.i(c10.b()), new InterfaceC16287k() { // from class: vf.c
            @Override // pc.InterfaceC16287k
            public final void a(Exception exc) {
                C17566e.a(this.f164692a, c5233k, z10, c10, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f164698a) * Math.pow(this.f164699b, h()));
    }
}
