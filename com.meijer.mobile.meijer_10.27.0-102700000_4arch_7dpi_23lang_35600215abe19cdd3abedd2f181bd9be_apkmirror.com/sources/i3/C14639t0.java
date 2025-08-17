package i3;

import a3.F;
import android.util.Base64;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import i3.B1;
import i3.InterfaceC14599b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: i3.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14639t0 implements B1 {

    /* renamed from: i, reason: collision with root package name */
    public static final Be.w<String> f137154i = new Be.w() { // from class: i3.s0
        @Override // Be.w
        public final Object get() {
            return C14639t0.m();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    private static final Random f137155j = new Random();

    /* renamed from: a, reason: collision with root package name */
    private final F.c f137156a;

    /* renamed from: b, reason: collision with root package name */
    private final F.b f137157b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, a> f137158c;

    /* renamed from: d, reason: collision with root package name */
    private final Be.w<String> f137159d;

    /* renamed from: e, reason: collision with root package name */
    private B1.a f137160e;

    /* renamed from: f, reason: collision with root package name */
    private a3.F f137161f;

    /* renamed from: g, reason: collision with root package name */
    private String f137162g;

    /* renamed from: h, reason: collision with root package name */
    private long f137163h;

    /* renamed from: i3.t0$a */
    private final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f137164a;

        /* renamed from: b, reason: collision with root package name */
        private int f137165b;

        /* renamed from: c, reason: collision with root package name */
        private long f137166c;

        /* renamed from: d, reason: collision with root package name */
        private r.b f137167d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f137168e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f137169f;

        public boolean i(int i10, r.b bVar) {
            if (bVar == null) {
                return i10 == this.f137165b;
            }
            r.b bVar2 = this.f137167d;
            return bVar2 == null ? !bVar.b() && bVar.f56936d == this.f137166c : bVar.f56936d == bVar2.f56936d && bVar.f56934b == bVar2.f56934b && bVar.f56935c == bVar2.f56935c;
        }

        public a(String str, int i10, r.b bVar) {
            this.f137164a = str;
            this.f137165b = i10;
            this.f137166c = bVar == null ? -1L : bVar.f56936d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f137167d = bVar;
        }

        public boolean j(InterfaceC14599b.a aVar) {
            r.b bVar = aVar.f137049d;
            if (bVar == null) {
                return this.f137165b != aVar.f137048c;
            }
            long j10 = this.f137166c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f56936d > j10) {
                return true;
            }
            if (this.f137167d == null) {
                return false;
            }
            int iB = aVar.f137047b.b(bVar.f56933a);
            int iB2 = aVar.f137047b.b(this.f137167d.f56933a);
            r.b bVar2 = aVar.f137049d;
            if (bVar2.f56936d < this.f137167d.f56936d || iB < iB2) {
                return false;
            }
            if (iB > iB2) {
                return true;
            }
            if (!bVar2.b()) {
                int i10 = aVar.f137049d.f56937e;
                return i10 == -1 || i10 > this.f137167d.f56934b;
            }
            r.b bVar3 = aVar.f137049d;
            int i11 = bVar3.f56934b;
            int i12 = bVar3.f56935c;
            r.b bVar4 = this.f137167d;
            int i13 = bVar4.f56934b;
            return i11 > i13 || (i11 == i13 && i12 > bVar4.f56935c);
        }

        public void k(int i10, r.b bVar) {
            if (this.f137166c != -1 || i10 != this.f137165b || bVar == null || bVar.f56936d < C14639t0.this.n()) {
                return;
            }
            this.f137166c = bVar.f56936d;
        }

        public boolean m(a3.F f10, a3.F f11) {
            int iL = l(f10, f11, this.f137165b);
            this.f137165b = iL;
            if (iL == -1) {
                return false;
            }
            r.b bVar = this.f137167d;
            return bVar == null || f11.b(bVar.f56933a) != -1;
        }

        private int l(a3.F f10, a3.F f11, int i10) {
            if (i10 >= f10.p()) {
                if (i10 >= f11.p()) {
                    return -1;
                }
                return i10;
            }
            f10.n(i10, C14639t0.this.f137156a);
            for (int i11 = C14639t0.this.f137156a.f43628n; i11 <= C14639t0.this.f137156a.f43629o; i11++) {
                int iB = f11.b(f10.m(i11));
                if (iB != -1) {
                    return f11.f(iB, C14639t0.this.f137157b).f43594c;
                }
            }
            return -1;
        }
    }

    public C14639t0() {
        this(f137154i);
    }

    @Override // i3.B1
    public synchronized String a() {
        return this.f137162g;
    }

    @Override // i3.B1
    public synchronized String b(a3.F f10, r.b bVar) {
        return o(f10.h(bVar.f56933a, this.f137157b).f43594c, bVar).f137164a;
    }

    @Override // i3.B1
    public synchronized void e(InterfaceC14599b.a aVar, int i10) {
        try {
            C13466a.e(this.f137160e);
            boolean z10 = i10 == 0;
            Iterator<a> it = this.f137158c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f137168e) {
                        boolean zEquals = next.f137164a.equals(this.f137162g);
                        boolean z11 = z10 && zEquals && next.f137169f;
                        if (zEquals) {
                            l(next);
                        }
                        this.f137160e.s(aVar, next.f137164a, z11);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // i3.B1
    public synchronized void f(InterfaceC14599b.a aVar) {
        B1.a aVar2;
        try {
            String str = this.f137162g;
            if (str != null) {
                l((a) C13466a.e(this.f137158c.get(str)));
            }
            Iterator<a> it = this.f137158c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f137168e && (aVar2 = this.f137160e) != null) {
                    aVar2.s(aVar, next.f137164a, false);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // i3.B1
    public synchronized void g(InterfaceC14599b.a aVar) {
        try {
            C13466a.e(this.f137160e);
            a3.F f10 = this.f137161f;
            this.f137161f = aVar.f137047b;
            Iterator<a> it = this.f137158c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (!next.m(f10, this.f137161f) || next.j(aVar)) {
                    it.remove();
                    if (next.f137168e) {
                        if (next.f137164a.equals(this.f137162g)) {
                            l(next);
                        }
                        this.f137160e.s(aVar, next.f137164a, false);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public C14639t0(Be.w<String> wVar) {
        this.f137159d = wVar;
        this.f137156a = new F.c();
        this.f137157b = new F.b();
        this.f137158c = new HashMap<>();
        this.f137161f = a3.F.f43583a;
        this.f137163h = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f137155j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long n() {
        a aVar = this.f137158c.get(this.f137162g);
        return (aVar == null || aVar.f137166c == -1) ? this.f137163h + 1 : aVar.f137166c;
    }

    private a o(int i10, r.b bVar) {
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a aVar2 : this.f137158c.values()) {
            aVar2.k(i10, bVar);
            if (aVar2.i(i10, bVar)) {
                long j11 = aVar2.f137166c;
                if (j11 == -1 || j11 < j10) {
                    aVar = aVar2;
                    j10 = j11;
                } else if (j11 == j10 && ((a) d3.P.h(aVar)).f137167d != null && aVar2.f137167d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f137159d.get();
        a aVar3 = new a(str, i10, bVar);
        this.f137158c.put(str, aVar3);
        return aVar3;
    }

    private void p(InterfaceC14599b.a aVar) {
        if (aVar.f137047b.q()) {
            String str = this.f137162g;
            if (str != null) {
                l((a) C13466a.e(this.f137158c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f137158c.get(this.f137162g);
        a aVarO = o(aVar.f137048c, aVar.f137049d);
        this.f137162g = aVarO.f137164a;
        c(aVar);
        r.b bVar = aVar.f137049d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f137166c == aVar.f137049d.f56936d && aVar2.f137167d != null && aVar2.f137167d.f56934b == aVar.f137049d.f56934b && aVar2.f137167d.f56935c == aVar.f137049d.f56935c) {
            return;
        }
        r.b bVar2 = aVar.f137049d;
        this.f137160e.C(aVar, o(aVar.f137048c, new r.b(bVar2.f56933a, bVar2.f56936d)).f137164a, aVarO.f137164a);
    }

    @Override // i3.B1
    public synchronized void c(InterfaceC14599b.a aVar) {
        C13466a.e(this.f137160e);
        if (aVar.f137047b.q()) {
            return;
        }
        r.b bVar = aVar.f137049d;
        if (bVar != null) {
            if (bVar.f56936d < n()) {
                return;
            }
            a aVar2 = this.f137158c.get(this.f137162g);
            if (aVar2 != null && aVar2.f137166c == -1 && aVar2.f137165b != aVar.f137048c) {
                return;
            }
        }
        a aVarO = o(aVar.f137048c, aVar.f137049d);
        if (this.f137162g == null) {
            this.f137162g = aVarO.f137164a;
        }
        r.b bVar2 = aVar.f137049d;
        if (bVar2 != null && bVar2.b()) {
            r.b bVar3 = aVar.f137049d;
            r.b bVar4 = new r.b(bVar3.f56933a, bVar3.f56936d, bVar3.f56934b);
            a aVarO2 = o(aVar.f137048c, bVar4);
            if (!aVarO2.f137168e) {
                aVarO2.f137168e = true;
                aVar.f137047b.h(aVar.f137049d.f56933a, this.f137157b);
                this.f137160e.K(new InterfaceC14599b.a(aVar.f137046a, aVar.f137047b, aVar.f137048c, bVar4, Math.max(0L, d3.P.j1(this.f137157b.f(aVar.f137049d.f56934b)) + this.f137157b.n()), aVar.f137051f, aVar.f137052g, aVar.f137053h, aVar.f137054i, aVar.f137055j), aVarO2.f137164a);
            }
        }
        if (!aVarO.f137168e) {
            aVarO.f137168e = true;
            this.f137160e.K(aVar, aVarO.f137164a);
        }
        if (aVarO.f137164a.equals(this.f137162g) && !aVarO.f137169f) {
            aVarO.f137169f = true;
            this.f137160e.x(aVar, aVarO.f137164a);
        }
    }

    @Override // i3.B1
    public void d(B1.a aVar) {
        this.f137160e = aVar;
    }

    private void l(a aVar) {
        if (aVar.f137166c != -1) {
            this.f137163h = aVar.f137166c;
        }
        this.f137162g = null;
    }
}
