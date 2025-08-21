package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.InterfaceC13606h;
import i3.E1;
import java.io.IOException;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6194h implements H0, I0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f56376b;

    /* renamed from: d, reason: collision with root package name */
    private h3.K f56378d;

    /* renamed from: e, reason: collision with root package name */
    private int f56379e;

    /* renamed from: f, reason: collision with root package name */
    private E1 f56380f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC13606h f56381g;

    /* renamed from: h, reason: collision with root package name */
    private int f56382h;

    /* renamed from: i, reason: collision with root package name */
    private p3.r f56383i;

    /* renamed from: j, reason: collision with root package name */
    private a3.t[] f56384j;

    /* renamed from: k, reason: collision with root package name */
    private long f56385k;

    /* renamed from: l, reason: collision with root package name */
    private long f56386l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f56388n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f56389o;

    /* renamed from: q, reason: collision with root package name */
    private I0.a f56391q;

    /* renamed from: a, reason: collision with root package name */
    private final Object f56375a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final h3.G f56377c = new h3.G();

    /* renamed from: m, reason: collision with root package name */
    private long f56387m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private a3.F f56390p = a3.F.f44401a;

    private void p0(long j10, boolean z10) throws ExoPlaybackException {
        this.f56388n = false;
        this.f56386l = j10;
        this.f56387m = j10;
        g0(j10, z10);
    }

    @Override // androidx.media3.exoplayer.H0
    public final I0 G() {
        return this;
    }

    @Override // androidx.media3.exoplayer.I0
    public int M() throws ExoPlaybackException {
        return 0;
    }

    @Override // androidx.media3.exoplayer.H0
    public final void O(long j10) throws ExoPlaybackException {
        p0(j10, false);
    }

    @Override // androidx.media3.exoplayer.H0
    public h3.I P() {
        return null;
    }

    protected final ExoPlaybackException R(Throwable th2, a3.t tVar, int i10) {
        return S(th2, tVar, false, i10);
    }

    protected abstract void d0();

    protected void e0(boolean z10, boolean z11) throws ExoPlaybackException {
    }

    protected void f0() {
    }

    protected abstract void g0(long j10, boolean z10) throws ExoPlaybackException;

    protected void h0() {
    }

    protected void j0() {
    }

    protected void k0() throws ExoPlaybackException {
    }

    protected void l0() {
    }

    protected void m0(a3.t[] tVarArr, long j10, long j11, r.b bVar) throws ExoPlaybackException {
    }

    protected void n0(a3.F f10) {
    }

    @Override // androidx.media3.exoplayer.H0
    public final void q() {
        this.f56388n = true;
    }

    @Override // androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.H0
    public final boolean B() {
        return this.f56388n;
    }

    @Override // androidx.media3.exoplayer.I0
    public final void H(I0.a aVar) {
        synchronized (this.f56375a) {
            this.f56391q = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public final void L(a3.t[] tVarArr, p3.r rVar, long j10, long j11, r.b bVar) throws ExoPlaybackException {
        C13599a.g(!this.f56388n);
        this.f56383i = rVar;
        if (this.f56387m == Long.MIN_VALUE) {
            this.f56387m = j10;
        }
        this.f56384j = tVarArr;
        this.f56385k = j11;
        m0(tVarArr, j10, j11, bVar);
    }

    @Override // androidx.media3.exoplayer.H0
    public final long N() {
        return this.f56387m;
    }

    protected final ExoPlaybackException S(Throwable th2, a3.t tVar, boolean z10, int i10) {
        int iQ;
        if (tVar == null || this.f56389o) {
            iQ = 4;
        } else {
            this.f56389o = true;
            try {
                iQ = I0.Q(a(tVar));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f56389o = false;
            }
        }
        return ExoPlaybackException.b(th2, getName(), W(), tVar, iQ, z10, i10);
    }

    protected final InterfaceC13606h T() {
        return (InterfaceC13606h) C13599a.e(this.f56381g);
    }

    protected final h3.K U() {
        return (h3.K) C13599a.e(this.f56378d);
    }

    protected final h3.G V() {
        this.f56377c.a();
        return this.f56377c;
    }

    protected final int W() {
        return this.f56379e;
    }

    protected final long X() {
        return this.f56386l;
    }

    protected final E1 Y() {
        return (E1) C13599a.e(this.f56380f);
    }

    protected final a3.t[] Z() {
        return (a3.t[]) C13599a.e(this.f56384j);
    }

    protected final long a0() {
        return this.f56385k;
    }

    protected final a3.F b0() {
        return this.f56390p;
    }

    @Override // androidx.media3.exoplayer.H0
    public final void disable() {
        C13599a.g(this.f56382h == 1);
        this.f56377c.a();
        this.f56382h = 0;
        this.f56383i = null;
        this.f56384j = null;
        this.f56388n = false;
        d0();
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public final int g() {
        return this.f56376b;
    }

    @Override // androidx.media3.exoplayer.H0
    public final int getState() {
        return this.f56382h;
    }

    @Override // androidx.media3.exoplayer.H0
    public final p3.r i() {
        return this.f56383i;
    }

    protected final void i0() {
        I0.a aVar;
        synchronized (this.f56375a) {
            aVar = this.f56391q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.I0
    public final void j() {
        synchronized (this.f56375a) {
            this.f56391q = null;
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public final void k(a3.F f10) {
        if (Objects.equals(this.f56390p, f10)) {
            return;
        }
        this.f56390p = f10;
        n0(f10);
    }

    @Override // androidx.media3.exoplayer.H0
    public final void l(int i10, E1 e12, InterfaceC13606h interfaceC13606h) {
        this.f56379e = i10;
        this.f56380f = e12;
        this.f56381g = interfaceC13606h;
        f0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final boolean m() {
        return this.f56387m == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.H0
    public final void o(h3.K k10, a3.t[] tVarArr, p3.r rVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar) throws ExoPlaybackException {
        C13599a.g(this.f56382h == 0);
        this.f56378d = k10;
        this.f56382h = 1;
        e0(z10, z11);
        L(tVarArr, rVar, j11, j12, bVar);
        p0(j11, z10);
    }

    protected final int o0(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iD = ((p3.r) C13599a.e(this.f56383i)).d(g10, decoderInputBuffer, i10);
        if (iD != -4) {
            if (iD == -5) {
                a3.t tVar = (a3.t) C13599a.e(g10.f134662b);
                if (tVar.f44772t != Long.MAX_VALUE) {
                    g10.f134662b = tVar.b().y0(tVar.f44772t + this.f56385k).N();
                }
            }
            return iD;
        }
        if (decoderInputBuffer.u()) {
            this.f56387m = Long.MIN_VALUE;
            return this.f56388n ? -4 : -3;
        }
        long j10 = decoderInputBuffer.f55691f + this.f56385k;
        decoderInputBuffer.f55691f = j10;
        this.f56387m = Math.max(this.f56387m, j10);
        return iD;
    }

    protected int q0(long j10) {
        return ((p3.r) C13599a.e(this.f56383i)).c(j10 - this.f56385k);
    }

    @Override // androidx.media3.exoplayer.H0
    public final void release() {
        C13599a.g(this.f56382h == 0);
        h0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void reset() {
        C13599a.g(this.f56382h == 0);
        this.f56377c.a();
        j0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void start() throws ExoPlaybackException {
        C13599a.g(this.f56382h == 1);
        this.f56382h = 2;
        k0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void stop() {
        C13599a.g(this.f56382h == 2);
        this.f56382h = 1;
        l0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void y() throws IOException {
        ((p3.r) C13599a.e(this.f56383i)).a();
    }

    public AbstractC6194h(int i10) {
        this.f56376b = i10;
    }

    protected final boolean c0() {
        if (m()) {
            return this.f56388n;
        }
        return ((p3.r) C13599a.e(this.f56383i)).b();
    }
}
