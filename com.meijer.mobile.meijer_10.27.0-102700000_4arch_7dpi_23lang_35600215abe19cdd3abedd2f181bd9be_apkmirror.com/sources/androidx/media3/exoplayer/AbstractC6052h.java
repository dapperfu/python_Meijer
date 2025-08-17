package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.InterfaceC13473h;
import i3.E1;
import java.io.IOException;
import java.util.Objects;

/* renamed from: androidx.media3.exoplayer.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6052h implements H0, I0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f56152b;

    /* renamed from: d, reason: collision with root package name */
    private h3.K f56154d;

    /* renamed from: e, reason: collision with root package name */
    private int f56155e;

    /* renamed from: f, reason: collision with root package name */
    private E1 f56156f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC13473h f56157g;

    /* renamed from: h, reason: collision with root package name */
    private int f56158h;

    /* renamed from: i, reason: collision with root package name */
    private p3.r f56159i;

    /* renamed from: j, reason: collision with root package name */
    private a3.t[] f56160j;

    /* renamed from: k, reason: collision with root package name */
    private long f56161k;

    /* renamed from: l, reason: collision with root package name */
    private long f56162l;

    /* renamed from: n, reason: collision with root package name */
    private boolean f56164n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f56165o;

    /* renamed from: q, reason: collision with root package name */
    private I0.a f56167q;

    /* renamed from: a, reason: collision with root package name */
    private final Object f56151a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final h3.G f56153c = new h3.G();

    /* renamed from: m, reason: collision with root package name */
    private long f56163m = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    private a3.F f56166p = a3.F.f43583a;

    private void p0(long j10, boolean z10) throws ExoPlaybackException {
        this.f56164n = false;
        this.f56162l = j10;
        this.f56163m = j10;
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
        this.f56164n = true;
    }

    @Override // androidx.media3.exoplayer.F0.b
    public void x(int i10, Object obj) throws ExoPlaybackException {
    }

    @Override // androidx.media3.exoplayer.H0
    public final boolean B() {
        return this.f56164n;
    }

    @Override // androidx.media3.exoplayer.I0
    public final void H(I0.a aVar) {
        synchronized (this.f56151a) {
            this.f56167q = aVar;
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public final void L(a3.t[] tVarArr, p3.r rVar, long j10, long j11, r.b bVar) throws ExoPlaybackException {
        C13466a.g(!this.f56164n);
        this.f56159i = rVar;
        if (this.f56163m == Long.MIN_VALUE) {
            this.f56163m = j10;
        }
        this.f56160j = tVarArr;
        this.f56161k = j11;
        m0(tVarArr, j10, j11, bVar);
    }

    @Override // androidx.media3.exoplayer.H0
    public final long N() {
        return this.f56163m;
    }

    protected final ExoPlaybackException S(Throwable th2, a3.t tVar, boolean z10, int i10) {
        int iQ;
        if (tVar == null || this.f56165o) {
            iQ = 4;
        } else {
            this.f56165o = true;
            try {
                iQ = I0.Q(a(tVar));
            } catch (ExoPlaybackException unused) {
            } finally {
                this.f56165o = false;
            }
        }
        return ExoPlaybackException.b(th2, getName(), W(), tVar, iQ, z10, i10);
    }

    protected final InterfaceC13473h T() {
        return (InterfaceC13473h) C13466a.e(this.f56157g);
    }

    protected final h3.K U() {
        return (h3.K) C13466a.e(this.f56154d);
    }

    protected final h3.G V() {
        this.f56153c.a();
        return this.f56153c;
    }

    protected final int W() {
        return this.f56155e;
    }

    protected final long X() {
        return this.f56162l;
    }

    protected final E1 Y() {
        return (E1) C13466a.e(this.f56156f);
    }

    protected final a3.t[] Z() {
        return (a3.t[]) C13466a.e(this.f56160j);
    }

    protected final long a0() {
        return this.f56161k;
    }

    protected final a3.F b0() {
        return this.f56166p;
    }

    @Override // androidx.media3.exoplayer.H0
    public final void disable() {
        C13466a.g(this.f56158h == 1);
        this.f56153c.a();
        this.f56158h = 0;
        this.f56159i = null;
        this.f56160j = null;
        this.f56164n = false;
        d0();
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public final int g() {
        return this.f56152b;
    }

    @Override // androidx.media3.exoplayer.H0
    public final int getState() {
        return this.f56158h;
    }

    @Override // androidx.media3.exoplayer.H0
    public final p3.r i() {
        return this.f56159i;
    }

    protected final void i0() {
        I0.a aVar;
        synchronized (this.f56151a) {
            aVar = this.f56167q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    @Override // androidx.media3.exoplayer.I0
    public final void j() {
        synchronized (this.f56151a) {
            this.f56167q = null;
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public final void k(a3.F f10) {
        if (Objects.equals(this.f56166p, f10)) {
            return;
        }
        this.f56166p = f10;
        n0(f10);
    }

    @Override // androidx.media3.exoplayer.H0
    public final void l(int i10, E1 e12, InterfaceC13473h interfaceC13473h) {
        this.f56155e = i10;
        this.f56156f = e12;
        this.f56157g = interfaceC13473h;
        f0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final boolean m() {
        return this.f56163m == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.H0
    public final void o(h3.K k10, a3.t[] tVarArr, p3.r rVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar) throws ExoPlaybackException {
        C13466a.g(this.f56158h == 0);
        this.f56154d = k10;
        this.f56158h = 1;
        e0(z10, z11);
        L(tVarArr, rVar, j11, j12, bVar);
        p0(j11, z10);
    }

    protected final int o0(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iD = ((p3.r) C13466a.e(this.f56159i)).d(g10, decoderInputBuffer, i10);
        if (iD != -4) {
            if (iD == -5) {
                a3.t tVar = (a3.t) C13466a.e(g10.f134191b);
                if (tVar.f43954t != Long.MAX_VALUE) {
                    g10.f134191b = tVar.b().y0(tVar.f43954t + this.f56161k).N();
                }
            }
            return iD;
        }
        if (decoderInputBuffer.u()) {
            this.f56163m = Long.MIN_VALUE;
            return this.f56164n ? -4 : -3;
        }
        long j10 = decoderInputBuffer.f55467f + this.f56161k;
        decoderInputBuffer.f55467f = j10;
        this.f56163m = Math.max(this.f56163m, j10);
        return iD;
    }

    protected int q0(long j10) {
        return ((p3.r) C13466a.e(this.f56159i)).c(j10 - this.f56161k);
    }

    @Override // androidx.media3.exoplayer.H0
    public final void release() {
        C13466a.g(this.f56158h == 0);
        h0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void reset() {
        C13466a.g(this.f56158h == 0);
        this.f56153c.a();
        j0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void start() throws ExoPlaybackException {
        C13466a.g(this.f56158h == 1);
        this.f56158h = 2;
        k0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void stop() {
        C13466a.g(this.f56158h == 2);
        this.f56158h = 1;
        l0();
    }

    @Override // androidx.media3.exoplayer.H0
    public final void y() throws IOException {
        ((p3.r) C13466a.e(this.f56159i)).a();
    }

    public AbstractC6052h(int i10) {
        this.f56152b = i10;
    }

    protected final boolean c0() {
        if (m()) {
            return this.f56164n;
        }
        return ((p3.r) C13466a.e(this.f56159i)).b();
    }
}
