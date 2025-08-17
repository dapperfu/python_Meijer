package Q1;

import Q1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f29501a;

    /* renamed from: b, reason: collision with root package name */
    protected e f29502b;

    /* renamed from: c, reason: collision with root package name */
    protected e f29503c;

    /* renamed from: d, reason: collision with root package name */
    protected e f29504d;

    /* renamed from: e, reason: collision with root package name */
    protected e f29505e;

    /* renamed from: f, reason: collision with root package name */
    protected e f29506f;

    /* renamed from: g, reason: collision with root package name */
    protected e f29507g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f29508h;

    /* renamed from: i, reason: collision with root package name */
    protected int f29509i;

    /* renamed from: j, reason: collision with root package name */
    protected int f29510j;

    /* renamed from: k, reason: collision with root package name */
    protected float f29511k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f29512l;

    /* renamed from: m, reason: collision with root package name */
    int f29513m;

    /* renamed from: n, reason: collision with root package name */
    int f29514n;

    /* renamed from: o, reason: collision with root package name */
    boolean f29515o;

    /* renamed from: p, reason: collision with root package name */
    private int f29516p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29517q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f29518r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f29519s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f29520t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f29521u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f29522v;

    private void b() {
        int i10 = this.f29516p * 2;
        e eVar = this.f29501a;
        this.f29515o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f29509i++;
            e[] eVarArr = eVar.f29553E0;
            int i11 = this.f29516p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f29551D0[i11] = null;
            if (eVar.L() != 8) {
                this.f29512l++;
                e.b bVarP = eVar.p(this.f29516p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarP != bVar) {
                    this.f29513m += eVar.x(this.f29516p);
                }
                int iE = this.f29513m + eVar.f29574V[i10].e();
                this.f29513m = iE;
                int i12 = i10 + 1;
                this.f29513m = iE + eVar.f29574V[i12].e();
                int iE2 = this.f29514n + eVar.f29574V[i10].e();
                this.f29514n = iE2;
                this.f29514n = iE2 + eVar.f29574V[i12].e();
                if (this.f29502b == null) {
                    this.f29502b = eVar;
                }
                this.f29504d = eVar;
                e.b[] bVarArr = eVar.f29577Y;
                int i13 = this.f29516p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f29627y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f29510j++;
                        float f10 = eVar.f29549C0[i13];
                        if (f10 > 0.0f) {
                            this.f29511k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f29518r = true;
                            } else {
                                this.f29519s = true;
                            }
                            if (this.f29508h == null) {
                                this.f29508h = new ArrayList<>();
                            }
                            this.f29508h.add(eVar);
                        }
                        if (this.f29506f == null) {
                            this.f29506f = eVar;
                        }
                        e eVar4 = this.f29507g;
                        if (eVar4 != null) {
                            eVar4.f29551D0[this.f29516p] = eVar;
                        }
                        this.f29507g = eVar;
                    }
                    if (this.f29516p == 0) {
                        if (eVar.f29623w != 0 || eVar.f29629z != 0 || eVar.f29544A != 0) {
                            this.f29515o = false;
                        }
                    } else if (eVar.f29625x != 0 || eVar.f29548C != 0 || eVar.f29550D != 0) {
                        this.f29515o = false;
                    }
                    if (eVar.f29584c0 != 0.0f) {
                        this.f29515o = false;
                        this.f29521u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f29553E0[this.f29516p] = eVar;
            }
            d dVar = eVar.f29574V[i10 + 1].f29528f;
            if (dVar != null) {
                e eVar5 = dVar.f29526d;
                d dVar2 = eVar5.f29574V[i10].f29528f;
                if (dVar2 != null && dVar2.f29526d == eVar) {
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
        e eVar6 = this.f29502b;
        if (eVar6 != null) {
            this.f29513m -= eVar6.f29574V[i10].e();
        }
        e eVar7 = this.f29504d;
        if (eVar7 != null) {
            this.f29513m -= eVar7.f29574V[i10 + 1].e();
        }
        this.f29503c = eVar;
        if (this.f29516p == 0 && this.f29517q) {
            this.f29505e = eVar;
        } else {
            this.f29505e = this.f29501a;
        }
        this.f29520t = this.f29519s && this.f29518r;
    }

    public void a() {
        if (!this.f29522v) {
            b();
        }
        this.f29522v = true;
    }

    public c(e eVar, int i10, boolean z10) {
        this.f29501a = eVar;
        this.f29516p = i10;
        this.f29517q = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.L() != 8 && eVar.f29577Y[i10] == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f29627y[i10];
            if (i11 == 0 || i11 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
