package androidx.media3.exoplayer;

import a3.AbstractC5568h;
import a3.B;
import a3.C5560A;
import a3.C5564d;
import a3.C5574n;
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
import androidx.media3.exoplayer.C6044d;
import androidx.media3.exoplayer.C6057j0;
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
import c3.C6350a;
import c3.C6351b;
import d3.C13466a;
import d3.C13471f;
import d3.C13476k;
import d3.C13482q;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;
import h3.C14333b;
import h3.C14334c;
import i3.A1;
import i3.E1;
import i3.InterfaceC14596a;
import i3.InterfaceC14599b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import p3.s;
import r3.InterfaceC16717h;
import s3.AbstractC16852D;
import s3.C16853E;
import w3.InterfaceC17752a;

/* loaded from: classes.dex */
final class V extends AbstractC5568h implements ExoPlayer {

    /* renamed from: A, reason: collision with root package name */
    private final d f55656A;

    /* renamed from: B, reason: collision with root package name */
    private final C6044d f55657B;

    /* renamed from: C, reason: collision with root package name */
    private final O0 f55658C;

    /* renamed from: D, reason: collision with root package name */
    private final T0 f55659D;

    /* renamed from: E, reason: collision with root package name */
    private final W0 f55660E;

    /* renamed from: F, reason: collision with root package name */
    private final long f55661F;

    /* renamed from: G, reason: collision with root package name */
    private final Q0 f55662G;

    /* renamed from: H, reason: collision with root package name */
    private final C13471f<Integer> f55663H;

    /* renamed from: I, reason: collision with root package name */
    private int f55664I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f55665J;

    /* renamed from: K, reason: collision with root package name */
    private int f55666K;

    /* renamed from: L, reason: collision with root package name */
    private int f55667L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f55668M;

    /* renamed from: N, reason: collision with root package name */
    private h3.M f55669N;

    /* renamed from: O, reason: collision with root package name */
    private p3.s f55670O;

    /* renamed from: P, reason: collision with root package name */
    private ExoPlayer.c f55671P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f55672Q;

    /* renamed from: R, reason: collision with root package name */
    private B.b f55673R;

    /* renamed from: S, reason: collision with root package name */
    private a3.x f55674S;

    /* renamed from: T, reason: collision with root package name */
    private a3.x f55675T;

    /* renamed from: U, reason: collision with root package name */
    private a3.t f55676U;

    /* renamed from: V, reason: collision with root package name */
    private a3.t f55677V;

    /* renamed from: W, reason: collision with root package name */
    private Object f55678W;

    /* renamed from: X, reason: collision with root package name */
    private Surface f55679X;

    /* renamed from: Y, reason: collision with root package name */
    private SurfaceHolder f55680Y;

    /* renamed from: Z, reason: collision with root package name */
    private SphericalGLSurfaceView f55681Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f55682a0;

    /* renamed from: b, reason: collision with root package name */
    final C16853E f55683b;

    /* renamed from: b0, reason: collision with root package name */
    private TextureView f55684b0;

    /* renamed from: c, reason: collision with root package name */
    final B.b f55685c;

    /* renamed from: c0, reason: collision with root package name */
    private int f55686c0;

    /* renamed from: d, reason: collision with root package name */
    private final C13476k f55687d = new C13476k();

    /* renamed from: d0, reason: collision with root package name */
    private int f55688d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f55689e;

    /* renamed from: e0, reason: collision with root package name */
    private d3.F f55690e0;

    /* renamed from: f, reason: collision with root package name */
    private final a3.B f55691f;

    /* renamed from: f0, reason: collision with root package name */
    private C14333b f55692f0;

    /* renamed from: g, reason: collision with root package name */
    private final H0[] f55693g;

    /* renamed from: g0, reason: collision with root package name */
    private C14333b f55694g0;

    /* renamed from: h, reason: collision with root package name */
    private final H0[] f55695h;

    /* renamed from: h0, reason: collision with root package name */
    private C5564d f55696h0;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC16852D f55697i;

    /* renamed from: i0, reason: collision with root package name */
    private float f55698i0;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC13479n f55699j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f55700j0;

    /* renamed from: k, reason: collision with root package name */
    private final C6057j0.f f55701k;

    /* renamed from: k0, reason: collision with root package name */
    private C6351b f55702k0;

    /* renamed from: l, reason: collision with root package name */
    private final C6057j0 f55703l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f55704l0;

    /* renamed from: m, reason: collision with root package name */
    private final C13482q<B.d> f55705m;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f55706m0;

    /* renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f55707n;

    /* renamed from: n0, reason: collision with root package name */
    private int f55708n0;

    /* renamed from: o, reason: collision with root package name */
    private final F.b f55709o;

    /* renamed from: o0, reason: collision with root package name */
    private PriorityTaskManager f55710o0;

    /* renamed from: p, reason: collision with root package name */
    private final List<e> f55711p;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f55712p0;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f55713q;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f55714q0;

    /* renamed from: r, reason: collision with root package name */
    private final r.a f55715r;

    /* renamed from: r0, reason: collision with root package name */
    private C5574n f55716r0;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC14596a f55717s;

    /* renamed from: s0, reason: collision with root package name */
    private a3.N f55718s0;

    /* renamed from: t, reason: collision with root package name */
    private final Looper f55719t;

    /* renamed from: t0, reason: collision with root package name */
    private a3.x f55720t0;

    /* renamed from: u, reason: collision with root package name */
    private final t3.d f55721u;

    /* renamed from: u0, reason: collision with root package name */
    private E0 f55722u0;

    /* renamed from: v, reason: collision with root package name */
    private final long f55723v;

    /* renamed from: v0, reason: collision with root package name */
    private int f55724v0;

    /* renamed from: w, reason: collision with root package name */
    private final long f55725w;

    /* renamed from: w0, reason: collision with root package name */
    private int f55726w0;

    /* renamed from: x, reason: collision with root package name */
    private final long f55727x;

    /* renamed from: x0, reason: collision with root package name */
    private long f55728x0;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC13473h f55729y;

    /* renamed from: z, reason: collision with root package name */
    private final c f55730z;

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements androidx.media3.exoplayer.video.p, androidx.media3.exoplayer.audio.e, InterfaceC16717h, o3.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.b, C6044d.b, O0.b, ExoPlayer.a {
        private c() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.p
        public void A(long j10, int i10) {
            V.this.f55717s.A(j10, i10);
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
            V.this.f55705m.k(30, new C13482q.a() { // from class: androidx.media3.exoplayer.e0
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).J0(i10, z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public void F(boolean z10) {
            V.this.n2();
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void a(AudioSink.a aVar) {
            V.this.f55717s.a(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void b(AudioSink.a aVar) {
            V.this.f55717s.b(aVar);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void c(final boolean z10) {
            if (V.this.f55700j0 == z10) {
                return;
            }
            V.this.f55700j0 = z10;
            V.this.f55705m.k(23, new C13482q.a() { // from class: androidx.media3.exoplayer.X
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).c(z10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void d(Exception exc) {
            V.this.f55717s.d(exc);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void e(final a3.N n10) {
            V.this.f55718s0 = n10;
            V.this.f55705m.k(25, new C13482q.a() { // from class: androidx.media3.exoplayer.c0
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).e(n10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void f(C14333b c14333b) {
            V.this.f55717s.f(c14333b);
            V.this.f55677V = null;
            V.this.f55694g0 = null;
        }

        @Override // androidx.media3.exoplayer.video.p
        public void g(String str) {
            V.this.f55717s.g(str);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void h(String str, long j10, long j11) {
            V.this.f55717s.h(str, j10, j11);
        }

        @Override // r3.InterfaceC16717h
        public void i(final C6351b c6351b) {
            V.this.f55702k0 = c6351b;
            V.this.f55705m.k(27, new C13482q.a() { // from class: androidx.media3.exoplayer.Y
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).i(c6351b);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.p
        public void j(C14333b c14333b) {
            V.this.f55692f0 = c14333b;
            V.this.f55717s.j(c14333b);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void k(String str) {
            V.this.f55717s.k(str);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void l(String str, long j10, long j11) {
            V.this.f55717s.l(str, j10, j11);
        }

        @Override // androidx.media3.exoplayer.O0.b
        public void m(int i10) {
            final C5574n c5574nC1 = V.C1(V.this.f55658C);
            if (c5574nC1.equals(V.this.f55716r0)) {
                return;
            }
            V.this.f55716r0 = c5574nC1;
            V.this.f55705m.k(29, new C13482q.a() { // from class: androidx.media3.exoplayer.d0
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).K0(c5574nC1);
                }
            });
        }

        @Override // r3.InterfaceC16717h
        public void n(final List<C6350a> list) {
            V.this.f55705m.k(27, new C13482q.a() { // from class: androidx.media3.exoplayer.b0
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).n(list);
                }
            });
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void o(long j10) {
            V.this.f55717s.o(j10);
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
            V.this.f55717s.p(exc);
        }

        @Override // o3.b
        public void q(final a3.y yVar) {
            V v10 = V.this;
            v10.f55720t0 = v10.f55720t0.a().M(yVar).J();
            a3.x xVarY1 = V.this.y1();
            if (!xVarY1.equals(V.this.f55674S)) {
                V.this.f55674S = xVarY1;
                V.this.f55705m.h(14, new C13482q.a() { // from class: androidx.media3.exoplayer.Z
                    @Override // d3.C13482q.a
                    public final void invoke(Object obj) {
                        ((B.d) obj).R0(V.this.f55674S);
                    }
                });
            }
            V.this.f55705m.h(28, new C13482q.a() { // from class: androidx.media3.exoplayer.a0
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).q(yVar);
                }
            });
            V.this.f55705m.f();
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void r(a3.t tVar, C14334c c14334c) {
            V.this.f55677V = tVar;
            V.this.f55717s.r(tVar, c14334c);
        }

        @Override // androidx.media3.exoplayer.C6044d.b
        public void s() {
            V.this.k2(false, 3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            V.this.U1(i11, i12);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (V.this.f55682a0) {
                V.this.g2(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (V.this.f55682a0) {
                V.this.g2(null);
            }
            V.this.U1(0, 0);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void t(C14333b c14333b) {
            V.this.f55694g0 = c14333b;
            V.this.f55717s.t(c14333b);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void u(int i10, long j10) {
            V.this.f55717s.u(i10, j10);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void v(Object obj, long j10) {
            V.this.f55717s.v(obj, j10);
            if (V.this.f55678W == obj) {
                V.this.f55705m.k(26, new C13482q.a() { // from class: h3.E
                    @Override // d3.C13482q.a
                    public final void invoke(Object obj2) {
                        ((B.d) obj2).L0();
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void w(Exception exc) {
            V.this.f55717s.w(exc);
        }

        @Override // androidx.media3.exoplayer.video.p
        public void x(C14333b c14333b) {
            V.this.f55717s.x(c14333b);
            V.this.f55676U = null;
            V.this.f55692f0 = null;
        }

        @Override // androidx.media3.exoplayer.video.p
        public void y(a3.t tVar, C14334c c14334c) {
            V.this.f55676U = tVar;
            V.this.f55717s.y(tVar, c14334c);
        }

        @Override // androidx.media3.exoplayer.audio.e
        public void z(int i10, long j10, long j11) {
            V.this.f55717s.z(i10, j10, j11);
        }
    }

    private static final class d implements v3.h, InterfaceC17752a, F0.b {

        /* renamed from: a, reason: collision with root package name */
        private v3.h f55732a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC17752a f55733b;

        /* renamed from: c, reason: collision with root package name */
        private v3.h f55734c;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC17752a f55735d;

        private d() {
        }

        @Override // androidx.media3.exoplayer.F0.b
        public void x(int i10, Object obj) {
            if (i10 == 7) {
                this.f55732a = (v3.h) obj;
                return;
            }
            if (i10 == 8) {
                this.f55733b = (InterfaceC17752a) obj;
                return;
            }
            if (i10 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f55734c = null;
                this.f55735d = null;
            } else {
                this.f55734c = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.f55735d = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // v3.h
        public void a(long j10, long j11, a3.t tVar, MediaFormat mediaFormat) {
            long j12;
            long j13;
            a3.t tVar2;
            MediaFormat mediaFormat2;
            v3.h hVar = this.f55734c;
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
            v3.h hVar2 = this.f55732a;
            if (hVar2 != null) {
                hVar2.a(j12, j13, tVar2, mediaFormat2);
            }
        }

        @Override // w3.InterfaceC17752a
        public void d(long j10, float[] fArr) {
            InterfaceC17752a interfaceC17752a = this.f55735d;
            if (interfaceC17752a != null) {
                interfaceC17752a.d(j10, fArr);
            }
            InterfaceC17752a interfaceC17752a2 = this.f55733b;
            if (interfaceC17752a2 != null) {
                interfaceC17752a2.d(j10, fArr);
            }
        }

        @Override // w3.InterfaceC17752a
        public void f() {
            InterfaceC17752a interfaceC17752a = this.f55735d;
            if (interfaceC17752a != null) {
                interfaceC17752a.f();
            }
            InterfaceC17752a interfaceC17752a2 = this.f55733b;
            if (interfaceC17752a2 != null) {
                interfaceC17752a2.f();
            }
        }
    }

    private static final class e implements InterfaceC6071q0 {

        /* renamed from: a, reason: collision with root package name */
        private final Object f55736a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.media3.exoplayer.source.r f55737b;

        /* renamed from: c, reason: collision with root package name */
        private a3.F f55738c;

        @Override // androidx.media3.exoplayer.InterfaceC6071q0
        public Object a() {
            return this.f55736a;
        }

        @Override // androidx.media3.exoplayer.InterfaceC6071q0
        public a3.F b() {
            return this.f55738c;
        }

        public void c(a3.F f10) {
            this.f55738c = f10;
        }

        public e(Object obj, androidx.media3.exoplayer.source.p pVar) {
            this.f55736a = obj;
            this.f55737b = pVar;
            this.f55738c = pVar.V();
        }
    }

    private Pair<Boolean, Integer> G1(E0 e02, E0 e03, boolean z10, int i10, boolean z11, boolean z12) {
        a3.F f10 = e03.f55511a;
        a3.F f11 = e02.f55511a;
        if (f11.q() && f10.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i11 = 3;
        if (f11.q() != f10.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (f10.n(f10.h(e03.f55512b.f56933a, this.f55709o).f43594c, this.f43831a).f43615a.equals(f11.n(f11.h(e02.f55512b.f56933a, this.f55709o).f43594c, this.f43831a).f43615a)) {
            return (z10 && i10 == 0 && e03.f55512b.f56936d < e02.f55512b.f56936d) ? new Pair<>(Boolean.TRUE, 0) : (z10 && i10 == 1 && z12) ? new Pair<>(Boolean.TRUE, 2) : new Pair<>(Boolean.FALSE, -1);
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
        this.f55682a0 = false;
        this.f55680Y = surfaceHolder;
        surfaceHolder.addCallback(this.f55730z);
        Surface surface = this.f55680Y.getSurface();
        if (surface == null || !surface.isValid()) {
            U1(0, 0);
        } else {
            Rect surfaceFrame = this.f55680Y.getSurfaceFrame();
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
        InterfaceC13473h interfaceC13473h;
        try {
            d3.r.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0] [" + d3.P.f127090e + "]");
            this.f55689e = bVar.f55548a.getApplicationContext();
            this.f55717s = bVar.f55556i.apply(bVar.f55549b);
            this.f55708n0 = bVar.f55558k;
            this.f55710o0 = bVar.f55559l;
            this.f55696h0 = bVar.f55560m;
            this.f55686c0 = bVar.f55566s;
            this.f55688d0 = bVar.f55567t;
            this.f55700j0 = bVar.f55564q;
            this.f55661F = bVar.f55539B;
            c cVar = new c();
            this.f55730z = cVar;
            this.f55656A = new d();
            Handler handler = new Handler(bVar.f55557j);
            h3.L l10 = bVar.f55551d.get();
            H0[] h0ArrA = l10.a(handler, cVar, cVar, cVar, cVar);
            this.f55693g = h0ArrA;
            C13466a.g(h0ArrA.length > 0);
            this.f55695h = new H0[h0ArrA.length];
            int i10 = 0;
            while (true) {
                H0[] h0Arr = this.f55695h;
                if (i10 >= h0Arr.length) {
                    break;
                }
                H0 h02 = this.f55693g[i10];
                c cVar2 = this.f55730z;
                h3.L l11 = l10;
                h0Arr[i10] = l11.b(h02, handler, cVar2, cVar2, cVar2, cVar2);
                i10++;
                l10 = l11;
            }
            AbstractC16852D abstractC16852D = bVar.f55553f.get();
            this.f55697i = abstractC16852D;
            this.f55715r = bVar.f55552e.get();
            t3.d dVar = bVar.f55555h.get();
            this.f55721u = dVar;
            this.f55713q = bVar.f55568u;
            this.f55669N = bVar.f55569v;
            this.f55723v = bVar.f55570w;
            this.f55725w = bVar.f55571x;
            this.f55727x = bVar.f55572y;
            this.f55672Q = bVar.f55540C;
            Looper looper2 = bVar.f55557j;
            this.f55719t = looper2;
            InterfaceC13473h interfaceC13473h2 = bVar.f55549b;
            this.f55729y = interfaceC13473h2;
            a3.B b11 = b10 == null ? this : b10;
            this.f55691f = b11;
            this.f55705m = new C13482q<>(looper2, interfaceC13473h2, new C13482q.b() { // from class: androidx.media3.exoplayer.B
                @Override // d3.C13482q.b
                public final void a(Object obj, a3.r rVar) {
                    ((B.d) obj).M0(this.f55480a.f55691f, new B.c(rVar));
                }
            });
            this.f55707n = new CopyOnWriteArraySet<>();
            this.f55711p = new ArrayList();
            this.f55670O = new s.a(0);
            this.f55671P = ExoPlayer.c.f55574b;
            H0[] h0Arr2 = this.f55693g;
            C16853E c16853e = new C16853E(new h3.K[h0Arr2.length], new s3.y[h0Arr2.length], a3.J.f43750b, null);
            this.f55683b = c16853e;
            this.f55709o = new F.b();
            B.b bVarE = new B.b.a().c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32).d(29, abstractC16852D.h()).d(23, bVar.f55565r).d(25, bVar.f55565r).d(33, bVar.f55565r).d(26, bVar.f55565r).d(34, bVar.f55565r).e();
            this.f55685c = bVarE;
            this.f55673R = new B.b.a().b(bVarE).a(4).a(10).e();
            this.f55699j = interfaceC13473h2.e(looper2, null);
            C6057j0.f fVar = new C6057j0.f() { // from class: androidx.media3.exoplayer.C
                @Override // androidx.media3.exoplayer.C6057j0.f
                public final void a(C6057j0.e eVar) {
                    V v10 = this.f55483a;
                    v10.f55699j.post(new Runnable() { // from class: androidx.media3.exoplayer.H
                        @Override // java.lang.Runnable
                        public final void run() {
                            v10.P1(eVar);
                        }
                    });
                }
            };
            this.f55701k = fVar;
            this.f55722u0 = E0.k(c16853e);
            this.f55717s.F(b11, looper2);
            E1 e12 = new E1(bVar.f55545H);
            C6057j0 c6057j0 = new C6057j0(this.f55689e, this.f55693g, this.f55695h, abstractC16852D, c16853e, bVar.f55554g.get(), dVar, this.f55664I, this.f55665J, this.f55717s, this.f55669N, bVar.f55573z, bVar.f55538A, this.f55672Q, bVar.f55546I, looper2, interfaceC13473h2, fVar, e12, bVar.f55542E, this.f55671P);
            this.f55703l = c6057j0;
            Looper looperK = c6057j0.K();
            this.f55698i0 = 1.0f;
            this.f55664I = 0;
            a3.x xVar = a3.x.f44153I;
            this.f55674S = xVar;
            this.f55675T = xVar;
            this.f55720t0 = xVar;
            this.f55724v0 = -1;
            this.f55702k0 = C6351b.f61425c;
            this.f55704l0 = true;
            l(this.f55717s);
            dVar.f(new Handler(looper2), this.f55717s);
            w1(this.f55730z);
            long j10 = bVar.f55550c;
            if (j10 > 0) {
                c6057j0.E(j10);
            }
            if (d3.P.f127086a >= 31) {
                b.b(this.f55689e, this, bVar.f55541D, e12);
            }
            C13471f<Integer> c13471f = new C13471f<>(0, looperK, looper2, interfaceC13473h2, new C13471f.a() { // from class: androidx.media3.exoplayer.E
                @Override // d3.C13471f.a
                public final void a(Object obj, Object obj2) {
                    this.f55509a.V1(((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            });
            this.f55663H = c13471f;
            c13471f.e(new Runnable() { // from class: androidx.media3.exoplayer.F
                @Override // java.lang.Runnable
                public final void run() {
                    V v10 = this.f55577a;
                    v10.f55663H.f(Integer.valueOf(d3.P.I(v10.f55689e)));
                }
            });
            C6044d c6044d = new C6044d(bVar.f55548a, looperK, bVar.f55557j, this.f55730z, interfaceC13473h2);
            InterfaceC13473h interfaceC13473h3 = interfaceC13473h2;
            this.f55657B = c6044d;
            c6044d.d(bVar.f55563p);
            if (bVar.f55544G) {
                Q0 q02 = bVar.f55547J;
                this.f55662G = q02;
                q02.a(new Q0.a() { // from class: androidx.media3.exoplayer.G
                    @Override // androidx.media3.exoplayer.Q0.a
                    public final void a(boolean z10) {
                        this.f55592a.W1(z10);
                    }
                }, this.f55689e, looper2, looperK, interfaceC13473h3);
                interfaceC13473h3 = interfaceC13473h3;
            } else {
                this.f55662G = null;
            }
            if (bVar.f55565r) {
                InterfaceC13473h interfaceC13473h4 = interfaceC13473h3;
                O0 o02 = new O0(bVar.f55548a, this.f55730z, this.f55696h0.b(), looperK, looper2, interfaceC13473h4);
                looper = looperK;
                interfaceC13473h = interfaceC13473h4;
                this.f55658C = o02;
            } else {
                looper = looperK;
                interfaceC13473h = interfaceC13473h3;
                this.f55658C = null;
            }
            T0 t02 = new T0(bVar.f55548a, looper, interfaceC13473h);
            this.f55659D = t02;
            t02.c(bVar.f55562o != 0);
            W0 w02 = new W0(bVar.f55548a, looper, interfaceC13473h);
            this.f55660E = w02;
            w02.c(bVar.f55562o == 2);
            this.f55716r0 = C5574n.f43859e;
            this.f55718s0 = a3.N.f43763e;
            this.f55690e0 = d3.F.f127068c;
            c6057j0.Z0(this.f55696h0, bVar.f55561n);
            a2(1, 3, this.f55696h0);
            a2(2, 4, Integer.valueOf(this.f55686c0));
            a2(2, 5, Integer.valueOf(this.f55688d0));
            a2(1, 9, Boolean.valueOf(this.f55700j0));
            a2(2, 7, this.f55656A);
            a2(6, 8, this.f55656A);
            b2(16, Integer.valueOf(this.f55708n0));
            this.f55687d.e();
        } catch (Throwable th2) {
            this.f55687d.e();
            throw th2;
        }
    }

    private int B1(boolean z10) {
        Q0 q02 = this.f55662G;
        if (q02 == null || q02.b()) {
            return (this.f55722u0.f55524n != 1 || z10) ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C5574n C1(O0 o02) {
        return new C5574n.b(0).g(o02 != null ? o02.j() : 0).f(o02 != null ? o02.i() : 0).e();
    }

    private a3.F D1() {
        return new G0(this.f55711p, this.f55670O);
    }

    private List<androidx.media3.exoplayer.source.r> E1(List<a3.v> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            arrayList.add(this.f55715r.e(list.get(i10)));
        }
        return arrayList;
    }

    private F0 F1(F0.b bVar) {
        int iK1 = K1(this.f55722u0);
        C6057j0 c6057j0 = this.f55703l;
        a3.F f10 = this.f55722u0.f55511a;
        if (iK1 == -1) {
            iK1 = 0;
        }
        return new F0(c6057j0, bVar, f10, iK1, this.f55729y, c6057j0.K());
    }

    private long I1(E0 e02) {
        if (!e02.f55512b.b()) {
            return d3.P.j1(J1(e02));
        }
        e02.f55511a.h(e02.f55512b.f56933a, this.f55709o);
        return e02.f55513c == -9223372036854775807L ? e02.f55511a.n(K1(e02), this.f43831a).b() : this.f55709o.n() + d3.P.j1(e02.f55513c);
    }

    private long J1(E0 e02) {
        if (e02.f55511a.q()) {
            return d3.P.M0(this.f55728x0);
        }
        long jM = e02.f55526p ? e02.m() : e02.f55529s;
        return e02.f55512b.b() ? jM : X1(e02.f55511a, e02.f55512b, jM);
    }

    private int K1(E0 e02) {
        return e02.f55511a.q() ? this.f55724v0 : e02.f55511a.h(e02.f55512b.f56933a, this.f55709o).f43594c;
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
        if (e02.f55511a.q()) {
            i12 = i11;
            obj = null;
            vVar = null;
            obj2 = null;
            i13 = -1;
        } else {
            Object obj3 = e02.f55512b.f56933a;
            e02.f55511a.h(obj3, bVar);
            int i14 = bVar.f43594c;
            int iB = e02.f55511a.b(obj3);
            Object obj4 = e02.f55511a.n(i14, this.f43831a).f43615a;
            vVar = this.f43831a.f43617c;
            obj2 = obj3;
            i13 = iB;
            obj = obj4;
            i12 = i14;
        }
        if (i10 == 0) {
            if (e02.f55512b.b()) {
                r.b bVar2 = e02.f55512b;
                jO1 = bVar.b(bVar2.f56934b, bVar2.f56935c);
                jO12 = O1(e02);
            } else {
                jO1 = e02.f55512b.f56937e != -1 ? O1(this.f55722u0) : bVar.f43596e + bVar.f43595d;
                jO12 = jO1;
            }
        } else if (e02.f55512b.b()) {
            jO1 = e02.f55529s;
            jO12 = O1(e02);
        } else {
            jO1 = bVar.f43596e + e02.f55529s;
            jO12 = jO1;
        }
        long jJ1 = d3.P.j1(jO1);
        long jJ12 = d3.P.j1(jO12);
        r.b bVar3 = e02.f55512b;
        return new B.e(obj, i12, vVar, obj2, i13, jJ1, jJ12, bVar3.f56934b, bVar3.f56935c);
    }

    private static long O1(E0 e02) {
        F.c cVar = new F.c();
        F.b bVar = new F.b();
        e02.f55511a.h(e02.f55512b.f56933a, bVar);
        return e02.f55513c == -9223372036854775807L ? e02.f55511a.n(bVar.f43594c, cVar).c() : bVar.o() + e02.f55513c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1(C6057j0.e eVar) {
        boolean z10;
        long jX1;
        int i10 = this.f55666K - eVar.f56283c;
        this.f55666K = i10;
        boolean z11 = true;
        if (eVar.f56284d) {
            this.f55667L = eVar.f56285e;
            this.f55668M = true;
        }
        if (i10 == 0) {
            a3.F f10 = eVar.f56282b.f55511a;
            if (!this.f55722u0.f55511a.q() && f10.q()) {
                this.f55724v0 = -1;
                this.f55728x0 = 0L;
                this.f55726w0 = 0;
            }
            if (!f10.q()) {
                List<a3.F> listF = ((G0) f10).F();
                C13466a.g(listF.size() == this.f55711p.size());
                for (int i11 = 0; i11 < listF.size(); i11++) {
                    this.f55711p.get(i11).c(listF.get(i11));
                }
            }
            long j10 = -9223372036854775807L;
            if (this.f55668M) {
                if (eVar.f56282b.f55512b.equals(this.f55722u0.f55512b) && eVar.f56282b.f55514d == this.f55722u0.f55529s) {
                    z11 = false;
                }
                if (z11) {
                    if (f10.q() || eVar.f56282b.f55512b.b()) {
                        jX1 = eVar.f56282b.f55514d;
                    } else {
                        E0 e02 = eVar.f56282b;
                        jX1 = X1(f10, e02.f55512b, e02.f55514d);
                    }
                    j10 = jX1;
                }
                z10 = z11;
            } else {
                z10 = false;
            }
            this.f55668M = false;
            l2(eVar.f56282b, 1, z10, this.f55667L, j10, -1, false);
        }
    }

    private E0 S1(E0 e02, a3.F f10, Pair<Object, Long> pair) {
        C13466a.a(f10.q() || pair != null);
        a3.F f11 = e02.f55511a;
        long jI1 = I1(e02);
        E0 e0J = e02.j(f10);
        if (f10.q()) {
            r.b bVarL = E0.l();
            long jM0 = d3.P.M0(this.f55728x0);
            E0 e0C = e0J.d(bVarL, jM0, jM0, jM0, 0L, p3.w.f155473d, this.f55683b, Ce.L.x()).c(bVarL);
            e0C.f55527q = e0C.f55529s;
            return e0C;
        }
        Object obj = e0J.f55512b.f56933a;
        boolean zEquals = obj.equals(((Pair) d3.P.h(pair)).first);
        r.b bVar = !zEquals ? new r.b(pair.first) : e0J.f55512b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM02 = d3.P.M0(jI1);
        if (!f11.q()) {
            jM02 -= f11.h(obj, this.f55709o).o();
        }
        if (!zEquals || jLongValue < jM02) {
            r.b bVar2 = bVar;
            C13466a.g(!bVar2.b());
            E0 e0C2 = e0J.d(bVar2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? p3.w.f155473d : e0J.f55518h, !zEquals ? this.f55683b : e0J.f55519i, !zEquals ? Ce.L.x() : e0J.f55520j).c(bVar2);
            e0C2.f55527q = jLongValue;
            return e0C2;
        }
        if (jLongValue != jM02) {
            r.b bVar3 = bVar;
            C13466a.g(!bVar3.b());
            long jMax = Math.max(0L, e0J.f55528r - (jLongValue - jM02));
            long j10 = e0J.f55527q;
            if (e0J.f55521k.equals(e0J.f55512b)) {
                j10 = jLongValue + jMax;
            }
            E0 e0D = e0J.d(bVar3, jLongValue, jLongValue, jLongValue, jMax, e0J.f55518h, e0J.f55519i, e0J.f55520j);
            e0D.f55527q = j10;
            return e0D;
        }
        int iB = f10.b(e0J.f55521k.f56933a);
        if (iB != -1 && f10.f(iB, this.f55709o).f43594c == f10.h(bVar.f56933a, this.f55709o).f43594c) {
            return e0J;
        }
        f10.h(bVar.f56933a, this.f55709o);
        long jB = bVar.b() ? this.f55709o.b(bVar.f56934b, bVar.f56935c) : this.f55709o.f43595d;
        r.b bVar4 = bVar;
        E0 e0C3 = e0J.d(bVar4, e0J.f55529s, e0J.f55529s, e0J.f55514d, jB - e0J.f55529s, e0J.f55518h, e0J.f55519i, e0J.f55520j).c(bVar4);
        e0C3.f55527q = jB;
        return e0C3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1(final int i10, final int i11) {
        if (i10 == this.f55690e0.b() && i11 == this.f55690e0.a()) {
            return;
        }
        this.f55690e0 = new d3.F(i10, i11);
        this.f55705m.k(24, new C13482q.a() { // from class: androidx.media3.exoplayer.y
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((B.d) obj).Q0(i10, i11);
            }
        });
        a2(2, 14, new d3.F(i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W1(boolean z10) {
        if (this.f55714q0) {
            return;
        }
        if (!z10) {
            k2(this.f55722u0.f55522l, 1);
            return;
        }
        E0 e02 = this.f55722u0;
        if (e02.f55524n == 3) {
            k2(e02.f55522l, 1);
        }
    }

    private long X1(a3.F f10, r.b bVar, long j10) {
        f10.h(bVar.f56933a, this.f55709o);
        return j10 + this.f55709o.o();
    }

    private void Y1(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            this.f55711p.remove(i12);
        }
        this.f55670O = this.f55670O.a(i10, i11);
    }

    private void Z1() {
        if (this.f55681Z != null) {
            F1(this.f55656A).m(10000).l(null).k();
            this.f55681Z.g(this.f55730z);
            this.f55681Z = null;
        }
        TextureView textureView = this.f55684b0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f55730z) {
                d3.r.i("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f55684b0.setSurfaceTextureListener(null);
            }
            this.f55684b0 = null;
        }
        SurfaceHolder surfaceHolder = this.f55680Y;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f55730z);
            this.f55680Y = null;
        }
    }

    private void a2(int i10, int i11, Object obj) {
        for (H0 h02 : this.f55693g) {
            if (i10 == -1 || h02.g() == i10) {
                F1(h02).m(i11).l(obj).k();
            }
        }
        for (H0 h03 : this.f55695h) {
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
            androidx.media3.exoplayer.E0 r2 = r14.f55722u0
            int r2 = r14.K1(r2)
            long r3 = r14.g0()
            int r5 = r14.f55666K
            r6 = 1
            int r5 = r5 + r6
            r14.f55666K = r5
            java.util.List<androidx.media3.exoplayer.V$e> r5 = r14.f55711p
            boolean r5 = r5.isEmpty()
            r7 = 0
            if (r5 != 0) goto L24
            java.util.List<androidx.media3.exoplayer.V$e> r5 = r14.f55711p
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
            boolean r1 = r14.f55665J
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
            androidx.media3.exoplayer.E0 r1 = r14.f55722u0
            android.util.Pair r4 = r14.T1(r5, r10, r2)
            androidx.media3.exoplayer.E0 r1 = r14.S1(r1, r5, r4)
            int r4 = r1.f55515e
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
            androidx.media3.exoplayer.j0 r8 = r14.f55703l
            long r11 = d3.P.M0(r2)
            p3.s r13 = r14.f55670O
            r8.e1(r9, r10, r11, r13)
            androidx.media3.exoplayer.E0 r2 = r14.f55722u0
            androidx.media3.exoplayer.source.r$b r2 = r2.f55512b
            java.lang.Object r2 = r2.f56933a
            androidx.media3.exoplayer.source.r$b r3 = r1.f55512b
            java.lang.Object r3 = r3.f56933a
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La5
            androidx.media3.exoplayer.E0 r2 = r14.f55722u0
            a3.F r2 = r2.f55511a
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
        this.f55679X = surface;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g2(Object obj) {
        Object obj2 = this.f55678W;
        boolean z10 = (obj2 == null || obj2 == obj) ? false : true;
        boolean zT1 = this.f55703l.t1(obj, z10 ? this.f55661F : -9223372036854775807L);
        if (z10) {
            Object obj3 = this.f55678W;
            Surface surface = this.f55679X;
            if (obj3 == surface) {
                surface.release();
                this.f55679X = null;
            }
        }
        this.f55678W = obj;
        if (zT1) {
            return;
        }
        i2(ExoPlaybackException.d(new ExoTimeoutException(3), 1003));
    }

    private void i2(ExoPlaybackException exoPlaybackException) {
        E0 e02 = this.f55722u0;
        E0 e0C = e02.c(e02.f55512b);
        e0C.f55527q = e0C.f55529s;
        e0C.f55528r = 0L;
        E0 e0R1 = R1(e0C, 1);
        if (exoPlaybackException != null) {
            e0R1 = e0R1.f(exoPlaybackException);
        }
        this.f55666K++;
        this.f55703l.D1();
        l2(e0R1, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void j2() {
        B.b bVar = this.f55673R;
        B.b bVarN = d3.P.N(this.f55691f, this.f55685c);
        this.f55673R = bVarN;
        if (bVarN.equals(bVar)) {
            return;
        }
        this.f55705m.h(13, new C13482q.a() { // from class: androidx.media3.exoplayer.J
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((B.d) obj).Y0(this.f55605a.f55673R);
            }
        });
    }

    private void l2(final E0 e02, final int i10, boolean z10, final int i11, long j10, int i12, boolean z11) {
        E0 e03 = this.f55722u0;
        this.f55722u0 = e02;
        boolean zEquals = e03.f55511a.equals(e02.f55511a);
        Pair<Boolean, Integer> pairG1 = G1(e02, e03, z10, i11, !zEquals, z11);
        boolean zBooleanValue = ((Boolean) pairG1.first).booleanValue();
        final int iIntValue = ((Integer) pairG1.second).intValue();
        if (zBooleanValue) {
            vVar = e02.f55511a.q() ? null : e02.f55511a.n(e02.f55511a.h(e02.f55512b.f56933a, this.f55709o).f43594c, this.f43831a).f43617c;
            this.f55720t0 = a3.x.f44153I;
        }
        if (zBooleanValue || !e03.f55520j.equals(e02.f55520j)) {
            this.f55720t0 = this.f55720t0.a().N(e02.f55520j).J();
        }
        a3.x xVarY1 = y1();
        boolean zEquals2 = xVarY1.equals(this.f55674S);
        this.f55674S = xVarY1;
        boolean z12 = e03.f55522l != e02.f55522l;
        boolean z13 = e03.f55515e != e02.f55515e;
        if (z13 || z12) {
            n2();
        }
        boolean z14 = e03.f55517g;
        boolean z15 = e02.f55517g;
        boolean z16 = z14 != z15;
        if (z16) {
            m2(z15);
        }
        if (!zEquals) {
            this.f55705m.h(0, new C13482q.a() { // from class: androidx.media3.exoplayer.s
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    B.d dVar = (B.d) obj;
                    dVar.N0(e02.f55511a, i10);
                }
            });
        }
        if (z10) {
            final B.e eVarN1 = N1(i11, e03, i12);
            final B.e eVarM1 = M1(j10);
            this.f55705m.h(11, new C13482q.a() { // from class: androidx.media3.exoplayer.P
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    V.O0(i11, eVarN1, eVarM1, (B.d) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f55705m.h(1, new C13482q.a() { // from class: androidx.media3.exoplayer.Q
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).T0(vVar, iIntValue);
                }
            });
        }
        if (e03.f55516f != e02.f55516f) {
            this.f55705m.h(10, new C13482q.a() { // from class: androidx.media3.exoplayer.S
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).Z0(e02.f55516f);
                }
            });
            if (e02.f55516f != null) {
                this.f55705m.h(10, new C13482q.a() { // from class: androidx.media3.exoplayer.T
                    @Override // d3.C13482q.a
                    public final void invoke(Object obj) {
                        ((B.d) obj).O0(e02.f55516f);
                    }
                });
            }
        }
        C16853E c16853e = e03.f55519i;
        C16853E c16853e2 = e02.f55519i;
        if (c16853e != c16853e2) {
            this.f55697i.i(c16853e2.f159894e);
            this.f55705m.h(2, new C13482q.a() { // from class: androidx.media3.exoplayer.U
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).P0(e02.f55519i.f159893d);
                }
            });
        }
        if (!zEquals2) {
            final a3.x xVar = this.f55674S;
            this.f55705m.h(14, new C13482q.a() { // from class: androidx.media3.exoplayer.t
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).R0(xVar);
                }
            });
        }
        if (z16) {
            this.f55705m.h(3, new C13482q.a() { // from class: androidx.media3.exoplayer.u
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    V.u0(e02, (B.d) obj);
                }
            });
        }
        if (z13 || z12) {
            this.f55705m.h(-1, new C13482q.a() { // from class: androidx.media3.exoplayer.v
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    E0 e04 = e02;
                    ((B.d) obj).X0(e04.f55522l, e04.f55515e);
                }
            });
        }
        if (z13) {
            this.f55705m.h(4, new C13482q.a() { // from class: androidx.media3.exoplayer.w
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).H0(e02.f55515e);
                }
            });
        }
        if (z12 || e03.f55523m != e02.f55523m) {
            this.f55705m.h(5, new C13482q.a() { // from class: androidx.media3.exoplayer.D
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    E0 e04 = e02;
                    ((B.d) obj).a1(e04.f55522l, e04.f55523m);
                }
            });
        }
        if (e03.f55524n != e02.f55524n) {
            this.f55705m.h(6, new C13482q.a() { // from class: androidx.media3.exoplayer.M
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).E0(e02.f55524n);
                }
            });
        }
        if (e03.n() != e02.n()) {
            this.f55705m.h(7, new C13482q.a() { // from class: androidx.media3.exoplayer.N
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).c1(e02.n());
                }
            });
        }
        if (!e03.f55525o.equals(e02.f55525o)) {
            this.f55705m.h(12, new C13482q.a() { // from class: androidx.media3.exoplayer.O
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).m(e02.f55525o);
                }
            });
        }
        j2();
        this.f55705m.f();
        if (e03.f55526p != e02.f55526p) {
            Iterator<ExoPlayer.a> it = this.f55707n.iterator();
            while (it.hasNext()) {
                it.next().F(e02.f55526p);
            }
        }
    }

    private void m2(boolean z10) {
        PriorityTaskManager priorityTaskManager = this.f55710o0;
        if (priorityTaskManager != null) {
            if (z10 && !this.f55712p0) {
                priorityTaskManager.a(this.f55708n0);
                this.f55712p0 = true;
            } else {
                if (z10 || !this.f55712p0) {
                    return;
                }
                priorityTaskManager.b(this.f55708n0);
                this.f55712p0 = false;
            }
        }
    }

    private void o2() {
        this.f55687d.b();
        if (Thread.currentThread() != z().getThread()) {
            String strF = d3.P.F("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), z().getThread().getName());
            if (this.f55704l0) {
                throw new IllegalStateException(strF);
            }
            d3.r.j("ExoPlayerImpl", strF, this.f55706m0 ? null : new IllegalStateException());
            this.f55706m0 = true;
        }
    }

    public static /* synthetic */ void u0(E0 e02, B.d dVar) {
        dVar.F0(e02.f55517g);
        dVar.U0(e02.f55517g);
    }

    private List<D0.c> x1(int i10, List<androidx.media3.exoplayer.source.r> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            D0.c cVar = new D0.c(list.get(i11), this.f55713q);
            arrayList.add(cVar);
            this.f55711p.add(i11 + i10, new e(cVar.f55505b, cVar.f55504a));
        }
        this.f55670O = this.f55670O.g(i10, arrayList.size());
        return arrayList;
    }

    public InterfaceC13473h H1() {
        return this.f55729y;
    }

    public Looper L1() {
        return this.f55703l.K();
    }

    @Override // a3.B
    public ExoPlaybackException e() {
        o2();
        return this.f55722u0.f55516f;
    }

    @Override // a3.B
    public void l(B.d dVar) {
        this.f55705m.c((B.d) C13466a.e(dVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void release() {
        d3.r.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.6.0] [" + d3.P.f127090e + "] [" + a3.w.b() + "]");
        o2();
        this.f55657B.d(false);
        O0 o02 = this.f55658C;
        if (o02 != null) {
            o02.l();
        }
        this.f55659D.d(false);
        this.f55660E.d(false);
        Q0 q02 = this.f55662G;
        if (q02 != null) {
            q02.disable();
        }
        if (!this.f55703l.A0()) {
            this.f55705m.k(10, new C13482q.a() { // from class: androidx.media3.exoplayer.z
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).O0(ExoPlaybackException.d(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.f55705m.i();
        this.f55699j.e(null);
        this.f55721u.e(this.f55717s);
        E0 e02 = this.f55722u0;
        if (e02.f55526p) {
            this.f55722u0 = e02.a();
        }
        E0 e0R1 = R1(this.f55722u0, 1);
        this.f55722u0 = e0R1;
        E0 e0C = e0R1.c(e0R1.f55512b);
        this.f55722u0 = e0C;
        e0C.f55527q = e0C.f55529s;
        this.f55722u0.f55528r = 0L;
        this.f55717s.release();
        Z1();
        Surface surface = this.f55679X;
        if (surface != null) {
            surface.release();
            this.f55679X = null;
        }
        if (this.f55712p0) {
            ((PriorityTaskManager) C13466a.e(this.f55710o0)).b(this.f55708n0);
            this.f55712p0 = false;
        }
        this.f55702k0 = C6351b.f61425c;
        this.f55714q0 = true;
    }

    public void v1(InterfaceC14599b interfaceC14599b) {
        this.f55717s.O((InterfaceC14599b) C13466a.e(interfaceC14599b));
    }

    public void w1(ExoPlayer.a aVar) {
        this.f55707n.add(aVar);
    }

    @Override // a3.B
    public Looper z() {
        return this.f55719t;
    }

    private B.e M1(long j10) {
        Object obj;
        int iB;
        a3.v vVar;
        Object obj2;
        long jJ1;
        int iW = W();
        if (!this.f55722u0.f55511a.q()) {
            E0 e02 = this.f55722u0;
            Object obj3 = e02.f55512b.f56933a;
            e02.f55511a.h(obj3, this.f55709o);
            iB = this.f55722u0.f55511a.b(obj3);
            obj2 = obj3;
            obj = this.f55722u0.f55511a.n(iW, this.f43831a).f43615a;
            vVar = this.f43831a.f43617c;
        } else {
            obj = null;
            iB = -1;
            vVar = null;
            obj2 = null;
        }
        int i10 = iB;
        long jJ12 = d3.P.j1(j10);
        if (this.f55722u0.f55512b.b()) {
            jJ1 = d3.P.j1(O1(this.f55722u0));
        } else {
            jJ1 = jJ12;
        }
        r.b bVar = this.f55722u0.f55512b;
        return new B.e(obj, iW, vVar, obj2, i10, jJ12, jJ1, bVar.f56934b, bVar.f56935c);
    }

    public static /* synthetic */ void O0(int i10, B.e eVar, B.e eVar2, B.d dVar) {
        dVar.S0(i10);
        dVar.W0(eVar, eVar2, i10);
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
            this.f55724v0 = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.f55728x0 = j10;
            this.f55726w0 = 0;
            return null;
        }
        if (i10 == -1 || i10 >= f10.p()) {
            i10 = f10.a(this.f55665J);
            j10 = f10.n(i10, this.f43831a).b();
        }
        return f10.j(this.f43831a, this.f55709o, i10, d3.P.M0(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V1(int i10, final int i11) {
        o2();
        a2(1, 10, Integer.valueOf(i11));
        a2(2, 10, Integer.valueOf(i11));
        this.f55705m.k(21, new C13482q.a() { // from class: androidx.media3.exoplayer.K
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((B.d) obj).G0(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k2(boolean z10, int i10) {
        int iB1 = B1(z10);
        E0 e0A = this.f55722u0;
        if (e0A.f55522l == z10 && e0A.f55524n == iB1 && e0A.f55523m == i10) {
            return;
        }
        this.f55666K++;
        if (e0A.f55526p) {
            e0A = e0A.a();
        }
        E0 e0E = e0A.e(z10, i10, iB1);
        this.f55703l.h1(z10, i10, iB1);
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
                T0 t02 = this.f55659D;
                if (F() && !zQ1) {
                    z10 = true;
                }
                t02.d(z10);
                this.f55660E.d(F());
                return;
            }
        }
        this.f55659D.d(false);
        this.f55660E.d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a3.x y1() {
        a3.F fY = y();
        if (fY.q()) {
            return this.f55720t0;
        }
        return this.f55720t0.a().L(fY.n(W(), this.f43831a).f43617c.f44015e).J();
    }

    @Override // a3.B
    public a3.I A() {
        o2();
        return this.f55697i.c();
    }

    public void A1(SurfaceHolder surfaceHolder) {
        o2();
        if (surfaceHolder != null && surfaceHolder == this.f55680Y) {
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
        this.f55684b0 = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            d3.r.i("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f55730z);
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
        return this.f55673R;
    }

    @Override // a3.B
    public boolean F() {
        o2();
        return this.f55722u0.f55522l;
    }

    @Override // a3.B
    public void G(final boolean z10) {
        o2();
        if (this.f55665J != z10) {
            this.f55665J = z10;
            this.f55703l.p1(z10);
            this.f55705m.h(9, new C13482q.a() { // from class: androidx.media3.exoplayer.I
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).I0(z10);
                }
            });
            j2();
            this.f55705m.f();
        }
    }

    @Override // a3.B
    public long H() {
        o2();
        return this.f55727x;
    }

    @Override // a3.B
    public int J() {
        o2();
        if (this.f55722u0.f55511a.q()) {
            return this.f55726w0;
        }
        E0 e02 = this.f55722u0;
        return e02.f55511a.b(e02.f55512b.f56933a);
    }

    @Override // a3.B
    public void K(TextureView textureView) {
        o2();
        if (textureView != null && textureView == this.f55684b0) {
            z1();
        }
    }

    @Override // a3.B
    public a3.N L() {
        o2();
        return this.f55718s0;
    }

    @Override // a3.B
    public void M(final a3.I i10) {
        o2();
        if (this.f55697i.h() && !i10.equals(this.f55697i.c())) {
            this.f55697i.m(i10);
            this.f55705m.k(19, new C13482q.a() { // from class: androidx.media3.exoplayer.L
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).b1(i10);
                }
            });
        }
    }

    @Override // a3.B
    public int O() {
        o2();
        if (j()) {
            return this.f55722u0.f55512b.f56935c;
        }
        return -1;
    }

    public boolean Q1() {
        o2();
        return this.f55722u0.f55526p;
    }

    @Override // a3.B
    public long R() {
        o2();
        return this.f55725w;
    }

    @Override // a3.B
    public long S() {
        o2();
        return I1(this.f55722u0);
    }

    @Override // a3.B
    public int U() {
        o2();
        return this.f55722u0.f55515e;
    }

    @Override // a3.B
    public int W() {
        o2();
        int iK1 = K1(this.f55722u0);
        if (iK1 == -1) {
            return 0;
        }
        return iK1;
    }

    @Override // a3.B
    public void X(final int i10) {
        o2();
        if (this.f55664I != i10) {
            this.f55664I = i10;
            this.f55703l.m1(i10);
            this.f55705m.h(8, new C13482q.a() { // from class: androidx.media3.exoplayer.A
                @Override // d3.C13482q.a
                public final void invoke(Object obj) {
                    ((B.d) obj).D0(i10);
                }
            });
            j2();
            this.f55705m.f();
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
        this.f55705m.j((B.d) C13466a.e(dVar));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public AbstractC16852D a() {
        o2();
        return this.f55697i;
    }

    @Override // a3.B
    public int a0() {
        o2();
        return this.f55664I;
    }

    @Override // a3.B
    public boolean b0() {
        o2();
        return this.f55665J;
    }

    @Override // a3.B
    public long c0() {
        o2();
        if (this.f55722u0.f55511a.q()) {
            return this.f55728x0;
        }
        E0 e02 = this.f55722u0;
        if (e02.f55521k.f56936d != e02.f55512b.f56936d) {
            return e02.f55511a.n(W(), this.f43831a).d();
        }
        long j10 = e02.f55527q;
        if (this.f55722u0.f55521k.b()) {
            E0 e03 = this.f55722u0;
            F.b bVarH = e03.f55511a.h(e03.f55521k.f56933a, this.f55709o);
            long jF = bVarH.f(this.f55722u0.f55521k.f56934b);
            if (jF == Long.MIN_VALUE) {
                j10 = bVarH.f43595d;
            } else {
                j10 = jF;
            }
        }
        E0 e04 = this.f55722u0;
        return d3.P.j1(X1(e04.f55511a, e04.f55521k, j10));
    }

    public void c2(List<androidx.media3.exoplayer.source.r> list, boolean z10) {
        o2();
        d2(list, -1, -9223372036854775807L, z10);
    }

    @Override // a3.B
    public void d(C5560A c5560a) {
        o2();
        if (c5560a == null) {
            c5560a = C5560A.f43549d;
        }
        if (this.f55722u0.f55525o.equals(c5560a)) {
            return;
        }
        E0 e0G = this.f55722u0.g(c5560a);
        this.f55666K++;
        this.f55703l.j1(c5560a);
        l2(e0G, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a3.B
    public C5560A f() {
        o2();
        return this.f55722u0.f55525o;
    }

    @Override // a3.B
    public a3.x f0() {
        o2();
        return this.f55674S;
    }

    @Override // a3.B
    public void g() {
        int i10;
        o2();
        E0 e02 = this.f55722u0;
        if (e02.f55515e != 1) {
            return;
        }
        E0 e0F = e02.f(null);
        if (e0F.f55511a.q()) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        E0 e0R1 = R1(e0F, i10);
        this.f55666K++;
        this.f55703l.y0();
        l2(e0R1, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // a3.B
    public long g0() {
        o2();
        return d3.P.j1(J1(this.f55722u0));
    }

    @Override // a3.B
    public long getDuration() {
        o2();
        if (j()) {
            E0 e02 = this.f55722u0;
            r.b bVar = e02.f55512b;
            e02.f55511a.h(bVar.f56933a, this.f55709o);
            return d3.P.j1(this.f55709o.b(bVar.f56934b, bVar.f56935c));
        }
        return I();
    }

    @Override // a3.B
    public float getVolume() {
        o2();
        return this.f55698i0;
    }

    @Override // a3.B
    public void h(float f10) {
        o2();
        final float fN = d3.P.n(f10, 0.0f, 1.0f);
        if (this.f55698i0 == fN) {
            return;
        }
        this.f55698i0 = fN;
        this.f55703l.v1(fN);
        this.f55705m.k(22, new C13482q.a() { // from class: androidx.media3.exoplayer.x
            @Override // d3.C13482q.a
            public final void invoke(Object obj) {
                ((B.d) obj).V0(fN);
            }
        });
    }

    @Override // a3.B
    public long h0() {
        o2();
        return this.f55723v;
    }

    public void h2(SurfaceHolder surfaceHolder) {
        o2();
        if (surfaceHolder == null) {
            z1();
            return;
        }
        Z1();
        this.f55682a0 = true;
        this.f55680Y = surfaceHolder;
        surfaceHolder.addCallback(this.f55730z);
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
        return this.f55722u0.f55512b.b();
    }

    @Override // a3.B
    public long k() {
        o2();
        return d3.P.j1(this.f55722u0.f55528r);
    }

    @Override // a3.AbstractC5568h
    protected void m0(int i10, long j10, int i11, boolean z10) {
        boolean z11;
        o2();
        if (i10 != -1) {
            if (i10 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            C13466a.a(z11);
            a3.F f10 = this.f55722u0.f55511a;
            if (!f10.q() && i10 >= f10.p()) {
                return;
            }
            this.f55717s.D();
            this.f55666K++;
            if (j()) {
                d3.r.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                C6057j0.e eVar = new C6057j0.e(this.f55722u0);
                eVar.b(1);
                this.f55701k.a(eVar);
                return;
            }
            E0 e0R1 = this.f55722u0;
            int i12 = e0R1.f55515e;
            if (i12 == 3 || (i12 == 4 && !f10.q())) {
                e0R1 = R1(this.f55722u0, 2);
            }
            int iW = W();
            E0 e0S1 = S1(e0R1, f10, T1(f10, i10, j10));
            this.f55703l.Q0(f10, i10, d3.P.M0(j10));
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
                this.f55681Z = (SphericalGLSurfaceView) surfaceView;
                F1(this.f55656A).m(10000).l(this.f55681Z).k();
                this.f55681Z.d(this.f55730z);
                g2(this.f55681Z.getVideoSurface());
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
        return this.f55722u0.f55519i.f159893d;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public void setImageOutput(ImageOutput imageOutput) {
        o2();
        a2(4, 15, imageOutput);
    }

    @Override // a3.B
    public C6351b t() {
        o2();
        return this.f55702k0;
    }

    @Override // a3.B
    public int u() {
        o2();
        if (j()) {
            return this.f55722u0.f55512b.f56934b;
        }
        return -1;
    }

    @Override // a3.B
    public int x() {
        o2();
        return this.f55722u0.f55524n;
    }

    @Override // a3.B
    public a3.F y() {
        o2();
        return this.f55722u0.f55511a;
    }

    public void z1() {
        o2();
        Z1();
        g2(null);
        U1(0, 0);
    }
}
