package fsimpl;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes15.dex */
class fP implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fN f133477a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f133478b;

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f133479c;

    /* renamed from: d, reason: collision with root package name */
    private long f133480d;

    /* renamed from: e, reason: collision with root package name */
    private long f133481e;

    /* renamed from: f, reason: collision with root package name */
    private int f133482f;

    /* renamed from: g, reason: collision with root package name */
    private int f133483g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f133484h;

    private fP(fN fNVar) {
        this.f133477a = fNVar;
        this.f133479c = new CountDownLatch(1);
        this.f133480d = -1L;
        this.f133481e = -1L;
        this.f133482f = 0;
        this.f133483g = 0;
        this.f133484h = new AtomicBoolean(true);
    }

    void a() throws InterruptedException {
        try {
            this.f133479c.await();
        } catch (InterruptedException e10) {
            this.f133484h.set(false);
            if (this.f133478b == null) {
                this.f133478b = e10;
            }
        }
    }

    void b() {
        this.f133484h.set(false);
        this.f133479c.countDown();
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        long jNanoTime = System.nanoTime();
        if (this.f133480d == -1) {
            this.f133480d = jNanoTime;
        }
        this.f133483g++;
        while (this.f133484h.get() && (runnable = (Runnable) this.f133477a.f133471b.poll()) != null) {
            try {
                this.f133482f++;
                runnable.run();
                if (this.f133477a.f133473d && System.nanoTime() - jNanoTime > this.f133477a.f133472c && this.f133484h.get() && this.f133477a.f133471b.peek() != null) {
                    fZ.b(this);
                    return;
                }
            } catch (Throwable th2) {
                this.f133478b = th2;
            }
        }
        this.f133481e = System.nanoTime();
        this.f133479c.countDown();
    }
}
