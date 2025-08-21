package V1;

import V1.e;
import W1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class f extends m {

    /* renamed from: C0, reason: collision with root package name */
    int f39540C0;

    /* renamed from: D0, reason: collision with root package name */
    int f39541D0;

    /* renamed from: E0, reason: collision with root package name */
    int f39542E0;

    /* renamed from: F0, reason: collision with root package name */
    int f39543F0;

    /* renamed from: x0, reason: collision with root package name */
    W1.b f39558x0 = new W1.b(this);

    /* renamed from: y0, reason: collision with root package name */
    public W1.e f39559y0 = new W1.e(this);

    /* renamed from: z0, reason: collision with root package name */
    protected b.InterfaceC0873b f39560z0 = null;

    /* renamed from: A0, reason: collision with root package name */
    private boolean f39538A0 = false;

    /* renamed from: B0, reason: collision with root package name */
    protected U1.d f39539B0 = new U1.d();

    /* renamed from: G0, reason: collision with root package name */
    int f39544G0 = 0;

    /* renamed from: H0, reason: collision with root package name */
    int f39545H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    c[] f39546I0 = new c[4];

    /* renamed from: J0, reason: collision with root package name */
    c[] f39547J0 = new c[4];

    /* renamed from: K0, reason: collision with root package name */
    public boolean f39548K0 = false;

    /* renamed from: L0, reason: collision with root package name */
    public boolean f39549L0 = false;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f39550M0 = false;

    /* renamed from: N0, reason: collision with root package name */
    public int f39551N0 = 0;

    /* renamed from: O0, reason: collision with root package name */
    public int f39552O0 = 0;

    /* renamed from: P0, reason: collision with root package name */
    private int f39553P0 = 263;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f39554Q0 = false;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f39555R0 = false;

    /* renamed from: S0, reason: collision with root package name */
    private boolean f39556S0 = false;

    /* renamed from: T0, reason: collision with root package name */
    int f39557T0 = 0;

    private void e1() {
        this.f39544G0 = 0;
        this.f39545H0 = 0;
    }

    public boolean W0() {
        return false;
    }

    public void i1(U1.d dVar, boolean[] zArr) {
        zArr[2] = false;
        J0(dVar);
        int size = this.f39627w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f39627w0.get(i10).J0(dVar);
        }
    }

    private void P0(e eVar) {
        int i10 = this.f39544G0 + 1;
        c[] cVarArr = this.f39547J0;
        if (i10 >= cVarArr.length) {
            this.f39547J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f39547J0[this.f39544G0] = new c(eVar, 0, a1());
        this.f39544G0++;
    }

    private void Q0(e eVar) {
        int i10 = this.f39545H0 + 1;
        c[] cVarArr = this.f39546I0;
        if (i10 >= cVarArr.length) {
            this.f39546I0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f39546I0[this.f39545H0] = new c(eVar, 1, a1());
        this.f39545H0++;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01cb A[PHI: r0 r12
      0x01cb: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:69:0x0190, B:77:0x01b3, B:78:0x01b5, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]
      0x01cb: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean) binds: [B:69:0x0190, B:77:0x01b3, B:78:0x01b5, B:80:0x01bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    @Override // V1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K0() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: V1.f.K0():void");
    }

    void N0(e eVar, int i10) {
        if (i10 == 0) {
            P0(eVar);
        } else if (i10 == 1) {
            Q0(eVar);
        }
    }

    public boolean R0(boolean z10) {
        return this.f39559y0.f(z10);
    }

    public boolean S0(boolean z10) {
        return this.f39559y0.g(z10);
    }

    public boolean T0(boolean z10, int i10) {
        return this.f39559y0.h(z10, i10);
    }

    public b.InterfaceC0873b U0() {
        return this.f39560z0;
    }

    public int V0() {
        return this.f39553P0;
    }

    public void X0() {
        this.f39559y0.j();
    }

    @Override // V1.m, V1.e
    public void Y() {
        this.f39539B0.D();
        this.f39540C0 = 0;
        this.f39542E0 = 0;
        this.f39541D0 = 0;
        this.f39543F0 = 0;
        this.f39554Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.f39559y0.k();
    }

    public boolean Z0() {
        return this.f39556S0;
    }

    public boolean a1() {
        return this.f39538A0;
    }

    public boolean b1() {
        return this.f39555R0;
    }

    public long c1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.f39540C0 = i17;
        this.f39541D0 = i18;
        return this.f39558x0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean d1(int i10) {
        return (this.f39553P0 & i10) == i10;
    }

    public void f1(b.InterfaceC0873b interfaceC0873b) {
        this.f39560z0 = interfaceC0873b;
        this.f39559y0.n(interfaceC0873b);
    }

    public void g1(int i10) {
        this.f39553P0 = i10;
        U1.d.f36969r = k.b(i10, 256);
    }

    public void h1(boolean z10) {
        this.f39538A0 = z10;
    }

    public void j1() {
        this.f39558x0.e(this);
    }

    @Override // V1.e
    public void I0(boolean z10, boolean z11) {
        super.I0(z10, z11);
        int size = this.f39627w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f39627w0.get(i10).I0(z10, z11);
        }
    }

    public boolean O0(U1.d dVar) {
        f(dVar);
        int size = this.f39627w0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f39627w0.get(i10);
            eVar.o0(0, false);
            eVar.o0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.f39627w0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).N0();
                }
            }
        }
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.f39627w0.get(i12);
            if (eVar3.e()) {
                eVar3.f(dVar);
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            e eVar4 = this.f39627w0.get(i13);
            if (eVar4 instanceof f) {
                e.b[] bVarArr = eVar4.f39470M;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                e.b bVar3 = e.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    eVar4.l0(e.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(e.b.FIXED);
                }
                eVar4.f(dVar);
                if (bVar == bVar3) {
                    eVar4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    eVar4.A0(bVar2);
                }
            } else {
                k.a(this, dVar, eVar4);
                if (!eVar4.e()) {
                    eVar4.f(dVar);
                }
            }
        }
        if (this.f39544G0 > 0) {
            b.a(this, dVar, 0);
        }
        if (this.f39545H0 > 0) {
            b.a(this, dVar, 1);
        }
        return true;
    }
}
