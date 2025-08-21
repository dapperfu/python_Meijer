package J8;

import i8.C14693B;
import i8.x;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: m, reason: collision with root package name */
    private static final String f15645m = x.f137411a + "RageTapDetector";

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f15646a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f15647b;

    /* renamed from: d, reason: collision with root package name */
    private final C14693B f15649d;

    /* renamed from: e, reason: collision with root package name */
    private p8.b f15650e;

    /* renamed from: f, reason: collision with root package name */
    private d f15651f;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f15655j;

    /* renamed from: k, reason: collision with root package name */
    private long f15656k;

    /* renamed from: g, reason: collision with root package name */
    private e f15652g = null;

    /* renamed from: h, reason: collision with root package name */
    private e f15653h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f15654i = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f15657l = false;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f15648c = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.e();
        }
    }

    public synchronized void a() {
        b(true);
    }

    public synchronized void c(p8.b bVar) {
        try {
            if (this.f15657l) {
                b(false);
            }
            this.f15650e = bVar;
            this.f15651f = new d(bVar.g());
            this.f15656k = bVar.g().e();
            this.f15657l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(e eVar) {
        try {
            if (this.f15657l) {
                if (x.f137412b) {
                    z8.f.u(f15645m, "register tap: " + eVar);
                }
                if (this.f15651f.b(eVar)) {
                    if (x.f137412b) {
                        z8.f.u(f15645m, "tap exceeds click duration");
                    }
                    a();
                    return;
                }
                if (this.f15652g == null) {
                    f(eVar);
                    return;
                }
                if (this.f15651f.d(this.f15653h, eVar)) {
                    if (x.f137412b) {
                        z8.f.u(f15645m, "tap exceeds timespan difference");
                    }
                    a();
                    f(eVar);
                    return;
                }
                if (this.f15651f.a(this.f15653h, eVar)) {
                    if (x.f137412b) {
                        z8.f.u(f15645m, "tap exceeds dispersion radius");
                    }
                    a();
                    f(eVar);
                    return;
                }
                this.f15653h = eVar;
                int i10 = this.f15654i + 1;
                this.f15654i = i10;
                if (this.f15651f.e(i10)) {
                    ScheduledFuture<?> scheduledFuture = this.f15655j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f15655j = h();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e() {
        try {
            if (this.f15652g == null) {
                return;
            }
            if (this.f15651f.c(this.f15653h, this.f15649d.c())) {
                if (x.f137412b) {
                    z8.f.u(f15645m, "timespan difference exceeded");
                }
                a();
            } else {
                ScheduledFuture<?> scheduledFuture = this.f15655j;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f15655j = h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(boolean z10) {
        if (this.f15657l) {
            if (this.f15651f.e(this.f15654i)) {
                J8.a aVar = new J8.a(this.f15652g, this.f15653h, this.f15654i);
                if (x.f137412b) {
                    z8.f.u(f15645m, "rage tap detected: " + aVar);
                }
                Iterator<c> it = this.f15646a.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f15650e, aVar, z10);
                }
            }
            g();
        }
    }

    private void f(e eVar) {
        if (this.f15650e.i() > eVar.a().a()) {
            if (x.f137412b) {
                z8.f.u(f15645m, "discard tap because it partially occurred outside of the session");
            }
            g();
        } else {
            this.f15652g = eVar;
            this.f15653h = eVar;
            this.f15654i = 1;
        }
    }

    private void g() {
        ScheduledFuture<?> scheduledFuture = this.f15655j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f15655j = null;
        }
        this.f15652g = null;
        this.f15653h = null;
        this.f15654i = 0;
    }

    private ScheduledFuture<?> h() {
        return this.f15647b.schedule(this.f15648c, this.f15656k, TimeUnit.MILLISECONDS);
    }

    public b(List<c> list, ScheduledExecutorService scheduledExecutorService, C14693B c14693b) {
        this.f15646a = Collections.unmodifiableList(list);
        this.f15647b = scheduledExecutorService;
        this.f15649d = c14693b;
    }
}
