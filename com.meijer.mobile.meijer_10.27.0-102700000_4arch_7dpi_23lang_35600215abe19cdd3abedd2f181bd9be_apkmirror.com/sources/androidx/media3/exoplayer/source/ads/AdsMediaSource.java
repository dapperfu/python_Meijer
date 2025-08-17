package androidx.media3.exoplayer.source.ads;

import a3.C5562b;
import a3.F;
import a3.InterfaceC5563c;
import a3.v;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.AbstractC6077c;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.a;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.P;
import f3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.i;
import q3.C16444b;

/* loaded from: classes.dex */
public final class AdsMediaSource extends AbstractC6077c<r.b> {

    /* renamed from: x, reason: collision with root package name */
    private static final r.b f56798x = new r.b(new Object());

    /* renamed from: k, reason: collision with root package name */
    private final p f56799k;

    /* renamed from: l, reason: collision with root package name */
    final v.f f56800l;

    /* renamed from: m, reason: collision with root package name */
    private final r.a f56801m;

    /* renamed from: n, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.ads.a f56802n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5563c f56803o;

    /* renamed from: p, reason: collision with root package name */
    private final g f56804p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f56805q;

    /* renamed from: t, reason: collision with root package name */
    private c f56808t;

    /* renamed from: u, reason: collision with root package name */
    private F f56809u;

    /* renamed from: v, reason: collision with root package name */
    private C5562b f56810v;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f56806r = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    private final F.b f56807s = new F.b();

    /* renamed from: w, reason: collision with root package name */
    private a[][] f56811w = new a[0][];

    public static final class AdLoadException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f56812a;

        public static AdLoadException a(Exception exc) {
            return new AdLoadException(0, exc);
        }

        public static AdLoadException b(Exception exc, int i10) {
            return new AdLoadException(1, new IOException("Failed to load ad group " + i10, exc));
        }

        public static AdLoadException c(Exception exc) {
            return new AdLoadException(2, exc);
        }

        public static AdLoadException d(RuntimeException runtimeException) {
            return new AdLoadException(3, runtimeException);
        }

        private AdLoadException(int i10, Exception exc) {
            super(exc);
            this.f56812a = i10;
        }
    }

    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final r.b f56813a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f56814b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private v f56815c;

        /* renamed from: d, reason: collision with root package name */
        private r f56816d;

        /* renamed from: e, reason: collision with root package name */
        private F f56817e;

        public a(r.b bVar) {
            this.f56813a = bVar;
        }

        public q a(r.b bVar, t3.b bVar2, long j10) {
            o oVar = new o(bVar, bVar2, j10);
            this.f56814b.add(oVar);
            r rVar = this.f56816d;
            if (rVar != null) {
                oVar.w(rVar);
                oVar.x(AdsMediaSource.this.new b((v) C13466a.e(this.f56815c)));
            }
            F f10 = this.f56817e;
            if (f10 != null) {
                oVar.l(new r.b(f10.m(0), bVar.f56936d));
            }
            return oVar;
        }

        public long b() {
            F f10 = this.f56817e;
            if (f10 == null) {
                return -9223372036854775807L;
            }
            return f10.f(0, AdsMediaSource.this.f56807s).k();
        }

        public boolean d() {
            return this.f56816d != null;
        }

        public void e(r rVar, v vVar) {
            this.f56816d = rVar;
            this.f56815c = vVar;
            for (int i10 = 0; i10 < this.f56814b.size(); i10++) {
                o oVar = this.f56814b.get(i10);
                oVar.w(rVar);
                oVar.x(AdsMediaSource.this.new b(vVar));
            }
            AdsMediaSource.this.G(this.f56813a, rVar);
        }

        public boolean f() {
            return this.f56814b.isEmpty();
        }

        public void h(o oVar) {
            this.f56814b.remove(oVar);
            oVar.v();
        }

        public void c(F f10) {
            boolean z10 = true;
            if (f10.i() != 1) {
                z10 = false;
            }
            C13466a.a(z10);
            if (this.f56817e == null) {
                Object objM = f10.m(0);
                for (int i10 = 0; i10 < this.f56814b.size(); i10++) {
                    o oVar = this.f56814b.get(i10);
                    oVar.l(new r.b(objM, oVar.f56911a.f56936d));
                }
            }
            this.f56817e = f10;
        }

        public void g() {
            if (d()) {
                AdsMediaSource.this.H(this.f56813a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements o.a {

        /* renamed from: a, reason: collision with root package name */
        private final v f56819a;

        public b(v vVar) {
            this.f56819a = vVar;
        }

        @Override // androidx.media3.exoplayer.source.o.a
        public void a(final r.b bVar, final IOException iOException) {
            AdsMediaSource.this.t(bVar).p(new i(i.a(), new g(((v.h) C13466a.e(this.f56819a.f44012b)).f44110a), SystemClock.elapsedRealtime()), 6, AdLoadException.a(iOException), true);
            AdsMediaSource.this.f56806r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.b bVar2 = this.f56828a;
                    r.b bVar3 = bVar;
                    AdsMediaSource.this.f56802n.e(AdsMediaSource.this, bVar3.f56934b, bVar3.f56935c, iOException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.o.a
        public void b(final r.b bVar) {
            AdsMediaSource.this.f56806r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.b bVar2 = this.f56831a;
                    r.b bVar3 = bVar;
                    AdsMediaSource.this.f56802n.c(AdsMediaSource.this, bVar3.f56934b, bVar3.f56935c);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements a.InterfaceC1127a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f56821a = P.z();

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f56822b;

        public void e() {
            this.f56822b = true;
            this.f56821a.removeCallbacksAndMessages(null);
        }

        public c() {
        }

        public static /* synthetic */ void d(c cVar, C5562b c5562b) {
            if (cVar.f56822b) {
                return;
            }
            AdsMediaSource.this.Z(c5562b);
        }

        @Override // androidx.media3.exoplayer.source.ads.a.InterfaceC1127a
        public void a(final C5562b c5562b) {
            if (this.f56822b) {
                return;
            }
            this.f56821a.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.c.d(this.f56833a, c5562b);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.ads.a.InterfaceC1127a
        public void c(AdLoadException adLoadException, g gVar) {
            if (this.f56822b) {
                return;
            }
            AdsMediaSource.this.t(null).p(new i(i.a(), gVar, SystemClock.elapsedRealtime()), 6, adLoadException, true);
        }
    }

    private static a[][] W(a[][] aVarArr, int i10) {
        int length = aVarArr.length + i10;
        a[][] aVarArr2 = new a[length][];
        System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
        for (int length2 = aVarArr.length; length2 < length; length2++) {
            aVarArr2[length2] = new a[0];
        }
        return aVarArr2;
    }

    private long[][] U() {
        boolean zB = ((C5562b) C13466a.e(this.f56810v)).b();
        int length = this.f56811w.length + (zB ? 1 : 0);
        long[][] jArr = new long[length][];
        int i10 = 0;
        while (true) {
            a[][] aVarArr = this.f56811w;
            if (i10 >= aVarArr.length) {
                break;
            }
            jArr[i10] = new long[aVarArr[i10].length];
            int i11 = 0;
            while (true) {
                a[] aVarArr2 = this.f56811w[i10];
                if (i11 < aVarArr2.length) {
                    a aVar = aVarArr2[i11];
                    jArr[i10][i11] = aVar == null ? -9223372036854775807L : aVar.b();
                    i11++;
                }
            }
            i10++;
        }
        if (zB) {
            jArr[length - 1] = new long[0];
        }
        return jArr;
    }

    private void X() {
        v vVarA;
        C5562b c5562b = this.f56810v;
        if (c5562b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f56811w.length; i10++) {
            int i11 = 0;
            while (true) {
                a[] aVarArr = this.f56811w[i10];
                if (i11 < aVarArr.length) {
                    a aVar = aVarArr[i11];
                    C5562b.a aVarC = c5562b.c(i10);
                    if (aVar != null && !aVar.d()) {
                        v[] vVarArr = aVarC.f43804e;
                        if (i11 < vVarArr.length && (vVarA = vVarArr[i11]) != null) {
                            if (this.f56800l != null) {
                                vVarA = vVarA.a().c(this.f56800l).a();
                            }
                            aVar.e(this.f56801m.e(vVarA), vVarA);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    private void Y() {
        F f10 = this.f56809u;
        C5562b c5562b = this.f56810v;
        if (c5562b == null || f10 == null) {
            return;
        }
        if (c5562b.f43784b == 0) {
            z(f10);
        } else {
            this.f56810v = c5562b.j(U());
            z(new C16444b(f10, this.f56810v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(C5562b c5562b) {
        C5562b c5562b2 = this.f56810v;
        if (c5562b2 == null) {
            a[][] aVarArr = new a[c5562b.f43784b - (c5562b.b() ? 1 : 0)][];
            this.f56811w = aVarArr;
            Arrays.fill(aVarArr, new a[0]);
        } else {
            int iT = T(c5562b2, c5562b);
            if (iT > 0) {
                this.f56811w = W(this.f56811w, iT);
            }
        }
        this.f56810v = c5562b;
        X();
        Y();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void c(v vVar) {
        this.f56799k.c(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public v e() {
        return this.f56799k.e();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        o oVar = (o) qVar;
        r.b bVar = oVar.f56911a;
        if (!bVar.b()) {
            oVar.v();
            return;
        }
        a aVar = (a) C13466a.e(this.f56811w[bVar.f56934b][bVar.f56935c]);
        aVar.h(oVar);
        if (aVar.f()) {
            aVar.g();
            this.f56811w[bVar.f56934b][bVar.f56935c] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        if (((C5562b) C13466a.e(this.f56810v)).f43784b <= 0 || !bVar.b()) {
            o oVar = new o(bVar, bVar2, j10);
            oVar.w(this.f56799k);
            oVar.l(bVar);
            return oVar;
        }
        int i10 = bVar.f56934b;
        int i11 = bVar.f56935c;
        a[][] aVarArr = this.f56811w;
        a[] aVarArr2 = aVarArr[i10];
        if (aVarArr2.length <= i11) {
            aVarArr[i10] = (a[]) Arrays.copyOf(aVarArr2, i11 + 1);
        }
        a aVar = this.f56811w[i10][i11];
        if (aVar == null) {
            aVar = new a(bVar);
            this.f56811w[i10][i11] = aVar;
            X();
        }
        return aVar.a(bVar, bVar2, j10);
    }

    public AdsMediaSource(r rVar, g gVar, Object obj, r.a aVar, androidx.media3.exoplayer.source.ads.a aVar2, InterfaceC5563c interfaceC5563c, boolean z10) {
        this.f56799k = new p(rVar, z10);
        this.f56800l = ((v.h) C13466a.e(rVar.e().f44012b)).f44112c;
        this.f56801m = aVar;
        this.f56802n = aVar2;
        this.f56803o = interfaceC5563c;
        this.f56804p = gVar;
        this.f56805q = obj;
        aVar2.d(aVar.d());
    }

    private static int T(C5562b c5562b, C5562b c5562b2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (c5562b.b() == c5562b2.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        int i10 = c5562b2.f43784b - c5562b.f43784b;
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13466a.g(z11);
        for (int i11 = c5562b2.f43787e; i11 < c5562b.f43784b; i11++) {
            C5562b.a aVarC = c5562b.c(i11);
            if (aVarC.f()) {
                if (i11 == c5562b.f43784b - 1) {
                    z14 = true;
                }
                C13466a.g(z14);
                return i10;
            }
            C5562b.a aVarC2 = c5562b2.c(i11);
            if (aVarC.f43801b <= aVarC2.f43801b) {
                z12 = true;
            } else {
                z12 = false;
            }
            C13466a.g(z12);
            if (aVarC.f43800a == aVarC2.f43800a) {
                z13 = true;
            } else {
                z13 = false;
            }
            C13466a.g(z13);
            for (int i12 = 0; i12 < aVarC.f43801b; i12++) {
                v vVar = aVarC.f43804e[i12];
                if (vVar != null) {
                    C13466a.g(vVar.equals(aVarC2.f43804e[i12]));
                }
            }
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6077c, androidx.media3.exoplayer.source.AbstractC6075a
    protected void A() {
        super.A();
        final c cVar = (c) C13466a.e(this.f56808t);
        this.f56808t = null;
        cVar.e();
        this.f56809u = null;
        this.f56810v = null;
        this.f56811w = new a[0][];
        this.f56806r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f56826a;
                adsMediaSource.f56802n.a(adsMediaSource, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6077c
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public r.b C(r.b bVar, r.b bVar2) {
        if (bVar.b()) {
            return bVar;
        }
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6077c
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void F(r.b bVar, r rVar, final F f10) {
        if (bVar.b()) {
            int i10 = bVar.f56934b;
            ((a) C13466a.e(this.f56811w[i10][bVar.f56935c])).c(f10);
        } else {
            boolean z10 = true;
            if (f10.i() != 1) {
                z10 = false;
            }
            C13466a.a(z10);
            this.f56809u = f10;
            this.f56806r.post(new Runnable() { // from class: q3.a
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource adsMediaSource = this.f156755a;
                    adsMediaSource.f56802n.f(adsMediaSource, f10);
                }
            });
        }
        Y();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6077c, androidx.media3.exoplayer.source.AbstractC6075a
    protected void y(f3.o oVar) {
        super.y(oVar);
        final c cVar = new c();
        this.f56808t = cVar;
        this.f56809u = this.f56799k.V();
        G(f56798x, this.f56799k);
        this.f56806r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.b
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f56824a;
                adsMediaSource.f56802n.b(adsMediaSource, adsMediaSource.f56804p, adsMediaSource.f56805q, adsMediaSource.f56803o, cVar);
            }
        });
    }
}
