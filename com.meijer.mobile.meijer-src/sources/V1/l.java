package V1;

import V1.e;
import W1.b;

/* loaded from: classes.dex */
public class l extends j {

    /* renamed from: y0, reason: collision with root package name */
    private int f39625y0 = 0;

    /* renamed from: z0, reason: collision with root package name */
    private int f39626z0 = 0;

    /* renamed from: A0, reason: collision with root package name */
    private int f39614A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private int f39615B0 = 0;

    /* renamed from: C0, reason: collision with root package name */
    private int f39616C0 = 0;

    /* renamed from: D0, reason: collision with root package name */
    private int f39617D0 = 0;

    /* renamed from: E0, reason: collision with root package name */
    private int f39618E0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    private int f39619F0 = 0;

    /* renamed from: G0, reason: collision with root package name */
    private boolean f39620G0 = false;

    /* renamed from: H0, reason: collision with root package name */
    private int f39621H0 = 0;

    /* renamed from: I0, reason: collision with root package name */
    private int f39622I0 = 0;

    /* renamed from: J0, reason: collision with root package name */
    protected b.a f39623J0 = new b.a();

    /* renamed from: K0, reason: collision with root package name */
    b.InterfaceC0873b f39624K0 = null;

    public void L0() {
        for (int i10 = 0; i10 < this.f39612x0; i10++) {
            e eVar = this.f39611w0[i10];
            if (eVar != null) {
                eVar.q0(true);
            }
        }
    }

    public void S0(int i10, int i11, int i12, int i13) {
    }

    public void K0(boolean z10) {
        int i10 = this.f39616C0;
        if (i10 > 0 || this.f39617D0 > 0) {
            if (z10) {
                this.f39618E0 = this.f39617D0;
                this.f39619F0 = i10;
            } else {
                this.f39618E0 = i10;
                this.f39619F0 = this.f39617D0;
            }
        }
    }

    public int M0() {
        return this.f39622I0;
    }

    public int N0() {
        return this.f39621H0;
    }

    public int O0() {
        return this.f39626z0;
    }

    public int P0() {
        return this.f39618E0;
    }

    public int Q0() {
        return this.f39619F0;
    }

    public int R0() {
        return this.f39625y0;
    }

    protected void T0(e eVar, e.b bVar, int i10, e.b bVar2, int i11) {
        while (this.f39624K0 == null && G() != null) {
            this.f39624K0 = ((f) G()).U0();
        }
        b.a aVar = this.f39623J0;
        aVar.f40624a = bVar;
        aVar.f40625b = bVar2;
        aVar.f40626c = i10;
        aVar.f40627d = i11;
        this.f39624K0.b(eVar, aVar);
        eVar.E0(this.f39623J0.f40628e);
        eVar.h0(this.f39623J0.f40629f);
        eVar.g0(this.f39623J0.f40631h);
        eVar.b0(this.f39623J0.f40630g);
    }

    protected boolean U0() {
        e eVar = this.f39471N;
        b.InterfaceC0873b interfaceC0873bU0 = eVar != null ? ((f) eVar).U0() : null;
        if (interfaceC0873bU0 == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.f39612x0; i10++) {
            e eVar2 = this.f39611w0[i10];
            if (eVar2 != null && !(eVar2 instanceof h)) {
                e.b bVarS = eVar2.s(0);
                e.b bVarS2 = eVar2.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || eVar2.f39506l == 1 || bVarS2 != bVar || eVar2.f39508m == 1) {
                    if (bVarS == bVar) {
                        bVarS = e.b.WRAP_CONTENT;
                    }
                    if (bVarS2 == bVar) {
                        bVarS2 = e.b.WRAP_CONTENT;
                    }
                    b.a aVar = this.f39623J0;
                    aVar.f40624a = bVarS;
                    aVar.f40625b = bVarS2;
                    aVar.f40626c = eVar2.P();
                    this.f39623J0.f40627d = eVar2.v();
                    interfaceC0873bU0.b(eVar2, this.f39623J0);
                    eVar2.E0(this.f39623J0.f40628e);
                    eVar2.h0(this.f39623J0.f40629f);
                    eVar2.b0(this.f39623J0.f40630g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.f39620G0;
    }

    protected void W0(boolean z10) {
        this.f39620G0 = z10;
    }

    public void X0(int i10, int i11) {
        this.f39621H0 = i10;
        this.f39622I0 = i11;
    }

    public void Y0(int i10) {
        this.f39614A0 = i10;
        this.f39625y0 = i10;
        this.f39615B0 = i10;
        this.f39626z0 = i10;
        this.f39616C0 = i10;
        this.f39617D0 = i10;
    }

    public void Z0(int i10) {
        this.f39626z0 = i10;
    }

    public void a1(int i10) {
        this.f39617D0 = i10;
    }

    public void b1(int i10) {
        this.f39614A0 = i10;
        this.f39618E0 = i10;
    }

    public void c1(int i10) {
        this.f39615B0 = i10;
        this.f39619F0 = i10;
    }

    public void d1(int i10) {
        this.f39616C0 = i10;
        this.f39618E0 = i10;
        this.f39619F0 = i10;
    }

    public void e1(int i10) {
        this.f39625y0 = i10;
    }

    @Override // V1.j, V1.i
    public void a(f fVar) {
        L0();
    }
}
