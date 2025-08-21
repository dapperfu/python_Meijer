package Q1;

import Q1.e;
import R1.b;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: L0, reason: collision with root package name */
    R1.b f27651L0;

    /* renamed from: M0, reason: collision with root package name */
    public R1.e f27652M0;

    /* renamed from: N0, reason: collision with root package name */
    private int f27653N0;

    /* renamed from: O0, reason: collision with root package name */
    protected b.InterfaceC0733b f27654O0;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f27655P0;

    /* renamed from: Q0, reason: collision with root package name */
    protected M1.d f27656Q0;

    /* renamed from: R0, reason: collision with root package name */
    int f27657R0;

    /* renamed from: S0, reason: collision with root package name */
    int f27658S0;

    /* renamed from: T0, reason: collision with root package name */
    int f27659T0;

    /* renamed from: U0, reason: collision with root package name */
    int f27660U0;

    /* renamed from: V0, reason: collision with root package name */
    public int f27661V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f27662W0;

    /* renamed from: X0, reason: collision with root package name */
    c[] f27663X0;

    /* renamed from: Y0, reason: collision with root package name */
    c[] f27664Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public boolean f27665Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f27666a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f27667b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f27668c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f27669d1;

    /* renamed from: e1, reason: collision with root package name */
    private int f27670e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f27671f1;

    /* renamed from: g1, reason: collision with root package name */
    private boolean f27672g1;

    /* renamed from: h1, reason: collision with root package name */
    private boolean f27673h1;

    /* renamed from: i1, reason: collision with root package name */
    int f27674i1;

    /* renamed from: j1, reason: collision with root package name */
    private WeakReference<d> f27675j1;

    /* renamed from: k1, reason: collision with root package name */
    private WeakReference<d> f27676k1;

    /* renamed from: l1, reason: collision with root package name */
    private WeakReference<d> f27677l1;

    /* renamed from: m1, reason: collision with root package name */
    private WeakReference<d> f27678m1;

    /* renamed from: n1, reason: collision with root package name */
    HashSet<e> f27679n1;

    /* renamed from: o1, reason: collision with root package name */
    public b.a f27680o1;

    public f() {
        this.f27651L0 = new R1.b(this);
        this.f27652M0 = new R1.e(this);
        this.f27654O0 = null;
        this.f27655P0 = false;
        this.f27656Q0 = new M1.d();
        this.f27661V0 = 0;
        this.f27662W0 = 0;
        this.f27663X0 = new c[4];
        this.f27664Y0 = new c[4];
        this.f27665Z0 = false;
        this.f27666a1 = false;
        this.f27667b1 = false;
        this.f27668c1 = 0;
        this.f27669d1 = 0;
        this.f27670e1 = 257;
        this.f27671f1 = false;
        this.f27672g1 = false;
        this.f27673h1 = false;
        this.f27674i1 = 0;
        this.f27675j1 = null;
        this.f27676k1 = null;
        this.f27677l1 = null;
        this.f27678m1 = null;
        this.f27679n1 = new HashSet<>();
        this.f27680o1 = new b.a();
    }

    public static boolean v1(int i10, e eVar, b.InterfaceC0733b interfaceC0733b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0733b == null) {
            return false;
        }
        if (eVar.L() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.f31565e = 0;
            aVar.f31566f = 0;
            return false;
        }
        aVar.f31561a = eVar.v();
        aVar.f31562b = eVar.K();
        aVar.f31563c = eVar.M();
        aVar.f31564d = eVar.s();
        aVar.f31569i = false;
        aVar.f31570j = i11;
        e.b bVar = aVar.f31561a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z10 = bVar == bVar2;
        boolean z11 = aVar.f31562b == bVar2;
        boolean z12 = z10 && eVar.f27597c0 > 0.0f;
        boolean z13 = z11 && eVar.f27597c0 > 0.0f;
        if (z10 && eVar.Q(0) && eVar.f27636w == 0 && !z12) {
            aVar.f31561a = e.b.WRAP_CONTENT;
            if (z11 && eVar.f27638x == 0) {
                aVar.f31561a = e.b.FIXED;
            }
            z10 = false;
        }
        if (z11 && eVar.Q(1) && eVar.f27638x == 0 && !z13) {
            aVar.f31562b = e.b.WRAP_CONTENT;
            if (z10 && eVar.f27636w == 0) {
                aVar.f31562b = e.b.FIXED;
            }
            z11 = false;
        }
        if (eVar.c0()) {
            aVar.f31561a = e.b.FIXED;
            z10 = false;
        }
        if (eVar.d0()) {
            aVar.f31562b = e.b.FIXED;
            z11 = false;
        }
        if (z12) {
            if (eVar.f27640y[0] == 4) {
                aVar.f31561a = e.b.FIXED;
            } else if (!z11) {
                e.b bVar3 = aVar.f31562b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i13 = aVar.f31564d;
                } else {
                    aVar.f31561a = e.b.WRAP_CONTENT;
                    interfaceC0733b.b(eVar, aVar);
                    i13 = aVar.f31566f;
                }
                aVar.f31561a = bVar4;
                aVar.f31563c = (int) (eVar.q() * i13);
            }
        }
        if (z13) {
            if (eVar.f27640y[1] == 4) {
                aVar.f31562b = e.b.FIXED;
            } else if (!z10) {
                e.b bVar5 = aVar.f31561a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i12 = aVar.f31563c;
                } else {
                    aVar.f31562b = e.b.WRAP_CONTENT;
                    interfaceC0733b.b(eVar, aVar);
                    i12 = aVar.f31565e;
                }
                aVar.f31562b = bVar6;
                if (eVar.r() == -1) {
                    aVar.f31564d = (int) (i12 / eVar.q());
                } else {
                    aVar.f31564d = (int) (eVar.q() * i12);
                }
            }
        }
        interfaceC0733b.b(eVar, aVar);
        eVar.R0(aVar.f31565e);
        eVar.w0(aVar.f31566f);
        eVar.v0(aVar.f31568h);
        eVar.l0(aVar.f31567g);
        aVar.f31570j = b.a.f31558k;
        return aVar.f31569i;
    }

    private void x1() {
        this.f27661V0 = 0;
        this.f27662W0 = 0;
    }

    public boolean B1(M1.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zW1 = w1(64);
        W0(dVar, zW1);
        int size = this.f27706K0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f27706K0.get(i10);
            eVar.W0(dVar, zW1);
            if (eVar.S()) {
                z10 = true;
            }
        }
        return z10;
    }

    private void e1(e eVar) {
        int i10 = this.f27661V0 + 1;
        c[] cVarArr = this.f27664Y0;
        if (i10 >= cVarArr.length) {
            this.f27664Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f27664Y0[this.f27661V0] = new c(eVar, 0, t1());
        this.f27661V0++;
    }

    private void h1(d dVar, M1.i iVar) {
        this.f27656Q0.h(iVar, this.f27656Q0.q(dVar), 0, 5);
    }

    private void i1(d dVar, M1.i iVar) {
        this.f27656Q0.h(this.f27656Q0.q(dVar), iVar, 0, 5);
    }

    private void j1(e eVar) {
        int i10 = this.f27662W0 + 1;
        c[] cVarArr = this.f27663X0;
        if (i10 >= cVarArr.length) {
            this.f27663X0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f27663X0[this.f27662W0] = new c(eVar, 1, t1());
        this.f27662W0++;
    }

    public void A1(int i10) {
        this.f27653N0 = i10;
    }

    public void C1() {
        this.f27651L0.e(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x023c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0329 A[PHI: r13 r19
      0x0329: PHI (r13v9 boolean) = (r13v8 boolean), (r13v11 boolean), (r13v11 boolean), (r13v11 boolean) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]
      0x0329: PHI (r19v4 boolean) = (r19v3 boolean), (r19v6 boolean), (r19v6 boolean), (r19v6 boolean) binds: [B:150:0x02e5, B:159:0x030e, B:160:0x0310, B:162:0x0316] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0330  */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    @Override // Q1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Z0() {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.f.Z0():void");
    }

    void c1(e eVar, int i10) {
        if (i10 == 0) {
            e1(eVar);
        } else if (i10 == 1) {
            j1(eVar);
        }
    }

    public boolean d1(M1.d dVar) {
        f fVar;
        M1.d dVar2;
        boolean zW1 = w1(64);
        d(dVar, zW1);
        int size = this.f27706K0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f27706K0.get(i10);
            eVar.D0(0, false);
            eVar.D0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f27706K0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).f1();
                }
            }
        }
        this.f27679n1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.f27706K0.get(i12);
            if (eVar3.c()) {
                if (eVar3 instanceof k) {
                    this.f27679n1.add(eVar3);
                } else {
                    eVar3.d(dVar, zW1);
                }
            }
        }
        while (this.f27679n1.size() > 0) {
            int size2 = this.f27679n1.size();
            Iterator<e> it = this.f27679n1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.a1(this.f27679n1)) {
                    kVar.d(dVar, zW1);
                    this.f27679n1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f27679n1.size()) {
                Iterator<e> it2 = this.f27679n1.iterator();
                while (it2.hasNext()) {
                    it2.next().d(dVar, zW1);
                }
                this.f27679n1.clear();
            }
        }
        if (M1.d.f19565r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.f27706K0.get(i13);
                if (!eVar4.c()) {
                    hashSet.add(eVar4);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.b(this, dVar2, hashSet, v() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                j.a(this, dVar2, next);
                next.d(dVar2, zW1);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = fVar.f27706K0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.f27590Y;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.A0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.N0(e.b.FIXED);
                    }
                    eVar5.d(dVar2, zW1);
                    if (bVar == bVar3) {
                        eVar5.A0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.N0(bVar2);
                    }
                } else {
                    j.a(this, dVar2, eVar5);
                    if (!eVar5.c()) {
                        eVar5.d(dVar2, zW1);
                    }
                }
            }
        }
        if (fVar.f27661V0 > 0) {
            b.b(this, dVar2, null, 0);
        }
        if (fVar.f27662W0 > 0) {
            b.b(this, dVar2, null, 1);
        }
        return true;
    }

    public void f1(d dVar) {
        WeakReference<d> weakReference = this.f27678m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f27678m1.get().d()) {
            this.f27678m1 = new WeakReference<>(dVar);
        }
    }

    public void g1(d dVar) {
        WeakReference<d> weakReference = this.f27676k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f27676k1.get().d()) {
            this.f27676k1 = new WeakReference<>(dVar);
        }
    }

    @Override // Q1.l, Q1.e
    public void i0() {
        this.f27656Q0.D();
        this.f27657R0 = 0;
        this.f27659T0 = 0;
        this.f27658S0 = 0;
        this.f27660U0 = 0;
        this.f27671f1 = false;
        super.i0();
    }

    void k1(d dVar) {
        WeakReference<d> weakReference = this.f27677l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f27677l1.get().d()) {
            this.f27677l1 = new WeakReference<>(dVar);
        }
    }

    void l1(d dVar) {
        WeakReference<d> weakReference = this.f27675j1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f27675j1.get().d()) {
            this.f27675j1 = new WeakReference<>(dVar);
        }
    }

    public boolean m1(boolean z10) {
        return this.f27652M0.f(z10);
    }

    public boolean n1(boolean z10) {
        return this.f27652M0.g(z10);
    }

    public boolean o1(boolean z10, int i10) {
        return this.f27652M0.h(z10, i10);
    }

    public b.InterfaceC0733b p1() {
        return this.f27654O0;
    }

    public int q1() {
        return this.f27670e1;
    }

    public M1.d r1() {
        return this.f27656Q0;
    }

    public void s1() {
        this.f27652M0.j();
    }

    public boolean t1() {
        return this.f27655P0;
    }

    public long u1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f27657R0 = i17;
        this.f27658S0 = i18;
        return this.f27651L0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean w1(int i10) {
        return (this.f27670e1 & i10) == i10;
    }

    public void y1(b.InterfaceC0733b interfaceC0733b) {
        this.f27654O0 = interfaceC0733b;
        this.f27652M0.m(interfaceC0733b);
    }

    public void z1(int i10) {
        this.f27670e1 = i10;
        M1.d.f19565r = w1(512);
    }

    @Override // Q1.e
    public void V0(boolean z10, boolean z11) {
        super.V0(z10, z11);
        int size = this.f27706K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f27706K0.get(i10).V0(z10, z11);
        }
    }

    public f(int i10, int i11) {
        super(i10, i11);
        this.f27651L0 = new R1.b(this);
        this.f27652M0 = new R1.e(this);
        this.f27654O0 = null;
        this.f27655P0 = false;
        this.f27656Q0 = new M1.d();
        this.f27661V0 = 0;
        this.f27662W0 = 0;
        this.f27663X0 = new c[4];
        this.f27664Y0 = new c[4];
        this.f27665Z0 = false;
        this.f27666a1 = false;
        this.f27667b1 = false;
        this.f27668c1 = 0;
        this.f27669d1 = 0;
        this.f27670e1 = 257;
        this.f27671f1 = false;
        this.f27672g1 = false;
        this.f27673h1 = false;
        this.f27674i1 = 0;
        this.f27675j1 = null;
        this.f27676k1 = null;
        this.f27677l1 = null;
        this.f27678m1 = null;
        this.f27679n1 = new HashSet<>();
        this.f27680o1 = new b.a();
    }
}
