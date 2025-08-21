package Q1;

import Q1.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected e f27514a;

    /* renamed from: b, reason: collision with root package name */
    protected e f27515b;

    /* renamed from: c, reason: collision with root package name */
    protected e f27516c;

    /* renamed from: d, reason: collision with root package name */
    protected e f27517d;

    /* renamed from: e, reason: collision with root package name */
    protected e f27518e;

    /* renamed from: f, reason: collision with root package name */
    protected e f27519f;

    /* renamed from: g, reason: collision with root package name */
    protected e f27520g;

    /* renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f27521h;

    /* renamed from: i, reason: collision with root package name */
    protected int f27522i;

    /* renamed from: j, reason: collision with root package name */
    protected int f27523j;

    /* renamed from: k, reason: collision with root package name */
    protected float f27524k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    int f27525l;

    /* renamed from: m, reason: collision with root package name */
    int f27526m;

    /* renamed from: n, reason: collision with root package name */
    int f27527n;

    /* renamed from: o, reason: collision with root package name */
    boolean f27528o;

    /* renamed from: p, reason: collision with root package name */
    private int f27529p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27530q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f27531r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f27532s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f27533t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f27534u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f27535v;

    private void b() {
        int i10 = this.f27529p * 2;
        e eVar = this.f27514a;
        this.f27528o = true;
        e eVar2 = eVar;
        boolean z10 = false;
        while (!z10) {
            this.f27522i++;
            e[] eVarArr = eVar.f27566E0;
            int i11 = this.f27529p;
            e eVar3 = null;
            eVarArr[i11] = null;
            eVar.f27564D0[i11] = null;
            if (eVar.L() != 8) {
                this.f27525l++;
                e.b bVarP = eVar.p(this.f27529p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarP != bVar) {
                    this.f27526m += eVar.x(this.f27529p);
                }
                int iE = this.f27526m + eVar.f27587V[i10].e();
                this.f27526m = iE;
                int i12 = i10 + 1;
                this.f27526m = iE + eVar.f27587V[i12].e();
                int iE2 = this.f27527n + eVar.f27587V[i10].e();
                this.f27527n = iE2;
                this.f27527n = iE2 + eVar.f27587V[i12].e();
                if (this.f27515b == null) {
                    this.f27515b = eVar;
                }
                this.f27517d = eVar;
                e.b[] bVarArr = eVar.f27590Y;
                int i13 = this.f27529p;
                if (bVarArr[i13] == bVar) {
                    int i14 = eVar.f27640y[i13];
                    if (i14 == 0 || i14 == 3 || i14 == 2) {
                        this.f27523j++;
                        float f10 = eVar.f27562C0[i13];
                        if (f10 > 0.0f) {
                            this.f27524k += f10;
                        }
                        if (c(eVar, i13)) {
                            if (f10 < 0.0f) {
                                this.f27531r = true;
                            } else {
                                this.f27532s = true;
                            }
                            if (this.f27521h == null) {
                                this.f27521h = new ArrayList<>();
                            }
                            this.f27521h.add(eVar);
                        }
                        if (this.f27519f == null) {
                            this.f27519f = eVar;
                        }
                        e eVar4 = this.f27520g;
                        if (eVar4 != null) {
                            eVar4.f27564D0[this.f27529p] = eVar;
                        }
                        this.f27520g = eVar;
                    }
                    if (this.f27529p == 0) {
                        if (eVar.f27636w != 0 || eVar.f27642z != 0 || eVar.f27557A != 0) {
                            this.f27528o = false;
                        }
                    } else if (eVar.f27638x != 0 || eVar.f27561C != 0 || eVar.f27563D != 0) {
                        this.f27528o = false;
                    }
                    if (eVar.f27597c0 != 0.0f) {
                        this.f27528o = false;
                        this.f27534u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f27566E0[this.f27529p] = eVar;
            }
            d dVar = eVar.f27587V[i10 + 1].f27541f;
            if (dVar != null) {
                e eVar5 = dVar.f27539d;
                d dVar2 = eVar5.f27587V[i10].f27541f;
                if (dVar2 != null && dVar2.f27539d == eVar) {
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
        e eVar6 = this.f27515b;
        if (eVar6 != null) {
            this.f27526m -= eVar6.f27587V[i10].e();
        }
        e eVar7 = this.f27517d;
        if (eVar7 != null) {
            this.f27526m -= eVar7.f27587V[i10 + 1].e();
        }
        this.f27516c = eVar;
        if (this.f27529p == 0 && this.f27530q) {
            this.f27518e = eVar;
        } else {
            this.f27518e = this.f27514a;
        }
        this.f27533t = this.f27532s && this.f27531r;
    }

    public void a() {
        if (!this.f27535v) {
            b();
        }
        this.f27535v = true;
    }

    public c(e eVar, int i10, boolean z10) {
        this.f27514a = eVar;
        this.f27529p = i10;
        this.f27530q = z10;
    }

    private static boolean c(e eVar, int i10) {
        if (eVar.L() != 8 && eVar.f27590Y[i10] == e.b.MATCH_CONSTRAINT) {
            int i11 = eVar.f27640y[i10];
            if (i11 == 0 || i11 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
