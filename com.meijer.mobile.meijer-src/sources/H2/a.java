package H2;

import Z.n0;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f13355g = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f13359d;

    /* renamed from: a, reason: collision with root package name */
    private final n0<b, Long> f13356a = new n0<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f13357b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0196a f13358c = new C0196a();

    /* renamed from: e, reason: collision with root package name */
    long f13360e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13361f = false;

    /* renamed from: H2.a$a, reason: collision with other inner class name */
    class C0196a {
        C0196a() {
        }

        void a() {
            a.this.f13360e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f13360e);
            if (a.this.f13357b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean doAnimationFrame(long j10);
    }

    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f13364b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f13365c;

        /* renamed from: H2.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0197a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0197a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f13363a.a();
            }
        }

        @Override // H2.a.c
        void a() {
            this.f13364b.postFrameCallback(this.f13365c);
        }

        d(C0196a c0196a) {
            super(c0196a);
            this.f13364b = Choreographer.getInstance();
            this.f13365c = new ChoreographerFrameCallbackC0197a();
        }
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0196a f13363a;

        abstract void a();

        c(C0196a c0196a) {
            this.f13363a = c0196a;
        }
    }

    private void b() {
        if (this.f13361f) {
            for (int size = this.f13357b.size() - 1; size >= 0; size--) {
                if (this.f13357b.get(size) == null) {
                    this.f13357b.remove(size);
                }
            }
            this.f13361f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f13355g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j10) {
        Long l10 = this.f13356a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f13356a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f13357b.size() == 0) {
            e().a();
        }
        if (!this.f13357b.contains(bVar)) {
            this.f13357b.add(bVar);
        }
        if (j10 > 0) {
            this.f13356a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    c e() {
        if (this.f13359d == null) {
            this.f13359d = new d(this.f13358c);
        }
        return this.f13359d;
    }

    public void g(b bVar) {
        this.f13356a.remove(bVar);
        int iIndexOf = this.f13357b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f13357b.set(iIndexOf, null);
            this.f13361f = true;
        }
    }

    a() {
    }

    void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f13357b.size(); i10++) {
            b bVar = this.f13357b.get(i10);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.doAnimationFrame(j10);
            }
        }
        b();
    }
}
