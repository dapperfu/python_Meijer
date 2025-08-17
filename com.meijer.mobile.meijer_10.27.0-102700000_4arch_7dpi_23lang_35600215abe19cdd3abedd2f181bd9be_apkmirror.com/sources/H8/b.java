package H8;

import g8.C14217B;
import g8.x;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: m, reason: collision with root package name */
    private static final String f12335m = x.f133195a + "RageTapDetector";

    /* renamed from: a, reason: collision with root package name */
    private final List<c> f12336a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f12337b;

    /* renamed from: d, reason: collision with root package name */
    private final C14217B f12339d;

    /* renamed from: e, reason: collision with root package name */
    private n8.b f12340e;

    /* renamed from: f, reason: collision with root package name */
    private d f12341f;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f12345j;

    /* renamed from: k, reason: collision with root package name */
    private long f12346k;

    /* renamed from: g, reason: collision with root package name */
    private e f12342g = null;

    /* renamed from: h, reason: collision with root package name */
    private e f12343h = null;

    /* renamed from: i, reason: collision with root package name */
    private int f12344i = 0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f12347l = false;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f12338c = new a();

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

    public synchronized void c(n8.b bVar) {
        try {
            if (this.f12347l) {
                b(false);
            }
            this.f12340e = bVar;
            this.f12341f = new d(bVar.g());
            this.f12346k = bVar.g().e();
            this.f12347l = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d(e eVar) {
        try {
            if (this.f12347l) {
                if (x.f133196b) {
                    x8.f.u(f12335m, "register tap: " + eVar);
                }
                if (this.f12341f.b(eVar)) {
                    if (x.f133196b) {
                        x8.f.u(f12335m, "tap exceeds click duration");
                    }
                    a();
                    return;
                }
                if (this.f12342g == null) {
                    f(eVar);
                    return;
                }
                if (this.f12341f.d(this.f12343h, eVar)) {
                    if (x.f133196b) {
                        x8.f.u(f12335m, "tap exceeds timespan difference");
                    }
                    a();
                    f(eVar);
                    return;
                }
                if (this.f12341f.a(this.f12343h, eVar)) {
                    if (x.f133196b) {
                        x8.f.u(f12335m, "tap exceeds dispersion radius");
                    }
                    a();
                    f(eVar);
                    return;
                }
                this.f12343h = eVar;
                int i10 = this.f12344i + 1;
                this.f12344i = i10;
                if (this.f12341f.e(i10)) {
                    ScheduledFuture<?> scheduledFuture = this.f12345j;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f12345j = h();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void e() {
        try {
            if (this.f12342g == null) {
                return;
            }
            if (this.f12341f.c(this.f12343h, this.f12339d.c())) {
                if (x.f133196b) {
                    x8.f.u(f12335m, "timespan difference exceeded");
                }
                a();
            } else {
                ScheduledFuture<?> scheduledFuture = this.f12345j;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f12345j = h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void b(boolean z10) {
        if (this.f12347l) {
            if (this.f12341f.e(this.f12344i)) {
                H8.a aVar = new H8.a(this.f12342g, this.f12343h, this.f12344i);
                if (x.f133196b) {
                    x8.f.u(f12335m, "rage tap detected: " + aVar);
                }
                Iterator<c> it = this.f12336a.iterator();
                while (it.hasNext()) {
                    it.next().a(this.f12340e, aVar, z10);
                }
            }
            g();
        }
    }

    private void f(e eVar) {
        if (this.f12340e.i() > eVar.a().a()) {
            if (x.f133196b) {
                x8.f.u(f12335m, "discard tap because it partially occurred outside of the session");
            }
            g();
        } else {
            this.f12342g = eVar;
            this.f12343h = eVar;
            this.f12344i = 1;
        }
    }

    private void g() {
        ScheduledFuture<?> scheduledFuture = this.f12345j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.f12345j = null;
        }
        this.f12342g = null;
        this.f12343h = null;
        this.f12344i = 0;
    }

    private ScheduledFuture<?> h() {
        return this.f12337b.schedule(this.f12338c, this.f12346k, TimeUnit.MILLISECONDS);
    }

    public b(List<c> list, ScheduledExecutorService scheduledExecutorService, C14217B c14217b) {
        this.f12336a = Collections.unmodifiableList(list);
        this.f12337b = scheduledExecutorService;
        this.f12339d = c14217b;
    }
}
