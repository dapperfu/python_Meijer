package fsimpl;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes14.dex */
class fP implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fN f132227a;

    /* renamed from: b, reason: collision with root package name */
    private Throwable f132228b;

    /* renamed from: c, reason: collision with root package name */
    private final CountDownLatch f132229c;

    /* renamed from: d, reason: collision with root package name */
    private long f132230d;

    /* renamed from: e, reason: collision with root package name */
    private long f132231e;

    /* renamed from: f, reason: collision with root package name */
    private int f132232f;

    /* renamed from: g, reason: collision with root package name */
    private int f132233g;

    /* renamed from: h, reason: collision with root package name */
    private AtomicBoolean f132234h;

    private fP(fN fNVar) {
        this.f132227a = fNVar;
        this.f132229c = new CountDownLatch(1);
        this.f132230d = -1L;
        this.f132231e = -1L;
        this.f132232f = 0;
        this.f132233g = 0;
        this.f132234h = new AtomicBoolean(true);
    }

    void a() throws InterruptedException {
        try {
            this.f132229c.await();
        } catch (InterruptedException e10) {
            this.f132234h.set(false);
            if (this.f132228b == null) {
                this.f132228b = e10;
            }
        }
    }

    void b() {
        this.f132234h.set(false);
        this.f132229c.countDown();
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable;
        long jNanoTime = System.nanoTime();
        if (this.f132230d == -1) {
            this.f132230d = jNanoTime;
        }
        this.f132233g++;
        while (this.f132234h.get() && (runnable = (Runnable) this.f132227a.f132221b.poll()) != null) {
            try {
                this.f132232f++;
                runnable.run();
                if (this.f132227a.f132223d && System.nanoTime() - jNanoTime > this.f132227a.f132222c && this.f132234h.get() && this.f132227a.f132221b.peek() != null) {
                    fZ.b(this);
                    return;
                }
            } catch (Throwable th2) {
                this.f132228b = th2;
            }
        }
        this.f132231e = System.nanoTime();
        this.f132229c.countDown();
    }
}
