package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.D0;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.InterfaceC13479n;
import h3.AbstractC14332a;
import i3.E1;
import i3.InterfaceC14596a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p3.s;

/* loaded from: classes.dex */
final class D0 {

    /* renamed from: a, reason: collision with root package name */
    private final E1 f55487a;

    /* renamed from: e, reason: collision with root package name */
    private final d f55491e;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC14596a f55494h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC13479n f55495i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f55497k;

    /* renamed from: l, reason: collision with root package name */
    private f3.o f55498l;

    /* renamed from: j, reason: collision with root package name */
    private p3.s f55496j = new s.a(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<androidx.media3.exoplayer.source.q, c> f55489c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f55490d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f55488b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f55492f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final Set<c> f55493g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements androidx.media3.exoplayer.source.s, androidx.media3.exoplayer.drm.h {

        /* renamed from: a, reason: collision with root package name */
        private final c f55499a;

        private Pair<Integer, r.b> V(int i10, r.b bVar) {
            r.b bVar2 = null;
            if (bVar != null) {
                r.b bVarN = D0.n(this.f55499a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(D0.s(this.f55499a, i10)), bVar2);
        }

        public a(c cVar) {
            this.f55499a = cVar;
        }

        @Override // androidx.media3.exoplayer.source.s
        public void B(int i10, r.b bVar, final p3.i iVar, final p3.j jVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f56553a;
                        Pair pair = pairV;
                        D0.this.f55494h.B(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void E(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f56959a;
                        Pair pair = pairV;
                        D0.this.f55494h.E(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void G(int i10, r.b bVar, final p3.i iVar, final p3.j jVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f55474a;
                        Pair pair = pairV;
                        D0.this.f55494h.G(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void H(int i10, r.b bVar, final p3.i iVar, final p3.j jVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57273a;
                        Pair pair = pairV;
                        D0.this.f55494h.H(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void I(int i10, r.b bVar, final int i11) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57279a;
                        Pair pair = pairV;
                        D0.this.f55494h.I(((Integer) pair.first).intValue(), (r.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void J(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f55481a;
                        Pair pair = pairV;
                        D0.this.f55494h.J(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void K(int i10, r.b bVar, final Exception exc) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f56962a;
                        Pair pair = pairV;
                        D0.this.f55494h.K(((Integer) pair.first).intValue(), (r.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void L(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f55484a;
                        Pair pair = pairV;
                        D0.this.f55494h.L(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i10, r.b bVar, final p3.i iVar, final p3.j jVar, final int i11) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57282a;
                        Pair pair = pairV;
                        D0.this.f55494h.M(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void P(int i10, r.b bVar, final p3.j jVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f56991a;
                        Pair pair = pairV;
                        D0.this.f55494h.P(((Integer) pair.first).intValue(), (r.b) pair.second, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Q(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55495i.post(new Runnable() { // from class: androidx.media3.exoplayer.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57270a;
                        Pair pair = pairV;
                        D0.this.f55494h.Q(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }
    }

    static final class c implements InterfaceC6071q0 {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.p f55504a;

        /* renamed from: d, reason: collision with root package name */
        public int f55507d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f55508e;

        /* renamed from: c, reason: collision with root package name */
        public final List<r.b> f55506c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f55505b = new Object();

        @Override // androidx.media3.exoplayer.InterfaceC6071q0
        public Object a() {
            return this.f55505b;
        }

        @Override // androidx.media3.exoplayer.InterfaceC6071q0
        public a3.F b() {
            return this.f55504a.V();
        }

        public void c(int i10) {
            this.f55507d = i10;
            this.f55508e = false;
            this.f55506c.clear();
        }

        public c(androidx.media3.exoplayer.source.r rVar, boolean z10) {
            this.f55504a = new androidx.media3.exoplayer.source.p(rVar, z10);
        }
    }

    public interface d {
        void c();
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f55488b.remove(i12);
            this.f55490d.remove(cVarRemove.f55505b);
            g(i12, -cVarRemove.f55504a.V().p());
            cVarRemove.f55508e = true;
            if (this.f55497k) {
                u(cVarRemove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.b n(c cVar, r.b bVar) {
        for (int i10 = 0; i10 < cVar.f55506c.size(); i10++) {
            if (cVar.f55506c.get(i10).f56936d == bVar.f56936d) {
                return bVar.a(p(cVar, bVar.f56933a));
            }
        }
        return null;
    }

    public a3.F E(int i10, int i11, List<a3.v> list) {
        C13466a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        C13466a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.f55488b.get(i12).f55504a.c(list.get(i12 - i10));
        }
        return i();
    }

    public a3.F v(int i10, int i11, int i12, p3.s sVar) {
        C13466a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f55496j = sVar;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iP = this.f55488b.get(iMin).f55507d;
        d3.P.L0(this.f55488b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f55488b.get(iMin);
            cVar.f55507d = iP;
            iP += cVar.f55504a.V().p();
            iMin++;
        }
        return i();
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r f55501a;

        /* renamed from: b, reason: collision with root package name */
        public final r.c f55502b;

        /* renamed from: c, reason: collision with root package name */
        public final a f55503c;

        public b(androidx.media3.exoplayer.source.r rVar, r.c cVar, a aVar) {
            this.f55501a = rVar;
            this.f55502b = cVar;
            this.f55503c = aVar;
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f55488b.size()) {
            this.f55488b.get(i10).f55507d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f55492f.get(cVar);
        if (bVar != null) {
            bVar.f55501a.l(bVar.f55502b);
        }
    }

    private void k() {
        Iterator<c> it = this.f55493g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f55506c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f55493g.add(cVar);
        b bVar = this.f55492f.get(cVar);
        if (bVar != null) {
            bVar.f55501a.i(bVar.f55502b);
        }
    }

    private static Object p(c cVar, Object obj) {
        return AbstractC14332a.y(cVar.f55505b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f55507d;
    }

    private void u(c cVar) {
        if (cVar.f55508e && cVar.f55506c.isEmpty()) {
            b bVar = (b) C13466a.e(this.f55492f.remove(cVar));
            bVar.f55501a.k(bVar.f55502b);
            bVar.f55501a.b(bVar.f55503c);
            bVar.f55501a.g(bVar.f55503c);
            this.f55493g.remove(cVar);
        }
    }

    private void x(c cVar) {
        androidx.media3.exoplayer.source.p pVar = cVar.f55504a;
        r.c cVar2 = new r.c() { // from class: androidx.media3.exoplayer.r0
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar, a3.F f10) {
                this.f56550a.f55491e.c();
            }
        };
        a aVar = new a(cVar);
        this.f55492f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.a(d3.P.B(), aVar);
        pVar.f(d3.P.B(), aVar);
        pVar.d(cVar2, this.f55498l, this.f55487a);
    }

    public a3.F A(int i10, int i11, p3.s sVar) {
        C13466a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f55496j = sVar;
        B(i10, i11);
        return i();
    }

    public a3.F C(List<c> list, p3.s sVar) {
        B(0, this.f55488b.size());
        return f(this.f55488b.size(), list, sVar);
    }

    public androidx.media3.exoplayer.source.q h(r.b bVar, t3.b bVar2, long j10) {
        Object objO = o(bVar.f56933a);
        r.b bVarA = bVar.a(m(bVar.f56933a));
        c cVar = (c) C13466a.e(this.f55490d.get(objO));
        l(cVar);
        cVar.f55506c.add(bVarA);
        androidx.media3.exoplayer.source.o oVarJ = cVar.f55504a.j(bVarA, bVar2, j10);
        this.f55489c.put(oVarJ, cVar);
        k();
        return oVarJ;
    }

    public a3.F i() {
        if (this.f55488b.isEmpty()) {
            return a3.F.f43583a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f55488b.size(); i10++) {
            c cVar = this.f55488b.get(i10);
            cVar.f55507d = iP;
            iP += cVar.f55504a.V().p();
        }
        return new G0(this.f55488b, this.f55496j);
    }

    public p3.s q() {
        return this.f55496j;
    }

    public int r() {
        return this.f55488b.size();
    }

    public boolean t() {
        return this.f55497k;
    }

    public void w(f3.o oVar) {
        C13466a.g(!this.f55497k);
        this.f55498l = oVar;
        for (int i10 = 0; i10 < this.f55488b.size(); i10++) {
            c cVar = this.f55488b.get(i10);
            x(cVar);
            this.f55493g.add(cVar);
        }
        this.f55497k = true;
    }

    public void y() {
        for (b bVar : this.f55492f.values()) {
            try {
                bVar.f55501a.k(bVar.f55502b);
            } catch (RuntimeException e10) {
                d3.r.e("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f55501a.b(bVar.f55503c);
            bVar.f55501a.g(bVar.f55503c);
        }
        this.f55492f.clear();
        this.f55493g.clear();
        this.f55497k = false;
    }

    public void z(androidx.media3.exoplayer.source.q qVar) {
        c cVar = (c) C13466a.e(this.f55489c.remove(qVar));
        cVar.f55504a.h(qVar);
        cVar.f55506c.remove(((androidx.media3.exoplayer.source.o) qVar).f56911a);
        if (!this.f55489c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public D0(d dVar, InterfaceC14596a interfaceC14596a, InterfaceC13479n interfaceC13479n, E1 e12) {
        this.f55487a = e12;
        this.f55491e = dVar;
        this.f55494h = interfaceC14596a;
        this.f55495i = interfaceC13479n;
    }

    private static Object m(Object obj) {
        return AbstractC14332a.v(obj);
    }

    private static Object o(Object obj) {
        return AbstractC14332a.w(obj);
    }

    public a3.F D(p3.s sVar) {
        int iR = r();
        if (sVar.getLength() != iR) {
            sVar = sVar.e().g(0, iR);
        }
        this.f55496j = sVar;
        return i();
    }

    public a3.F f(int i10, List<c> list, p3.s sVar) {
        if (!list.isEmpty()) {
            this.f55496j = sVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f55488b.get(i11 - 1);
                    cVar.c(cVar2.f55507d + cVar2.f55504a.V().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f55504a.V().p());
                this.f55488b.add(i11, cVar);
                this.f55490d.put(cVar.f55505b, cVar);
                if (this.f55497k) {
                    x(cVar);
                    if (this.f55489c.isEmpty()) {
                        this.f55493g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }
}
