package i3;

import a3.F;
import android.util.Base64;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import i3.B1;
import i3.InterfaceC14602b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: i3.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14642t0 implements B1 {

    /* renamed from: i, reason: collision with root package name */
    public static final De.w<String> f136911i = new De.w() { // from class: i3.s0
        @Override // De.w
        public final Object get() {
            return C14642t0.m();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private static final Random f136912j = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final F.c f136913a;

    /* renamed from: b, reason: collision with root package name */
    private final F.b f136914b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f136915c;

    /* renamed from: d, reason: collision with root package name */
    private final De.w<String> f136916d;

    /* renamed from: e, reason: collision with root package name */
    private B1.a f136917e;

    /* renamed from: f, reason: collision with root package name */
    private a3.F f136918f;

    /* renamed from: g, reason: collision with root package name */
    private String f136919g;

    /* renamed from: h, reason: collision with root package name */
    private long f136920h;

    /* renamed from: i3.t0$a */
    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f136921a;

        /* renamed from: b, reason: collision with root package name */
        private int f136922b;

        /* renamed from: c, reason: collision with root package name */
        private long f136923c;

        /* renamed from: d, reason: collision with root package name */
        private r.b f136924d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f136925e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f136926f;

        public boolean i(int i10, r.b bVar) {
            if (bVar == null) {
                return i10 == this.f136922b;
            }
            r.b bVar2 = this.f136924d;
            return bVar2 == null ? !bVar.b() && bVar.f57160d == this.f136923c : bVar.f57160d == bVar2.f57160d && bVar.f57158b == bVar2.f57158b && bVar.f57159c == bVar2.f57159c;
        }

        public a(String str, int i10, r.b bVar) {
            this.f136921a = str;
            this.f136922b = i10;
            this.f136923c = bVar == null ? -1L : bVar.f57160d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f136924d = bVar;
        }

        public boolean j(InterfaceC14602b.a aVar) {
            r.b bVar = aVar.f136806d;
            if (bVar == null) {
                return this.f136922b != aVar.f136805c;
            }
            long j10 = this.f136923c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f57160d > j10) {
                return true;
            }
            if (this.f136924d == null) {
                return false;
            }
            int iB = aVar.f136804b.b(bVar.f57157a);
            int iB2 = aVar.f136804b.b(this.f136924d.f57157a);
            r.b bVar2 = aVar.f136806d;
            if (bVar2.f57160d < this.f136924d.f57160d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f136806d.f57161e;
                return i10 == -1 || i10 > this.f136924d.f57158b;
            }
            r.b bVar3 = aVar.f136806d;
            int i11 = bVar3.f57158b;
            int i12 = bVar3.f57159c;
            r.b bVar4 = this.f136924d;
            int i13 = bVar4.f57158b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f57159c);
        }

        public void k(int i10, r.b bVar) {
            if (this.f136923c != -1 || i10 != this.f136922b || bVar == null || bVar.f57160d < C14642t0.this.n()) {
                return;
            }
            this.f136923c = bVar.f57160d;
        }

        public boolean m(a3.F f10, a3.F f11) {
            int iL = l(f10, f11, this.f136922b);
            this.f136922b = iL;
            if (iL == -1) {
                return false;
            }
            r.b bVar = this.f136924d;
            return bVar == null || f11.b(bVar.f57157a) != -1;
        }

        private int l(a3.F f10, a3.F f11, int i10) {
            if (i10 >= f10.p()) {
                if (i10 >= f11.p()) {
                    return -1;
                }
                return i10;
            }
            f10.n(i10, C14642t0.this.f136913a);
            for (int i11 = C14642t0.this.f136913a.f44446n; i11 <= C14642t0.this.f136913a.f44447o; i11++) {
                int iB = f11.b(f10.m(i11));
                if (iB != -1) {
                    return f11.f(iB, C14642t0.this.f136914b).f44412c;
                }
            }
            return -1;
        }
    }

    public C14642t0() {
        this(f136911i);
    }

    @Override // i3.B1
    public synchronized String a() {
        return this.f136919g;
    }

    @Override // i3.B1
    public synchronized String b(a3.F f10, r.b bVar) {
        return o(f10.h(bVar.f57157a, this.f136914b).f44412c, bVar).f136921a;
    }

    @Override // i3.B1
    public synchronized void e(InterfaceC14602b.a aVar, int i10) {
        try {
            C13599a.e(this.f136917e);
            boolean z10 = i10 == 0;
            Iterator<a> it = this.f136915c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f136925e) {
                        boolean zEquals = next.f136921a.equals(this.f136919g);
                        boolean z11 = z10 && zEquals && next.f136926f;
                        if (zEquals) {
                            l(next);
                        }
                        this.f136917e.s(aVar, next.f136921a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // i3.B1
    public synchronized void f(InterfaceC14602b.a aVar) {
        B1.a aVar2;
        try {
            String str = this.f136919g;
            if (str != null) {
                l((a) C13599a.e(this.f136915c.get(str)));
            }
            Iterator<a> it = this.f136915c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f136925e && (aVar2 = this.f136917e) != null) {
                    aVar2.s(aVar, next.f136921a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // i3.B1
    public synchronized void g(InterfaceC14602b.a aVar) {
        try {
            C13599a.e(this.f136917e);
            a3.F f10 = this.f136918f;
            this.f136918f = aVar.f136804b;
            Iterator<a> it = this.f136915c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(f10, this.f136918f) || next.j(aVar)) {
                    it.remove();
                    if (next.f136925e) {
                        if (next.f136921a.equals(this.f136919g)) {
                            l(next);
                        }
                        this.f136917e.s(aVar, next.f136921a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C14642t0(De.w<String> wVar) {
        this.f136916d = wVar;
        this.f136913a = new F.c();
        this.f136914b = new F.b();
        this.f136915c = new HashMap<>();
        this.f136918f = a3.F.f44401a;
        this.f136920h = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f136912j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f136915c.get(this.f136919g);
        return (aVar == null || aVar.f136923c == -1) ? this.f136920h + 1 : aVar.f136923c;
    }

    private a o(int i10, r.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f136915c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f136923c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) d3.P.h(aVar)).f136924d != null && aVar2.f136924d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f136916d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f136915c.put(str, aVar3);
        return aVar3;
    }

    private void p(InterfaceC14602b.a aVar) {
        if (aVar.f136804b.q()) {
            String str = this.f136919g;
            if (str != null) {
                l((a) C13599a.e(this.f136915c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f136915c.get(this.f136919g);
        a aVarO = o(aVar.f136805c, aVar.f136806d);
        this.f136919g = aVarO.f136921a;
        c(aVar);
        r.b bVar = aVar.f136806d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f136923c == aVar.f136806d.f57160d && aVar2.f136924d != null && aVar2.f136924d.f57158b == aVar.f136806d.f57158b && aVar2.f136924d.f57159c == aVar.f136806d.f57159c) {
            return;
        }
        r.b bVar2 = aVar.f136806d;
        this.f136917e.C(aVar, o(aVar.f136805c, new r.b(bVar2.f57157a, bVar2.f57160d)).f136921a, aVarO.f136921a);
    }

    @Override // i3.B1
    public synchronized void c(InterfaceC14602b.a aVar) {
        C13599a.e(this.f136917e);
        if (aVar.f136804b.q()) {
            return;
        }
        r.b bVar = aVar.f136806d;
        if (bVar != null) {
            if (bVar.f57160d < n()) {
                return;
            }
            a aVar2 = this.f136915c.get(this.f136919g);
            if (aVar2 != null && aVar2.f136923c == -1 && aVar2.f136922b != aVar.f136805c) {
                return;
            }
        }
        a aVarO = o(aVar.f136805c, aVar.f136806d);
        if (this.f136919g == null) {
            this.f136919g = aVarO.f136921a;
        }
        r.b bVar2 = aVar.f136806d;
        if (bVar2 != null && bVar2.b()) {
            r.b bVar3 = aVar.f136806d;
            r.b bVar4 = new r.b(bVar3.f57157a, bVar3.f57160d, bVar3.f57158b);
            a aVarO2 = o(aVar.f136805c, bVar4);
            if (!aVarO2.f136925e) {
                aVarO2.f136925e = true;
                aVar.f136804b.h(aVar.f136806d.f57157a, this.f136914b);
                this.f136917e.K(new InterfaceC14602b.a(aVar.f136803a, aVar.f136804b, aVar.f136805c, bVar4, Math.max(0L, d3.P.j1(this.f136914b.f(aVar.f136806d.f57158b)) + this.f136914b.n()), aVar.f136808f, aVar.f136809g, aVar.f136810h, aVar.f136811i, aVar.f136812j), aVarO2.f136921a);
            }
        }
        if (!aVarO.f136925e) {
            aVarO.f136925e = true;
            this.f136917e.K(aVar, aVarO.f136921a);
        }
        if (aVarO.f136921a.equals(this.f136919g) && !aVarO.f136926f) {
            aVarO.f136926f = true;
            this.f136917e.x(aVar, aVarO.f136921a);
        }
    }

    @Override // i3.B1
    public void d(B1.a aVar) {
        this.f136917e = aVar;
    }

    private void l(a aVar) {
        if (aVar.f136923c != -1) {
            this.f136920h = aVar.f136923c;
        }
        this.f136919g = null;
    }
}
