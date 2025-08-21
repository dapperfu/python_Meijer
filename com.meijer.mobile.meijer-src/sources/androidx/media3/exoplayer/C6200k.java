package androidx.media3.exoplayer;

import a3.C5643A;
import d3.C13599a;
import d3.InterfaceC13606h;

/* renamed from: androidx.media3.exoplayer.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6200k implements h3.I {

    /* renamed from: a, reason: collision with root package name */
    private final h3.N f56519a;

    /* renamed from: b, reason: collision with root package name */
    private final a f56520b;

    /* renamed from: c, reason: collision with root package name */
    private H0 f56521c;

    /* renamed from: d, reason: collision with root package name */
    private h3.I f56522d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f56523e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f56524f;

    /* renamed from: androidx.media3.exoplayer.k$a */
    public interface a {
        void m(C5643A c5643a);
    }

    public void g() {
        this.f56524f = true;
        this.f56519a.b();
    }

    public void h() {
        this.f56524f = false;
        this.f56519a.c();
    }

    private boolean e(boolean z10) {
        H0 h02 = this.f56521c;
        if (h02 == null || h02.c()) {
            return true;
        }
        if (z10 && this.f56521c.getState() != 2) {
            return true;
        }
        if (this.f56521c.b()) {
            return false;
        }
        return z10 || this.f56521c.m();
    }

    @Override // h3.I
    public long I() {
        return this.f56523e ? this.f56519a.I() : ((h3.I) C13599a.e(this.f56522d)).I();
    }

    public void a(H0 h02) {
        if (h02 == this.f56521c) {
            this.f56522d = null;
            this.f56521c = null;
            this.f56523e = true;
        }
    }

    public void c(long j10) {
        this.f56519a.a(j10);
    }

    @Override // h3.I
    public void d(C5643A c5643a) {
        h3.I i10 = this.f56522d;
        if (i10 != null) {
            i10.d(c5643a);
            c5643a = this.f56522d.f();
        }
        this.f56519a.d(c5643a);
    }

    @Override // h3.I
    public C5643A f() {
        h3.I i10 = this.f56522d;
        return i10 != null ? i10.f() : this.f56519a.f();
    }

    @Override // h3.I
    public boolean w() {
        return this.f56523e ? this.f56519a.w() : ((h3.I) C13599a.e(this.f56522d)).w();
    }

    public C6200k(a aVar, InterfaceC13606h interfaceC13606h) {
        this.f56520b = aVar;
        this.f56519a = new h3.N(interfaceC13606h);
    }

    private void j(boolean z10) {
        if (e(z10)) {
            this.f56523e = true;
            if (this.f56524f) {
                this.f56519a.b();
                return;
            }
            return;
        }
        h3.I i10 = (h3.I) C13599a.e(this.f56522d);
        long jI = i10.I();
        if (this.f56523e) {
            if (jI < this.f56519a.I()) {
                this.f56519a.c();
                return;
            } else {
                this.f56523e = false;
                if (this.f56524f) {
                    this.f56519a.b();
                }
            }
        }
        this.f56519a.a(jI);
        C5643A c5643aF = i10.f();
        if (!c5643aF.equals(this.f56519a.f())) {
            this.f56519a.d(c5643aF);
            this.f56520b.m(c5643aF);
        }
    }

    public void b(H0 h02) throws ExoPlaybackException {
        h3.I i10;
        h3.I iP = h02.P();
        if (iP != null && iP != (i10 = this.f56522d)) {
            if (i10 == null) {
                this.f56522d = iP;
                this.f56521c = h02;
                iP.d(this.f56519a.f());
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
