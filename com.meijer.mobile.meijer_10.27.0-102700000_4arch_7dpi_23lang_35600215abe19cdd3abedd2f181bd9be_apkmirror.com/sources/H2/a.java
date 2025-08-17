package H2;

import Z.n0;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* loaded from: classes.dex */
class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f12023g = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    private c f12027d;

    /* renamed from: a, reason: collision with root package name */
    private final n0<b, Long> f12024a = new n0<>();

    /* renamed from: b, reason: collision with root package name */
    final ArrayList<b> f12025b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final C0181a f12026c = new C0181a();

    /* renamed from: e, reason: collision with root package name */
    long f12028e = 0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12029f = false;

    /* renamed from: H2.a$a, reason: collision with other inner class name */
    class C0181a {
        C0181a() {
        }

        void a() {
            a.this.f12028e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f12028e);
            if (a.this.f12025b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean doAnimationFrame(long j10);
    }

    private static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        private final Choreographer f12032b;

        /* renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f12033c;

        /* renamed from: H2.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0182a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0182a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j10) {
                d.this.f12031a.a();
            }
        }

        @Override // H2.a.c
        void a() {
            this.f12032b.postFrameCallback(this.f12033c);
        }

        d(C0181a c0181a) {
            super(c0181a);
            this.f12032b = Choreographer.getInstance();
            this.f12033c = new ChoreographerFrameCallbackC0182a();
        }
    }

    static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final C0181a f12031a;

        abstract void a();

        c(C0181a c0181a) {
            this.f12031a = c0181a;
        }
    }

    private void b() {
        if (this.f12029f) {
            for (int size = this.f12025b.size() - 1; size >= 0; size--) {
                if (this.f12025b.get(size) == null) {
                    this.f12025b.remove(size);
                }
            }
            this.f12029f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f12023g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j10) {
        Long l10 = this.f12024a.get(bVar);
        if (l10 == null) {
            return true;
        }
        if (l10.longValue() >= j10) {
            return false;
        }
        this.f12024a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j10) {
        if (this.f12025b.size() == 0) {
            e().a();
        }
        if (!this.f12025b.contains(bVar)) {
            this.f12025b.add(bVar);
        }
        if (j10 > 0) {
            this.f12024a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j10));
        }
    }

    c e() {
        if (this.f12027d == null) {
            this.f12027d = new d(this.f12026c);
        }
        return this.f12027d;
    }

    public void g(b bVar) {
        this.f12024a.remove(bVar);
        int iIndexOf = this.f12025b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f12025b.set(iIndexOf, null);
            this.f12029f = true;
        }
    }

    a() {
    }

    void c(long j10) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i10 = 0; i10 < this.f12025b.size(); i10++) {
            b bVar = this.f12025b.get(i10);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.doAnimationFrame(j10);
            }
        }
        b();
    }
}
