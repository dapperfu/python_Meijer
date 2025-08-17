package androidx.media3.exoplayer.video;

import a3.N;
import a3.t;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.video.VideoSink;
import androidx.media3.exoplayer.video.d;
import androidx.media3.exoplayer.video.o;
import d3.C13466a;
import d3.F;
import d3.InterfaceC13473h;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class d implements VideoSink {

    /* renamed from: a, reason: collision with root package name */
    private final n f57016a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13473h f57017b;

    /* renamed from: c, reason: collision with root package name */
    private final o f57018c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<VideoSink.b> f57019d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f57020e;

    /* renamed from: f, reason: collision with root package name */
    private t f57021f;

    /* renamed from: g, reason: collision with root package name */
    private long f57022g;

    /* renamed from: h, reason: collision with root package name */
    private long f57023h;

    /* renamed from: i, reason: collision with root package name */
    private VideoSink.a f57024i;

    /* renamed from: j, reason: collision with root package name */
    private Executor f57025j;

    /* renamed from: k, reason: collision with root package name */
    private v3.h f57026k;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements o.a {

        /* renamed from: a, reason: collision with root package name */
        private t f57027a;

        private b() {
        }

        @Override // androidx.media3.exoplayer.video.o.a
        public void a() {
            d.this.f57025j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = this.f57030a;
                    d.this.f57024i.c(d.this);
                }
            });
            ((VideoSink.b) d.this.f57019d.remove()).skip();
        }

        @Override // androidx.media3.exoplayer.video.o.a
        public void b(long j10, long j11, boolean z10) {
            if (z10 && d.this.f57020e != null) {
                d.this.f57025j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b bVar = this.f57029a;
                        d.this.f57024i.b(d.this);
                    }
                });
            }
            t tVarN = this.f57027a;
            if (tVarN == null) {
                tVarN = new t.b().N();
            }
            d.this.f57026k.a(j11, d.this.f57017b.b(), tVarN, null);
            ((VideoSink.b) d.this.f57019d.remove()).a(j10);
        }

        @Override // androidx.media3.exoplayer.video.o.a
        public void e(final N n10) {
            this.f57027a = new t.b().z0(n10.f43767a).d0(n10.f43768b).u0("video/raw").N();
            d.this.f57025j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = this.f57031a;
                    d.this.f57024i.a(d.this, n10);
                }
            });
        }
    }

    public static /* synthetic */ void d(Runnable runnable) {
    }

    public static /* synthetic */ void x(long j10, long j11, t tVar, MediaFormat mediaFormat) {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean a() {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean g(t tVar) {
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void release() {
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void v() {
        this.f57020e = null;
        this.f57016a.q(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void A(boolean z10) {
        this.f57016a.e(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void B(VideoSink.a aVar, Executor executor) {
        this.f57024i = aVar;
        this.f57025j = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface b() {
        return (Surface) C13466a.i(this.f57020e);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean c() {
        return this.f57018c.d();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void e() {
        this.f57016a.a();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean f(long j10, boolean z10, VideoSink.b bVar) {
        this.f57019d.add(bVar);
        this.f57018c.g(j10 - this.f57023h);
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void h(long j10, long j11) throws VideoSink.VideoSinkException {
        try {
            this.f57018c.j(j10, j11);
        } catch (ExoPlaybackException e10) {
            throw new VideoSink.VideoSinkException(e10, this.f57021f);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void i() {
        this.f57018c.l();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void j(long j10, long j11) {
        if (j10 != this.f57022g) {
            this.f57018c.h(j10);
            this.f57022g = j10;
        }
        this.f57023h = j11;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void k() {
        this.f57016a.l();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void l(H0.a aVar) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void m(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean n(boolean z10) {
        return this.f57016a.d(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void o(v3.h hVar) {
        this.f57026k = hVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void p(boolean z10) {
        this.f57016a.h(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void q() {
        this.f57016a.k();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void r(Surface surface, F f10) {
        this.f57020e = surface;
        this.f57016a.q(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void s() {
        this.f57016a.g();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void t(int i10) {
        this.f57016a.n(i10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void u(float f10) {
        this.f57016a.r(f10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void w(boolean z10) {
        if (z10) {
            this.f57016a.m();
        }
        this.f57018c.b();
        this.f57019d.clear();
    }

    public d(n nVar, InterfaceC13473h interfaceC13473h) {
        this.f57016a = nVar;
        nVar.o(interfaceC13473h);
        this.f57017b = interfaceC13473h;
        this.f57018c = new o(new b(), nVar);
        this.f57019d = new ArrayDeque();
        this.f57021f = new t.b().N();
        this.f57022g = -9223372036854775807L;
        this.f57024i = VideoSink.a.f57014a;
        this.f57025j = new Executor() { // from class: androidx.media3.exoplayer.video.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                d.d(runnable);
            }
        };
        this.f57026k = new v3.h() { // from class: androidx.media3.exoplayer.video.c
            @Override // v3.h
            public final void a(long j10, long j11, t tVar, MediaFormat mediaFormat) {
                d.x(j10, j11, tVar, mediaFormat);
            }
        };
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void y(int i10, t tVar, List<Object> list) {
        C13466a.g(list.isEmpty());
        int i11 = tVar.f43956v;
        t tVar2 = this.f57021f;
        if (i11 != tVar2.f43956v || tVar.f43957w != tVar2.f43957w) {
            this.f57018c.i(i11, tVar.f43957w);
        }
        float f10 = tVar.f43958x;
        if (f10 != this.f57021f.f43958x) {
            this.f57016a.p(f10);
        }
        this.f57021f = tVar;
    }
}
