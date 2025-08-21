package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.D0;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.InterfaceC13612n;
import h3.AbstractC14445a;
import i3.E1;
import i3.InterfaceC14599a;
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
    private final E1 f55711a;

    /* renamed from: e, reason: collision with root package name */
    private final d f55715e;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC14599a f55718h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC13612n f55719i;

    /* renamed from: k, reason: collision with root package name */
    private boolean f55721k;

    /* renamed from: l, reason: collision with root package name */
    private f3.o f55722l;

    /* renamed from: j, reason: collision with root package name */
    private p3.s f55720j = new s.a(0);

    /* renamed from: c, reason: collision with root package name */
    private final IdentityHashMap<androidx.media3.exoplayer.source.q, c> f55713c = new IdentityHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Object, c> f55714d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final List<c> f55712b = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<c, b> f55716f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final Set<c> f55717g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    final class a implements androidx.media3.exoplayer.source.s, androidx.media3.exoplayer.drm.h {

        /* renamed from: a, reason: collision with root package name */
        private final c f55723a;

        private Pair<Integer, r.b> V(int i10, r.b bVar) {
            r.b bVar2 = null;
            if (bVar != null) {
                r.b bVarN = D0.n(this.f55723a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(D0.s(this.f55723a, i10)), bVar2);
        }

        public a(c cVar) {
            this.f55723a = cVar;
        }

        @Override // androidx.media3.exoplayer.source.s
        public void B(int i10, r.b bVar, final p3.i iVar, final p3.j jVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.s0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f56777a;
                        Pair pair = pairV;
                        D0.this.f55718h.B(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void E(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57183a;
                        Pair pair = pairV;
                        D0.this.f55718h.E(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void G(int i10, r.b bVar, final p3.i iVar, final p3.j jVar, final IOException iOException, final boolean z10) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f55698a;
                        Pair pair = pairV;
                        D0.this.f55718h.G(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void H(int i10, r.b bVar, final p3.i iVar, final p3.j jVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57497a;
                        Pair pair = pairV;
                        D0.this.f55718h.H(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void I(int i10, r.b bVar, final int i11) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57503a;
                        Pair pair = pairV;
                        D0.this.f55718h.I(((Integer) pair.first).intValue(), (r.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void J(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.B0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f55705a;
                        Pair pair = pairV;
                        D0.this.f55718h.J(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void K(int i10, r.b bVar, final Exception exc) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.u0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57186a;
                        Pair pair = pairV;
                        D0.this.f55718h.K(((Integer) pair.first).intValue(), (r.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void L(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.C0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f55708a;
                        Pair pair = pairV;
                        D0.this.f55718h.L(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void M(int i10, r.b bVar, final p3.i iVar, final p3.j jVar, final int i11) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.z0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57506a;
                        Pair pair = pairV;
                        D0.this.f55718h.M(((Integer) pair.first).intValue(), (r.b) pair.second, iVar, jVar, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void P(int i10, r.b bVar, final p3.j jVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.v0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57215a;
                        Pair pair = pairV;
                        D0.this.f55718h.P(((Integer) pair.first).intValue(), (r.b) pair.second, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void Q(int i10, r.b bVar) {
            final Pair<Integer, r.b> pairV = V(i10, bVar);
            if (pairV != null) {
                D0.this.f55719i.post(new Runnable() { // from class: androidx.media3.exoplayer.w0
                    @Override // java.lang.Runnable
                    public final void run() {
                        D0.a aVar = this.f57494a;
                        Pair pair = pairV;
                        D0.this.f55718h.Q(((Integer) pair.first).intValue(), (r.b) pair.second);
                    }
                });
            }
        }
    }

    static final class c implements InterfaceC6213q0 {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.p f55728a;

        /* renamed from: d, reason: collision with root package name */
        public int f55731d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f55732e;

        /* renamed from: c, reason: collision with root package name */
        public final List<r.b> f55730c = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public final Object f55729b = new Object();

        @Override // androidx.media3.exoplayer.InterfaceC6213q0
        public Object a() {
            return this.f55729b;
        }

        @Override // androidx.media3.exoplayer.InterfaceC6213q0
        public a3.F b() {
            return this.f55728a.V();
        }

        public void c(int i10) {
            this.f55731d = i10;
            this.f55732e = false;
            this.f55730c.clear();
        }

        public c(androidx.media3.exoplayer.source.r rVar, boolean z10) {
            this.f55728a = new androidx.media3.exoplayer.source.p(rVar, z10);
        }
    }

    public interface d {
        void c();
    }

    private void B(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVarRemove = this.f55712b.remove(i12);
            this.f55714d.remove(cVarRemove.f55729b);
            g(i12, -cVarRemove.f55728a.V().p());
            cVarRemove.f55732e = true;
            if (this.f55721k) {
                u(cVarRemove);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r.b n(c cVar, r.b bVar) {
        for (int i10 = 0; i10 < cVar.f55730c.size(); i10++) {
            if (cVar.f55730c.get(i10).f57160d == bVar.f57160d) {
                return bVar.a(p(cVar, bVar.f57157a));
            }
        }
        return null;
    }

    public a3.F E(int i10, int i11, List<a3.v> list) {
        C13599a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        C13599a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            this.f55712b.get(i12).f55728a.c(list.get(i12 - i10));
        }
        return i();
    }

    public a3.F v(int i10, int i11, int i12, p3.s sVar) {
        C13599a.a(i10 >= 0 && i10 <= i11 && i11 <= r() && i12 >= 0);
        this.f55720j = sVar;
        if (i10 == i11 || i10 == i12) {
            return i();
        }
        int iMin = Math.min(i10, i12);
        int iMax = Math.max(((i11 - i10) + i12) - 1, i11 - 1);
        int iP = this.f55712b.get(iMin).f55731d;
        d3.P.L0(this.f55712b, i10, i11, i12);
        while (iMin <= iMax) {
            c cVar = this.f55712b.get(iMin);
            cVar.f55731d = iP;
            iP += cVar.f55728a.V().p();
            iMin++;
        }
        return i();
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r f55725a;

        /* renamed from: b, reason: collision with root package name */
        public final r.c f55726b;

        /* renamed from: c, reason: collision with root package name */
        public final a f55727c;

        public b(androidx.media3.exoplayer.source.r rVar, r.c cVar, a aVar) {
            this.f55725a = rVar;
            this.f55726b = cVar;
            this.f55727c = aVar;
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f55712b.size()) {
            this.f55712b.get(i10).f55731d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f55716f.get(cVar);
        if (bVar != null) {
            bVar.f55725a.l(bVar.f55726b);
        }
    }

    private void k() {
        Iterator<c> it = this.f55717g.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.f55730c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f55717g.add(cVar);
        b bVar = this.f55716f.get(cVar);
        if (bVar != null) {
            bVar.f55725a.i(bVar.f55726b);
        }
    }

    private static Object p(c cVar, Object obj) {
        return AbstractC14445a.y(cVar.f55729b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f55731d;
    }

    private void u(c cVar) {
        if (cVar.f55732e && cVar.f55730c.isEmpty()) {
            b bVar = (b) C13599a.e(this.f55716f.remove(cVar));
            bVar.f55725a.k(bVar.f55726b);
            bVar.f55725a.b(bVar.f55727c);
            bVar.f55725a.g(bVar.f55727c);
            this.f55717g.remove(cVar);
        }
    }

    private void x(c cVar) {
        androidx.media3.exoplayer.source.p pVar = cVar.f55728a;
        r.c cVar2 = new r.c() { // from class: androidx.media3.exoplayer.r0
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar, a3.F f10) {
                this.f56774a.f55715e.c();
            }
        };
        a aVar = new a(cVar);
        this.f55716f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.a(d3.P.B(), aVar);
        pVar.f(d3.P.B(), aVar);
        pVar.d(cVar2, this.f55722l, this.f55711a);
    }

    public a3.F A(int i10, int i11, p3.s sVar) {
        C13599a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f55720j = sVar;
        B(i10, i11);
        return i();
    }

    public a3.F C(List<c> list, p3.s sVar) {
        B(0, this.f55712b.size());
        return f(this.f55712b.size(), list, sVar);
    }

    public androidx.media3.exoplayer.source.q h(r.b bVar, t3.b bVar2, long j10) {
        Object objO = o(bVar.f57157a);
        r.b bVarA = bVar.a(m(bVar.f57157a));
        c cVar = (c) C13599a.e(this.f55714d.get(objO));
        l(cVar);
        cVar.f55730c.add(bVarA);
        androidx.media3.exoplayer.source.o oVarJ = cVar.f55728a.j(bVarA, bVar2, j10);
        this.f55713c.put(oVarJ, cVar);
        k();
        return oVarJ;
    }

    public a3.F i() {
        if (this.f55712b.isEmpty()) {
            return a3.F.f44401a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f55712b.size(); i10++) {
            c cVar = this.f55712b.get(i10);
            cVar.f55731d = iP;
            iP += cVar.f55728a.V().p();
        }
        return new G0(this.f55712b, this.f55720j);
    }

    public p3.s q() {
        return this.f55720j;
    }

    public int r() {
        return this.f55712b.size();
    }

    public boolean t() {
        return this.f55721k;
    }

    public void w(f3.o oVar) {
        C13599a.g(!this.f55721k);
        this.f55722l = oVar;
        for (int i10 = 0; i10 < this.f55712b.size(); i10++) {
            c cVar = this.f55712b.get(i10);
            x(cVar);
            this.f55717g.add(cVar);
        }
        this.f55721k = true;
    }

    public void y() {
        for (b bVar : this.f55716f.values()) {
            try {
                bVar.f55725a.k(bVar.f55726b);
            } catch (RuntimeException e10) {
                d3.r.e("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f55725a.b(bVar.f55727c);
            bVar.f55725a.g(bVar.f55727c);
        }
        this.f55716f.clear();
        this.f55717g.clear();
        this.f55721k = false;
    }

    public void z(androidx.media3.exoplayer.source.q qVar) {
        c cVar = (c) C13599a.e(this.f55713c.remove(qVar));
        cVar.f55728a.h(qVar);
        cVar.f55730c.remove(((androidx.media3.exoplayer.source.o) qVar).f57135a);
        if (!this.f55713c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public D0(d dVar, InterfaceC14599a interfaceC14599a, InterfaceC13612n interfaceC13612n, E1 e12) {
        this.f55711a = e12;
        this.f55715e = dVar;
        this.f55718h = interfaceC14599a;
        this.f55719i = interfaceC13612n;
    }

    private static Object m(Object obj) {
        return AbstractC14445a.v(obj);
    }

    private static Object o(Object obj) {
        return AbstractC14445a.w(obj);
    }

    public a3.F D(p3.s sVar) {
        int iR = r();
        if (sVar.getLength() != iR) {
            sVar = sVar.e().g(0, iR);
        }
        this.f55720j = sVar;
        return i();
    }

    public a3.F f(int i10, List<c> list, p3.s sVar) {
        if (!list.isEmpty()) {
            this.f55720j = sVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = this.f55712b.get(i11 - 1);
                    cVar.c(cVar2.f55731d + cVar2.f55728a.V().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f55728a.V().p());
                this.f55712b.add(i11, cVar);
                this.f55714d.put(cVar.f55729b, cVar);
                if (this.f55721k) {
                    x(cVar);
                    if (this.f55713c.isEmpty()) {
                        this.f55717g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }
}
