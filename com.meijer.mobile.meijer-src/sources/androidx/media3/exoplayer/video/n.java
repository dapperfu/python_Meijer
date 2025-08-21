package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import d3.C13599a;
import d3.InterfaceC13606h;
import d3.P;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final b f57382a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.j f57383b;

    /* renamed from: c, reason: collision with root package name */
    private final long f57384c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f57385d;

    /* renamed from: g, reason: collision with root package name */
    private long f57388g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57391j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f57394m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f57395n;

    /* renamed from: e, reason: collision with root package name */
    private int f57386e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f57387f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f57389h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f57390i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    private float f57392k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC13606h f57393l = InterfaceC13606h.f127918a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f57396a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private long f57397b = -9223372036854775807L;

        public long f() {
            return this.f57396a;
        }

        public long g() {
            return this.f57397b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f57396a = -9223372036854775807L;
            this.f57397b = -9223372036854775807L;
        }
    }

    public interface b {
        boolean A(long j10, long j11);

        boolean C(long j10, long j11, long j12, boolean z10, boolean z11) throws ExoPlaybackException;

        boolean K(long j10, long j11, boolean z10);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / this.f57392k);
        return this.f57385d ? j13 - (P.M0(this.f57393l.c()) - j11) : j13;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f57386e == 3 || (!this.f57394m && this.f57395n))) {
            this.f57390i = -9223372036854775807L;
            return true;
        }
        if (this.f57390i == -9223372036854775807L) {
            return false;
        }
        if (this.f57393l.c() < this.f57390i) {
            return true;
        }
        this.f57390i = -9223372036854775807L;
        return false;
    }

    public void g() {
        f(0);
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f57385d = true;
        this.f57388g = P.M0(this.f57393l.c());
        this.f57383b.k();
    }

    public void l() {
        this.f57385d = false;
        this.f57390i = -9223372036854775807L;
        this.f57383b.l();
    }

    public void q(Surface surface) {
        this.f57394m = surface != null;
        this.f57395n = false;
        this.f57383b.m(surface);
        f(1);
    }

    public void r(float f10) {
        C13599a.a(f10 > 0.0f);
        if (f10 == this.f57392k) {
            return;
        }
        this.f57392k = f10;
        this.f57383b.i(f10);
    }

    private void f(int i10) {
        this.f57386e = Math.min(this.f57386e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f57390i != -9223372036854775807L && !this.f57391j) {
            return false;
        }
        int i10 = this.f57386e;
        if (i10 == 0) {
            return this.f57385d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f57385d && this.f57382a.A(j11, P.M0(this.f57393l.c()) - this.f57388g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f57386e == 0) {
            this.f57386e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) throws ExoPlaybackException {
        aVar.h();
        if (this.f57387f == -9223372036854775807L) {
            this.f57387f = j11;
        }
        if (this.f57389h != j10) {
            this.f57383b.h(j10);
            this.f57389h = j10;
        }
        aVar.f57396a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f57394m) {
            this.f57395n = true;
            if (this.f57382a.C(aVar.f57396a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f57385d || aVar.f57396a >= 30000) ? 5 : 3;
        }
        if (s(j11, aVar.f57396a, j13)) {
            return 0;
        }
        if (!this.f57385d || j11 == this.f57387f) {
            return 5;
        }
        long jB = this.f57393l.b();
        aVar.f57397b = this.f57383b.b((aVar.f57396a * 1000) + jB);
        aVar.f57396a = (aVar.f57397b - jB) / 1000;
        boolean z12 = (this.f57390i == -9223372036854775807L || this.f57391j) ? false : true;
        if (this.f57382a.C(aVar.f57396a, j11, j12, z11, z12)) {
            return 4;
        }
        return this.f57382a.K(aVar.f57396a, j12, z11) ? z12 ? 3 : 2 : aVar.f57396a > 50000 ? 5 : 1;
    }

    public void e(boolean z10) {
        this.f57391j = z10;
        this.f57390i = this.f57384c > 0 ? this.f57393l.c() + this.f57384c : -9223372036854775807L;
    }

    public void h(boolean z10) {
        this.f57386e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f57386e != 3;
        this.f57386e = 3;
        this.f57388g = P.M0(this.f57393l.c());
        return z10;
    }

    public void m() {
        this.f57383b.j();
        this.f57389h = -9223372036854775807L;
        this.f57387f = -9223372036854775807L;
        f(1);
        this.f57390i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f57383b.o(i10);
    }

    public void o(InterfaceC13606h interfaceC13606h) {
        this.f57393l = interfaceC13606h;
    }

    public void p(float f10) {
        this.f57383b.g(f10);
    }

    public n(Context context, b bVar, long j10) {
        this.f57382a = bVar;
        this.f57384c = j10;
        this.f57383b = new v3.j(context);
    }
}
