package androidx.media3.exoplayer.source.ads;

import a3.C5645b;
import a3.F;
import a3.InterfaceC5646c;
import a3.v;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.source.AbstractC6219c;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.source.ads.a;
import androidx.media3.exoplayer.source.o;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.P;
import f3.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p3.i;
import q3.C16599b;

/* loaded from: classes.dex */
public final class AdsMediaSource extends AbstractC6219c<r.b> {

    /* renamed from: x, reason: collision with root package name */
    private static final r.b f57022x = new r.b(new Object());

    /* renamed from: k, reason: collision with root package name */
    private final p f57023k;

    /* renamed from: l, reason: collision with root package name */
    final v.f f57024l;

    /* renamed from: m, reason: collision with root package name */
    private final r.a f57025m;

    /* renamed from: n, reason: collision with root package name */
    private final androidx.media3.exoplayer.source.ads.a f57026n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC5646c f57027o;

    /* renamed from: p, reason: collision with root package name */
    private final g f57028p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f57029q;

    /* renamed from: t, reason: collision with root package name */
    private c f57032t;

    /* renamed from: u, reason: collision with root package name */
    private F f57033u;

    /* renamed from: v, reason: collision with root package name */
    private C5645b f57034v;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f57030r = new Handler(Looper.getMainLooper());

    /* renamed from: s, reason: collision with root package name */
    private final F.b f57031s = new F.b();

    /* renamed from: w, reason: collision with root package name */
    private a[][] f57035w = new a[0][];

    public static final class AdLoadException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f57036a;

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
            this.f57036a = i10;
        }
    }

    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final r.b f57037a;

        /* renamed from: b, reason: collision with root package name */
        private final List<o> f57038b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private v f57039c;

        /* renamed from: d, reason: collision with root package name */
        private r f57040d;

        /* renamed from: e, reason: collision with root package name */
        private F f57041e;

        public a(r.b bVar) {
            this.f57037a = bVar;
        }

        public q a(r.b bVar, t3.b bVar2, long j10) {
            o oVar = new o(bVar, bVar2, j10);
            this.f57038b.add(oVar);
            r rVar = this.f57040d;
            if (rVar != null) {
                oVar.w(rVar);
                oVar.x(AdsMediaSource.this.new b((v) C13599a.e(this.f57039c)));
            }
            F f10 = this.f57041e;
            if (f10 != null) {
                oVar.l(new r.b(f10.m(0), bVar.f57160d));
            }
            return oVar;
        }

        public long b() {
            F f10 = this.f57041e;
            if (f10 == null) {
                return -9223372036854775807L;
            }
            return f10.f(0, AdsMediaSource.this.f57031s).k();
        }

        public boolean d() {
            return this.f57040d != null;
        }

        public void e(r rVar, v vVar) {
            this.f57040d = rVar;
            this.f57039c = vVar;
            for (int i10 = 0; i10 < this.f57038b.size(); i10++) {
                o oVar = this.f57038b.get(i10);
                oVar.w(rVar);
                oVar.x(AdsMediaSource.this.new b(vVar));
            }
            AdsMediaSource.this.G(this.f57037a, rVar);
        }

        public boolean f() {
            return this.f57038b.isEmpty();
        }

        public void h(o oVar) {
            this.f57038b.remove(oVar);
            oVar.v();
        }

        public void c(F f10) {
            boolean z10 = true;
            if (f10.i() != 1) {
                z10 = false;
            }
            C13599a.a(z10);
            if (this.f57041e == null) {
                Object objM = f10.m(0);
                for (int i10 = 0; i10 < this.f57038b.size(); i10++) {
                    o oVar = this.f57038b.get(i10);
                    oVar.l(new r.b(objM, oVar.f57135a.f57160d));
                }
            }
            this.f57041e = f10;
        }

        public void g() {
            if (d()) {
                AdsMediaSource.this.H(this.f57037a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements o.a {

        /* renamed from: a, reason: collision with root package name */
        private final v f57043a;

        public b(v vVar) {
            this.f57043a = vVar;
        }

        @Override // androidx.media3.exoplayer.source.o.a
        public void a(final r.b bVar, final IOException iOException) {
            AdsMediaSource.this.t(bVar).p(new i(i.a(), new g(((v.h) C13599a.e(this.f57043a.f44830b)).f44928a), SystemClock.elapsedRealtime()), 6, AdLoadException.a(iOException), true);
            AdsMediaSource.this.f57030r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.d
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.b bVar2 = this.f57052a;
                    r.b bVar3 = bVar;
                    AdsMediaSource.this.f57026n.e(AdsMediaSource.this, bVar3.f57158b, bVar3.f57159c, iOException);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.o.a
        public void b(final r.b bVar) {
            AdsMediaSource.this.f57030r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.e
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.b bVar2 = this.f57055a;
                    r.b bVar3 = bVar;
                    AdsMediaSource.this.f57026n.c(AdsMediaSource.this, bVar3.f57158b, bVar3.f57159c);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements a.InterfaceC1140a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f57045a = P.z();

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f57046b;

        public void e() {
            this.f57046b = true;
            this.f57045a.removeCallbacksAndMessages(null);
        }

        public c() {
        }

        public static /* synthetic */ void d(c cVar, C5645b c5645b) {
            if (cVar.f57046b) {
                return;
            }
            AdsMediaSource.this.Z(c5645b);
        }

        @Override // androidx.media3.exoplayer.source.ads.a.InterfaceC1140a
        public void a(final C5645b c5645b) {
            if (this.f57046b) {
                return;
            }
            this.f57045a.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.f
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource.c.d(this.f57057a, c5645b);
                }
            });
        }

        @Override // androidx.media3.exoplayer.source.ads.a.InterfaceC1140a
        public void c(AdLoadException adLoadException, g gVar) {
            if (this.f57046b) {
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
        boolean zB = ((C5645b) C13599a.e(this.f57034v)).b();
        int length = this.f57035w.length + (zB ? 1 : 0);
        long[][] jArr = new long[length][];
        int i10 = 0;
        while (true) {
            a[][] aVarArr = this.f57035w;
            if (i10 >= aVarArr.length) {
                break;
            }
            jArr[i10] = new long[aVarArr[i10].length];
            int i11 = 0;
            while (true) {
                a[] aVarArr2 = this.f57035w[i10];
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
        C5645b c5645b = this.f57034v;
        if (c5645b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f57035w.length; i10++) {
            int i11 = 0;
            while (true) {
                a[] aVarArr = this.f57035w[i10];
                if (i11 < aVarArr.length) {
                    a aVar = aVarArr[i11];
                    C5645b.a aVarC = c5645b.c(i10);
                    if (aVar != null && !aVar.d()) {
                        v[] vVarArr = aVarC.f44622e;
                        if (i11 < vVarArr.length && (vVarA = vVarArr[i11]) != null) {
                            if (this.f57024l != null) {
                                vVarA = vVarA.a().c(this.f57024l).a();
                            }
                            aVar.e(this.f57025m.e(vVarA), vVarA);
                        }
                    }
                    i11++;
                }
            }
        }
    }

    private void Y() {
        F f10 = this.f57033u;
        C5645b c5645b = this.f57034v;
        if (c5645b == null || f10 == null) {
            return;
        }
        if (c5645b.f44602b == 0) {
            z(f10);
        } else {
            this.f57034v = c5645b.j(U());
            z(new C16599b(f10, this.f57034v));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(C5645b c5645b) {
        C5645b c5645b2 = this.f57034v;
        if (c5645b2 == null) {
            a[][] aVarArr = new a[c5645b.f44602b - (c5645b.b() ? 1 : 0)][];
            this.f57035w = aVarArr;
            Arrays.fill(aVarArr, new a[0]);
        } else {
            int iT = T(c5645b2, c5645b);
            if (iT > 0) {
                this.f57035w = W(this.f57035w, iT);
            }
        }
        this.f57034v = c5645b;
        X();
        Y();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void c(v vVar) {
        this.f57023k.c(vVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public v e() {
        return this.f57023k.e();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        o oVar = (o) qVar;
        r.b bVar = oVar.f57135a;
        if (!bVar.b()) {
            oVar.v();
            return;
        }
        a aVar = (a) C13599a.e(this.f57035w[bVar.f57158b][bVar.f57159c]);
        aVar.h(oVar);
        if (aVar.f()) {
            aVar.g();
            this.f57035w[bVar.f57158b][bVar.f57159c] = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        if (((C5645b) C13599a.e(this.f57034v)).f44602b <= 0 || !bVar.b()) {
            o oVar = new o(bVar, bVar2, j10);
            oVar.w(this.f57023k);
            oVar.l(bVar);
            return oVar;
        }
        int i10 = bVar.f57158b;
        int i11 = bVar.f57159c;
        a[][] aVarArr = this.f57035w;
        a[] aVarArr2 = aVarArr[i10];
        if (aVarArr2.length <= i11) {
            aVarArr[i10] = (a[]) Arrays.copyOf(aVarArr2, i11 + 1);
        }
        a aVar = this.f57035w[i10][i11];
        if (aVar == null) {
            aVar = new a(bVar);
            this.f57035w[i10][i11] = aVar;
            X();
        }
        return aVar.a(bVar, bVar2, j10);
    }

    public AdsMediaSource(r rVar, g gVar, Object obj, r.a aVar, androidx.media3.exoplayer.source.ads.a aVar2, InterfaceC5646c interfaceC5646c, boolean z10) {
        this.f57023k = new p(rVar, z10);
        this.f57024l = ((v.h) C13599a.e(rVar.e().f44830b)).f44930c;
        this.f57025m = aVar;
        this.f57026n = aVar2;
        this.f57027o = interfaceC5646c;
        this.f57028p = gVar;
        this.f57029q = obj;
        aVar2.d(aVar.d());
    }

    private static int T(C5645b c5645b, C5645b c5645b2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (c5645b.b() == c5645b2.b()) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        int i10 = c5645b2.f44602b - c5645b.f44602b;
        if (i10 >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        C13599a.g(z11);
        for (int i11 = c5645b2.f44605e; i11 < c5645b.f44602b; i11++) {
            C5645b.a aVarC = c5645b.c(i11);
            if (aVarC.f()) {
                if (i11 == c5645b.f44602b - 1) {
                    z14 = true;
                }
                C13599a.g(z14);
                return i10;
            }
            C5645b.a aVarC2 = c5645b2.c(i11);
            if (aVarC.f44619b <= aVarC2.f44619b) {
                z12 = true;
            } else {
                z12 = false;
            }
            C13599a.g(z12);
            if (aVarC.f44618a == aVarC2.f44618a) {
                z13 = true;
            } else {
                z13 = false;
            }
            C13599a.g(z13);
            for (int i12 = 0; i12 < aVarC.f44619b; i12++) {
                v vVar = aVarC.f44622e[i12];
                if (vVar != null) {
                    C13599a.g(vVar.equals(aVarC2.f44622e[i12]));
                }
            }
        }
        return i10;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
        super.A();
        final c cVar = (c) C13599a.e(this.f57032t);
        this.f57032t = null;
        cVar.e();
        this.f57033u = null;
        this.f57034v = null;
        this.f57035w = new a[0][];
        this.f57030r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f57050a;
                adsMediaSource.f57026n.a(adsMediaSource, cVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public r.b C(r.b bVar, r.b bVar2) {
        if (bVar.b()) {
            return bVar;
        }
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.AbstractC6219c
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void F(r.b bVar, r rVar, final F f10) {
        if (bVar.b()) {
            int i10 = bVar.f57158b;
            ((a) C13599a.e(this.f57035w[i10][bVar.f57159c])).c(f10);
        } else {
            boolean z10 = true;
            if (f10.i() != 1) {
                z10 = false;
            }
            C13599a.a(z10);
            this.f57033u = f10;
            this.f57030r.post(new Runnable() { // from class: q3.a
                @Override // java.lang.Runnable
                public final void run() {
                    AdsMediaSource adsMediaSource = this.f157868a;
                    adsMediaSource.f57026n.f(adsMediaSource, f10);
                }
            });
        }
        Y();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.AbstractC6217a
    protected void y(f3.o oVar) {
        super.y(oVar);
        final c cVar = new c();
        this.f57032t = cVar;
        this.f57033u = this.f57023k.V();
        G(f57022x, this.f57023k);
        this.f57030r.post(new Runnable() { // from class: androidx.media3.exoplayer.source.ads.b
            @Override // java.lang.Runnable
            public final void run() {
                AdsMediaSource adsMediaSource = this.f57048a;
                adsMediaSource.f57026n.b(adsMediaSource, adsMediaSource.f57028p, adsMediaSource.f57029q, adsMediaSource.f57027o, cVar);
            }
        });
    }
}
