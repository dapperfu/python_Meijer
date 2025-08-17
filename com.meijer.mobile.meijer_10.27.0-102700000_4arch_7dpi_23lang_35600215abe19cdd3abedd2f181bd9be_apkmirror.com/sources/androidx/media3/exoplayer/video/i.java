package androidx.media3.exoplayer.video;

import Be.w;
import Be.x;
import Ce.L;
import a3.C;
import a3.C5570j;
import a3.E;
import a3.InterfaceC5573m;
import a3.K;
import a3.L;
import a3.M;
import a3.N;
import a3.t;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.i;
import d3.C13466a;
import d3.F;
import d3.I;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;
import d3.P;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i implements M.a {

    /* renamed from: z, reason: collision with root package name */
    private static final Executor f57100z = new Executor() { // from class: v3.f
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.i.a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f57101a;

    /* renamed from: b, reason: collision with root package name */
    private final I<Long> f57102b;

    /* renamed from: c, reason: collision with root package name */
    private final C.a f57103c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<d> f57104d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Object> f57105e;

    /* renamed from: f, reason: collision with root package name */
    private final K f57106f;

    /* renamed from: g, reason: collision with root package name */
    private final VideoSink f57107g;

    /* renamed from: h, reason: collision with root package name */
    private final VideoSink.b f57108h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC13473h f57109i;

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f57110j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f57111k;

    /* renamed from: l, reason: collision with root package name */
    private t f57112l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC13479n f57113m;

    /* renamed from: n, reason: collision with root package name */
    private C f57114n;

    /* renamed from: o, reason: collision with root package name */
    private long f57115o;

    /* renamed from: p, reason: collision with root package name */
    private Pair<Surface, F> f57116p;

    /* renamed from: q, reason: collision with root package name */
    private int f57117q;

    /* renamed from: r, reason: collision with root package name */
    private int f57118r;

    /* renamed from: s, reason: collision with root package name */
    private H0.a f57119s;

    /* renamed from: t, reason: collision with root package name */
    private long f57120t;

    /* renamed from: u, reason: collision with root package name */
    private long f57121u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57122v;

    /* renamed from: w, reason: collision with root package name */
    private long f57123w;

    /* renamed from: x, reason: collision with root package name */
    private int f57124x;

    /* renamed from: y, reason: collision with root package name */
    private int f57125y;

    class a implements VideoSink.b {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void a(long j10) {
            ((C) C13466a.i(i.this.f57114n)).c(j10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void skip() {
            ((C) C13466a.i(i.this.f57114n)).c(-2L);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f57127a;

        /* renamed from: b, reason: collision with root package name */
        private final n f57128b;

        /* renamed from: c, reason: collision with root package name */
        private L.a f57129c;

        /* renamed from: d, reason: collision with root package name */
        private C.a f57130d;

        /* renamed from: e, reason: collision with root package name */
        private List<Object> f57131e = Ce.L.x();

        /* renamed from: f, reason: collision with root package name */
        private K f57132f = K.f43762a;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC13473h f57133g = InterfaceC13473h.f127116a;

        /* renamed from: h, reason: collision with root package name */
        private boolean f57134h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f57135i;

        public i h() {
            C13466a.g(!this.f57135i);
            a aVar = null;
            if (this.f57130d == null) {
                if (this.f57129c == null) {
                    this.f57129c = new f(aVar);
                }
                this.f57130d = new g(this.f57129c);
            }
            i iVar = new i(this, aVar);
            this.f57135i = true;
            return iVar;
        }

        public b i(InterfaceC13473h interfaceC13473h) {
            this.f57133g = interfaceC13473h;
            return this;
        }

        public b(Context context, n nVar) {
            this.f57127a = context.getApplicationContext();
            this.f57128b = nVar;
        }
    }

    private final class c implements VideoSink.a {
        private c() {
        }

        /* synthetic */ c(i iVar, a aVar) {
            this();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void a(VideoSink videoSink, N n10) {
            Iterator it = i.this.f57110j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(i.this, n10);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink) {
            Iterator it = i.this.f57110j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).x(i.this);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink) {
            Iterator it = i.this.f57110j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).z(i.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements VideoSink, e {

        /* renamed from: a, reason: collision with root package name */
        private final int f57137a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57138b;

        /* renamed from: d, reason: collision with root package name */
        private L f57140d;

        /* renamed from: e, reason: collision with root package name */
        private t f57141e;

        /* renamed from: f, reason: collision with root package name */
        private int f57142f;

        /* renamed from: g, reason: collision with root package name */
        private long f57143g;

        /* renamed from: k, reason: collision with root package name */
        private boolean f57147k;

        /* renamed from: c, reason: collision with root package name */
        private Ce.L<Object> f57139c = Ce.L.x();

        /* renamed from: h, reason: collision with root package name */
        private long f57144h = -9223372036854775807L;

        /* renamed from: i, reason: collision with root package name */
        private VideoSink.a f57145i = VideoSink.a.f57014a;

        /* renamed from: j, reason: collision with root package name */
        private Executor f57146j = i.f57100z;

        public d(Context context, int i10) {
            this.f57138b = i10;
            this.f57137a = P.b0(context);
        }

        private void G(List<Object> list) {
            if (i.this.f57103c.b()) {
                this.f57139c = Ce.L.s(list);
            } else {
                this.f57139c = new L.a().j(list).j(i.this.f57105e).k();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void A(boolean z10) {
            i.this.f57107g.A(z10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void B(VideoSink.a aVar, Executor executor) {
            this.f57145i = aVar;
            this.f57146j = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean a() {
            return this.f57140d != null;
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void d(i iVar, final N n10) {
            final VideoSink.a aVar = this.f57145i;
            this.f57146j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.C(this.f57151a, aVar, n10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void e() {
            i.this.f57107g.e();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void h(long j10, long j11) throws VideoSink.VideoSinkException {
            i.this.J(j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void i() {
            i.this.f57121u = this.f57144h;
            if (i.this.f57120t >= i.this.f57121u) {
                i.this.f57107g.i();
                i.this.f57122v = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void j(long j10, long j11) {
            I i10 = i.this.f57102b;
            long j12 = this.f57144h;
            i10.a(j12 == -9223372036854775807L ? 0L : j12 + 1, Long.valueOf(j10));
            this.f57143g = j11;
            i.this.K(j11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void k() {
            i.this.f57107g.k();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void l(H0.a aVar) {
            i.this.f57119s = aVar;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void m(List<Object> list) {
            if (this.f57139c.equals(list)) {
                return;
            }
            G(list);
            t tVar = this.f57141e;
            if (tVar != null) {
                F(tVar);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean n(boolean z10) {
            return i.this.F(z10 && a());
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void o(v3.h hVar) {
            i.this.O(hVar);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void p(boolean z10) {
            i.this.f57107g.p(z10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void q() {
            i.this.f57107g.q();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void r(Surface surface, F f10) {
            i.this.L(surface, f10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void release() {
            i.this.I();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void s() {
            i.this.f57107g.s();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void t(int i10) {
            i.this.f57107g.t(i10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void u(float f10) {
            i.this.M(f10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void v() {
            i.this.z();
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void x(i iVar) {
            final VideoSink.a aVar = this.f57145i;
            this.f57146j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.E(this.f57154a, aVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void z(i iVar) {
            final VideoSink.a aVar = this.f57145i;
            this.f57146j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.l
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.D(this.f57156a, aVar);
                }
            });
        }

        public static /* synthetic */ void C(d dVar, VideoSink.a aVar, N n10) {
            dVar.getClass();
            aVar.a(dVar, n10);
        }

        public static /* synthetic */ void D(d dVar, VideoSink.a aVar) {
            dVar.getClass();
            aVar.c((VideoSink) C13466a.i(dVar));
        }

        public static /* synthetic */ void E(d dVar, VideoSink.a aVar) {
            dVar.getClass();
            aVar.b(dVar);
        }

        private void F(t tVar) {
            ((a3.L) C13466a.i(this.f57140d)).c(this.f57142f, tVar.b().T(i.B(tVar.f43922C)).N(), this.f57139c, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface b() {
            C13466a.g(a());
            return ((a3.L) C13466a.i(this.f57140d)).b();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean c() {
            if (a() && i.this.D()) {
                return true;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean f(long j10, boolean z10, VideoSink.b bVar) {
            C13466a.g(a());
            if (!i.this.P() || ((a3.L) C13466a.i(this.f57140d)).e() >= this.f57137a || !((a3.L) C13466a.i(this.f57140d)).d()) {
                return false;
            }
            this.f57144h = j10 - this.f57143g;
            bVar.a(j10 * 1000);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean g(t tVar) throws VideoSink.VideoSinkException {
            C13466a.g(!a());
            a3.L lH = i.this.H(tVar, this.f57138b);
            this.f57140d = lH;
            if (lH != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void w(boolean z10) {
            if (a()) {
                this.f57140d.flush();
            }
            this.f57144h = -9223372036854775807L;
            i.this.A(z10);
            this.f57147k = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void y(int i10, t tVar, List<Object> list) {
            C13466a.g(a());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            G(list);
            this.f57142f = i10;
            this.f57141e = tVar;
            i.this.f57121u = -9223372036854775807L;
            i.this.f57122v = false;
            F(tVar);
        }
    }

    public interface e {
        void d(i iVar, N n10);

        void x(i iVar);

        void z(i iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f implements L.a {

        /* renamed from: a, reason: collision with root package name */
        private static final w<L.a> f57149a = x.a(new w() { // from class: androidx.media3.exoplayer.video.m
            @Override // Be.w
            public final Object get() {
                return i.f.a();
            }
        });

        private f() {
        }

        /* synthetic */ f(a aVar) {
            this();
        }

        public static /* synthetic */ L.a a() throws IllegalAccessException, InstantiationException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (L.a) C13466a.e(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static final class g implements C.a {

        /* renamed from: a, reason: collision with root package name */
        private final L.a f57150a;

        @Override // a3.C.a
        public boolean b() {
            return false;
        }

        @Override // a3.C.a
        public C a(Context context, C5570j c5570j, InterfaceC5573m interfaceC5573m, M.a aVar, Executor executor, K k10, List<Object> list, long j10) throws VideoFrameProcessingException {
            try {
                return ((C.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(L.a.class).newInstance(this.f57150a)).a(context, c5570j, interfaceC5573m, aVar, executor, k10, list, j10);
            } catch (Exception e10) {
                throw VideoFrameProcessingException.a(e10);
            }
        }

        public g(L.a aVar) {
            this.f57150a = aVar;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a3.L H(t tVar, int i10) throws VideoSink.VideoSinkException {
        i iVar;
        a aVar = null;
        if (i10 == 0) {
            C13466a.g(this.f57118r == 0);
            C5570j c5570jB = B(tVar.f43922C);
            if (this.f57111k) {
                c5570jB = C5570j.f43837h;
            } else if (c5570jB.f43847c == 7 && P.f127086a < 34) {
                c5570jB = c5570jB.a().e(6).a();
            }
            C5570j c5570j = c5570jB;
            final InterfaceC13479n interfaceC13479nE = this.f57109i.e((Looper) C13466a.i(Looper.myLooper()), null);
            this.f57113m = interfaceC13479nE;
            try {
                C.a aVar2 = this.f57103c;
                Context context = this.f57101a;
                InterfaceC5573m interfaceC5573m = InterfaceC5573m.f43858a;
                Objects.requireNonNull(interfaceC13479nE);
                iVar = this;
                try {
                    C cA = aVar2.a(context, c5570j, interfaceC5573m, iVar, new Executor() { // from class: v3.d
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            interfaceC13479nE.post(runnable);
                        }
                    }, this.f57106f, this.f57105e, 0L);
                    iVar.f57114n = cA;
                    cA.b();
                    Pair<Surface, F> pair = iVar.f57116p;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        F f10 = (F) pair.second;
                        G(surface, f10.b(), f10.a());
                    }
                    iVar.f57107g.g(tVar);
                    iVar.f57118r = 1;
                } catch (VideoFrameProcessingException e10) {
                    e = e10;
                    throw new VideoSink.VideoSinkException(e, tVar);
                }
            } catch (VideoFrameProcessingException e11) {
                e = e11;
            }
        } else {
            iVar = this;
            if (!E()) {
                return null;
            }
        }
        try {
            ((C) C13466a.e(iVar.f57114n)).e(i10);
            iVar.f57125y++;
            VideoSink videoSink = iVar.f57107g;
            c cVar = new c(this, aVar);
            final InterfaceC13479n interfaceC13479n = (InterfaceC13479n) C13466a.e(iVar.f57113m);
            Objects.requireNonNull(interfaceC13479n);
            videoSink.B(cVar, new Executor() { // from class: v3.d
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC13479n.post(runnable);
                }
            });
            return iVar.f57114n.a(i10);
        } catch (VideoFrameProcessingException e12) {
            throw new VideoSink.VideoSinkException(e12, tVar);
        }
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    private i(b bVar) {
        this.f57101a = bVar.f57127a;
        this.f57102b = new I<>();
        this.f57103c = (C.a) C13466a.i(bVar.f57130d);
        this.f57104d = new SparseArray<>();
        this.f57105e = bVar.f57131e;
        this.f57106f = bVar.f57132f;
        InterfaceC13473h interfaceC13473h = bVar.f57133g;
        this.f57109i = interfaceC13473h;
        this.f57107g = new androidx.media3.exoplayer.video.d(bVar.f57128b, interfaceC13473h);
        this.f57108h = new a();
        this.f57110j = new CopyOnWriteArraySet<>();
        this.f57111k = bVar.f57134h;
        this.f57112l = new t.b().N();
        this.f57120t = -9223372036854775807L;
        this.f57121u = -9223372036854775807L;
        this.f57124x = -1;
        this.f57118r = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C5570j B(C5570j c5570j) {
        return (c5570j == null || !c5570j.g()) ? C5570j.f43837h : c5570j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D() {
        return this.f57117q == 0 && this.f57122v && this.f57107g.c();
    }

    private boolean E() {
        return this.f57118r == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F(boolean z10) {
        return this.f57107g.n(z10 && this.f57117q == 0);
    }

    private void G(Surface surface, int i10, int i11) {
        C c10 = this.f57114n;
        if (c10 == null) {
            return;
        }
        if (surface != null) {
            c10.d(new E(surface, i10, i11));
            this.f57107g.r(surface, new F(i10, i11));
        } else {
            c10.d(null);
            this.f57107g.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(long j10, long j11) throws VideoSink.VideoSinkException {
        this.f57107g.h(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(long j10) {
        this.f57123w = j10;
        this.f57107g.j(this.f57115o, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(float f10) {
        this.f57107g.u(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(v3.h hVar) {
        this.f57107g.o(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        int i10 = this.f57124x;
        return i10 != -1 && i10 == this.f57125y;
    }

    public static /* synthetic */ void b(i iVar) {
        iVar.f57117q--;
    }

    public VideoSink C(int i10) {
        C13466a.g(!P.q(this.f57104d, i10));
        d dVar = new d(this.f57101a, i10);
        y(dVar);
        this.f57104d.put(i10, dVar);
        return dVar;
    }

    public void I() {
        if (this.f57118r == 2) {
            return;
        }
        InterfaceC13479n interfaceC13479n = this.f57113m;
        if (interfaceC13479n != null) {
            interfaceC13479n.e(null);
        }
        C c10 = this.f57114n;
        if (c10 != null) {
            c10.release();
        }
        this.f57116p = null;
        this.f57118r = 2;
    }

    public void L(Surface surface, F f10) {
        Pair<Surface, F> pair = this.f57116p;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((F) this.f57116p.second).equals(f10)) {
            return;
        }
        this.f57116p = Pair.create(surface, f10);
        G(surface, f10.b(), f10.a());
    }

    public void N(int i10) {
        this.f57124x = i10;
    }

    public void y(e eVar) {
        this.f57110j.add(eVar);
    }

    public void z() {
        F f10 = F.f127068c;
        G(null, f10.b(), f10.a());
        this.f57116p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        if (!E()) {
            return;
        }
        this.f57117q++;
        this.f57107g.w(z10);
        while (this.f57102b.l() > 1) {
            this.f57102b.i();
        }
        if (this.f57102b.l() == 1) {
            this.f57107g.j(((Long) C13466a.e(this.f57102b.i())).longValue(), this.f57123w);
        }
        this.f57120t = -9223372036854775807L;
        this.f57121u = -9223372036854775807L;
        this.f57122v = false;
        ((InterfaceC13479n) C13466a.i(this.f57113m)).post(new Runnable() { // from class: v3.e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.video.i.b(this.f164446a);
            }
        });
    }
}
