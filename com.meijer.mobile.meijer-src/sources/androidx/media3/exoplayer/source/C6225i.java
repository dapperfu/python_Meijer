package androidx.media3.exoplayer.source;

import U3.r;
import a3.InterfaceC5646c;
import a3.t;
import a3.v;
import android.content.Context;
import androidx.media3.exoplayer.source.C;
import androidx.media3.exoplayer.source.C6225i;
import androidx.media3.exoplayer.source.C6228l;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.I;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.a;
import androidx.media3.exoplayer.source.r;
import com.google.android.gms.common.api.a;
import d3.C13599a;
import d3.P;
import f3.InterfaceC13949d;
import f3.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import x3.C18073l;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.O;

/* renamed from: androidx.media3.exoplayer.source.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6225i implements t {

    /* renamed from: c, reason: collision with root package name */
    private final a f57088c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC13949d.a f57089d;

    /* renamed from: e, reason: collision with root package name */
    private r.a f57090e;

    /* renamed from: f, reason: collision with root package name */
    private r.a f57091f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC6226j f57092g;

    /* renamed from: h, reason: collision with root package name */
    private a.b f57093h;

    /* renamed from: i, reason: collision with root package name */
    private InterfaceC5646c f57094i;

    /* renamed from: j, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f57095j;

    /* renamed from: k, reason: collision with root package name */
    private long f57096k;

    /* renamed from: l, reason: collision with root package name */
    private long f57097l;

    /* renamed from: m, reason: collision with root package name */
    private long f57098m;

    /* renamed from: n, reason: collision with root package name */
    private float f57099n;

    /* renamed from: o, reason: collision with root package name */
    private float f57100o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f57101p;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.media3.exoplayer.source.i$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final x3.u f57102a;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC13949d.a f57105d;

        /* renamed from: f, reason: collision with root package name */
        private r.a f57107f;

        /* renamed from: g, reason: collision with root package name */
        private int f57108g;

        /* renamed from: h, reason: collision with root package name */
        private t3.e f57109h;

        /* renamed from: i, reason: collision with root package name */
        private k3.k f57110i;

        /* renamed from: j, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f57111j;

        /* renamed from: b, reason: collision with root package name */
        private final Map<Integer, De.w<r.a>> f57103b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final Map<Integer, r.a> f57104c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private boolean f57106e = true;

        private void f() {
            j(0);
            j(1);
            j(2);
            j(3);
            j(4);
        }

        private De.w<r.a> i(int i10) throws ClassNotFoundException {
            De.w<r.a> wVar;
            De.w<r.a> wVar2;
            De.w<r.a> wVar3 = this.f57103b.get(Integer.valueOf(i10));
            if (wVar3 != null) {
                return wVar3;
            }
            final InterfaceC13949d.a aVar = (InterfaceC13949d.a) C13599a.e(this.f57105d);
            if (i10 == 0) {
                final Class<? extends U> clsAsSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(r.a.class);
                wVar = new De.w() { // from class: androidx.media3.exoplayer.source.d
                    @Override // De.w
                    public final Object get() {
                        return C6225i.q(clsAsSubclass, aVar);
                    }
                };
            } else if (i10 == 1) {
                final Class<? extends U> clsAsSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(r.a.class);
                wVar = new De.w() { // from class: androidx.media3.exoplayer.source.e
                    @Override // De.w
                    public final Object get() {
                        return C6225i.q(clsAsSubclass2, aVar);
                    }
                };
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        final Class<? extends U> clsAsSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(r.a.class);
                        wVar2 = new De.w() { // from class: androidx.media3.exoplayer.source.g
                            @Override // De.w
                            public final Object get() {
                                return C6225i.p(clsAsSubclass3);
                            }
                        };
                    } else {
                        if (i10 != 4) {
                            throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                        }
                        wVar2 = new De.w() { // from class: androidx.media3.exoplayer.source.h
                            @Override // De.w
                            public final Object get() {
                                return C6225i.a.c(this.f57086a, aVar);
                            }
                        };
                    }
                    this.f57103b.put(Integer.valueOf(i10), wVar2);
                    return wVar2;
                }
                final Class<? extends U> clsAsSubclass4 = Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(r.a.class);
                wVar = new De.w() { // from class: androidx.media3.exoplayer.source.f
                    @Override // De.w
                    public final Object get() {
                        return C6225i.q(clsAsSubclass4, aVar);
                    }
                };
            }
            wVar2 = wVar;
            this.f57103b.put(Integer.valueOf(i10), wVar2);
            return wVar2;
        }

        public r.a g(int i10) throws ClassNotFoundException {
            r.a aVar = this.f57104c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            r.a aVar2 = i(i10).get();
            t3.e eVar = this.f57109h;
            if (eVar != null) {
                aVar2.h(eVar);
            }
            k3.k kVar = this.f57110i;
            if (kVar != null) {
                aVar2.c(kVar);
            }
            androidx.media3.exoplayer.upstream.b bVar = this.f57111j;
            if (bVar != null) {
                aVar2.f(bVar);
            }
            aVar2.a(this.f57107f);
            aVar2.g(this.f57106e);
            aVar2.b(this.f57108g);
            this.f57104c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void k(t3.e eVar) {
            this.f57109h = eVar;
            Iterator<r.a> it = this.f57104c.values().iterator();
            while (it.hasNext()) {
                it.next().h(eVar);
            }
        }

        public void l(int i10) {
            this.f57108g = i10;
            this.f57102a.b(i10);
        }

        public void m(InterfaceC13949d.a aVar) {
            if (aVar != this.f57105d) {
                this.f57105d = aVar;
                this.f57103b.clear();
                this.f57104c.clear();
            }
        }

        public void n(k3.k kVar) {
            this.f57110i = kVar;
            Iterator<r.a> it = this.f57104c.values().iterator();
            while (it.hasNext()) {
                it.next().c(kVar);
            }
        }

        public void o(int i10) {
            x3.u uVar = this.f57102a;
            if (uVar instanceof C18073l) {
                ((C18073l) uVar).n(i10);
            }
        }

        public void p(androidx.media3.exoplayer.upstream.b bVar) {
            this.f57111j = bVar;
            Iterator<r.a> it = this.f57104c.values().iterator();
            while (it.hasNext()) {
                it.next().f(bVar);
            }
        }

        public void q(boolean z10) {
            this.f57106e = z10;
            this.f57102a.c(z10);
            Iterator<r.a> it = this.f57104c.values().iterator();
            while (it.hasNext()) {
                it.next().g(z10);
            }
        }

        public void r(r.a aVar) {
            this.f57107f = aVar;
            this.f57102a.a(aVar);
            Iterator<r.a> it = this.f57104c.values().iterator();
            while (it.hasNext()) {
                it.next().a(aVar);
            }
        }

        public a(x3.u uVar, r.a aVar) {
            this.f57102a = uVar;
            this.f57107f = aVar;
        }

        public static /* synthetic */ r.a c(a aVar, InterfaceC13949d.a aVar2) {
            aVar.getClass();
            return new C.b(aVar2, aVar.f57102a);
        }

        private De.w<r.a> j(int i10) {
            try {
                return i(i10);
            } catch (ClassNotFoundException unused) {
                return null;
            }
        }

        public int[] h() {
            f();
            return Je.f.l(this.f57103b.keySet());
        }
    }

    public C6225i(Context context) {
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
    public static final class b implements InterfaceC18077p {

        /* renamed from: a, reason: collision with root package name */
        private final a3.t f57112a;

        @Override // x3.InterfaceC18077p
        public void a(long j10, long j11) {
        }

        @Override // x3.InterfaceC18077p
        public void c(x3.r rVar) {
            O oT = rVar.t(0, 3);
            rVar.g(new J.b(-9223372036854775807L));
            rVar.p();
            oT.b(this.f57112a.b().u0("text/x-unknown").S(this.f57112a.f44767o).N());
        }

        @Override // x3.InterfaceC18077p
        public boolean j(InterfaceC18078q interfaceC18078q) {
            return true;
        }

        @Override // x3.InterfaceC18077p
        public void release() {
        }

        public b(a3.t tVar) {
            this.f57112a = tVar;
        }

        @Override // x3.InterfaceC18077p
        public int b(InterfaceC18078q interfaceC18078q, x3.I i10) throws IOException {
            if (interfaceC18078q.a(a.e.API_PRIORITY_OTHER) == -1) {
                return -1;
            }
            return 0;
        }
    }

    public C6225i(Context context, x3.u uVar) {
        this(new h.a(context), uVar);
    }

    public static /* synthetic */ InterfaceC18077p[] i(C6225i c6225i, a3.t tVar) {
        return new InterfaceC18077p[]{c6225i.f57090e.a(tVar) ? new U3.n(c6225i.f57090e.c(tVar), null) : new b(tVar)};
    }

    private static r n(a3.v vVar, r rVar) {
        v.d dVar = vVar.f44834f;
        return (dVar.f44865b == 0 && dVar.f44867d == Long.MIN_VALUE && !dVar.f44869f) ? rVar : new ClippingMediaSource.b(rVar).m(vVar.f44834f.f44865b).k(vVar.f44834f.f44867d).j(!vVar.f44834f.f44870g).i(vVar.f44834f.f44868e).l(vVar.f44834f.f44869f).h();
    }

    private r o(a3.v vVar, r rVar) {
        C13599a.e(vVar.f44830b);
        v.b bVar = vVar.f44830b.f44931d;
        if (bVar == null) {
            return rVar;
        }
        a.b bVar2 = this.f57093h;
        InterfaceC5646c interfaceC5646c = this.f57094i;
        if (bVar2 == null || interfaceC5646c == null) {
            d3.r.i("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return rVar;
        }
        androidx.media3.exoplayer.source.ads.a aVarA = bVar2.a(bVar);
        if (aVarA == null) {
            d3.r.i("DMediaSourceFactory", "Playing media without ads, as no AdsLoader was provided.");
            return rVar;
        }
        f3.g gVar = new f3.g(bVar.f44838a);
        Object objB = bVar.f44839b;
        if (objB == null) {
            objB = Ee.L.B(vVar.f44829a, vVar.f44830b.f44928a, bVar.f44838a);
        }
        return new AdsMediaSource(rVar, gVar, objB, this, aVarA, interfaceC5646c, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.a q(Class<? extends r.a> cls, InterfaceC13949d.a aVar) {
        try {
            return cls.getConstructor(InterfaceC13949d.a.class).newInstance(aVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public int[] d() {
        return this.f57088c.h();
    }

    @Override // androidx.media3.exoplayer.source.r.a
    public r e(a3.v vVar) {
        C13599a.e(vVar.f44830b);
        String scheme = vVar.f44830b.f44928a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((r.a) C13599a.e(this.f57091f)).e(vVar);
        }
        if (Objects.equals(vVar.f44830b.f44929b, "application/x-image-uri")) {
            return new C6228l.b(P.M0(vVar.f44830b.f44937j), (InterfaceC6226j) C13599a.e(this.f57092g)).e(vVar);
        }
        v.h hVar = vVar.f44830b;
        int iW0 = P.w0(hVar.f44928a, hVar.f44929b);
        if (vVar.f44830b.f44937j != -9223372036854775807L) {
            this.f57088c.o(1);
        }
        try {
            r.a aVarG = this.f57088c.g(iW0);
            v.g.a aVarA = vVar.f44832d.a();
            if (vVar.f44832d.f44910a == -9223372036854775807L) {
                aVarA.k(this.f57096k);
            }
            if (vVar.f44832d.f44913d == -3.4028235E38f) {
                aVarA.j(this.f57099n);
            }
            if (vVar.f44832d.f44914e == -3.4028235E38f) {
                aVarA.h(this.f57100o);
            }
            if (vVar.f44832d.f44911b == -9223372036854775807L) {
                aVarA.i(this.f57097l);
            }
            if (vVar.f44832d.f44912c == -9223372036854775807L) {
                aVarA.g(this.f57098m);
            }
            v.g gVarF = aVarA.f();
            if (!gVarF.equals(vVar.f44832d)) {
                vVar = vVar.a().d(gVarF).a();
            }
            r rVarE = aVarG.e(vVar);
            Ee.L<v.k> l10 = ((v.h) P.h(vVar.f44830b)).f44934g;
            if (!l10.isEmpty()) {
                r[] rVarArr = new r[l10.size() + 1];
                rVarArr[0] = rVarE;
                for (int i10 = 0; i10 < l10.size(); i10++) {
                    if (this.f57101p) {
                        final a3.t tVarN = new t.b().u0(l10.get(i10).f44956b).j0(l10.get(i10).f44957c).w0(l10.get(i10).f44958d).s0(l10.get(i10).f44959e).h0(l10.get(i10).f44960f).f0(l10.get(i10).f44961g).N();
                        C.b bVar = new C.b(this.f57089d, new x3.u() { // from class: p3.g
                            @Override // x3.u
                            public final InterfaceC18077p[] f() {
                                return C6225i.i(this.f156091b, tVarN);
                            }
                        });
                        if (this.f57090e.a(tVarN)) {
                            tVarN = tVarN.b().u0("application/x-media3-cues").S(tVarN.f44767o).W(this.f57090e.b(tVarN)).N();
                        }
                        C.b bVarK = bVar.k(0, tVarN);
                        androidx.media3.exoplayer.upstream.b bVar2 = this.f57095j;
                        if (bVar2 != null) {
                            bVarK.f(bVar2);
                        }
                        rVarArr[i10 + 1] = bVarK.e(a3.v.b(l10.get(i10).f44955a.toString()));
                    } else {
                        I.b bVar3 = new I.b(this.f57089d);
                        androidx.media3.exoplayer.upstream.b bVar4 = this.f57095j;
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
    public C6225i g(boolean z10) {
        this.f57101p = z10;
        this.f57088c.q(z10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6225i b(int i10) {
        this.f57088c.l(i10);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public C6225i h(t3.e eVar) {
        this.f57088c.k((t3.e) C13599a.e(eVar));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public C6225i c(k3.k kVar) {
        this.f57088c.n((k3.k) C13599a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public C6225i f(androidx.media3.exoplayer.upstream.b bVar) {
        this.f57095j = (androidx.media3.exoplayer.upstream.b) C13599a.f(bVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f57088c.p(bVar);
        return this;
    }

    public C6225i(InterfaceC13949d.a aVar) {
        this(aVar, new C18073l());
    }

    public C6225i u(a.b bVar, InterfaceC5646c interfaceC5646c) {
        this.f57093h = (a.b) C13599a.e(bVar);
        this.f57094i = (InterfaceC5646c) C13599a.e(interfaceC5646c);
        return this;
    }

    @Override // androidx.media3.exoplayer.source.r.a
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public C6225i a(r.a aVar) {
        this.f57090e = (r.a) C13599a.e(aVar);
        this.f57088c.r(aVar);
        return this;
    }

    public C6225i(InterfaceC13949d.a aVar, x3.u uVar) {
        this.f57089d = aVar;
        U3.h hVar = new U3.h();
        this.f57090e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f57088c = aVar2;
        aVar2.m(aVar);
        this.f57096k = -9223372036854775807L;
        this.f57097l = -9223372036854775807L;
        this.f57098m = -9223372036854775807L;
        this.f57099n = -3.4028235E38f;
        this.f57100o = -3.4028235E38f;
        this.f57101p = true;
    }
}
