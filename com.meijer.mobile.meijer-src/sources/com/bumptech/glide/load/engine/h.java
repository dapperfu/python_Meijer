package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import b7.InterfaceC6336a;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import s7.C17028a;

/* loaded from: classes4.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, C17028a.f {

    /* renamed from: A, reason: collision with root package name */
    private X6.a f64683A;

    /* renamed from: B, reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f64684B;

    /* renamed from: C, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f64685C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f64686D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f64687E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f64688F;

    /* renamed from: d, reason: collision with root package name */
    private final e f64692d;

    /* renamed from: e, reason: collision with root package name */
    private final o2.f<h<?>> f64693e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.d f64696h;

    /* renamed from: i, reason: collision with root package name */
    private X6.e f64697i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.g f64698j;

    /* renamed from: k, reason: collision with root package name */
    private m f64699k;

    /* renamed from: l, reason: collision with root package name */
    private int f64700l;

    /* renamed from: m, reason: collision with root package name */
    private int f64701m;

    /* renamed from: n, reason: collision with root package name */
    private Z6.a f64702n;

    /* renamed from: o, reason: collision with root package name */
    private X6.g f64703o;

    /* renamed from: p, reason: collision with root package name */
    private b<R> f64704p;

    /* renamed from: q, reason: collision with root package name */
    private int f64705q;

    /* renamed from: r, reason: collision with root package name */
    private EnumC1256h f64706r;

    /* renamed from: s, reason: collision with root package name */
    private g f64707s;

    /* renamed from: t, reason: collision with root package name */
    private long f64708t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f64709u;

    /* renamed from: v, reason: collision with root package name */
    private Object f64710v;

    /* renamed from: w, reason: collision with root package name */
    private Thread f64711w;

    /* renamed from: x, reason: collision with root package name */
    private X6.e f64712x;

    /* renamed from: y, reason: collision with root package name */
    private X6.e f64713y;

    /* renamed from: z, reason: collision with root package name */
    private Object f64714z;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f64689a = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: b, reason: collision with root package name */
    private final List<Throwable> f64690b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final s7.c f64691c = s7.c.a();

    /* renamed from: f, reason: collision with root package name */
    private final d<?> f64694f = new d<>();

    /* renamed from: g, reason: collision with root package name */
    private final f f64695g = new f();

    interface b<R> {
        void b(GlideException glideException);

        void c(Z6.c<R> cVar, X6.a aVar, boolean z10);

        void d(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final X6.a f64718a;

        c(X6.a aVar) {
            this.f64718a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public Z6.c<Z> a(Z6.c<Z> cVar) {
            return h.this.L(this.f64718a, cVar);
        }
    }

    private static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        private X6.e f64720a;

        /* renamed from: b, reason: collision with root package name */
        private X6.j<Z> f64721b;

        /* renamed from: c, reason: collision with root package name */
        private r<Z> f64722c;

        void a() {
            this.f64720a = null;
            this.f64721b = null;
            this.f64722c = null;
        }

        void b(e eVar, X6.g gVar) {
            s7.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f64720a, new com.bumptech.glide.load.engine.e(this.f64721b, this.f64722c, gVar));
            } finally {
                this.f64722c.g();
                s7.b.e();
            }
        }

        boolean c() {
            return this.f64722c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(X6.e eVar, X6.j<X> jVar, r<X> rVar) {
            this.f64720a = eVar;
            this.f64721b = jVar;
            this.f64722c = rVar;
        }

        d() {
        }
    }

    interface e {
        InterfaceC6336a a();
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f64723a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f64724b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f64725c;

        synchronized boolean b() {
            this.f64724b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f64725c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f64723a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f64724b = false;
            this.f64723a = false;
            this.f64725c = false;
        }

        private boolean a(boolean z10) {
            return (this.f64725c || z10 || this.f64724b) && this.f64723a;
        }

        f() {
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: com.bumptech.glide.load.engine.h$h, reason: collision with other inner class name */
    private enum EnumC1256h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    private void E(String str, long j10) {
        F(str, j10, null);
    }

    public void b() {
        this.f64687E = true;
        com.bumptech.glide.load.engine.f fVar = this.f64685C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64715a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64716b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f64717c;

        static {
            int[] iArr = new int[X6.c.values().length];
            f64717c = iArr;
            try {
                iArr[X6.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64717c[X6.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC1256h.values().length];
            f64716b = iArr2;
            try {
                iArr2[EnumC1256h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64716b[EnumC1256h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f64716b[EnumC1256h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64716b[EnumC1256h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64716b[EnumC1256h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f64715a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f64715a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f64715a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private X6.g B(X6.a aVar) {
        X6.g gVar = this.f64703o;
        if (Build.VERSION.SDK_INT < 26) {
            return gVar;
        }
        boolean z10 = aVar == X6.a.RESOURCE_DISK_CACHE || this.f64689a.x();
        X6.f<Boolean> fVar = com.bumptech.glide.load.resource.bitmap.s.f64926j;
        Boolean bool = (Boolean) gVar.a(fVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return gVar;
        }
        X6.g gVar2 = new X6.g();
        gVar2.b(this.f64703o);
        gVar2.d(fVar, Boolean.valueOf(z10));
        return gVar2;
    }

    private int C() {
        return this.f64698j.ordinal();
    }

    private void F(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(r7.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f64699k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        FS.log_v("DecodeJob", sb2.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void H(Z6.c<R> cVar, X6.a aVar, boolean z10) {
        r rVar;
        s7.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cVar instanceof Z6.b) {
                ((Z6.b) cVar).b();
            }
            if (this.f64694f.c()) {
                cVar = r.d(cVar);
                rVar = cVar;
            } else {
                rVar = 0;
            }
            G(cVar, aVar, z10);
            this.f64706r = EnumC1256h.ENCODE;
            try {
                if (this.f64694f.c()) {
                    this.f64694f.b(this.f64692d, this.f64703o);
                }
                J();
                s7.b.e();
            } finally {
                if (rVar != 0) {
                    rVar.g();
                }
            }
        } catch (Throwable th2) {
            s7.b.e();
            throw th2;
        }
    }

    private void J() {
        if (this.f64695g.b()) {
            N();
        }
    }

    private void K() {
        if (this.f64695g.c()) {
            N();
        }
    }

    private void N() {
        this.f64695g.e();
        this.f64694f.a();
        this.f64689a.a();
        this.f64686D = false;
        this.f64696h = null;
        this.f64697i = null;
        this.f64703o = null;
        this.f64698j = null;
        this.f64699k = null;
        this.f64704p = null;
        this.f64706r = null;
        this.f64685C = null;
        this.f64711w = null;
        this.f64712x = null;
        this.f64714z = null;
        this.f64683A = null;
        this.f64684B = null;
        this.f64708t = 0L;
        this.f64687E = false;
        this.f64710v = null;
        this.f64690b.clear();
        this.f64693e.a(this);
    }

    private void O(g gVar) {
        this.f64707s = gVar;
        this.f64704p.d(this);
    }

    private void R() {
        int i10 = a.f64715a[this.f64707s.ordinal()];
        if (i10 == 1) {
            this.f64706r = z(EnumC1256h.INITIALIZE);
            this.f64685C = w();
            P();
        } else if (i10 == 2) {
            P();
        } else {
            if (i10 == 3) {
                u();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f64707s);
        }
    }

    private void S() {
        Throwable th2;
        this.f64691c.c();
        if (!this.f64686D) {
            this.f64686D = true;
            return;
        }
        if (this.f64690b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f64690b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private <Data> Z6.c<R> p(com.bumptech.glide.load.data.d<?> dVar, Data data, X6.a aVar) throws GlideException {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = r7.g.b();
            Z6.c<R> cVarT = t(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                E("Decoded result " + cVarT, jB);
            }
            return cVarT;
        } finally {
            dVar.b();
        }
    }

    private <Data> Z6.c<R> t(Data data, X6.a aVar) throws GlideException {
        return Q(data, aVar, this.f64689a.h(data.getClass()));
    }

    private void u() {
        Z6.c<R> cVarP;
        if (Log.isLoggable("DecodeJob", 2)) {
            F("Retrieved data", this.f64708t, "data: " + this.f64714z + ", cache key: " + this.f64712x + ", fetcher: " + this.f64684B);
        }
        try {
            cVarP = p(this.f64684B, this.f64714z, this.f64683A);
        } catch (GlideException e10) {
            e10.i(this.f64713y, this.f64683A);
            this.f64690b.add(e10);
            cVarP = null;
        }
        if (cVarP != null) {
            H(cVarP, this.f64683A, this.f64688F);
        } else {
            P();
        }
    }

    private com.bumptech.glide.load.engine.f w() {
        int i10 = a.f64716b[this.f64706r.ordinal()];
        if (i10 == 1) {
            return new s(this.f64689a, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f64689a, this);
        }
        if (i10 == 3) {
            return new v(this.f64689a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f64706r);
    }

    private EnumC1256h z(EnumC1256h enumC1256h) {
        int i10 = a.f64716b[enumC1256h.ordinal()];
        if (i10 == 1) {
            return this.f64702n.a() ? EnumC1256h.DATA_CACHE : z(EnumC1256h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f64709u ? EnumC1256h.FINISHED : EnumC1256h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC1256h.FINISHED;
        }
        if (i10 == 5) {
            return this.f64702n.b() ? EnumC1256h.RESOURCE_CACHE : z(EnumC1256h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC1256h);
    }

    h<R> D(com.bumptech.glide.d dVar, Object obj, m mVar, X6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, Z6.a aVar, Map<Class<?>, X6.k<?>> map, boolean z10, boolean z11, boolean z12, X6.g gVar2, b<R> bVar, int i12) {
        this.f64689a.v(dVar, obj, eVar, i10, i11, aVar, cls, cls2, gVar, gVar2, map, z10, z11, this.f64692d);
        this.f64696h = dVar;
        this.f64697i = eVar;
        this.f64698j = gVar;
        this.f64699k = mVar;
        this.f64700l = i10;
        this.f64701m = i11;
        this.f64702n = aVar;
        this.f64709u = z12;
        this.f64703o = gVar2;
        this.f64704p = bVar;
        this.f64705q = i12;
        this.f64707s = g.INITIALIZE;
        this.f64710v = obj;
        return this;
    }

    void M(boolean z10) {
        if (this.f64695g.d(z10)) {
            N();
        }
    }

    boolean T() {
        EnumC1256h enumC1256hZ = z(EnumC1256h.INITIALIZE);
        return enumC1256hZ == EnumC1256h.RESOURCE_CACHE || enumC1256hZ == EnumC1256h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(X6.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, X6.a aVar, X6.e eVar2) {
        this.f64712x = eVar;
        this.f64714z = obj;
        this.f64684B = dVar;
        this.f64683A = aVar;
        this.f64713y = eVar2;
        this.f64688F = eVar != this.f64689a.c().get(0);
        if (Thread.currentThread() != this.f64711w) {
            O(g.DECODE_DATA);
            return;
        }
        s7.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            u();
        } finally {
            s7.b.e();
        }
    }

    @Override // s7.C17028a.f
    public s7.c e() {
        return this.f64691c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void m() {
        O(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Runnable
    public void run() {
        s7.b.c("DecodeJob#run(reason=%s, model=%s)", this.f64707s, this.f64710v);
        com.bumptech.glide.load.data.d<?> dVar = this.f64684B;
        try {
            try {
                if (this.f64687E) {
                    I();
                    if (dVar != null) {
                        dVar.b();
                    }
                    s7.b.e();
                    return;
                }
                R();
                if (dVar != null) {
                    dVar.b();
                }
                s7.b.e();
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                s7.b.e();
                throw th2;
            }
        } catch (com.bumptech.glide.load.engine.b e10) {
            throw e10;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                FS.log_d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f64687E + ", stage: " + this.f64706r, th3);
            }
            if (this.f64706r != EnumC1256h.ENCODE) {
                this.f64690b.add(th3);
                I();
            }
            if (!this.f64687E) {
                throw th3;
            }
            throw th3;
        }
    }

    h(e eVar, o2.f<h<?>> fVar) {
        this.f64692d = eVar;
        this.f64693e = fVar;
    }

    private void G(Z6.c<R> cVar, X6.a aVar, boolean z10) {
        S();
        this.f64704p.c(cVar, aVar, z10);
    }

    private void I() {
        S();
        this.f64704p.b(new GlideException("Failed to load resource", new ArrayList(this.f64690b)));
        K();
    }

    private void P() {
        this.f64711w = Thread.currentThread();
        this.f64708t = r7.g.b();
        boolean zB = false;
        while (!this.f64687E && this.f64685C != null && !(zB = this.f64685C.b())) {
            this.f64706r = z(this.f64706r);
            this.f64685C = w();
            if (this.f64706r == EnumC1256h.SOURCE) {
                O(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f64706r == EnumC1256h.FINISHED || this.f64687E) && !zB) {
            I();
        }
    }

    private <Data, ResourceType> Z6.c<R> Q(Data data, X6.a aVar, q<Data, ResourceType, R> qVar) throws GlideException {
        X6.g gVarB = B(aVar);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f64696h.i().l(data);
        try {
            return qVar.a(eVarL, gVarB, this.f64700l, this.f64701m, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    <Z> Z6.c<Z> L(X6.a aVar, Z6.c<Z> cVar) {
        Z6.c<Z> cVarTransform;
        X6.k<Z> kVar;
        X6.c cVarA;
        X6.e dVar;
        Class<?> cls = cVar.get().getClass();
        X6.j<Z> jVarN = null;
        if (aVar != X6.a.RESOURCE_DISK_CACHE) {
            X6.k<Z> kVarS = this.f64689a.s(cls);
            kVar = kVarS;
            cVarTransform = kVarS.transform(this.f64696h, cVar, this.f64700l, this.f64701m);
        } else {
            cVarTransform = cVar;
            kVar = null;
        }
        if (!cVar.equals(cVarTransform)) {
            cVar.a();
        }
        if (this.f64689a.w(cVarTransform)) {
            jVarN = this.f64689a.n(cVarTransform);
            cVarA = jVarN.a(this.f64703o);
        } else {
            cVarA = X6.c.NONE;
        }
        X6.j jVar = jVarN;
        if (this.f64702n.d(!this.f64689a.y(this.f64712x), aVar, cVarA)) {
            if (jVar != null) {
                int i10 = a.f64717c[cVarA.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        dVar = new t(this.f64689a.b(), this.f64712x, this.f64697i, this.f64700l, this.f64701m, kVar, cls, this.f64703o);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + cVarA);
                    }
                } else {
                    dVar = new com.bumptech.glide.load.engine.d(this.f64712x, this.f64697i);
                }
                r rVarD = r.d(cVarTransform);
                this.f64694f.d(dVar, jVar, rVarD);
                return rVarD;
            }
            throw new Registry.NoResultEncoderAvailableException(cVarTransform.get().getClass());
        }
        return cVarTransform;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void l(X6.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, X6.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(eVar, aVar, dVar.a());
        this.f64690b.add(glideException);
        if (Thread.currentThread() != this.f64711w) {
            O(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            P();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int iC = C() - hVar.C();
        if (iC == 0) {
            return this.f64705q - hVar.f64705q;
        }
        return iC;
    }
}
