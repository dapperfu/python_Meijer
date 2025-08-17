package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.engine.i;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import q7.C16480a;

/* loaded from: classes4.dex */
class h<R> implements f.a, Runnable, Comparable<h<?>>, C16480a.f {

    /* renamed from: A, reason: collision with root package name */
    private V6.a f63843A;

    /* renamed from: B, reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f63844B;

    /* renamed from: C, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.f f63845C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f63846D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f63847E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f63848F;

    /* renamed from: d, reason: collision with root package name */
    private final e f63852d;

    /* renamed from: e, reason: collision with root package name */
    private final o2.f<h<?>> f63853e;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.d f63856h;

    /* renamed from: i, reason: collision with root package name */
    private V6.e f63857i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.g f63858j;

    /* renamed from: k, reason: collision with root package name */
    private m f63859k;

    /* renamed from: l, reason: collision with root package name */
    private int f63860l;

    /* renamed from: m, reason: collision with root package name */
    private int f63861m;

    /* renamed from: n, reason: collision with root package name */
    private X6.a f63862n;

    /* renamed from: o, reason: collision with root package name */
    private V6.g f63863o;

    /* renamed from: p, reason: collision with root package name */
    private b<R> f63864p;

    /* renamed from: q, reason: collision with root package name */
    private int f63865q;

    /* renamed from: r, reason: collision with root package name */
    private EnumC1247h f63866r;

    /* renamed from: s, reason: collision with root package name */
    private g f63867s;

    /* renamed from: t, reason: collision with root package name */
    private long f63868t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f63869u;

    /* renamed from: v, reason: collision with root package name */
    private Object f63870v;

    /* renamed from: w, reason: collision with root package name */
    private Thread f63871w;

    /* renamed from: x, reason: collision with root package name */
    private V6.e f63872x;

    /* renamed from: y, reason: collision with root package name */
    private V6.e f63873y;

    /* renamed from: z, reason: collision with root package name */
    private Object f63874z;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.g<R> f63849a = new com.bumptech.glide.load.engine.g<>();

    /* renamed from: b, reason: collision with root package name */
    private final List<Throwable> f63850b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final q7.c f63851c = q7.c.a();

    /* renamed from: f, reason: collision with root package name */
    private final d<?> f63854f = new d<>();

    /* renamed from: g, reason: collision with root package name */
    private final f f63855g = new f();

    interface b<R> {
        void b(X6.c<R> cVar, V6.a aVar, boolean z10);

        void c(GlideException glideException);

        void d(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* renamed from: a, reason: collision with root package name */
        private final V6.a f63878a;

        c(V6.a aVar) {
            this.f63878a = aVar;
        }

        @Override // com.bumptech.glide.load.engine.i.a
        public X6.c<Z> a(X6.c<Z> cVar) {
            return h.this.L(this.f63878a, cVar);
        }
    }

    private static class d<Z> {

        /* renamed from: a, reason: collision with root package name */
        private V6.e f63880a;

        /* renamed from: b, reason: collision with root package name */
        private V6.j<Z> f63881b;

        /* renamed from: c, reason: collision with root package name */
        private r<Z> f63882c;

        void a() {
            this.f63880a = null;
            this.f63881b = null;
            this.f63882c = null;
        }

        void b(e eVar, V6.g gVar) {
            q7.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f63880a, new com.bumptech.glide.load.engine.e(this.f63881b, this.f63882c, gVar));
            } finally {
                this.f63882c.g();
                q7.b.e();
            }
        }

        boolean c() {
            return this.f63882c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(V6.e eVar, V6.j<X> jVar, r<X> rVar) {
            this.f63880a = eVar;
            this.f63881b = jVar;
            this.f63882c = rVar;
        }

        d() {
        }
    }

    interface e {
        Z6.a a();
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private boolean f63883a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f63884b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f63885c;

        synchronized boolean b() {
            this.f63884b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f63885c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f63883a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f63884b = false;
            this.f63883a = false;
            this.f63885c = false;
        }

        private boolean a(boolean z10) {
            return (this.f63885c || z10 || this.f63884b) && this.f63883a;
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
    private enum EnumC1247h {
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

    public void m() {
        this.f63847E = true;
        com.bumptech.glide.load.engine.f fVar = this.f63845C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63875a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f63876b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f63877c;

        static {
            int[] iArr = new int[V6.c.values().length];
            f63877c = iArr;
            try {
                iArr[V6.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63877c[V6.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC1247h.values().length];
            f63876b = iArr2;
            try {
                iArr2[EnumC1247h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63876b[EnumC1247h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63876b[EnumC1247h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63876b[EnumC1247h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63876b[EnumC1247h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f63875a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63875a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63875a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    private V6.g B(V6.a aVar) {
        V6.g gVar = this.f63863o;
        if (Build.VERSION.SDK_INT < 26) {
            return gVar;
        }
        boolean z10 = aVar == V6.a.RESOURCE_DISK_CACHE || this.f63849a.x();
        V6.f<Boolean> fVar = com.bumptech.glide.load.resource.bitmap.s.f64086j;
        Boolean bool = (Boolean) gVar.a(fVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return gVar;
        }
        V6.g gVar2 = new V6.g();
        gVar2.b(this.f63863o);
        gVar2.d(fVar, Boolean.valueOf(z10));
        return gVar2;
    }

    private int C() {
        return this.f63858j.ordinal();
    }

    private void F(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(p7.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f63859k);
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
    private void H(X6.c<R> cVar, V6.a aVar, boolean z10) {
        r rVar;
        q7.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (cVar instanceof X6.b) {
                ((X6.b) cVar).b();
            }
            if (this.f63854f.c()) {
                cVar = r.d(cVar);
                rVar = cVar;
            } else {
                rVar = 0;
            }
            G(cVar, aVar, z10);
            this.f63866r = EnumC1247h.ENCODE;
            try {
                if (this.f63854f.c()) {
                    this.f63854f.b(this.f63852d, this.f63863o);
                }
                J();
                q7.b.e();
            } finally {
                if (rVar != 0) {
                    rVar.g();
                }
            }
        } catch (Throwable th2) {
            q7.b.e();
            throw th2;
        }
    }

    private void J() {
        if (this.f63855g.b()) {
            N();
        }
    }

    private void K() {
        if (this.f63855g.c()) {
            N();
        }
    }

    private void N() {
        this.f63855g.e();
        this.f63854f.a();
        this.f63849a.a();
        this.f63846D = false;
        this.f63856h = null;
        this.f63857i = null;
        this.f63863o = null;
        this.f63858j = null;
        this.f63859k = null;
        this.f63864p = null;
        this.f63866r = null;
        this.f63845C = null;
        this.f63871w = null;
        this.f63872x = null;
        this.f63874z = null;
        this.f63843A = null;
        this.f63844B = null;
        this.f63868t = 0L;
        this.f63847E = false;
        this.f63870v = null;
        this.f63850b.clear();
        this.f63853e.a(this);
    }

    private void O(g gVar) {
        this.f63867s = gVar;
        this.f63864p.d(this);
    }

    private void R() {
        int i10 = a.f63875a[this.f63867s.ordinal()];
        if (i10 == 1) {
            this.f63866r = z(EnumC1247h.INITIALIZE);
            this.f63845C = w();
            P();
        } else if (i10 == 2) {
            P();
        } else {
            if (i10 == 3) {
                u();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f63867s);
        }
    }

    private void S() {
        Throwable th2;
        this.f63851c.c();
        if (!this.f63846D) {
            this.f63846D = true;
            return;
        }
        if (this.f63850b.isEmpty()) {
            th2 = null;
        } else {
            List<Throwable> list = this.f63850b;
            th2 = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private <Data> X6.c<R> p(com.bumptech.glide.load.data.d<?> dVar, Data data, V6.a aVar) throws GlideException {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = p7.g.b();
            X6.c<R> cVarT = t(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                E("Decoded result " + cVarT, jB);
            }
            return cVarT;
        } finally {
            dVar.b();
        }
    }

    private <Data> X6.c<R> t(Data data, V6.a aVar) throws GlideException {
        return Q(data, aVar, this.f63849a.h(data.getClass()));
    }

    private void u() {
        X6.c<R> cVarP;
        if (Log.isLoggable("DecodeJob", 2)) {
            F("Retrieved data", this.f63868t, "data: " + this.f63874z + ", cache key: " + this.f63872x + ", fetcher: " + this.f63844B);
        }
        try {
            cVarP = p(this.f63844B, this.f63874z, this.f63843A);
        } catch (GlideException e10) {
            e10.i(this.f63873y, this.f63843A);
            this.f63850b.add(e10);
            cVarP = null;
        }
        if (cVarP != null) {
            H(cVarP, this.f63843A, this.f63848F);
        } else {
            P();
        }
    }

    private com.bumptech.glide.load.engine.f w() {
        int i10 = a.f63876b[this.f63866r.ordinal()];
        if (i10 == 1) {
            return new s(this.f63849a, this);
        }
        if (i10 == 2) {
            return new com.bumptech.glide.load.engine.c(this.f63849a, this);
        }
        if (i10 == 3) {
            return new v(this.f63849a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f63866r);
    }

    private EnumC1247h z(EnumC1247h enumC1247h) {
        int i10 = a.f63876b[enumC1247h.ordinal()];
        if (i10 == 1) {
            return this.f63862n.a() ? EnumC1247h.DATA_CACHE : z(EnumC1247h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f63869u ? EnumC1247h.FINISHED : EnumC1247h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC1247h.FINISHED;
        }
        if (i10 == 5) {
            return this.f63862n.b() ? EnumC1247h.RESOURCE_CACHE : z(EnumC1247h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC1247h);
    }

    h<R> D(com.bumptech.glide.d dVar, Object obj, m mVar, V6.e eVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, X6.a aVar, Map<Class<?>, V6.k<?>> map, boolean z10, boolean z11, boolean z12, V6.g gVar2, b<R> bVar, int i12) {
        this.f63849a.v(dVar, obj, eVar, i10, i11, aVar, cls, cls2, gVar, gVar2, map, z10, z11, this.f63852d);
        this.f63856h = dVar;
        this.f63857i = eVar;
        this.f63858j = gVar;
        this.f63859k = mVar;
        this.f63860l = i10;
        this.f63861m = i11;
        this.f63862n = aVar;
        this.f63869u = z12;
        this.f63863o = gVar2;
        this.f63864p = bVar;
        this.f63865q = i12;
        this.f63867s = g.INITIALIZE;
        this.f63870v = obj;
        return this;
    }

    void M(boolean z10) {
        if (this.f63855g.d(z10)) {
            N();
        }
    }

    boolean T() {
        EnumC1247h enumC1247hZ = z(EnumC1247h.INITIALIZE);
        return enumC1247hZ == EnumC1247h.RESOURCE_CACHE || enumC1247hZ == EnumC1247h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void a(V6.e eVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, V6.a aVar, V6.e eVar2) {
        this.f63872x = eVar;
        this.f63874z = obj;
        this.f63844B = dVar;
        this.f63843A = aVar;
        this.f63873y = eVar2;
        this.f63848F = eVar != this.f63849a.c().get(0);
        if (Thread.currentThread() != this.f63871w) {
            O(g.DECODE_DATA);
            return;
        }
        q7.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            u();
        } finally {
            q7.b.e();
        }
    }

    @Override // q7.C16480a.f
    public q7.c e() {
        return this.f63851c;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void l() {
        O(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // java.lang.Runnable
    public void run() {
        q7.b.c("DecodeJob#run(reason=%s, model=%s)", this.f63867s, this.f63870v);
        com.bumptech.glide.load.data.d<?> dVar = this.f63844B;
        try {
            try {
                if (this.f63847E) {
                    I();
                    if (dVar != null) {
                        dVar.b();
                    }
                    q7.b.e();
                    return;
                }
                R();
                if (dVar != null) {
                    dVar.b();
                }
                q7.b.e();
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.b();
                }
                q7.b.e();
                throw th2;
            }
        } catch (com.bumptech.glide.load.engine.b e10) {
            throw e10;
        } catch (Throwable th3) {
            if (Log.isLoggable("DecodeJob", 3)) {
                FS.log_d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f63847E + ", stage: " + this.f63866r, th3);
            }
            if (this.f63866r != EnumC1247h.ENCODE) {
                this.f63850b.add(th3);
                I();
            }
            if (!this.f63847E) {
                throw th3;
            }
            throw th3;
        }
    }

    h(e eVar, o2.f<h<?>> fVar) {
        this.f63852d = eVar;
        this.f63853e = fVar;
    }

    private void G(X6.c<R> cVar, V6.a aVar, boolean z10) {
        S();
        this.f63864p.b(cVar, aVar, z10);
    }

    private void I() {
        S();
        this.f63864p.c(new GlideException("Failed to load resource", new ArrayList(this.f63850b)));
        K();
    }

    private void P() {
        this.f63871w = Thread.currentThread();
        this.f63868t = p7.g.b();
        boolean zD = false;
        while (!this.f63847E && this.f63845C != null && !(zD = this.f63845C.d())) {
            this.f63866r = z(this.f63866r);
            this.f63845C = w();
            if (this.f63866r == EnumC1247h.SOURCE) {
                O(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f63866r == EnumC1247h.FINISHED || this.f63847E) && !zD) {
            I();
        }
    }

    private <Data, ResourceType> X6.c<R> Q(Data data, V6.a aVar, q<Data, ResourceType, R> qVar) throws GlideException {
        V6.g gVarB = B(aVar);
        com.bumptech.glide.load.data.e<Data> eVarL = this.f63856h.i().l(data);
        try {
            return qVar.a(eVarL, gVarB, this.f63860l, this.f63861m, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    <Z> X6.c<Z> L(V6.a aVar, X6.c<Z> cVar) {
        X6.c<Z> cVarTransform;
        V6.k<Z> kVar;
        V6.c cVarA;
        V6.e dVar;
        Class<?> cls = cVar.get().getClass();
        V6.j<Z> jVarN = null;
        if (aVar != V6.a.RESOURCE_DISK_CACHE) {
            V6.k<Z> kVarS = this.f63849a.s(cls);
            kVar = kVarS;
            cVarTransform = kVarS.transform(this.f63856h, cVar, this.f63860l, this.f63861m);
        } else {
            cVarTransform = cVar;
            kVar = null;
        }
        if (!cVar.equals(cVarTransform)) {
            cVar.a();
        }
        if (this.f63849a.w(cVarTransform)) {
            jVarN = this.f63849a.n(cVarTransform);
            cVarA = jVarN.a(this.f63863o);
        } else {
            cVarA = V6.c.NONE;
        }
        V6.j jVar = jVarN;
        if (this.f63862n.d(!this.f63849a.y(this.f63872x), aVar, cVarA)) {
            if (jVar != null) {
                int i10 = a.f63877c[cVarA.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        dVar = new t(this.f63849a.b(), this.f63872x, this.f63857i, this.f63860l, this.f63861m, kVar, cls, this.f63863o);
                    } else {
                        throw new IllegalArgumentException("Unknown strategy: " + cVarA);
                    }
                } else {
                    dVar = new com.bumptech.glide.load.engine.d(this.f63872x, this.f63857i);
                }
                r rVarD = r.d(cVarTransform);
                this.f63854f.d(dVar, jVar, rVarD);
                return rVarD;
            }
            throw new Registry.NoResultEncoderAvailableException(cVarTransform.get().getClass());
        }
        return cVarTransform;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(V6.e eVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, V6.a aVar) {
        dVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.j(eVar, aVar, dVar.a());
        this.f63850b.add(glideException);
        if (Thread.currentThread() != this.f63871w) {
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
            return this.f63865q - hVar.f63865q;
        }
        return iC;
    }
}
