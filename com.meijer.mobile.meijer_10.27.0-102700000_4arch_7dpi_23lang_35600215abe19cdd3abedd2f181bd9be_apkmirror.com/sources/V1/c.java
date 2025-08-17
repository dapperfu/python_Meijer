package V1;

import V1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f36557a;

    /* renamed from: b, reason: collision with root package name */
    protected e f36558b;

    /* renamed from: c, reason: collision with root package name */
    protected e f36559c;

    /* renamed from: d, reason: collision with root package name */
    protected e f36560d;

    /* renamed from: e, reason: collision with root package name */
    protected e f36561e;

    /* renamed from: f, reason: collision with root package name */
    protected e f36562f;

    /* renamed from: g, reason: collision with root package name */
    protected e f36563g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f36564h;

    /* renamed from: i, reason: collision with root package name */
    protected int f36565i;

    /* renamed from: j, reason: collision with root package name */
    protected int f36566j;

    /* renamed from: k, reason: collision with root package name */
    protected float f36567k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f36568l;

    /* renamed from: m, reason: collision with root package name */
    int f36569m;

    /* renamed from: n, reason: collision with root package name */
    int f36570n;

    /* renamed from: o, reason: collision with root package name */
    boolean f36571o;

    /* renamed from: p, reason: collision with root package name */
    private int f36572p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f36573q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f36574r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f36575s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f36576t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f36577u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f36578v;

    private void b() {
        int i10 = this.f36572p * 2;
        e eVar = this.f36557a;
        this.f36571o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f36565i++;
            e[] eVarArr = eVar.f36661s0;
            int i11 = this.f36572p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f36659r0[i11] = null;
            if (eVar.O() != 8) {
                this.f36568l++;
                e.b bVarS = eVar.s(this.f36572p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f36569m += eVar.A(this.f36572p);
                }
                int iC = this.f36569m + eVar.f36607J[i10].c();
                this.f36569m = iC;
                int i12 = i10 + 1;
                this.f36569m = iC + eVar.f36607J[i12].c();
                int iC2 = this.f36570n + eVar.f36607J[i10].c();
                this.f36570n = iC2;
                this.f36570n = iC2 + eVar.f36607J[i12].c();
                if (this.f36558b == null) {
                    this.f36558b = eVar;
                }
                this.f36560d = eVar;
                e.b[] bVarArr = eVar.f36610M;
                int i13 = this.f36572p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f36650n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f36566j++;
                        float f10 = eVar.f36657q0[i13];
                        if (f10 > 0.0f) {
                            this.f36567k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f36574r = true;
                            } else {
                                this.f36575s = true;
                            }
                            if (this.f36564h == null) {
                                this.f36564h = new ArrayList<>();
                            }
                            this.f36564h.add(eVar);
                        }
                        if (this.f36562f == null) {
                            this.f36562f = eVar;
                        }
                        e eVar4 = this.f36563g;
                        if (eVar4 != null) {
                            eVar4.f36659r0[this.f36572p] = eVar;
                        }
                        this.f36563g = eVar;
                    }
                    if (this.f36572p == 0) {
                        if (eVar.f36646l != 0 || eVar.f36652o != 0 || eVar.f36654p != 0) {
                            this.f36571o = false;
                        }
                    } else if (eVar.f36648m != 0 || eVar.f36658r != 0 || eVar.f36660s != 0) {
                        this.f36571o = false;
                    }
                    if (eVar.f36614Q != 0.0f) {
                        this.f36571o = false;
                        this.f36577u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f36661s0[this.f36572p] = eVar;
            }
            d dVar = eVar.f36607J[i10 + 1].f36582d;
            if (dVar != null) {
                e eVar5 = dVar.f36580b;
                d dVar2 = eVar5.f36607J[i10].f36582d;
                if (dVar2 != null && dVar2.f36580b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z10 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f36558b;
        if (eVar6 != null) {
            this.f36569m -= eVar6.f36607J[i10].c();
        }
        e eVar7 = this.f36560d;
        if (eVar7 != null) {
            this.f36569m -= eVar7.f36607J[i10 + 1].c();
        }
        this.f36559c = eVar;
        if (this.f36572p == 0 && this.f36573q) {
            this.f36561e = eVar;
        } else {
            this.f36561e = this.f36557a;
        }
        this.f36576t = this.f36575s && this.f36574r;
    }

    public void a() {
        if (!this.f36578v) {
            b();
        }
        this.f36578v = true;
    }

    public c(e eVar, int i10, boolean z10) {
        this.f36557a = eVar;
        this.f36572p = i10;
        this.f36573q = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.O() != 8 && eVar.f36610M[i10] == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f36650n[i10];
            if (i11 == 0 || i11 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
