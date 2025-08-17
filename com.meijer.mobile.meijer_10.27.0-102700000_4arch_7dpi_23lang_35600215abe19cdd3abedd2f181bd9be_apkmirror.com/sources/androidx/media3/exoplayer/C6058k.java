package androidx.media3.exoplayer;

import a3.C5560A;
import d3.C13466a;
import d3.InterfaceC13473h;

/* renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6058k implements h3.I {

    /* renamed from: a, reason: collision with root package name */
    private final h3.N f56295a;

    /* renamed from: b, reason: collision with root package name */
    private final a f56296b;

    /* renamed from: c, reason: collision with root package name */
    private H0 f56297c;

    /* renamed from: d, reason: collision with root package name */
    private h3.I f56298d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f56299e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56300f;

    /* renamed from: androidx.media3.exoplayer.k$a */
    public interface a {
        void m(C5560A c5560a);
    }

    public void g() {
        this.f56300f = true;
        this.f56295a.b();
    }

    public void h() {
        this.f56300f = false;
        this.f56295a.c();
    }

    private boolean e(boolean z10) {
        H0 h02 = this.f56297c;
        if (h02 == null || h02.c()) {
            return true;
        }
        if (z10 && this.f56297c.getState() != 2) {
            return true;
        }
        if (this.f56297c.b()) {
            return false;
        }
        return z10 || this.f56297c.m();
    }

    @Override // h3.I
    public long I() {
        return this.f56299e ? this.f56295a.I() : ((h3.I) C13466a.e(this.f56298d)).I();
    }

    public void a(H0 h02) {
        if (h02 == this.f56297c) {
            this.f56298d = null;
            this.f56297c = null;
            this.f56299e = true;
        }
    }

    public void c(long j10) {
        this.f56295a.a(j10);
    }

    @Override // h3.I
    public void d(C5560A c5560a) {
        h3.I i10 = this.f56298d;
        if (i10 != null) {
            i10.d(c5560a);
            c5560a = this.f56298d.f();
        }
        this.f56295a.d(c5560a);
    }

    @Override // h3.I
    public C5560A f() {
        h3.I i10 = this.f56298d;
        return i10 != null ? i10.f() : this.f56295a.f();
    }

    @Override // h3.I
    public boolean w() {
        return this.f56299e ? this.f56295a.w() : ((h3.I) C13466a.e(this.f56298d)).w();
    }

    public C6058k(a aVar, InterfaceC13473h interfaceC13473h) {
        this.f56296b = aVar;
        this.f56295a = new h3.N(interfaceC13473h);
    }

    private void j(boolean z10) {
        if (e(z10)) {
            this.f56299e = true;
            if (this.f56300f) {
                this.f56295a.b();
                return;
            }
            return;
        }
        h3.I i10 = (h3.I) C13466a.e(this.f56298d);
        long jI = i10.I();
        if (this.f56299e) {
            if (jI < this.f56295a.I()) {
                this.f56295a.c();
                return;
            } else {
                this.f56299e = false;
                if (this.f56300f) {
                    this.f56295a.b();
                }
            }
        }
        this.f56295a.a(jI);
        C5560A c5560aF = i10.f();
        if (!c5560aF.equals(this.f56295a.f())) {
            this.f56295a.d(c5560aF);
            this.f56296b.m(c5560aF);
        }
    }

    public void b(H0 h02) throws ExoPlaybackException {
        h3.I i10;
        h3.I iP = h02.P();
        if (iP != null && iP != (i10 = this.f56298d)) {
            if (i10 == null) {
                this.f56298d = iP;
                this.f56297c = h02;
                iP.d(this.f56295a.f());
                return;
            }
            throw ExoPlaybackException.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public long i(boolean z10) {
        j(z10);
        return I();
    }
}
