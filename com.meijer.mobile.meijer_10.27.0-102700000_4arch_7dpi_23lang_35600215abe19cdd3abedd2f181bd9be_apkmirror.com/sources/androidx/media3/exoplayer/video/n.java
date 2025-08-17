package androidx.media3.exoplayer.video;

import android.content.Context;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import d3.C13466a;
import d3.InterfaceC13473h;
import d3.P;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final b f57158a;

    /* renamed from: b, reason: collision with root package name */
    private final v3.j f57159b;

    /* renamed from: c, reason: collision with root package name */
    private final long f57160c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f57161d;

    /* renamed from: g, reason: collision with root package name */
    private long f57164g;

    /* renamed from: j, reason: collision with root package name */
    private boolean f57167j;

    /* renamed from: m, reason: collision with root package name */
    private boolean f57170m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f57171n;

    /* renamed from: e, reason: collision with root package name */
    private int f57162e = 0;

    /* renamed from: f, reason: collision with root package name */
    private long f57163f = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f57165h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f57166i = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    private float f57168k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private InterfaceC13473h f57169l = InterfaceC13473h.f127116a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private long f57172a = -9223372036854775807L;

        /* renamed from: b, reason: collision with root package name */
        private long f57173b = -9223372036854775807L;

        public long f() {
            return this.f57172a;
        }

        public long g() {
            return this.f57173b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h() {
            this.f57172a = -9223372036854775807L;
            this.f57173b = -9223372036854775807L;
        }
    }

    public interface b {
        boolean A(long j10, long j11);

        boolean C(long j10, long j11, long j12, boolean z10, boolean z11) throws ExoPlaybackException;

        boolean K(long j10, long j11, boolean z10);
    }

    private long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / this.f57168k);
        return this.f57161d ? j13 - (P.M0(this.f57169l.c()) - j11) : j13;
    }

    public boolean d(boolean z10) {
        if (z10 && (this.f57162e == 3 || (!this.f57170m && this.f57171n))) {
            this.f57166i = -9223372036854775807L;
            return true;
        }
        if (this.f57166i == -9223372036854775807L) {
            return false;
        }
        if (this.f57169l.c() < this.f57166i) {
            return true;
        }
        this.f57166i = -9223372036854775807L;
        return false;
    }

    public void g() {
        f(0);
    }

    public void j() {
        f(2);
    }

    public void k() {
        this.f57161d = true;
        this.f57164g = P.M0(this.f57169l.c());
        this.f57159b.k();
    }

    public void l() {
        this.f57161d = false;
        this.f57166i = -9223372036854775807L;
        this.f57159b.l();
    }

    public void q(Surface surface) {
        this.f57170m = surface != null;
        this.f57171n = false;
        this.f57159b.m(surface);
        f(1);
    }

    public void r(float f10) {
        C13466a.a(f10 > 0.0f);
        if (f10 == this.f57168k) {
            return;
        }
        this.f57168k = f10;
        this.f57159b.i(f10);
    }

    private void f(int i10) {
        this.f57162e = Math.min(this.f57162e, i10);
    }

    private boolean s(long j10, long j11, long j12) {
        if (this.f57166i != -9223372036854775807L && !this.f57167j) {
            return false;
        }
        int i10 = this.f57162e;
        if (i10 == 0) {
            return this.f57161d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 == 3) {
            return this.f57161d && this.f57158a.A(j11, P.M0(this.f57169l.c()) - this.f57164g);
        }
        throw new IllegalStateException();
    }

    public void a() {
        if (this.f57162e == 0) {
            this.f57162e = 1;
        }
    }

    public int c(long j10, long j11, long j12, long j13, boolean z10, boolean z11, a aVar) throws ExoPlaybackException {
        aVar.h();
        if (this.f57163f == -9223372036854775807L) {
            this.f57163f = j11;
        }
        if (this.f57165h != j10) {
            this.f57159b.h(j10);
            this.f57165h = j10;
        }
        aVar.f57172a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f57170m) {
            this.f57171n = true;
            if (this.f57158a.C(aVar.f57172a, j11, j12, z11, true)) {
                return 4;
            }
            return (!this.f57161d || aVar.f57172a >= 30000) ? 5 : 3;
        }
        if (s(j11, aVar.f57172a, j13)) {
            return 0;
        }
        if (!this.f57161d || j11 == this.f57163f) {
            return 5;
        }
        long jB = this.f57169l.b();
        aVar.f57173b = this.f57159b.b((aVar.f57172a * 1000) + jB);
        aVar.f57172a = (aVar.f57173b - jB) / 1000;
        boolean z12 = (this.f57166i == -9223372036854775807L || this.f57167j) ? false : true;
        if (this.f57158a.C(aVar.f57172a, j11, j12, z11, z12)) {
            return 4;
        }
        return this.f57158a.K(aVar.f57172a, j12, z11) ? z12 ? 3 : 2 : aVar.f57172a > 50000 ? 5 : 1;
    }

    public void e(boolean z10) {
        this.f57167j = z10;
        this.f57166i = this.f57160c > 0 ? this.f57169l.c() + this.f57160c : -9223372036854775807L;
    }

    public void h(boolean z10) {
        this.f57162e = z10 ? 1 : 0;
    }

    public boolean i() {
        boolean z10 = this.f57162e != 3;
        this.f57162e = 3;
        this.f57164g = P.M0(this.f57169l.c());
        return z10;
    }

    public void m() {
        this.f57159b.j();
        this.f57165h = -9223372036854775807L;
        this.f57163f = -9223372036854775807L;
        f(1);
        this.f57166i = -9223372036854775807L;
    }

    public void n(int i10) {
        this.f57159b.o(i10);
    }

    public void o(InterfaceC13473h interfaceC13473h) {
        this.f57169l = interfaceC13473h;
    }

    public void p(float f10) {
        this.f57159b.g(f10);
    }

    public n(Context context, b bVar, long j10) {
        this.f57158a = bVar;
        this.f57160c = j10;
        this.f57159b = new v3.j(context);
    }
}
