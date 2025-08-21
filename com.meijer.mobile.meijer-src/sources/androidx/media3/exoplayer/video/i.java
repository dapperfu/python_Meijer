package androidx.media3.exoplayer.video;

import De.w;
import De.x;
import Ee.L;
import a3.C;
import a3.C5653j;
import a3.E;
import a3.InterfaceC5656m;
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
import d3.C13599a;
import d3.F;
import d3.I;
import d3.InterfaceC13606h;
import d3.InterfaceC13612n;
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
    private static final Executor f57324z = new Executor() { // from class: v3.f
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            androidx.media3.exoplayer.video.i.a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final Context f57325a;

    /* renamed from: b, reason: collision with root package name */
    private final I<Long> f57326b;

    /* renamed from: c, reason: collision with root package name */
    private final C.a f57327c;

    /* renamed from: d, reason: collision with root package name */
    private final SparseArray<d> f57328d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Object> f57329e;

    /* renamed from: f, reason: collision with root package name */
    private final K f57330f;

    /* renamed from: g, reason: collision with root package name */
    private final VideoSink f57331g;

    /* renamed from: h, reason: collision with root package name */
    private final VideoSink.b f57332h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC13606h f57333i;

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArraySet<e> f57334j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f57335k;

    /* renamed from: l, reason: collision with root package name */
    private t f57336l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC13612n f57337m;

    /* renamed from: n, reason: collision with root package name */
    private C f57338n;

    /* renamed from: o, reason: collision with root package name */
    private long f57339o;

    /* renamed from: p, reason: collision with root package name */
    private Pair<Surface, F> f57340p;

    /* renamed from: q, reason: collision with root package name */
    private int f57341q;

    /* renamed from: r, reason: collision with root package name */
    private int f57342r;

    /* renamed from: s, reason: collision with root package name */
    private H0.a f57343s;

    /* renamed from: t, reason: collision with root package name */
    private long f57344t;

    /* renamed from: u, reason: collision with root package name */
    private long f57345u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f57346v;

    /* renamed from: w, reason: collision with root package name */
    private long f57347w;

    /* renamed from: x, reason: collision with root package name */
    private int f57348x;

    /* renamed from: y, reason: collision with root package name */
    private int f57349y;

    class a implements VideoSink.b {
        a() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void a(long j10) {
            ((C) C13599a.i(i.this.f57338n)).c(j10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.b
        public void skip() {
            ((C) C13599a.i(i.this.f57338n)).c(-2L);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final Context f57351a;

        /* renamed from: b, reason: collision with root package name */
        private final n f57352b;

        /* renamed from: c, reason: collision with root package name */
        private L.a f57353c;

        /* renamed from: d, reason: collision with root package name */
        private C.a f57354d;

        /* renamed from: e, reason: collision with root package name */
        private List<Object> f57355e = Ee.L.x();

        /* renamed from: f, reason: collision with root package name */
        private K f57356f = K.f44580a;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC13606h f57357g = InterfaceC13606h.f127918a;

        /* renamed from: h, reason: collision with root package name */
        private boolean f57358h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f57359i;

        public i h() {
            C13599a.g(!this.f57359i);
            a aVar = null;
            if (this.f57354d == null) {
                if (this.f57353c == null) {
                    this.f57353c = new f(aVar);
                }
                this.f57354d = new g(this.f57353c);
            }
            i iVar = new i(this, aVar);
            this.f57359i = true;
            return iVar;
        }

        public b i(InterfaceC13606h interfaceC13606h) {
            this.f57357g = interfaceC13606h;
            return this;
        }

        public b(Context context, n nVar) {
            this.f57351a = context.getApplicationContext();
            this.f57352b = nVar;
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
            Iterator it = i.this.f57334j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(i.this, n10);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void b(VideoSink videoSink) {
            Iterator it = i.this.f57334j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).x(i.this);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.a
        public void c(VideoSink videoSink) {
            Iterator it = i.this.f57334j.iterator();
            while (it.hasNext()) {
                ((e) it.next()).z(i.this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class d implements VideoSink, e {

        /* renamed from: a, reason: collision with root package name */
        private final int f57361a;

        /* renamed from: b, reason: collision with root package name */
        private final int f57362b;

        /* renamed from: d, reason: collision with root package name */
        private L f57364d;

        /* renamed from: e, reason: collision with root package name */
        private t f57365e;

        /* renamed from: f, reason: collision with root package name */
        private int f57366f;

        /* renamed from: g, reason: collision with root package name */
        private long f57367g;

        /* renamed from: k, reason: collision with root package name */
        private boolean f57371k;

        /* renamed from: c, reason: collision with root package name */
        private Ee.L<Object> f57363c = Ee.L.x();

        /* renamed from: h, reason: collision with root package name */
        private long f57368h = -9223372036854775807L;

        /* renamed from: i, reason: collision with root package name */
        private VideoSink.a f57369i = VideoSink.a.f57238a;

        /* renamed from: j, reason: collision with root package name */
        private Executor f57370j = i.f57324z;

        public d(Context context, int i10) {
            this.f57362b = i10;
            this.f57361a = P.b0(context);
        }

        private void G(List<Object> list) {
            if (i.this.f57327c.b()) {
                this.f57363c = Ee.L.s(list);
            } else {
                this.f57363c = new L.a().j(list).j(i.this.f57329e).k();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void A(boolean z10) {
            i.this.f57331g.A(z10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void B(VideoSink.a aVar, Executor executor) {
            this.f57369i = aVar;
            this.f57370j = executor;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean a() {
            return this.f57364d != null;
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void d(i iVar, final N n10) {
            final VideoSink.a aVar = this.f57369i;
            this.f57370j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.j
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.C(this.f57375a, aVar, n10);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void e() {
            i.this.f57331g.e();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void h(long j10, long j11) throws VideoSink.VideoSinkException {
            i.this.J(j10, j11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void i() {
            i.this.f57345u = this.f57368h;
            if (i.this.f57344t >= i.this.f57345u) {
                i.this.f57331g.i();
                i.this.f57346v = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void j(long j10, long j11) {
            I i10 = i.this.f57326b;
            long j12 = this.f57368h;
            i10.a(j12 == -9223372036854775807L ? 0L : j12 + 1, Long.valueOf(j10));
            this.f57367g = j11;
            i.this.K(j11);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void k() {
            i.this.f57331g.k();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void l(H0.a aVar) {
            i.this.f57343s = aVar;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void m(List<Object> list) {
            if (this.f57363c.equals(list)) {
                return;
            }
            G(list);
            t tVar = this.f57365e;
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
            i.this.f57331g.p(z10);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void q() {
            i.this.f57331g.q();
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
            i.this.f57331g.s();
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void t(int i10) {
            i.this.f57331g.t(i10);
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
            final VideoSink.a aVar = this.f57369i;
            this.f57370j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.E(this.f57378a, aVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.video.i.e
        public void z(i iVar) {
            final VideoSink.a aVar = this.f57369i;
            this.f57370j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.l
                @Override // java.lang.Runnable
                public final void run() {
                    i.d.D(this.f57380a, aVar);
                }
            });
        }

        public static /* synthetic */ void C(d dVar, VideoSink.a aVar, N n10) {
            dVar.getClass();
            aVar.a(dVar, n10);
        }

        public static /* synthetic */ void D(d dVar, VideoSink.a aVar) {
            dVar.getClass();
            aVar.c((VideoSink) C13599a.i(dVar));
        }

        public static /* synthetic */ void E(d dVar, VideoSink.a aVar) {
            dVar.getClass();
            aVar.b(dVar);
        }

        private void F(t tVar) {
            ((a3.L) C13599a.i(this.f57364d)).c(this.f57366f, tVar.b().T(i.B(tVar.f44740C)).N(), this.f57363c, 0L);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public Surface b() {
            C13599a.g(a());
            return ((a3.L) C13599a.i(this.f57364d)).b();
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
            C13599a.g(a());
            if (!i.this.P() || ((a3.L) C13599a.i(this.f57364d)).e() >= this.f57361a || !((a3.L) C13599a.i(this.f57364d)).d()) {
                return false;
            }
            this.f57368h = j10 - this.f57367g;
            bVar.a(j10 * 1000);
            return true;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public boolean g(t tVar) throws VideoSink.VideoSinkException {
            C13599a.g(!a());
            a3.L lH = i.this.H(tVar, this.f57362b);
            this.f57364d = lH;
            if (lH != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void w(boolean z10) {
            if (a()) {
                this.f57364d.flush();
            }
            this.f57368h = -9223372036854775807L;
            i.this.A(z10);
            this.f57371k = false;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public void y(int i10, t tVar, List<Object> list) {
            C13599a.g(a());
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i10);
            }
            G(list);
            this.f57366f = i10;
            this.f57365e = tVar;
            i.this.f57345u = -9223372036854775807L;
            i.this.f57346v = false;
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
        private static final w<L.a> f57373a = x.a(new w() { // from class: androidx.media3.exoplayer.video.m
            @Override // De.w
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
                return (L.a) C13599a.e(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    private static final class g implements C.a {

        /* renamed from: a, reason: collision with root package name */
        private final L.a f57374a;

        @Override // a3.C.a
        public boolean b() {
            return false;
        }

        @Override // a3.C.a
        public C a(Context context, C5653j c5653j, InterfaceC5656m interfaceC5656m, M.a aVar, Executor executor, K k10, List<Object> list, long j10) throws VideoFrameProcessingException {
            try {
                return ((C.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(L.a.class).newInstance(this.f57374a)).a(context, c5653j, interfaceC5656m, aVar, executor, k10, list, j10);
            } catch (Exception e10) {
                throw VideoFrameProcessingException.a(e10);
            }
        }

        public g(L.a aVar) {
            this.f57374a = aVar;
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
            C13599a.g(this.f57342r == 0);
            C5653j c5653jB = B(tVar.f44740C);
            if (this.f57335k) {
                c5653jB = C5653j.f44655h;
            } else if (c5653jB.f44665c == 7 && P.f127888a < 34) {
                c5653jB = c5653jB.a().e(6).a();
            }
            C5653j c5653j = c5653jB;
            final InterfaceC13612n interfaceC13612nE = this.f57333i.e((Looper) C13599a.i(Looper.myLooper()), null);
            this.f57337m = interfaceC13612nE;
            try {
                C.a aVar2 = this.f57327c;
                Context context = this.f57325a;
                InterfaceC5656m interfaceC5656m = InterfaceC5656m.f44676a;
                Objects.requireNonNull(interfaceC13612nE);
                iVar = this;
                try {
                    C cA = aVar2.a(context, c5653j, interfaceC5656m, iVar, new Executor() { // from class: v3.d
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            interfaceC13612nE.post(runnable);
                        }
                    }, this.f57330f, this.f57329e, 0L);
                    iVar.f57338n = cA;
                    cA.b();
                    Pair<Surface, F> pair = iVar.f57340p;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        F f10 = (F) pair.second;
                        G(surface, f10.b(), f10.a());
                    }
                    iVar.f57331g.g(tVar);
                    iVar.f57342r = 1;
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
            ((C) C13599a.e(iVar.f57338n)).e(i10);
            iVar.f57349y++;
            VideoSink videoSink = iVar.f57331g;
            c cVar = new c(this, aVar);
            final InterfaceC13612n interfaceC13612n = (InterfaceC13612n) C13599a.e(iVar.f57337m);
            Objects.requireNonNull(interfaceC13612n);
            videoSink.B(cVar, new Executor() { // from class: v3.d
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    interfaceC13612n.post(runnable);
                }
            });
            return iVar.f57338n.a(i10);
        } catch (VideoFrameProcessingException e12) {
            throw new VideoSink.VideoSinkException(e12, tVar);
        }
    }

    public static /* synthetic */ void a(Runnable runnable) {
    }

    private i(b bVar) {
        this.f57325a = bVar.f57351a;
        this.f57326b = new I<>();
        this.f57327c = (C.a) C13599a.i(bVar.f57354d);
        this.f57328d = new SparseArray<>();
        this.f57329e = bVar.f57355e;
        this.f57330f = bVar.f57356f;
        InterfaceC13606h interfaceC13606h = bVar.f57357g;
        this.f57333i = interfaceC13606h;
        this.f57331g = new androidx.media3.exoplayer.video.d(bVar.f57352b, interfaceC13606h);
        this.f57332h = new a();
        this.f57334j = new CopyOnWriteArraySet<>();
        this.f57335k = bVar.f57358h;
        this.f57336l = new t.b().N();
        this.f57344t = -9223372036854775807L;
        this.f57345u = -9223372036854775807L;
        this.f57348x = -1;
        this.f57342r = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C5653j B(C5653j c5653j) {
        return (c5653j == null || !c5653j.g()) ? C5653j.f44655h : c5653j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D() {
        return this.f57341q == 0 && this.f57346v && this.f57331g.c();
    }

    private boolean E() {
        return this.f57342r == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean F(boolean z10) {
        return this.f57331g.n(z10 && this.f57341q == 0);
    }

    private void G(Surface surface, int i10, int i11) {
        C c10 = this.f57338n;
        if (c10 == null) {
            return;
        }
        if (surface != null) {
            c10.d(new E(surface, i10, i11));
            this.f57331g.r(surface, new F(i10, i11));
        } else {
            c10.d(null);
            this.f57331g.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(long j10, long j11) throws VideoSink.VideoSinkException {
        this.f57331g.h(j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(long j10) {
        this.f57347w = j10;
        this.f57331g.j(this.f57339o, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(float f10) {
        this.f57331g.u(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O(v3.h hVar) {
        this.f57331g.o(hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean P() {
        int i10 = this.f57348x;
        return i10 != -1 && i10 == this.f57349y;
    }

    public static /* synthetic */ void b(i iVar) {
        iVar.f57341q--;
    }

    public VideoSink C(int i10) {
        C13599a.g(!P.q(this.f57328d, i10));
        d dVar = new d(this.f57325a, i10);
        y(dVar);
        this.f57328d.put(i10, dVar);
        return dVar;
    }

    public void I() {
        if (this.f57342r == 2) {
            return;
        }
        InterfaceC13612n interfaceC13612n = this.f57337m;
        if (interfaceC13612n != null) {
            interfaceC13612n.e(null);
        }
        C c10 = this.f57338n;
        if (c10 != null) {
            c10.release();
        }
        this.f57340p = null;
        this.f57342r = 2;
    }

    public void L(Surface surface, F f10) {
        Pair<Surface, F> pair = this.f57340p;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((F) this.f57340p.second).equals(f10)) {
            return;
        }
        this.f57340p = Pair.create(surface, f10);
        G(surface, f10.b(), f10.a());
    }

    public void N(int i10) {
        this.f57348x = i10;
    }

    public void y(e eVar) {
        this.f57334j.add(eVar);
    }

    public void z() {
        F f10 = F.f127870c;
        G(null, f10.b(), f10.a());
        this.f57340p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        if (!E()) {
            return;
        }
        this.f57341q++;
        this.f57331g.w(z10);
        while (this.f57326b.l() > 1) {
            this.f57326b.i();
        }
        if (this.f57326b.l() == 1) {
            this.f57331g.j(((Long) C13599a.e(this.f57326b.i())).longValue(), this.f57347w);
        }
        this.f57344t = -9223372036854775807L;
        this.f57345u = -9223372036854775807L;
        this.f57346v = false;
        ((InterfaceC13612n) C13599a.i(this.f57337m)).post(new Runnable() { // from class: v3.e
            @Override // java.lang.Runnable
            public final void run() {
                androidx.media3.exoplayer.video.i.b(this.f165480a);
            }
        });
    }
}
