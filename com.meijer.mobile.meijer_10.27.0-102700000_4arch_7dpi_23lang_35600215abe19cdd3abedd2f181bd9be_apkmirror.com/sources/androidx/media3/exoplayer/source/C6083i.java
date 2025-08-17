package androidx.media3.exoplayer.source;

import U3.r;
import a3.InterfaceC5563c;
import a3.t;
import a3.v;
import android.content.Context;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C6083i;
import androidx.media3.exoplayer.source.C6086l;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.I;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.a;
import androidx.media3.exoplayer.source.r;
import com.google.android.gms.common.api.a;
import d3.C13466a;
import d3.P;
import f3.InterfaceC13839d;
import f3.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import x3.C18007l;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.O;

/* renamed from: androidx.media3.exoplayer.source.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6083i implements t {

    /* renamed from: c, reason: collision with root package name */
    private final a f56864c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13839d.a f56865d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f56866e;

    /* renamed from: f, reason: collision with root package name */
    private r.a f56867f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6084j f56868g;

    /* renamed from: h, reason: collision with root package name */
    private a.b f56869h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC5563c f56870i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f56871j;

    /* renamed from: k, reason: collision with root package name */
    private long f56872k;

    /* renamed from: l, reason: collision with root package name */
    private long f56873l;

    /* renamed from: m, reason: collision with root package name */
    private long f56874m;

    /* renamed from: n, reason: collision with root package name */
    private float f56875n;

    /* renamed from: o, reason: collision with root package name */
    private float f56876o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f56877p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.source.i$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final x3.u f56878a;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC13839d.a f56881d;

        /* renamed from: f, reason: collision with root package name */
        private r.a f56883f;

        /* renamed from: g, reason: collision with root package name */
        private int f56884g;

        /* renamed from: h, reason: collision with root package name */
        private t3.e f56885h;

        /* renamed from: i, reason: collision with root package name */
        private k3.k f56886i;

        /* renamed from: j, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56887j;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Integer, Be.w<r.a>> f56879b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map<Integer, r.a> f56880c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private boolean f56882e = true;

        private void f() {
            j(0);
            j(1);
            j(2);
            j(3);
            j(4);
        }

        private Be.w<r.a> i(int i10) throws ClassNotFoundException {
            Be.w<r.a> wVar;
            Be.w<r.a> wVar2;
            Be.w<r.a> wVar3 = this.f56879b.get(Integer.valueOf(i10));
            if (wVar3 != null) {
                return wVar3;
            }
            final InterfaceC13839d.a aVar = (InterfaceC13839d.a) C13466a.e(this.f56881d);
            if (i10 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(r.a.class);
                wVar = new Be.w() { // from class: androidx.media3.exoplayer.source.d
                    @Override // Be.w
                    public final Object get() {
                        return C6083i.q(clsAsSubclass, aVar);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(r.a.class);
                wVar = new Be.w() { // from class: androidx.media3.exoplayer.source.e
                    @Override // Be.w
                    public final Object get() {
                        return C6083i.q(clsAsSubclass2, aVar);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(r.a.class);
                        wVar2 = new Be.w() { // from class: androidx.media3.exoplayer.source.g
                            @Override // Be.w
                            public final Object get() {
                                return C6083i.p(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        wVar2 = new Be.w() { // from class: androidx.media3.exoplayer.source.h
                            @Override // Be.w
                            public final Object get() {
                                return C6083i.a.c(this.f56862a, aVar);
                            }
                        };
                    }
                    this.f56879b.put(Integer.valueOf(i10), wVar2);
                    return wVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(r.a.class);
                wVar = new Be.w() { // from class: androidx.media3.exoplayer.source.f
                    @Override // Be.w
                    public final Object get() {
                        return C6083i.q(clsAsSubclass4, aVar);
                    }
                };
            }
            wVar2 = wVar;
            this.f56879b.put(Integer.valueOf(i10), wVar2);
            return wVar2;
        }

        public r.a g(int i10) throws ClassNotFoundException {
            r.a aVar = this.f56880c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            r.a aVar2 = i(i10).get();
            t3.e eVar = this.f56885h;
            if (eVar != null) {
                aVar2.h(eVar);
            }
            k3.k kVar = this.f56886i;
            if (kVar != null) {
                aVar2.c(kVar);
            }
            androidx.media3.exoplayer.upstream.b bVar = this.f56887j;
            if (bVar != null) {
                aVar2.f(bVar);
            }
            aVar2.a(this.f56883f);
            aVar2.g(this.f56882e);
            aVar2.b(this.f56884g);
            this.f56880c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void k(t3.e eVar) {
            this.f56885h = eVar;
            Iterator<r.a> it = this.f56880c.values().iterator();
            while (it.hasNext()) {
                it.next().h(eVar);
            }
        }

        public void l(int i10) {
            this.f56884g = i10;
            this.f56878a.b(i10);
        }

        public void m(InterfaceC13839d.a aVar) {
            if (aVar != this.f56881d) {
                this.f56881d = aVar;
                this.f56879b.clear();
                this.f56880c.clear();
            }
        }

        public void n(k3.k kVar) {
            this.f56886i = kVar;
            Iterator<r.a> it = this.f56880c.values().iterator();
            while (it.hasNext()) {
                it.next().c(kVar);
            }
        }

        public void o(int i10) {
            x3.u uVar = this.f56878a;
            if (uVar instanceof C18007l) {
                ((C18007l) uVar).n(i10);
            }
        }

        public void p(androidx.media3.exoplayer.upstream.b bVar) {
            this.f56887j = bVar;
            Iterator<r.a> it = this.f56880c.values().iterator();
            while (it.hasNext()) {
                it.next().f(bVar);
            }
        }

        public void q(boolean z10) {
            this.f56882e = z10;
            this.f56878a.c(z10);
            Iterator<r.a> it = this.f56880c.values().iterator();
            while (it.hasNext()) {
                it.next().g(z10);
            }
        }

        public void r(r.a aVar) {
            this.f56883f = aVar;
            this.f56878a.a(aVar);
            Iterator<r.a> it = this.f56880c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }

        public a(x3.u uVar, r.a aVar) {
            this.f56878a = uVar;
            this.f56883f = aVar;
        }

        public static /* synthetic */ r.a c(a aVar, InterfaceC13839d.a aVar2) {
            aVar.getClass();
            return new C.b(aVar2, aVar.f56878a);
        }

        private Be.w<r.a> j(int i10) {
            try {
                return i(i10);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public int[] h() {
            f();
            return He.f.l(this.f56879b.keySet());
        }
    }

    public C6083i(Context context) {
        this(new h.a(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a p(Class<? extends r.a> cls) {
        try {
            return cls.getConstructor(null).newInstance(null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.source.i$b */
    public static final class b implements InterfaceC18011p {

        /* renamed from: a, reason: collision with root package name */
        private final a3.t f56888a;

        @Override // x3.InterfaceC18011p
        public void a(long j10, long j11) {
        }

        @Override // x3.InterfaceC18011p
        public void c(x3.r rVar) {
            O oT = rVar.t(0, 3);
            rVar.g(new J.b(-9223372036854775807L));
            rVar.p();
            oT.b(this.f56888a.b().u0("text/x-unknown").S(this.f56888a.f43949o).N());
        }

        @Override // x3.InterfaceC18011p
        public boolean j(InterfaceC18012q interfaceC18012q) {
            return true;
        }

        @Override // x3.InterfaceC18011p
        public void release() {
        }

        public b(a3.t tVar) {
            this.f56888a = tVar;
        }

        @Override // x3.InterfaceC18011p
        public int b(InterfaceC18012q interfaceC18012q, x3.I i10) throws IOException {
            if (interfaceC18012q.a(a.e.API_PRIORITY_OTHER) == -1) {
                return -1;
            }
            return 0;
        }
    }

    public C6083i(Context context, x3.u uVar) {
        this(new h.a(context), uVar);
    }

    public static /* synthetic */ InterfaceC18011p[] i(C6083i c6083i, a3.t tVar) {
        return new InterfaceC18011p[]{c6083i.f56866e.a(tVar) ? new U3.n(c6083i.f56866e.c(tVar), null) : new b(tVar)};
    }

    private static r n(a3.v vVar, r rVar) {
        v.d dVar = vVar.f44016f;
        return (dVar.f44047b == 0 && dVar.f44049d == Long.MIN_VALUE && !dVar.f44051f) ? rVar : new ClippingMediaSource.b(rVar).m(vVar.f44016f.f44047b).k(vVar.f44016f.f44049d).j(!vVar.f44016f.f44052g).i(vVar.f44016f.f44050e).l(vVar.f44016f.f44051f).h();
    }

    private r o(a3.v vVar, r rVar) {
        C13466a.e(vVar.f44012b);
        v.b bVar = vVar.f44012b.f44113d;
        if (bVar == null) {
            return rVar;
        }
        a.b bVar2 = this.f56869h;
        InterfaceC5563c interfaceC5563c = this.f56870i;
        if (bVar2 == null || interfaceC5563c == null) {
            d3.r.i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return rVar;
        }
        androidx.media3.exoplayer.source.ads.a aVarA = bVar2.a(bVar);
        if (aVarA == null) {
            d3.r.i("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
            return rVar;
        }
        f3.g gVar = new f3.g(bVar.f44020a);
        Object objB = bVar.f44021b;
        if (objB == null) {
            objB = Ce.L.B(vVar.f44011a, vVar.f44012b.f44110a, bVar.f44020a);
        }
        return new AdsMediaSource(rVar, gVar, objB, this, aVarA, interfaceC5563c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a q(Class<? extends r.a> cls, InterfaceC13839d.a aVar) {
        try {
            return cls.getConstructor(InterfaceC13839d.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public int[] d() {
        return this.f56864c.h();
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public r e(a3.v vVar) {
        C13466a.e(vVar.f44012b);
        String scheme = vVar.f44012b.f44110a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((r.a) C13466a.e(this.f56867f)).e(vVar);
        }
        if (Objects.equals(vVar.f44012b.f44111b, "application/x-image-uri")) {
            return new C6086l.b(P.M0(vVar.f44012b.f44119j), (InterfaceC6084j) C13466a.e(this.f56868g)).e(vVar);
        }
        v.h hVar = vVar.f44012b;
        int iW0 = P.w0(hVar.f44110a, hVar.f44111b);
        if (vVar.f44012b.f44119j != -9223372036854775807L) {
            this.f56864c.o(1);
        }
        try {
            r.a aVarG = this.f56864c.g(iW0);
            v.g.a aVarA = vVar.f44014d.a();
            if (vVar.f44014d.f44092a == -9223372036854775807L) {
                aVarA.k(this.f56872k);
            }
            if (vVar.f44014d.f44095d == -3.4028235E38f) {
                aVarA.j(this.f56875n);
            }
            if (vVar.f44014d.f44096e == -3.4028235E38f) {
                aVarA.h(this.f56876o);
            }
            if (vVar.f44014d.f44093b == -9223372036854775807L) {
                aVarA.i(this.f56873l);
            }
            if (vVar.f44014d.f44094c == -9223372036854775807L) {
                aVarA.g(this.f56874m);
            }
            v.g gVarF = aVarA.f();
            if (!gVarF.equals(vVar.f44014d)) {
                vVar = vVar.a().d(gVarF).a();
            }
            r rVarE = aVarG.e(vVar);
            Ce.L<v.k> l10 = ((v.h) P.h(vVar.f44012b)).f44116g;
            if (!l10.isEmpty()) {
                r[] rVarArr = new r[l10.size() + 1];
                rVarArr[0] = rVarE;
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    if (this.f56877p) {
                        final a3.t tVarN = new t.b().u0(l10.get(i10).f44138b).j0(l10.get(i10).f44139c).w0(l10.get(i10).f44140d).s0(l10.get(i10).f44141e).h0(l10.get(i10).f44142f).f0(l10.get(i10).f44143g).N();
                        C.b bVar = new C.b(this.f56865d, new x3.u() { // from class: p3.g
                            @Override // x3.u
                            public final InterfaceC18011p[] f() {
                                return C6083i.i(this.f155417b, tVarN);
                            }
                        });
                        if (this.f56866e.a(tVarN)) {
                            tVarN = tVarN.b().u0("application/x-media3-cues").S(tVarN.f43949o).W(this.f56866e.b(tVarN)).N();
                        }
                        C.b bVarK = bVar.k(0, tVarN);
                        androidx.media3.exoplayer.upstream.b bVar2 = this.f56871j;
                        if (bVar2 != null) {
                            bVarK.f(bVar2);
                        }
                        rVarArr[i10 + 1] = bVarK.e(a3.v.b(l10.get(i10).f44137a.toString()));
                    } else {
                        I.b bVar3 = new I.b(this.f56865d);
                        androidx.media3.exoplayer.upstream.b bVar4 = this.f56871j;
                        if (bVar4 != null) {
                            bVar3.b(bVar4);
                        }
                        rVarArr[i10 + 1] = bVar3.a(l10.get(i10), -9223372036854775807L);
                    }
                }
                rVarE = new MergingMediaSource(rVarArr);
            }
            return o(vVar, n(vVar, rVarE));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    @Deprecated
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C6083i g(boolean z10) {
        this.f56877p = z10;
        this.f56864c.q(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6083i b(int i10) {
        this.f56864c.l(i10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C6083i h(t3.e eVar) {
        this.f56864c.k((t3.e) C13466a.e(eVar));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C6083i c(k3.k kVar) {
        this.f56864c.n((k3.k) C13466a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C6083i f(androidx.media3.exoplayer.upstream.b bVar) {
        this.f56871j = (androidx.media3.exoplayer.upstream.b) C13466a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f56864c.p(bVar);
        return this;
    }

    public C6083i(InterfaceC13839d.a aVar) {
        this(aVar, new C18007l());
    }

    public C6083i u(a.b bVar, InterfaceC5563c interfaceC5563c) {
        this.f56869h = (a.b) C13466a.e(bVar);
        this.f56870i = (InterfaceC5563c) C13466a.e(interfaceC5563c);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C6083i a(r.a aVar) {
        this.f56866e = (r.a) C13466a.e(aVar);
        this.f56864c.r(aVar);
        return this;
    }

    public C6083i(InterfaceC13839d.a aVar, x3.u uVar) {
        this.f56865d = aVar;
        U3.h hVar = new U3.h();
        this.f56866e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f56864c = aVar2;
        aVar2.m(aVar);
        this.f56872k = -9223372036854775807L;
        this.f56873l = -9223372036854775807L;
        this.f56874m = -9223372036854775807L;
        this.f56875n = -3.4028235E38f;
        this.f56876o = -3.4028235E38f;
        this.f56877p = true;
    }
}
