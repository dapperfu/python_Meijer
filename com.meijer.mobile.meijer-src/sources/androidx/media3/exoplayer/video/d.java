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
import d3.C13599a;
import d3.F;
import d3.InterfaceC13606h;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class d implements VideoSink {

    /* renamed from: a, reason: collision with root package name */
    private final n f57240a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13606h f57241b;

    /* renamed from: c, reason: collision with root package name */
    private final o f57242c;

    /* renamed from: d, reason: collision with root package name */
    private final Queue<VideoSink.b> f57243d;

    /* renamed from: e, reason: collision with root package name */
    private Surface f57244e;

    /* renamed from: f, reason: collision with root package name */
    private t f57245f;

    /* renamed from: g, reason: collision with root package name */
    private long f57246g;

    /* renamed from: h, reason: collision with root package name */
    private long f57247h;

    /* renamed from: i, reason: collision with root package name */
    private VideoSink.a f57248i;

    /* renamed from: j, reason: collision with root package name */
    private Executor f57249j;

    /* renamed from: k, reason: collision with root package name */
    private v3.h f57250k;

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements o.a {

        /* renamed from: a, reason: collision with root package name */
        private t f57251a;

        private b() {
        }

        @Override // androidx.media3.exoplayer.video.o.a
        public void a() {
            d.this.f57249j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.f
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = this.f57254a;
                    d.this.f57248i.c(d.this);
                }
            });
            ((VideoSink.b) d.this.f57243d.remove()).skip();
        }

        @Override // androidx.media3.exoplayer.video.o.a
        public void b(long j10, long j11, boolean z10) {
            if (z10 && d.this.f57244e != null) {
                d.this.f57249j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.b bVar = this.f57253a;
                        d.this.f57248i.b(d.this);
                    }
                });
            }
            t tVarN = this.f57251a;
            if (tVarN == null) {
                tVarN = new t.b().N();
            }
            d.this.f57250k.a(j11, d.this.f57241b.b(), tVarN, null);
            ((VideoSink.b) d.this.f57243d.remove()).a(j10);
        }

        @Override // androidx.media3.exoplayer.video.o.a
        public void e(final N n10) {
            this.f57251a = new t.b().z0(n10.f44585a).d0(n10.f44586b).u0("video/raw").N();
            d.this.f57249j.execute(new Runnable() { // from class: androidx.media3.exoplayer.video.g
                @Override // java.lang.Runnable
                public final void run() {
                    d.b bVar = this.f57255a;
                    d.this.f57248i.a(d.this, n10);
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
        this.f57244e = null;
        this.f57240a.q(null);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void A(boolean z10) {
        this.f57240a.e(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void B(VideoSink.a aVar, Executor executor) {
        this.f57248i = aVar;
        this.f57249j = executor;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public Surface b() {
        return (Surface) C13599a.i(this.f57244e);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean c() {
        return this.f57242c.d();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void e() {
        this.f57240a.a();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public boolean f(long j10, boolean z10, VideoSink.b bVar) {
        this.f57243d.add(bVar);
        this.f57242c.g(j10 - this.f57247h);
        return true;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void h(long j10, long j11) throws VideoSink.VideoSinkException {
        try {
            this.f57242c.j(j10, j11);
        } catch (ExoPlaybackException e10) {
            throw new VideoSink.VideoSinkException(e10, this.f57245f);
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void i() {
        this.f57242c.l();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void j(long j10, long j11) {
        if (j10 != this.f57246g) {
            this.f57242c.h(j10);
            this.f57246g = j10;
        }
        this.f57247h = j11;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void k() {
        this.f57240a.l();
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
        return this.f57240a.d(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void o(v3.h hVar) {
        this.f57250k = hVar;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void p(boolean z10) {
        this.f57240a.h(z10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void q() {
        this.f57240a.k();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void r(Surface surface, F f10) {
        this.f57244e = surface;
        this.f57240a.q(surface);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void s() {
        this.f57240a.g();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void t(int i10) {
        this.f57240a.n(i10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void u(float f10) {
        this.f57240a.r(f10);
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void w(boolean z10) {
        if (z10) {
            this.f57240a.m();
        }
        this.f57242c.b();
        this.f57243d.clear();
    }

    public d(n nVar, InterfaceC13606h interfaceC13606h) {
        this.f57240a = nVar;
        nVar.o(interfaceC13606h);
        this.f57241b = interfaceC13606h;
        this.f57242c = new o(new b(), nVar);
        this.f57243d = new ArrayDeque();
        this.f57245f = new t.b().N();
        this.f57246g = -9223372036854775807L;
        this.f57248i = VideoSink.a.f57238a;
        this.f57249j = new Executor() { // from class: androidx.media3.exoplayer.video.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                d.d(runnable);
            }
        };
        this.f57250k = new v3.h() { // from class: androidx.media3.exoplayer.video.c
            @Override // v3.h
            public final void a(long j10, long j11, t tVar, MediaFormat mediaFormat) {
                d.x(j10, j11, tVar, mediaFormat);
            }
        };
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public void y(int i10, t tVar, List<Object> list) {
        C13599a.g(list.isEmpty());
        int i11 = tVar.f44774v;
        t tVar2 = this.f57245f;
        if (i11 != tVar2.f44774v || tVar.f44775w != tVar2.f44775w) {
            this.f57242c.i(i11, tVar.f44775w);
        }
        float f10 = tVar.f44776x;
        if (f10 != this.f57245f.f44776x) {
            this.f57240a.p(f10);
        }
        this.f57245f = tVar;
    }
}
