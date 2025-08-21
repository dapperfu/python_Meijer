package V1;

import V1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f39417a;

    /* renamed from: b, reason: collision with root package name */
    protected e f39418b;

    /* renamed from: c, reason: collision with root package name */
    protected e f39419c;

    /* renamed from: d, reason: collision with root package name */
    protected e f39420d;

    /* renamed from: e, reason: collision with root package name */
    protected e f39421e;

    /* renamed from: f, reason: collision with root package name */
    protected e f39422f;

    /* renamed from: g, reason: collision with root package name */
    protected e f39423g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f39424h;

    /* renamed from: i, reason: collision with root package name */
    protected int f39425i;

    /* renamed from: j, reason: collision with root package name */
    protected int f39426j;

    /* renamed from: k, reason: collision with root package name */
    protected float f39427k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f39428l;

    /* renamed from: m, reason: collision with root package name */
    int f39429m;

    /* renamed from: n, reason: collision with root package name */
    int f39430n;

    /* renamed from: o, reason: collision with root package name */
    boolean f39431o;

    /* renamed from: p, reason: collision with root package name */
    private int f39432p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f39433q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f39434r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f39435s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f39436t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f39437u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f39438v;

    private void b() {
        int i10 = this.f39432p * 2;
        e eVar = this.f39417a;
        this.f39431o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f39425i++;
            e[] eVarArr = eVar.f39521s0;
            int i11 = this.f39432p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f39519r0[i11] = null;
            if (eVar.O() != 8) {
                this.f39428l++;
                e.b bVarS = eVar.s(this.f39432p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.f39429m += eVar.A(this.f39432p);
                }
                int iC = this.f39429m + eVar.f39467J[i10].c();
                this.f39429m = iC;
                int i12 = i10 + 1;
                this.f39429m = iC + eVar.f39467J[i12].c();
                int iC2 = this.f39430n + eVar.f39467J[i10].c();
                this.f39430n = iC2;
                this.f39430n = iC2 + eVar.f39467J[i12].c();
                if (this.f39418b == null) {
                    this.f39418b = eVar;
                }
                this.f39420d = eVar;
                e.b[] bVarArr = eVar.f39470M;
                int i13 = this.f39432p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f39510n[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f39426j++;
                        float f10 = eVar.f39517q0[i13];
                        if (f10 > 0.0f) {
                            this.f39427k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f39434r = true;
                            } else {
                                this.f39435s = true;
                            }
                            if (this.f39424h == null) {
                                this.f39424h = new ArrayList<>();
                            }
                            this.f39424h.add(eVar);
                        }
                        if (this.f39422f == null) {
                            this.f39422f = eVar;
                        }
                        e eVar4 = this.f39423g;
                        if (eVar4 != null) {
                            eVar4.f39519r0[this.f39432p] = eVar;
                        }
                        this.f39423g = eVar;
                    }
                    if (this.f39432p == 0) {
                        if (eVar.f39506l != 0 || eVar.f39512o != 0 || eVar.f39514p != 0) {
                            this.f39431o = false;
                        }
                    } else if (eVar.f39508m != 0 || eVar.f39518r != 0 || eVar.f39520s != 0) {
                        this.f39431o = false;
                    }
                    if (eVar.f39474Q != 0.0f) {
                        this.f39431o = false;
                        this.f39437u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f39521s0[this.f39432p] = eVar;
            }
            d dVar = eVar.f39467J[i10 + 1].f39442d;
            if (dVar != null) {
                e eVar5 = dVar.f39440b;
                d dVar2 = eVar5.f39467J[i10].f39442d;
                if (dVar2 != null && dVar2.f39440b == eVar) {
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
        e eVar6 = this.f39418b;
        if (eVar6 != null) {
            this.f39429m -= eVar6.f39467J[i10].c();
        }
        e eVar7 = this.f39420d;
        if (eVar7 != null) {
            this.f39429m -= eVar7.f39467J[i10 + 1].c();
        }
        this.f39419c = eVar;
        if (this.f39432p == 0 && this.f39433q) {
            this.f39421e = eVar;
        } else {
            this.f39421e = this.f39417a;
        }
        this.f39436t = this.f39435s && this.f39434r;
    }

    public void a() {
        if (!this.f39438v) {
            b();
        }
        this.f39438v = true;
    }

    public c(e eVar, int i10, boolean z10) {
        this.f39417a = eVar;
        this.f39432p = i10;
        this.f39433q = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.O() != 8 && eVar.f39470M[i10] == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f39510n[i10];
            if (i11 == 0 || i11 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
