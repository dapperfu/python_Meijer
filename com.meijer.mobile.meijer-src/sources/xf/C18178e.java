package xf;

import Vd.C5517k;
import android.annotation.SuppressLint;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nf.g;
import qf.C;
import qf.P;
import qf.d0;
import rc.AbstractC16884d;
import rc.EnumC16886f;
import rc.InterfaceC16889i;
import rc.InterfaceC16891k;
import tc.l;
import tf.AbstractC17251F;
import yf.C18311d;

/* renamed from: xf.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C18178e {

    /* renamed from: a, reason: collision with root package name */
    private final double f170734a;

    /* renamed from: b, reason: collision with root package name */
    private final double f170735b;

    /* renamed from: c, reason: collision with root package name */
    private final long f170736c;

    /* renamed from: d, reason: collision with root package name */
    private final long f170737d;

    /* renamed from: e, reason: collision with root package name */
    private final int f170738e;

    /* renamed from: f, reason: collision with root package name */
    private final BlockingQueue<Runnable> f170739f;

    /* renamed from: g, reason: collision with root package name */
    private final ThreadPoolExecutor f170740g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC16889i<AbstractC17251F> f170741h;

    /* renamed from: i, reason: collision with root package name */
    private final P f170742i;

    /* renamed from: j, reason: collision with root package name */
    private int f170743j;

    /* renamed from: k, reason: collision with root package name */
    private long f170744k;

    /* renamed from: xf.e$b */
    private final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final C f170745a;

        /* renamed from: b, reason: collision with root package name */
        private final C5517k<C> f170746b;

        private b(C c10, C5517k<C> c5517k) {
            this.f170745a = c10;
            this.f170746b = c5517k;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            C18178e.this.n(this.f170745a, this.f170746b);
            C18178e.this.f170742i.c();
            double dG = C18178e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f170745a.d());
            C18178e.o(dG);
        }
    }

    C18178e(InterfaceC16889i<AbstractC17251F> interfaceC16889i, C18311d c18311d, P p10) {
        this(c18311d.f171390f, c18311d.f171391g, c18311d.f171392h * 1000, interfaceC16889i, p10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(double d10) throws InterruptedException {
        try {
            Thread.sleep((long) d10);
        } catch (InterruptedException unused) {
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    C18178e(double d10, double d11, long j10, InterfaceC16889i<AbstractC17251F> interfaceC16889i, P p10) {
        this.f170734a = d10;
        this.f170735b = d11;
        this.f170736c = j10;
        this.f170741h = interfaceC16889i;
        this.f170742i = p10;
        this.f170737d = SystemClock.elapsedRealtime();
        int i10 = (int) d10;
        this.f170738e = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f170739f = arrayBlockingQueue;
        this.f170740g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f170743j = 0;
        this.f170744k = 0L;
    }

    private int h() {
        if (this.f170744k == 0) {
            this.f170744k = m();
        }
        int iM = (int) ((m() - this.f170744k) / this.f170736c);
        int iMin = l() ? Math.min(100, this.f170743j + iM) : Math.max(0, this.f170743j - iM);
        if (this.f170743j != iMin) {
            this.f170743j = iMin;
            this.f170744k = m();
        }
        return iMin;
    }

    private boolean k() {
        return this.f170739f.size() < this.f170738e;
    }

    private boolean l() {
        return this.f170739f.size() == this.f170738e;
    }

    C5517k<C> i(C c10, boolean z10) {
        synchronized (this.f170739f) {
            try {
                C5517k<C> c5517k = new C5517k<>();
                if (!z10) {
                    n(c10, c5517k);
                    return c5517k;
                }
                this.f170742i.b();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + c10.d());
                    this.f170742i.a();
                    c5517k.e(c10);
                    return c5517k;
                }
                g.f().b("Enqueueing report: " + c10.d());
                g.f().b("Queue size: " + this.f170739f.size());
                this.f170740g.execute(new b(c10, c5517k));
                g.f().b("Closing task for report: " + c10.d());
                c5517k.e(c10);
                return c5517k;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @SuppressLint({"DiscouragedApi", "ThreadPoolCreation"})
    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: xf.d
            @Override // java.lang.Runnable
            public final void run() {
                C18178e.b(this.f170732a, countDownLatch);
            }
        }).start();
        d0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public static /* synthetic */ void a(C18178e c18178e, C5517k c5517k, boolean z10, C c10, Exception exc) {
        c18178e.getClass();
        if (exc != null) {
            c5517k.d(exc);
            return;
        }
        if (z10) {
            c18178e.j();
        }
        c5517k.e(c10);
    }

    public static /* synthetic */ void b(C18178e c18178e, CountDownLatch countDownLatch) {
        c18178e.getClass();
        try {
            l.a(c18178e.f170741h, EnumC16886f.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    private long m() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(final C c10, final C5517k<C> c5517k) {
        final boolean z10;
        g.f().b("Sending report through Google DataTransport: " + c10.d());
        if (SystemClock.elapsedRealtime() - this.f170737d < 2000) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f170741h.a(AbstractC16884d.i(c10.b()), new InterfaceC16891k() { // from class: xf.c
            @Override // rc.InterfaceC16891k
            public final void a(Exception exc) {
                C18178e.a(this.f170728a, c5517k, z10, c10, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double g() {
        return Math.min(3600000.0d, (60000.0d / this.f170734a) * Math.pow(this.f170735b, h()));
    }
}
