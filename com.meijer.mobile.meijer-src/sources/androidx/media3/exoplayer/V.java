package androidx.media3.exoplayer;

import a3.AbstractC5651h;
import a3.B;
import a3.C5643A;
import a3.C5647d;
import a3.C5657n;
import a3.F;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.exoplayer.C6186d;
import androidx.media3.exoplayer.C6199j0;
import androidx.media3.exoplayer.D0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.F0;
import androidx.media3.exoplayer.O0;
import androidx.media3.exoplayer.Q0;
import androidx.media3.exoplayer.V;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.r;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import c3.C6476a;
import c3.C6477b;
import d3.C13599a;
import d3.C13604f;
import d3.C13609k;
import d3.C13615q;
import d3.InterfaceC13606h;
import d3.InterfaceC13612n;
import h3.C14446b;
import h3.C14447c;
import i3.A1;
import i3.E1;
import i3.InterfaceC14599a;
import i3.InterfaceC14602b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p3.s;
import r3.InterfaceC16831h;
import s3.AbstractC16998D;
import s3.C16999E;
import w3.InterfaceC17822a;

/* loaded from: classes.dex */
final class V extends AbstractC5651h implements ExoPlayer {

    /* renamed from: A, reason: collision with root package name */
    private final d f55880A;

    /* renamed from: B, reason: collision with root package name */
    private final C6186d f55881B;

    /* renamed from: C, reason: collision with root package name */
    private final O0 f55882C;

    /* renamed from: D, reason: collision with root package name */
    private final T0 f55883D;

    /* renamed from: E, reason: collision with root package name */
    private final W0 f55884E;

    /* renamed from: F, reason: collision with root package name */
    private final long f55885F;

    /* renamed from: G, reason: collision with root package name */
    private final Q0 f55886G;

    /* renamed from: H, reason: collision with root package name */
    private final C13604f<Integer> f55887H;

    /* renamed from: I, reason: collision with root package name */
    private int f55888I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f55889J;

    /* renamed from: K, reason: collision with root package name */
    private int f55890K;

    /* renamed from: L, reason: collision with root package name */
    private int f55891L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f55892M;

    /* renamed from: N, reason: collision with root package name */
    private h3.M f55893N;

    /* renamed from: O, reason: collision with root package name */
    private p3.s f55894O;

    /* renamed from: P, reason: collision with root package name */
    private ExoPlayer.c f55895P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f55896Q;

    /* renamed from: R, reason: collision with root package name */
    private B.b f55897R;

    /* renamed from: S, reason: collision with root package name */
    private a3.x f55898S;

    /* renamed from: T, reason: collision with root package name */
    private a3.x f55899T;

    /* renamed from: U, reason: collision with root package name */
    private a3.t f55900U;

    /* renamed from: V, reason: collision with root package name */
    private a3.t f55901V;

    /* renamed from: W, reason: collision with root package name */
    private Object f55902W;

    /* renamed from: X, reason: collision with root package name */
    private Surface f55903X;

    /* renamed from: Y, reason: collision with root package name */
    private SurfaceHolder f55904Y;

    /* renamed from: Z, reason: collision with root package name */
    private SphericalGLSurfaceView f55905Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f55906a0;

    /* renamed from: b, reason: collision with root package name */
    final C16999E f55907b;

    /* renamed from: b0, reason: collision with root package name */
    private TextureView f55908b0;

    /* renamed from: c, reason: collision with root package name */
    final B.b f55909c;

    /* renamed from: c0, reason: collision with root package name */
    private int f55910c0;

    /* renamed from: d, reason: collision with root package name */
    private final C13609k f55911d = new C13609k();

    /* renamed from: d0, reason: collision with root package name */
    private int f55912d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f55913e;

    /* renamed from: e0, reason: collision with root package name */
    private d3.F f55914e0;

    /* renamed from: f, reason: collision with root package name */
    private final a3.B f55915f;

    /* renamed from: f0, reason: collision with root package name */
    private C14446b f55916f0;

    /* renamed from: g, reason: collision with root package name */
    private final H0[] f55917g;

    /* renamed from: g0, reason: collision with root package name */
    private C14446b f55918g0;

    /* renamed from: h, reason: collision with root package name */
    private final H0[] f55919h;

    /* renamed from: h0, reason: collision with root package name */
    private C5647d f55920h0;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC16998D f55921i;

    /* renamed from: i0, reason: collision with root package name */
    private float f55922i0;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC13612n f55923j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f55924j0;

    /* renamed from: k, reason: collision with root package name */
    private final C6199j0.f f55925k;

    /* renamed from: k0, reason: collision with root package name */
    private C6477b f55926k0;

    /* renamed from: l, reason: collision with root package name */
    private final C6199j0 f55927l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f55928l0;

    /* renamed from: m, reason: collision with root package name */
    private final C13615q<B.d> f55929m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f55930m0;

    /* renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f55931n;

    /* renamed from: n0, reason: collision with root package name */
    private int f55932n0;

    /* renamed from: o, reason: collision with root package name */
    private final F.b f55933o;

    /* renamed from: o0, reason: collision with root package name */
    private PriorityTaskManager f55934o0;

    /* renamed from: p, reason: collision with root package name */
    private final List<e> f55935p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f55936p0;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f55937q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f55938q0;

    /* renamed from: r, reason: collision with root package name */
    private final r.a f55939r;

    /* renamed from: r0, reason: collision with root package name */
    private C5657n f55940r0;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC14599a f55941s;

    /* renamed from: s0, reason: collision with root package name */
    private a3.N f55942s0;

    /* renamed from: t, reason: collision with root package name */
    private final Looper f55943t;

    /* renamed from: t0, reason: collision with root package name */
    private a3.x f55944t0;

    /* renamed from: u, reason: collision with root package name */
    private final t3.d f55945u;

    /* renamed from: u0, reason: collision with root package name */
    private E0 f55946u0;

    /* renamed from: v, reason: collision with root package name */
    private final long f55947v;

    /* renamed from: v0, reason: collision with root package name */
    private int f55948v0;

    /* renamed from: w, reason: collision with root package name */
    private final long f55949w;

    /* renamed from: w0, reason: collision with root package name */
    private int f55950w0;

    /* renamed from: x, reason: collision with root package name */
    private final long f55951x;

    /* renamed from: x0, reason: collision with root package name */
    private long f55952x0;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC13606h f55953y;

    /* renamed from: z, reason: collision with root package name */
    private final c f55954z;

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements androidx.media3.exoplayer.video.p, androidx.media3.exoplayer.audio.e, InterfaceC16831h, o3.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, C6186d.b, O0.b, ExoPlayer.a {
        private c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.p
        public void A(long j10, int i10) {
            V.this.f55941s.A(j10, i10);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.b
        public void B(Surface surface) {
            V.this.g2(null);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.b
        public void D(Surface surface) {
            V.this.g2(surface);
        }

        @Override // androidx.media3.exoplayer.O0.b
        public void E(final int i10, final boolean z10) {
            V.this.f55929m.k(30, new C13615q.a() { // from class: androidx.media3.exoplayer.e0
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).M0(i10, z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void F(boolean z10) {
            V.this.n2();
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void a(AudioSink.a aVar) {
            V.this.f55941s.a(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void b(AudioSink.a aVar) {
            V.this.f55941s.b(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void c(final boolean z10) {
            if (V.this.f55924j0 == z10) {
                return;
            }
            V.this.f55924j0 = z10;
            V.this.f55929m.k(23, new C13615q.a() { // from class: androidx.media3.exoplayer.X
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).c(z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void d(Exception exc) {
            V.this.f55941s.d(exc);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void e(final a3.N n10) {
            V.this.f55942s0 = n10;
            V.this.f55929m.k(25, new C13615q.a() { // from class: androidx.media3.exoplayer.c0
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).e(n10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void f(C14446b c14446b) {
            V.this.f55941s.f(c14446b);
            V.this.f55901V = null;
            V.this.f55918g0 = null;
        }

        @Override // androidx.media3.exoplayer.video.p
        public void g(String str) {
            V.this.f55941s.g(str);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void h(String str, long j10, long j11) {
            V.this.f55941s.h(str, j10, j11);
        }

        @Override // r3.InterfaceC16831h
        public void i(final C6477b c6477b) {
            V.this.f55926k0 = c6477b;
            V.this.f55929m.k(27, new C13615q.a() { // from class: androidx.media3.exoplayer.Y
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).i(c6477b);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.p
        public void j(C14446b c14446b) {
            V.this.f55916f0 = c14446b;
            V.this.f55941s.j(c14446b);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void k(String str) {
            V.this.f55941s.k(str);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void l(String str, long j10, long j11) {
            V.this.f55941s.l(str, j10, j11);
        }

        @Override // androidx.media3.exoplayer.O0.b
        public void m(int i10) {
            final C5657n c5657nC1 = V.C1(V.this.f55882C);
            if (c5657nC1.equals(V.this.f55940r0)) {
                return;
            }
            V.this.f55940r0 = c5657nC1;
            V.this.f55929m.k(29, new C13615q.a() { // from class: androidx.media3.exoplayer.d0
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).N0(c5657nC1);
                }
            });
        }

        @Override // r3.InterfaceC16831h
        public void n(final List<C6476a> list) {
            V.this.f55929m.k(27, new C13615q.a() { // from class: androidx.media3.exoplayer.b0
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).n(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void o(long j10) {
            V.this.f55941s.o(j10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
            V.this.f2(surfaceTexture);
            V.this.U1(i10, i11);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            V.this.g2(null);
            V.this.U1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
            V.this.U1(i10, i11);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void p(Exception exc) {
            V.this.f55941s.p(exc);
        }

        @Override // o3.b
        public void q(final a3.y yVar) {
            V v10 = V.this;
            v10.f55944t0 = v10.f55944t0.a().M(yVar).J();
            a3.x xVarY1 = V.this.y1();
            if (!xVarY1.equals(V.this.f55898S)) {
                V.this.f55898S = xVarY1;
                V.this.f55929m.h(14, new C13615q.a() { // from class: androidx.media3.exoplayer.Z
                    @Override // d3.C13615q.a
                    public final void invoke(Object obj) {
                        ((B.d) obj).U0(V.this.f55898S);
                    }
                });
            }
            V.this.f55929m.h(28, new C13615q.a() { // from class: androidx.media3.exoplayer.a0
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).q(yVar);
                }
            });
            V.this.f55929m.f();
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void r(a3.t tVar, C14447c c14447c) {
            V.this.f55901V = tVar;
            V.this.f55941s.r(tVar, c14447c);
        }

        @Override // androidx.media3.exoplayer.C6186d.b
        public void s() {
            V.this.k2(false, 3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            V.this.U1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (V.this.f55906a0) {
                V.this.g2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (V.this.f55906a0) {
                V.this.g2(null);
            }
            V.this.U1(0, 0);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void t(C14446b c14446b) {
            V.this.f55918g0 = c14446b;
            V.this.f55941s.t(c14446b);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void u(int i10, long j10) {
            V.this.f55941s.u(i10, j10);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void v(Object obj, long j10) {
            V.this.f55941s.v(obj, j10);
            if (V.this.f55902W == obj) {
                V.this.f55929m.k(26, new C13615q.a() { // from class: h3.E
                    @Override // d3.C13615q.a
                    public final void invoke(Object obj2) {
                        ((B.d) obj2).O0();
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void w(Exception exc) {
            V.this.f55941s.w(exc);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void x(C14446b c14446b) {
            V.this.f55941s.x(c14446b);
            V.this.f55900U = null;
            V.this.f55916f0 = null;
        }

        @Override // androidx.media3.exoplayer.video.p
        public void y(a3.t tVar, C14447c c14447c) {
            V.this.f55900U = tVar;
            V.this.f55941s.y(tVar, c14447c);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void z(int i10, long j10, long j11) {
            V.this.f55941s.z(i10, j10, j11);
        }
    }

    private static final class d implements v3.h, InterfaceC17822a, F0.b {

        /* renamed from: a, reason: collision with root package name */
        private v3.h f55956a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC17822a f55957b;

        /* renamed from: c, reason: collision with root package name */
        private v3.h f55958c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC17822a f55959d;

        private d() {
        }

        @Override // androidx.media3.exoplayer.F0.b
        public void x(int i10, Object obj) {
            if (i10 == 7) {
                this.f55956a = (v3.h) obj;
                return;
            }
            if (i10 == 8) {
                this.f55957b = (InterfaceC17822a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f55958c = null;
                this.f55959d = null;
            } else {
                this.f55958c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f55959d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // v3.h
        public void a(long j10, long j11, a3.t tVar, MediaFormat mediaFormat) {
            long j12;
            long j13;
            a3.t tVar2;
            MediaFormat mediaFormat2;
            v3.h hVar = this.f55958c;
            if (hVar != null) {
                hVar.a(j10, j11, tVar, mediaFormat);
                mediaFormat2 = mediaFormat;
                tVar2 = tVar;
                j13 = j11;
                j12 = j10;
            } else {
                j12 = j10;
                j13 = j11;
                tVar2 = tVar;
                mediaFormat2 = mediaFormat;
            }
            v3.h hVar2 = this.f55956a;
            if (hVar2 != null) {
                hVar2.a(j12, j13, tVar2, mediaFormat2);
            }
        }

        @Override // w3.InterfaceC17822a
        public void d(long j10, float[] fArr) {
            InterfaceC17822a interfaceC17822a = this.f55959d;
            if (interfaceC17822a != null) {
                interfaceC17822a.d(j10, fArr);
            }
            InterfaceC17822a interfaceC17822a2 = this.f55957b;
            if (interfaceC17822a2 != null) {
                interfaceC17822a2.d(j10, fArr);
            }
        }

        @Override // w3.InterfaceC17822a
        public void f() {
            InterfaceC17822a interfaceC17822a = this.f55959d;
            if (interfaceC17822a != null) {
                interfaceC17822a.f();
            }
            InterfaceC17822a interfaceC17822a2 = this.f55957b;
            if (interfaceC17822a2 != null) {
                interfaceC17822a2.f();
            }
        }
    }

    private static final class e implements InterfaceC6213q0 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f55960a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.r f55961b;

        /* renamed from: c, reason: collision with root package name */
        private a3.F f55962c;

        @Override // androidx.media3.exoplayer.InterfaceC6213q0
        public Object a() {
            return this.f55960a;
        }

        @Override // androidx.media3.exoplayer.InterfaceC6213q0
        public a3.F b() {
            return this.f55962c;
        }

        public void c(a3.F f10) {
            this.f55962c = f10;
        }

        public e(Object obj, androidx.media3.exoplayer.source.p pVar) {
            this.f55960a = obj;
            this.f55961b = pVar;
            this.f55962c = pVar.V();
        }
    }

    private Pair<Boolean, Integer> G1(E0 e02, E0 e03, boolean z10, int i10, boolean z11, boolean z12) {
        a3.F f10 = e03.f55735a;
        a3.F f11 = e02.f55735a;
        if (f11.q() && f10.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (f11.q() != f10.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (f10.n(f10.h(e03.f55736b.f57157a, this.f55933o).f44412c, this.f44649a).f44433a.equals(f11.n(f11.h(e02.f55736b.f57157a, this.f55933o).f44412c, this.f44649a).f44433a)) {
            return (z10 && i10 == 0 && e03.f55736b.f57160d < e02.f55736b.f57160d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z10 && i10 == 0) {
            i11 = 1;
        } else if (z10 && i10 == 1) {
            i11 = 2;
        } else if (!z11) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i11));
    }

    private void b2(int i10, Object obj) {
        a2(-1, i10, obj);
    }

    private void e2(SurfaceHolder surfaceHolder) {
        this.f55906a0 = false;
        this.f55904Y = surfaceHolder;
        surfaceHolder.addCallback(this.f55954z);
        Surface surface = this.f55904Y.getSurface();
        if (surface == null || !surface.isValid()) {
            U1(0, 0);
        } else {
            Rect surfaceFrame = this.f55904Y.getSurfaceFrame();
            U1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
        public static /* synthetic */ void a(Context context, boolean z10, V v10, E1 e12) {
            A1 a1D0 = A1.D0(context);
            if (a1D0 == null) {
                d3.r.i("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            }
            if (z10) {
                v10.v1(a1D0);
            }
            e12.b(a1D0.K0());
        }

        public static void b(final Context context, final V v10, final boolean z10, final E1 e12) {
            v10.H1().e(v10.L1(), null).post(new Runnable() { // from class: androidx.media3.exoplayer.W
                @Override // java.lang.Runnable
                public final void run() {
                    V.b.a(context, z10, v10, e12);
                }
            });
        }
    }

    static {
        a3.w.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public V(ExoPlayer.b bVar, a3.B b10) {
        Looper looper;
        InterfaceC13606h interfaceC13606h;
        try {
            d3.r.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0] [" + d3.P.f127892e + "]");
            this.f55913e = bVar.f55772a.getApplicationContext();
            this.f55941s = bVar.f55780i.apply(bVar.f55773b);
            this.f55932n0 = bVar.f55782k;
            this.f55934o0 = bVar.f55783l;
            this.f55920h0 = bVar.f55784m;
            this.f55910c0 = bVar.f55790s;
            this.f55912d0 = bVar.f55791t;
            this.f55924j0 = bVar.f55788q;
            this.f55885F = bVar.f55763B;
            c cVar = new c();
            this.f55954z = cVar;
            this.f55880A = new d();
            Handler handler = new Handler(bVar.f55781j);
            h3.L l10 = bVar.f55775d.get();
            H0[] h0ArrA = l10.a(handler, cVar, cVar, cVar, cVar);
            this.f55917g = h0ArrA;
            C13599a.g(h0ArrA.length > 0);
            this.f55919h = new H0[h0ArrA.length];
            int i10 = 0;
            while (true) {
                H0[] h0Arr = this.f55919h;
                if (i10 >= h0Arr.length) {
                    break;
                }
                H0 h02 = this.f55917g[i10];
                c cVar2 = this.f55954z;
                h3.L l11 = l10;
                h0Arr[i10] = l11.b(h02, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
                l10 = l11;
            }
            AbstractC16998D abstractC16998D = bVar.f55777f.get();
            this.f55921i = abstractC16998D;
            this.f55939r = bVar.f55776e.get();
            t3.d dVar = bVar.f55779h.get();
            this.f55945u = dVar;
            this.f55937q = bVar.f55792u;
            this.f55893N = bVar.f55793v;
            this.f55947v = bVar.f55794w;
            this.f55949w = bVar.f55795x;
            this.f55951x = bVar.f55796y;
            this.f55896Q = bVar.f55764C;
            Looper looper2 = bVar.f55781j;
            this.f55943t = looper2;
            InterfaceC13606h interfaceC13606h2 = bVar.f55773b;
            this.f55953y = interfaceC13606h2;
            a3.B b11 = b10 == null ? this : b10;
            this.f55915f = b11;
            this.f55929m = new C13615q<>(looper2, interfaceC13606h2, new C13615q.b() { // from class: androidx.media3.exoplayer.B
                @Override // d3.C13615q.b
                public final void a(Object obj, a3.r rVar) {
                    ((B.d) obj).P0(this.f55704a.f55915f, new B.c(rVar));
                }
            });
            this.f55931n = new CopyOnWriteArraySet<>();
            this.f55935p = new ArrayList();
            this.f55894O = new s.a(0);
            this.f55895P = ExoPlayer.c.f55798b;
            H0[] h0Arr2 = this.f55917g;
            C16999E c16999e = new C16999E(new h3.K[h0Arr2.length], new s3.y[h0Arr2.length], a3.J.f44568b, null);
            this.f55907b = c16999e;
            this.f55933o = new F.b();
            B.b bVarE = new B.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, abstractC16998D.h()).d(23, bVar.f55789r).d(25, bVar.f55789r).d(33, bVar.f55789r).d(26, bVar.f55789r).d(34, bVar.f55789r).e();
            this.f55909c = bVarE;
            this.f55897R = new B.b.a().b(bVarE).a(4).a(10).e();
            this.f55923j = interfaceC13606h2.e(looper2, null);
            C6199j0.f fVar = new C6199j0.f() { // from class: androidx.media3.exoplayer.C
                @Override // androidx.media3.exoplayer.C6199j0.f
                public final void a(C6199j0.e eVar) {
                    V v10 = this.f55707a;
                    v10.f55923j.post(new Runnable() { // from class: androidx.media3.exoplayer.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            v10.P1(eVar);
                        }
                    });
                }
            };
            this.f55925k = fVar;
            this.f55946u0 = E0.k(c16999e);
            this.f55941s.F(b11, looper2);
            E1 e12 = new E1(bVar.f55769H);
            C6199j0 c6199j0 = new C6199j0(this.f55913e, this.f55917g, this.f55919h, abstractC16998D, c16999e, bVar.f55778g.get(), dVar, this.f55888I, this.f55889J, this.f55941s, this.f55893N, bVar.f55797z, bVar.f55762A, this.f55896Q, bVar.f55770I, looper2, interfaceC13606h2, fVar, e12, bVar.f55766E, this.f55895P);
            this.f55927l = c6199j0;
            Looper looperK = c6199j0.K();
            this.f55922i0 = 1.0f;
            this.f55888I = 0;
            a3.x xVar = a3.x.f44971I;
            this.f55898S = xVar;
            this.f55899T = xVar;
            this.f55944t0 = xVar;
            this.f55948v0 = -1;
            this.f55926k0 = C6477b.f61224c;
            this.f55928l0 = true;
            l(this.f55941s);
            dVar.f(new Handler(looper2), this.f55941s);
            w1(this.f55954z);
            long j10 = bVar.f55774c;
            if (j10 > 0) {
                c6199j0.E(j10);
            }
            if (d3.P.f127888a >= 31) {
                b.b(this.f55913e, this, bVar.f55765D, e12);
            }
            C13604f<Integer> c13604f = new C13604f<>(0, looperK, looper2, interfaceC13606h2, new C13604f.a() { // from class: androidx.media3.exoplayer.E
                @Override // d3.C13604f.a
                public final void a(Object obj, Object obj2) {
                    this.f55733a.V1(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.f55887H = c13604f;
            c13604f.e(new Runnable() { // from class: androidx.media3.exoplayer.F
                @Override // java.lang.Runnable
                public final void run() {
                    V v10 = this.f55801a;
                    v10.f55887H.f(Integer.valueOf(d3.P.I(v10.f55913e)));
                }
            });
            C6186d c6186d = new C6186d(bVar.f55772a, looperK, bVar.f55781j, this.f55954z, interfaceC13606h2);
            InterfaceC13606h interfaceC13606h3 = interfaceC13606h2;
            this.f55881B = c6186d;
            c6186d.d(bVar.f55787p);
            if (bVar.f55768G) {
                Q0 q02 = bVar.f55771J;
                this.f55886G = q02;
                q02.a(new Q0.a() { // from class: androidx.media3.exoplayer.G
                    @Override // androidx.media3.exoplayer.Q0.a
                    public final void a(boolean z10) {
                        this.f55816a.W1(z10);
                    }
                }, this.f55913e, looper2, looperK, interfaceC13606h3);
                interfaceC13606h3 = interfaceC13606h3;
            } else {
                this.f55886G = null;
            }
            if (bVar.f55789r) {
                InterfaceC13606h interfaceC13606h4 = interfaceC13606h3;
                O0 o02 = new O0(bVar.f55772a, this.f55954z, this.f55920h0.b(), looperK, looper2, interfaceC13606h4);
                looper = looperK;
                interfaceC13606h = interfaceC13606h4;
                this.f55882C = o02;
            } else {
                looper = looperK;
                interfaceC13606h = interfaceC13606h3;
                this.f55882C = null;
            }
            T0 t02 = new T0(bVar.f55772a, looper, interfaceC13606h);
            this.f55883D = t02;
            t02.c(bVar.f55786o != 0);
            W0 w02 = new W0(bVar.f55772a, looper, interfaceC13606h);
            this.f55884E = w02;
            w02.c(bVar.f55786o == 2);
            this.f55940r0 = C5657n.f44677e;
            this.f55942s0 = a3.N.f44581e;
            this.f55914e0 = d3.F.f127870c;
            c6199j0.Z0(this.f55920h0, bVar.f55785n);
            a2(1, 3, this.f55920h0);
            a2(2, 4, Integer.valueOf(this.f55910c0));
            a2(2, 5, Integer.valueOf(this.f55912d0));
            a2(1, 9, Boolean.valueOf(this.f55924j0));
            a2(2, 7, this.f55880A);
            a2(6, 8, this.f55880A);
            b2(16, Integer.valueOf(this.f55932n0));
            this.f55911d.e();
        } catch (Throwable th2) {
            this.f55911d.e();
            throw th2;
        }
    }

    private int B1(boolean z10) {
        Q0 q02 = this.f55886G;
        if (q02 == null || q02.b()) {
            return (this.f55946u0.f55748n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C5657n C1(O0 o02) {
        return new C5657n.b(0).g(o02 != null ? o02.j() : 0).f(o02 != null ? o02.i() : 0).e();
    }

    private a3.F D1() {
        return new G0(this.f55935p, this.f55894O);
    }

    private List<androidx.media3.exoplayer.source.r> E1(List<a3.v> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f55939r.e(list.get(i10)));
        }
        return arrayList;
    }

    private F0 F1(F0.b bVar) {
        int iK1 = K1(this.f55946u0);
        C6199j0 c6199j0 = this.f55927l;
        a3.F f10 = this.f55946u0.f55735a;
        if (iK1 == -1) {
            iK1 = 0;
        }
        return new F0(c6199j0, bVar, f10, iK1, this.f55953y, c6199j0.K());
    }

    private long I1(E0 e02) {
        if (!e02.f55736b.b()) {
            return d3.P.j1(J1(e02));
        }
        e02.f55735a.h(e02.f55736b.f57157a, this.f55933o);
        return e02.f55737c == -9223372036854775807L ? e02.f55735a.n(K1(e02), this.f44649a).b() : this.f55933o.n() + d3.P.j1(e02.f55737c);
    }

    private long J1(E0 e02) {
        if (e02.f55735a.q()) {
            return d3.P.M0(this.f55952x0);
        }
        long jM = e02.f55750p ? e02.m() : e02.f55753s;
        return e02.f55736b.b() ? jM : X1(e02.f55735a, e02.f55736b, jM);
    }

    private int K1(E0 e02) {
        return e02.f55735a.q() ? this.f55948v0 : e02.f55735a.h(e02.f55736b.f57157a, this.f55933o).f44412c;
    }

    private B.e N1(int i10, E0 e02, int i11) {
        int i12;
        Object obj;
        a3.v vVar;
        Object obj2;
        int i13;
        long jO1;
        long jO12;
        F.b bVar = new F.b();
        if (e02.f55735a.q()) {
            i12 = i11;
            obj = null;
            vVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = e02.f55736b.f57157a;
            e02.f55735a.h(obj3, bVar);
            int i14 = bVar.f44412c;
            int iB = e02.f55735a.b(obj3);
            Object obj4 = e02.f55735a.n(i14, this.f44649a).f44433a;
            vVar = this.f44649a.f44435c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (e02.f55736b.b()) {
                r.b bVar2 = e02.f55736b;
                jO1 = bVar.b(bVar2.f57158b, bVar2.f57159c);
                jO12 = O1(e02);
            } else {
                jO1 = e02.f55736b.f57161e != -1 ? O1(this.f55946u0) : bVar.f44414e + bVar.f44413d;
                jO12 = jO1;
            }
        } else if (e02.f55736b.b()) {
            jO1 = e02.f55753s;
            jO12 = O1(e02);
        } else {
            jO1 = bVar.f44414e + e02.f55753s;
            jO12 = jO1;
        }
        long jJ1 = d3.P.j1(jO1);
        long jJ12 = d3.P.j1(jO12);
        r.b bVar3 = e02.f55736b;
        return new B.e(obj, i12, vVar, obj2, i13, jJ1, jJ12, bVar3.f57158b, bVar3.f57159c);
    }

    private static long O1(E0 e02) {
        F.c cVar = new F.c();
        F.b bVar = new F.b();
        e02.f55735a.h(e02.f55736b.f57157a, bVar);
        return e02.f55737c == -9223372036854775807L ? e02.f55735a.n(bVar.f44412c, cVar).c() : bVar.o() + e02.f55737c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1(C6199j0.e eVar) {
        boolean z10;
        long jX1;
        int i10 = this.f55890K - eVar.f56507c;
        this.f55890K = i10;
        boolean z11 = true;
        if (eVar.f56508d) {
            this.f55891L = eVar.f56509e;
            this.f55892M = true;
        }
        if (i10 == 0) {
            a3.F f10 = eVar.f56506b.f55735a;
            if (!this.f55946u0.f55735a.q() && f10.q()) {
                this.f55948v0 = -1;
                this.f55952x0 = 0L;
                this.f55950w0 = 0;
            }
            if (!f10.q()) {
                List<a3.F> listF = ((G0) f10).F();
                C13599a.g(listF.size() == this.f55935p.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    this.f55935p.get(i11).c(listF.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f55892M) {
                if (eVar.f56506b.f55736b.equals(this.f55946u0.f55736b) && eVar.f56506b.f55738d == this.f55946u0.f55753s) {
                    z11 = false;
                }
                if (z11) {
                    if (f10.q() || eVar.f56506b.f55736b.b()) {
                        jX1 = eVar.f56506b.f55738d;
                    } else {
                        E0 e02 = eVar.f56506b;
                        jX1 = X1(f10, e02.f55736b, e02.f55738d);
                    }
                    j10 = jX1;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f55892M = false;
            l2(eVar.f56506b, 1, z10, this.f55891L, j10, -1, false);
        }
    }

    private E0 S1(E0 e02, a3.F f10, Pair<Object, Long> pair) {
        C13599a.a(f10.q() || pair != null);
        a3.F f11 = e02.f55735a;
        long jI1 = I1(e02);
        E0 e0J = e02.j(f10);
        if (f10.q()) {
            r.b bVarL = E0.l();
            long jM0 = d3.P.M0(this.f55952x0);
            E0 e0C = e0J.d(bVarL, jM0, jM0, jM0, 0L, p3.w.f156147d, this.f55907b, Ee.L.x()).c(bVarL);
            e0C.f55751q = e0C.f55753s;
            return e0C;
        }
        Object obj = e0J.f55736b.f57157a;
        boolean zEquals = obj.equals(((Pair) d3.P.h(pair)).first);
        r.b bVar = !zEquals ? new r.b(pair.first) : e0J.f55736b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM02 = d3.P.M0(jI1);
        if (!f11.q()) {
            jM02 -= f11.h(obj, this.f55933o).o();
        }
        if (!zEquals || jLongValue < jM02) {
            r.b bVar2 = bVar;
            C13599a.g(!bVar2.b());
            E0 e0C2 = e0J.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? p3.w.f156147d : e0J.f55742h, !zEquals ? this.f55907b : e0J.f55743i, !zEquals ? Ee.L.x() : e0J.f55744j).c(bVar2);
            e0C2.f55751q = jLongValue;
            return e0C2;
        }
        if (jLongValue != jM02) {
            r.b bVar3 = bVar;
            C13599a.g(!bVar3.b());
            long jMax = Math.max(0L, e0J.f55752r - (jLongValue - jM02));
            long j10 = e0J.f55751q;
            if (e0J.f55745k.equals(e0J.f55736b)) {
                j10 = jLongValue + jMax;
            }
            E0 e0D = e0J.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, e0J.f55742h, e0J.f55743i, e0J.f55744j);
            e0D.f55751q = j10;
            return e0D;
        }
        int iB = f10.b(e0J.f55745k.f57157a);
        if (iB != -1 && f10.f(iB, this.f55933o).f44412c == f10.h(bVar.f57157a, this.f55933o).f44412c) {
            return e0J;
        }
        f10.h(bVar.f57157a, this.f55933o);
        long jB = bVar.b() ? this.f55933o.b(bVar.f57158b, bVar.f57159c) : this.f55933o.f44413d;
        r.b bVar4 = bVar;
        E0 e0C3 = e0J.d(bVar4, e0J.f55753s, e0J.f55753s, e0J.f55738d, jB - e0J.f55753s, e0J.f55742h, e0J.f55743i, e0J.f55744j).c(bVar4);
        e0C3.f55751q = jB;
        return e0C3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(final int i10, final int i11) {
        if (i10 == this.f55914e0.b() && i11 == this.f55914e0.a()) {
            return;
        }
        this.f55914e0 = new d3.F(i10, i11);
        this.f55929m.k(24, new C13615q.a() { // from class: androidx.media3.exoplayer.y
            @Override // d3.C13615q.a
            public final void invoke(Object obj) {
                ((B.d) obj).T0(i10, i11);
            }
        });
        a2(2, 14, new d3.F(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1(boolean z10) {
        if (this.f55938q0) {
            return;
        }
        if (!z10) {
            k2(this.f55946u0.f55746l, 1);
            return;
        }
        E0 e02 = this.f55946u0;
        if (e02.f55748n == 3) {
            k2(e02.f55746l, 1);
        }
    }

    private long X1(a3.F f10, r.b bVar, long j10) {
        f10.h(bVar.f57157a, this.f55933o);
        return j10 + this.f55933o.o();
    }

    private void Y1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f55935p.remove(i12);
        }
        this.f55894O = this.f55894O.a(i10, i11);
    }

    private void Z1() {
        if (this.f55905Z != null) {
            F1(this.f55880A).m(10000).l(null).k();
            this.f55905Z.g(this.f55954z);
            this.f55905Z = null;
        }
        TextureView textureView = this.f55908b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f55954z) {
                d3.r.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f55908b0.setSurfaceTextureListener(null);
            }
            this.f55908b0 = null;
        }
        SurfaceHolder surfaceHolder = this.f55904Y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f55954z);
            this.f55904Y = null;
        }
    }

    private void a2(int i10, int i11, Object obj) {
        for (H0 h02 : this.f55917g) {
            if (i10 == -1 || h02.g() == i10) {
                F1(h02).m(i11).l(obj).k();
            }
        }
        for (H0 h03 : this.f55919h) {
            if (h03 != null && (i10 == -1 || h03.g() == i10)) {
                F1(h03).m(i11).l(obj).k();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d2(java.util.List<androidx.media3.exoplayer.source.r> r15, int r16, long r17, boolean r19) {
        /*
            r14 = this;
            r1 = r16
            androidx.media3.exoplayer.E0 r2 = r14.f55946u0
            int r2 = r14.K1(r2)
            long r3 = r14.g0()
            int r5 = r14.f55890K
            r6 = 1
            int r5 = r5 + r6
            r14.f55890K = r5
            java.util.List<androidx.media3.exoplayer.V$e> r5 = r14.f55935p
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L24
            java.util.List<androidx.media3.exoplayer.V$e> r5 = r14.f55935p
            int r5 = r5.size()
            r14.Y1(r7, r5)
        L24:
            java.util.List r9 = r14.x1(r7, r15)
            a3.F r5 = r14.D1()
            boolean r8 = r5.q()
            if (r8 != 0) goto L38
            int r8 = r5.p()
            if (r1 >= r8) goto L3b
        L38:
            r10 = r17
            goto L43
        L3b:
            androidx.media3.common.IllegalSeekPositionException r2 = new androidx.media3.common.IllegalSeekPositionException
            r10 = r17
            r2.<init>(r5, r1, r10)
            throw r2
        L43:
            r8 = -1
            if (r19 == 0) goto L53
            boolean r1 = r14.f55889J
            int r1 = r5.a(r1)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L51:
            r10 = r1
            goto L5a
        L53:
            if (r1 != r8) goto L58
            r10 = r2
            r2 = r3
            goto L5a
        L58:
            r2 = r10
            goto L51
        L5a:
            androidx.media3.exoplayer.E0 r1 = r14.f55946u0
            android.util.Pair r4 = r14.T1(r5, r10, r2)
            androidx.media3.exoplayer.E0 r1 = r14.S1(r1, r5, r4)
            int r4 = r1.f55739e
            if (r10 == r8) goto L7a
            if (r4 == r6) goto L7a
            boolean r4 = r5.q()
            if (r4 != 0) goto L79
            int r4 = r5.p()
            if (r10 < r4) goto L77
            goto L79
        L77:
            r4 = 2
            goto L7a
        L79:
            r4 = 4
        L7a:
            androidx.media3.exoplayer.E0 r1 = R1(r1, r4)
            androidx.media3.exoplayer.j0 r8 = r14.f55927l
            long r11 = d3.P.M0(r2)
            p3.s r13 = r14.f55894O
            r8.e1(r9, r10, r11, r13)
            androidx.media3.exoplayer.E0 r2 = r14.f55946u0
            androidx.media3.exoplayer.source.r$b r2 = r2.f55736b
            java.lang.Object r2 = r2.f57157a
            androidx.media3.exoplayer.source.r$b r3 = r1.f55736b
            java.lang.Object r3 = r3.f57157a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La5
            androidx.media3.exoplayer.E0 r2 = r14.f55946u0
            a3.F r2 = r2.f55735a
            boolean r2 = r2.q()
            if (r2 != 0) goto La5
            r3 = r6
            goto La6
        La5:
            r3 = r7
        La6:
            long r5 = r14.J1(r1)
            r7 = -1
            r8 = 0
            r2 = 0
            r4 = 4
            r0 = r14
            r0.l2(r1, r2, r3, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.V.d2(java.util.List, int, long, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f2(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        g2(surface);
        this.f55903X = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2(Object obj) {
        Object obj2 = this.f55902W;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zT1 = this.f55927l.t1(obj, z10 ? this.f55885F : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f55902W;
            Surface surface = this.f55903X;
            if (obj3 == surface) {
                surface.release();
                this.f55903X = null;
            }
        }
        this.f55902W = obj;
        if (zT1) {
            return;
        }
        i2(ExoPlaybackException.d(new ExoTimeoutException(3), 1003));
    }

    private void i2(ExoPlaybackException exoPlaybackException) {
        E0 e02 = this.f55946u0;
        E0 e0C = e02.c(e02.f55736b);
        e0C.f55751q = e0C.f55753s;
        e0C.f55752r = 0L;
        E0 e0R1 = R1(e0C, 1);
        if (exoPlaybackException != null) {
            e0R1 = e0R1.f(exoPlaybackException);
        }
        this.f55890K++;
        this.f55927l.D1();
        l2(e0R1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void j2() {
        B.b bVar = this.f55897R;
        B.b bVarN = d3.P.N(this.f55915f, this.f55909c);
        this.f55897R = bVarN;
        if (bVarN.equals(bVar)) {
            return;
        }
        this.f55929m.h(13, new C13615q.a() { // from class: androidx.media3.exoplayer.J
            @Override // d3.C13615q.a
            public final void invoke(Object obj) {
                ((B.d) obj).b1(this.f55829a.f55897R);
            }
        });
    }

    private void l2(final E0 e02, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        E0 e03 = this.f55946u0;
        this.f55946u0 = e02;
        boolean zEquals = e03.f55735a.equals(e02.f55735a);
        Pair<Boolean, Integer> pairG1 = G1(e02, e03, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairG1.first).booleanValue();
        final int iIntValue = ((Integer) pairG1.second).intValue();
        if (zBooleanValue) {
            vVar = e02.f55735a.q() ? null : e02.f55735a.n(e02.f55735a.h(e02.f55736b.f57157a, this.f55933o).f44412c, this.f44649a).f44435c;
            this.f55944t0 = a3.x.f44971I;
        }
        if (zBooleanValue || !e03.f55744j.equals(e02.f55744j)) {
            this.f55944t0 = this.f55944t0.a().N(e02.f55744j).J();
        }
        a3.x xVarY1 = y1();
        boolean zEquals2 = xVarY1.equals(this.f55898S);
        this.f55898S = xVarY1;
        boolean z12 = e03.f55746l != e02.f55746l;
        boolean z13 = e03.f55739e != e02.f55739e;
        if (z13 || z12) {
            n2();
        }
        boolean z14 = e03.f55741g;
        boolean z15 = e02.f55741g;
        boolean z16 = z14 != z15;
        if (z16) {
            m2(z15);
        }
        if (!zEquals) {
            this.f55929m.h(0, new C13615q.a() { // from class: androidx.media3.exoplayer.s
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    B.d dVar = (B.d) obj;
                    dVar.Q0(e02.f55735a, i10);
                }
            });
        }
        if (z10) {
            final B.e eVarN1 = N1(i11, e03, i12);
            final B.e eVarM1 = M1(j10);
            this.f55929m.h(11, new C13615q.a() { // from class: androidx.media3.exoplayer.P
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    V.O0(i11, eVarN1, eVarM1, (B.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f55929m.h(1, new C13615q.a() { // from class: androidx.media3.exoplayer.Q
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).W0(vVar, iIntValue);
                }
            });
        }
        if (e03.f55740f != e02.f55740f) {
            this.f55929m.h(10, new C13615q.a() { // from class: androidx.media3.exoplayer.S
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).c1(e02.f55740f);
                }
            });
            if (e02.f55740f != null) {
                this.f55929m.h(10, new C13615q.a() { // from class: androidx.media3.exoplayer.T
                    @Override // d3.C13615q.a
                    public final void invoke(Object obj) {
                        ((B.d) obj).R0(e02.f55740f);
                    }
                });
            }
        }
        C16999E c16999e = e03.f55743i;
        C16999E c16999e2 = e02.f55743i;
        if (c16999e != c16999e2) {
            this.f55921i.i(c16999e2.f159757e);
            this.f55929m.h(2, new C13615q.a() { // from class: androidx.media3.exoplayer.U
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).S0(e02.f55743i.f159756d);
                }
            });
        }
        if (!zEquals2) {
            final a3.x xVar = this.f55898S;
            this.f55929m.h(14, new C13615q.a() { // from class: androidx.media3.exoplayer.t
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).U0(xVar);
                }
            });
        }
        if (z16) {
            this.f55929m.h(3, new C13615q.a() { // from class: androidx.media3.exoplayer.u
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    V.u0(e02, (B.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f55929m.h(-1, new C13615q.a() { // from class: androidx.media3.exoplayer.v
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    E0 e04 = e02;
                    ((B.d) obj).a1(e04.f55746l, e04.f55739e);
                }
            });
        }
        if (z13) {
            this.f55929m.h(4, new C13615q.a() { // from class: androidx.media3.exoplayer.w
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).K0(e02.f55739e);
                }
            });
        }
        if (z12 || e03.f55747m != e02.f55747m) {
            this.f55929m.h(5, new C13615q.a() { // from class: androidx.media3.exoplayer.D
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    E0 e04 = e02;
                    ((B.d) obj).d1(e04.f55746l, e04.f55747m);
                }
            });
        }
        if (e03.f55748n != e02.f55748n) {
            this.f55929m.h(6, new C13615q.a() { // from class: androidx.media3.exoplayer.M
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).H0(e02.f55748n);
                }
            });
        }
        if (e03.n() != e02.n()) {
            this.f55929m.h(7, new C13615q.a() { // from class: androidx.media3.exoplayer.N
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).f1(e02.n());
                }
            });
        }
        if (!e03.f55749o.equals(e02.f55749o)) {
            this.f55929m.h(12, new C13615q.a() { // from class: androidx.media3.exoplayer.O
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).m(e02.f55749o);
                }
            });
        }
        j2();
        this.f55929m.f();
        if (e03.f55750p != e02.f55750p) {
            Iterator<ExoPlayer.a> it = this.f55931n.iterator();
            while (it.hasNext()) {
                it.next().F(e02.f55750p);
            }
        }
    }

    private void m2(boolean z10) {
        PriorityTaskManager priorityTaskManager = this.f55934o0;
        if (priorityTaskManager != null) {
            if (z10 && !this.f55936p0) {
                priorityTaskManager.a(this.f55932n0);
                this.f55936p0 = true;
            } else {
                if (z10 || !this.f55936p0) {
                    return;
                }
                priorityTaskManager.b(this.f55932n0);
                this.f55936p0 = false;
            }
        }
    }

    private void o2() {
        this.f55911d.b();
        if (Thread.currentThread() != z().getThread()) {
            String strF = d3.P.F("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), z().getThread().getName());
            if (this.f55928l0) {
                throw new IllegalStateException(strF);
            }
            d3.r.j("ExoPlayerImpl", strF, this.f55930m0 ? null : new IllegalStateException());
            this.f55930m0 = true;
        }
    }

    public static /* synthetic */ void u0(E0 e02, B.d dVar) {
        dVar.I0(e02.f55741g);
        dVar.X0(e02.f55741g);
    }

    private List<D0.c> x1(int i10, List<androidx.media3.exoplayer.source.r> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            D0.c cVar = new D0.c(list.get(i11), this.f55937q);
            arrayList.add(cVar);
            this.f55935p.add(i11 + i10, new e(cVar.f55729b, cVar.f55728a));
        }
        this.f55894O = this.f55894O.g(i10, arrayList.size());
        return arrayList;
    }

    public InterfaceC13606h H1() {
        return this.f55953y;
    }

    public Looper L1() {
        return this.f55927l.K();
    }

    @Override // a3.B
    public ExoPlaybackException e() {
        o2();
        return this.f55946u0.f55740f;
    }

    @Override // a3.B
    public void l(B.d dVar) {
        this.f55929m.c((B.d) C13599a.e(dVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void release() {
        d3.r.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0] [" + d3.P.f127892e + "] [" + a3.w.b() + "]");
        o2();
        this.f55881B.d(false);
        O0 o02 = this.f55882C;
        if (o02 != null) {
            o02.l();
        }
        this.f55883D.d(false);
        this.f55884E.d(false);
        Q0 q02 = this.f55886G;
        if (q02 != null) {
            q02.disable();
        }
        if (!this.f55927l.A0()) {
            this.f55929m.k(10, new C13615q.a() { // from class: androidx.media3.exoplayer.z
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).R0(ExoPlaybackException.d(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.f55929m.i();
        this.f55923j.e(null);
        this.f55945u.e(this.f55941s);
        E0 e02 = this.f55946u0;
        if (e02.f55750p) {
            this.f55946u0 = e02.a();
        }
        E0 e0R1 = R1(this.f55946u0, 1);
        this.f55946u0 = e0R1;
        E0 e0C = e0R1.c(e0R1.f55736b);
        this.f55946u0 = e0C;
        e0C.f55751q = e0C.f55753s;
        this.f55946u0.f55752r = 0L;
        this.f55941s.release();
        Z1();
        Surface surface = this.f55903X;
        if (surface != null) {
            surface.release();
            this.f55903X = null;
        }
        if (this.f55936p0) {
            ((PriorityTaskManager) C13599a.e(this.f55934o0)).b(this.f55932n0);
            this.f55936p0 = false;
        }
        this.f55926k0 = C6477b.f61224c;
        this.f55938q0 = true;
    }

    public void v1(InterfaceC14602b interfaceC14602b) {
        this.f55941s.O((InterfaceC14602b) C13599a.e(interfaceC14602b));
    }

    public void w1(ExoPlayer.a aVar) {
        this.f55931n.add(aVar);
    }

    @Override // a3.B
    public Looper z() {
        return this.f55943t;
    }

    private B.e M1(long j10) {
        Object obj;
        int iB;
        a3.v vVar;
        Object obj2;
        long jJ1;
        int iW = W();
        if (!this.f55946u0.f55735a.q()) {
            E0 e02 = this.f55946u0;
            Object obj3 = e02.f55736b.f57157a;
            e02.f55735a.h(obj3, this.f55933o);
            iB = this.f55946u0.f55735a.b(obj3);
            obj2 = obj3;
            obj = this.f55946u0.f55735a.n(iW, this.f44649a).f44433a;
            vVar = this.f44649a.f44435c;
        } else {
            obj = null;
            iB = -1;
            vVar = null;
            obj2 = null;
        }
        int i10 = iB;
        long jJ12 = d3.P.j1(j10);
        if (this.f55946u0.f55736b.b()) {
            jJ1 = d3.P.j1(O1(this.f55946u0));
        } else {
            jJ1 = jJ12;
        }
        r.b bVar = this.f55946u0.f55736b;
        return new B.e(obj, iW, vVar, obj2, i10, jJ12, jJ1, bVar.f57158b, bVar.f57159c);
    }

    public static /* synthetic */ void O0(int i10, B.e eVar, B.e eVar2, B.d dVar) {
        dVar.V0(i10);
        dVar.Z0(eVar, eVar2, i10);
    }

    private static E0 R1(E0 e02, int i10) {
        E0 e0H = e02.h(i10);
        if (i10 != 1 && i10 != 4) {
            return e0H;
        }
        return e0H.b(false);
    }

    private Pair<Object, Long> T1(a3.F f10, int i10, long j10) {
        if (f10.q()) {
            this.f55948v0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f55952x0 = j10;
            this.f55950w0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= f10.p()) {
            i10 = f10.a(this.f55889J);
            j10 = f10.n(i10, this.f44649a).b();
        }
        return f10.j(this.f44649a, this.f55933o, i10, d3.P.M0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1(int i10, final int i11) {
        o2();
        a2(1, 10, Integer.valueOf(i11));
        a2(2, 10, Integer.valueOf(i11));
        this.f55929m.k(21, new C13615q.a() { // from class: androidx.media3.exoplayer.K
            @Override // d3.C13615q.a
            public final void invoke(Object obj) {
                ((B.d) obj).J0(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2(boolean z10, int i10) {
        int iB1 = B1(z10);
        E0 e0A = this.f55946u0;
        if (e0A.f55746l == z10 && e0A.f55748n == iB1 && e0A.f55747m == i10) {
            return;
        }
        this.f55890K++;
        if (e0A.f55750p) {
            e0A = e0A.a();
        }
        E0 e0E = e0A.e(z10, i10, iB1);
        this.f55927l.h1(z10, i10, iB1);
        l2(e0E, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2() {
        int iU = U();
        boolean z10 = false;
        if (iU != 1) {
            if (iU != 2 && iU != 3) {
                if (iU != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean zQ1 = Q1();
                T0 t02 = this.f55883D;
                if (F() && !zQ1) {
                    z10 = true;
                }
                t02.d(z10);
                this.f55884E.d(F());
                return;
            }
        }
        this.f55883D.d(false);
        this.f55884E.d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a3.x y1() {
        a3.F fY = y();
        if (fY.q()) {
            return this.f55944t0;
        }
        return this.f55944t0.a().L(fY.n(W(), this.f44649a).f44435c.f44833e).J();
    }

    @Override // a3.B
    public a3.I A() {
        o2();
        return this.f55921i.c();
    }

    public void A1(SurfaceHolder surfaceHolder) {
        o2();
        if (surfaceHolder != null && surfaceHolder == this.f55904Y) {
            z1();
        }
    }

    @Override // a3.B
    public void C(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        o2();
        if (textureView == null) {
            z1();
            return;
        }
        Z1();
        this.f55908b0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d3.r.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f55954z);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            g2(null);
            U1(0, 0);
        } else {
            f2(surfaceTexture);
            U1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // a3.B
    public B.b E() {
        o2();
        return this.f55897R;
    }

    @Override // a3.B
    public boolean F() {
        o2();
        return this.f55946u0.f55746l;
    }

    @Override // a3.B
    public void G(final boolean z10) {
        o2();
        if (this.f55889J != z10) {
            this.f55889J = z10;
            this.f55927l.p1(z10);
            this.f55929m.h(9, new C13615q.a() { // from class: androidx.media3.exoplayer.I
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).L0(z10);
                }
            });
            j2();
            this.f55929m.f();
        }
    }

    @Override // a3.B
    public long H() {
        o2();
        return this.f55951x;
    }

    @Override // a3.B
    public int J() {
        o2();
        if (this.f55946u0.f55735a.q()) {
            return this.f55950w0;
        }
        E0 e02 = this.f55946u0;
        return e02.f55735a.b(e02.f55736b.f57157a);
    }

    @Override // a3.B
    public void K(TextureView textureView) {
        o2();
        if (textureView != null && textureView == this.f55908b0) {
            z1();
        }
    }

    @Override // a3.B
    public a3.N L() {
        o2();
        return this.f55942s0;
    }

    @Override // a3.B
    public void M(final a3.I i10) {
        o2();
        if (this.f55921i.h() && !i10.equals(this.f55921i.c())) {
            this.f55921i.m(i10);
            this.f55929m.k(19, new C13615q.a() { // from class: androidx.media3.exoplayer.L
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).e1(i10);
                }
            });
        }
    }

    @Override // a3.B
    public int O() {
        o2();
        if (j()) {
            return this.f55946u0.f55736b.f57159c;
        }
        return -1;
    }

    public boolean Q1() {
        o2();
        return this.f55946u0.f55750p;
    }

    @Override // a3.B
    public long R() {
        o2();
        return this.f55949w;
    }

    @Override // a3.B
    public long S() {
        o2();
        return I1(this.f55946u0);
    }

    @Override // a3.B
    public int U() {
        o2();
        return this.f55946u0.f55739e;
    }

    @Override // a3.B
    public int W() {
        o2();
        int iK1 = K1(this.f55946u0);
        if (iK1 == -1) {
            return 0;
        }
        return iK1;
    }

    @Override // a3.B
    public void X(final int i10) {
        o2();
        if (this.f55888I != i10) {
            this.f55888I = i10;
            this.f55927l.m1(i10);
            this.f55929m.h(8, new C13615q.a() { // from class: androidx.media3.exoplayer.A
                @Override // d3.C13615q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).G0(i10);
                }
            });
            j2();
            this.f55929m.f();
        }
    }

    @Override // a3.B
    public void Y(SurfaceView surfaceView) {
        SurfaceHolder holder;
        o2();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        A1(holder);
    }

    @Override // a3.B
    public void Z(B.d dVar) {
        o2();
        this.f55929m.j((B.d) C13599a.e(dVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public AbstractC16998D a() {
        o2();
        return this.f55921i;
    }

    @Override // a3.B
    public int a0() {
        o2();
        return this.f55888I;
    }

    @Override // a3.B
    public boolean b0() {
        o2();
        return this.f55889J;
    }

    @Override // a3.B
    public long c0() {
        o2();
        if (this.f55946u0.f55735a.q()) {
            return this.f55952x0;
        }
        E0 e02 = this.f55946u0;
        if (e02.f55745k.f57160d != e02.f55736b.f57160d) {
            return e02.f55735a.n(W(), this.f44649a).d();
        }
        long j10 = e02.f55751q;
        if (this.f55946u0.f55745k.b()) {
            E0 e03 = this.f55946u0;
            F.b bVarH = e03.f55735a.h(e03.f55745k.f57157a, this.f55933o);
            long jF = bVarH.f(this.f55946u0.f55745k.f57158b);
            if (jF == Long.MIN_VALUE) {
                j10 = bVarH.f44413d;
            } else {
                j10 = jF;
            }
        }
        E0 e04 = this.f55946u0;
        return d3.P.j1(X1(e04.f55735a, e04.f55745k, j10));
    }

    public void c2(List<androidx.media3.exoplayer.source.r> list, boolean z10) {
        o2();
        d2(list, -1, -9223372036854775807L, z10);
    }

    @Override // a3.B
    public void d(C5643A c5643a) {
        o2();
        if (c5643a == null) {
            c5643a = C5643A.f44367d;
        }
        if (this.f55946u0.f55749o.equals(c5643a)) {
            return;
        }
        E0 e0G = this.f55946u0.g(c5643a);
        this.f55890K++;
        this.f55927l.j1(c5643a);
        l2(e0G, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a3.B
    public C5643A f() {
        o2();
        return this.f55946u0.f55749o;
    }

    @Override // a3.B
    public a3.x f0() {
        o2();
        return this.f55898S;
    }

    @Override // a3.B
    public void g() {
        int i10;
        o2();
        E0 e02 = this.f55946u0;
        if (e02.f55739e != 1) {
            return;
        }
        E0 e0F = e02.f(null);
        if (e0F.f55735a.q()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        E0 e0R1 = R1(e0F, i10);
        this.f55890K++;
        this.f55927l.y0();
        l2(e0R1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a3.B
    public long g0() {
        o2();
        return d3.P.j1(J1(this.f55946u0));
    }

    @Override // a3.B
    public long getDuration() {
        o2();
        if (j()) {
            E0 e02 = this.f55946u0;
            r.b bVar = e02.f55736b;
            e02.f55735a.h(bVar.f57157a, this.f55933o);
            return d3.P.j1(this.f55933o.b(bVar.f57158b, bVar.f57159c));
        }
        return I();
    }

    @Override // a3.B
    public float getVolume() {
        o2();
        return this.f55922i0;
    }

    @Override // a3.B
    public void h(float f10) {
        o2();
        final float fN = d3.P.n(f10, 0.0f, 1.0f);
        if (this.f55922i0 == fN) {
            return;
        }
        this.f55922i0 = fN;
        this.f55927l.v1(fN);
        this.f55929m.k(22, new C13615q.a() { // from class: androidx.media3.exoplayer.x
            @Override // d3.C13615q.a
            public final void invoke(Object obj) {
                ((B.d) obj).Y0(fN);
            }
        });
    }

    @Override // a3.B
    public long h0() {
        o2();
        return this.f55947v;
    }

    public void h2(SurfaceHolder surfaceHolder) {
        o2();
        if (surfaceHolder == null) {
            z1();
            return;
        }
        Z1();
        this.f55906a0 = true;
        this.f55904Y = surfaceHolder;
        surfaceHolder.addCallback(this.f55954z);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            g2(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            U1(surfaceFrame.width(), surfaceFrame.height());
        } else {
            g2(null);
            U1(0, 0);
        }
    }

    @Override // a3.B
    public boolean j() {
        o2();
        return this.f55946u0.f55736b.b();
    }

    @Override // a3.B
    public long k() {
        o2();
        return d3.P.j1(this.f55946u0.f55752r);
    }

    @Override // a3.AbstractC5651h
    protected void m0(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        o2();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C13599a.a(z11);
            a3.F f10 = this.f55946u0.f55735a;
            if (!f10.q() && i10 >= f10.p()) {
                return;
            }
            this.f55941s.D();
            this.f55890K++;
            if (j()) {
                d3.r.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C6199j0.e eVar = new C6199j0.e(this.f55946u0);
                eVar.b(1);
                this.f55925k.a(eVar);
                return;
            }
            E0 e0R1 = this.f55946u0;
            int i12 = e0R1.f55739e;
            if (i12 == 3 || (i12 == 4 && !f10.q())) {
                e0R1 = R1(this.f55946u0, 2);
            }
            int iW = W();
            E0 e0S1 = S1(e0R1, f10, T1(f10, i10, j10));
            this.f55927l.Q0(f10, i10, d3.P.M0(j10));
            l2(e0S1, 0, true, 1, J1(e0S1), iW, z10);
        }
    }

    @Override // a3.B
    public void n(List<a3.v> list, boolean z10) {
        o2();
        c2(E1(list), z10);
    }

    @Override // a3.B
    public void o(SurfaceView surfaceView) {
        SurfaceHolder holder;
        o2();
        if (surfaceView instanceof v3.g) {
            Z1();
            g2(surfaceView);
            e2(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof SphericalGLSurfaceView) {
                Z1();
                this.f55905Z = (SphericalGLSurfaceView) surfaceView;
                F1(this.f55880A).m(10000).l(this.f55905Z).k();
                this.f55905Z.d(this.f55954z);
                g2(this.f55905Z.getVideoSurface());
                e2(surfaceView.getHolder());
                return;
            }
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            h2(holder);
        }
    }

    @Override // a3.B
    public void q(boolean z10) {
        o2();
        k2(z10, 1);
    }

    @Override // a3.B
    public a3.J r() {
        o2();
        return this.f55946u0.f55743i.f159756d;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        o2();
        a2(4, 15, imageOutput);
    }

    @Override // a3.B
    public C6477b t() {
        o2();
        return this.f55926k0;
    }

    @Override // a3.B
    public int u() {
        o2();
        if (j()) {
            return this.f55946u0.f55736b.f57158b;
        }
        return -1;
    }

    @Override // a3.B
    public int x() {
        o2();
        return this.f55946u0.f55748n;
    }

    @Override // a3.B
    public a3.F y() {
        o2();
        return this.f55946u0.f55735a;
    }

    public void z1() {
        o2();
        Z1();
        g2(null);
        U1(0, 0);
    }
}
