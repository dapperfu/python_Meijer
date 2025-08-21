package O1;

import O1.e;
import Q1.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private Object f22965a;

    /* renamed from: a0, reason: collision with root package name */
    private float f22966a0;

    /* renamed from: b, reason: collision with root package name */
    final e f22967b;

    /* renamed from: b0, reason: collision with root package name */
    private float f22968b0;

    /* renamed from: d0, reason: collision with root package name */
    b f22972d0;

    /* renamed from: e0, reason: collision with root package name */
    b f22974e0;

    /* renamed from: f0, reason: collision with root package name */
    private Object f22976f0;

    /* renamed from: g0, reason: collision with root package name */
    private Q1.e f22978g0;

    /* renamed from: h0, reason: collision with root package name */
    private HashMap<String, Integer> f22980h0;

    /* renamed from: i0, reason: collision with root package name */
    private HashMap<String, Float> f22982i0;

    /* renamed from: c, reason: collision with root package name */
    String f22969c = null;

    /* renamed from: d, reason: collision with root package name */
    P1.e f22971d = null;

    /* renamed from: e, reason: collision with root package name */
    int f22973e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f22975f = 0;

    /* renamed from: g, reason: collision with root package name */
    float f22977g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    float f22979h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    float f22981i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    float f22983j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    protected int f22984k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f22985l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f22986m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f22987n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected int f22988o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f22989p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected int f22990q = 0;

    /* renamed from: r, reason: collision with root package name */
    protected int f22991r = 0;

    /* renamed from: s, reason: collision with root package name */
    protected int f22992s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected int f22993t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected int f22994u = 0;

    /* renamed from: v, reason: collision with root package name */
    protected int f22995v = 0;

    /* renamed from: w, reason: collision with root package name */
    int f22996w = 0;

    /* renamed from: x, reason: collision with root package name */
    int f22997x = 0;

    /* renamed from: y, reason: collision with root package name */
    float f22998y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    float f22999z = Float.NaN;

    /* renamed from: A, reason: collision with root package name */
    float f22939A = Float.NaN;

    /* renamed from: B, reason: collision with root package name */
    float f22940B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    float f22941C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    float f22942D = Float.NaN;

    /* renamed from: E, reason: collision with root package name */
    float f22943E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    float f22944F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    float f22945G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    float f22946H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    float f22947I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    int f22948J = 0;

    /* renamed from: K, reason: collision with root package name */
    protected Object f22949K = null;

    /* renamed from: L, reason: collision with root package name */
    protected Object f22950L = null;

    /* renamed from: M, reason: collision with root package name */
    protected Object f22951M = null;

    /* renamed from: N, reason: collision with root package name */
    protected Object f22952N = null;

    /* renamed from: O, reason: collision with root package name */
    protected Object f22953O = null;

    /* renamed from: P, reason: collision with root package name */
    protected Object f22954P = null;

    /* renamed from: Q, reason: collision with root package name */
    protected Object f22955Q = null;

    /* renamed from: R, reason: collision with root package name */
    protected Object f22956R = null;

    /* renamed from: S, reason: collision with root package name */
    protected Object f22957S = null;

    /* renamed from: T, reason: collision with root package name */
    protected Object f22958T = null;

    /* renamed from: U, reason: collision with root package name */
    protected Object f22959U = null;

    /* renamed from: V, reason: collision with root package name */
    protected Object f22960V = null;

    /* renamed from: W, reason: collision with root package name */
    Object f22961W = null;

    /* renamed from: X, reason: collision with root package name */
    Object f22962X = null;

    /* renamed from: Y, reason: collision with root package name */
    Object f22963Y = null;

    /* renamed from: Z, reason: collision with root package name */
    Object f22964Z = null;

    /* renamed from: c0, reason: collision with root package name */
    e.c f22970c0 = null;

    /* renamed from: O1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0377a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23000a;

        static {
            int[] iArr = new int[e.c.values().length];
            f23000a = iArr;
            try {
                iArr[e.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23000a[e.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23000a[e.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23000a[e.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23000a[e.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23000a[e.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23000a[e.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23000a[e.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23000a[e.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23000a[e.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23000a[e.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23000a[e.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23000a[e.c.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23000a[e.c.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23000a[e.c.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23000a[e.c.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23000a[e.c.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23000a[e.c.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private void p() {
        this.f22949K = t(this.f22949K);
        this.f22950L = t(this.f22950L);
        this.f22951M = t(this.f22951M);
        this.f22952N = t(this.f22952N);
        this.f22953O = t(this.f22953O);
        this.f22954P = t(this.f22954P);
        this.f22955Q = t(this.f22955Q);
        this.f22956R = t(this.f22956R);
        this.f22957S = t(this.f22957S);
        this.f22958T = t(this.f22958T);
        this.f22959U = t(this.f22959U);
        this.f22960V = t(this.f22960V);
        this.f22961W = t(this.f22961W);
        this.f22962X = t(this.f22962X);
        this.f22963Y = t(this.f22963Y);
    }

    private Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f22967b.j(obj) : obj;
    }

    private Q1.e v(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).a();
        }
        return null;
    }

    public a A(Object obj) {
        this.f22970c0 = e.c.LEFT_TO_LEFT;
        this.f22949K = obj;
        return this;
    }

    public a B(Object obj) {
        this.f22970c0 = e.c.LEFT_TO_RIGHT;
        this.f22950L = obj;
        return this;
    }

    public a C(int i10) {
        e.c cVar = this.f22970c0;
        if (cVar == null) {
            this.f22984k = i10;
            this.f22985l = i10;
            this.f22986m = i10;
            this.f22987n = i10;
            this.f22988o = i10;
            this.f22989p = i10;
            return this;
        }
        switch (C0377a.f23000a[cVar.ordinal()]) {
            case 1:
            case 2:
                this.f22984k = i10;
                break;
            case 3:
            case 4:
                this.f22985l = i10;
                break;
            case 5:
            case 6:
                this.f22986m = i10;
                break;
            case 7:
            case 8:
                this.f22987n = i10;
                break;
            case 9:
            case 10:
                this.f22988o = i10;
                break;
            case 11:
            case 12:
                this.f22989p = i10;
                break;
            case 13:
            case 14:
            case 15:
                this.f22996w = i10;
                break;
            case 16:
                this.f22968b0 = i10;
                break;
        }
        return this;
    }

    public a D(Object obj) {
        return C(this.f22967b.c(obj));
    }

    public a E(int i10) {
        e.c cVar = this.f22970c0;
        if (cVar == null) {
            this.f22990q = i10;
            this.f22991r = i10;
            this.f22992s = i10;
            this.f22993t = i10;
            this.f22994u = i10;
            this.f22995v = i10;
            return this;
        }
        switch (C0377a.f23000a[cVar.ordinal()]) {
            case 1:
            case 2:
                this.f22990q = i10;
                break;
            case 3:
            case 4:
                this.f22991r = i10;
                break;
            case 5:
            case 6:
                this.f22992s = i10;
                break;
            case 7:
            case 8:
                this.f22993t = i10;
                break;
            case 9:
            case 10:
                this.f22994u = i10;
                break;
            case 11:
            case 12:
                this.f22995v = i10;
                break;
            case 13:
            case 14:
            case 15:
                this.f22997x = i10;
                break;
        }
        return this;
    }

    public a F(Object obj) {
        return E(this.f22967b.c(obj));
    }

    public a G() {
        if (this.f22951M != null) {
            this.f22970c0 = e.c.RIGHT_TO_LEFT;
            return this;
        }
        this.f22970c0 = e.c.RIGHT_TO_RIGHT;
        return this;
    }

    public a H(Object obj) {
        this.f22970c0 = e.c.RIGHT_TO_LEFT;
        this.f22951M = obj;
        return this;
    }

    public a I(Object obj) {
        this.f22970c0 = e.c.RIGHT_TO_RIGHT;
        this.f22952N = obj;
        return this;
    }

    public void J(P1.e eVar) {
        this.f22971d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public a K(b bVar) {
        this.f22974e0 = bVar;
        return this;
    }

    public void L(int i10) {
        this.f22973e = i10;
    }

    public void M(String str) {
        this.f22969c = str;
    }

    public void N(int i10) {
        this.f22975f = i10;
    }

    public void O(Object obj) {
        this.f22976f0 = obj;
        Q1.e eVar = this.f22978g0;
        if (eVar != null) {
            eVar.m0(obj);
        }
    }

    public a P(b bVar) {
        this.f22972d0 = bVar;
        return this;
    }

    public a Q() {
        if (this.f22953O != null) {
            this.f22970c0 = e.c.START_TO_START;
            return this;
        }
        this.f22970c0 = e.c.START_TO_END;
        return this;
    }

    public a R(Object obj) {
        this.f22970c0 = e.c.START_TO_END;
        this.f22954P = obj;
        return this;
    }

    public a S(Object obj) {
        this.f22970c0 = e.c.START_TO_START;
        this.f22953O = obj;
        return this;
    }

    public a T() {
        if (this.f22957S != null) {
            this.f22970c0 = e.c.TOP_TO_TOP;
            return this;
        }
        this.f22970c0 = e.c.TOP_TO_BOTTOM;
        return this;
    }

    public a U(Object obj) {
        this.f22970c0 = e.c.TOP_TO_BOTTOM;
        this.f22958T = obj;
        return this;
    }

    public a V(Object obj) {
        this.f22970c0 = e.c.TOP_TO_TOP;
        this.f22957S = obj;
        return this;
    }

    public a W(float f10) {
        this.f22983j = f10;
        return this;
    }

    public a X(int i10) {
        this.f22948J = i10;
        return this;
    }

    @Override // O1.d
    public Q1.e a() {
        if (this.f22978g0 == null) {
            Q1.e eVarO = o();
            this.f22978g0 = eVarO;
            eVarO.m0(this.f22976f0);
        }
        return this.f22978g0;
    }

    @Override // O1.d
    public void apply() {
        if (this.f22978g0 == null) {
            return;
        }
        P1.e eVar = this.f22971d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f22972d0.f(this.f22967b, this.f22978g0, 0);
        this.f22974e0.f(this.f22967b, this.f22978g0, 1);
        p();
        f(this.f22978g0, this.f22949K, e.c.LEFT_TO_LEFT);
        f(this.f22978g0, this.f22950L, e.c.LEFT_TO_RIGHT);
        f(this.f22978g0, this.f22951M, e.c.RIGHT_TO_LEFT);
        f(this.f22978g0, this.f22952N, e.c.RIGHT_TO_RIGHT);
        f(this.f22978g0, this.f22953O, e.c.START_TO_START);
        f(this.f22978g0, this.f22954P, e.c.START_TO_END);
        f(this.f22978g0, this.f22955Q, e.c.END_TO_START);
        f(this.f22978g0, this.f22956R, e.c.END_TO_END);
        f(this.f22978g0, this.f22957S, e.c.TOP_TO_TOP);
        f(this.f22978g0, this.f22958T, e.c.TOP_TO_BOTTOM);
        f(this.f22978g0, this.f22959U, e.c.BOTTOM_TO_TOP);
        f(this.f22978g0, this.f22960V, e.c.BOTTOM_TO_BOTTOM);
        f(this.f22978g0, this.f22961W, e.c.BASELINE_TO_BASELINE);
        f(this.f22978g0, this.f22962X, e.c.BASELINE_TO_TOP);
        f(this.f22978g0, this.f22963Y, e.c.BASELINE_TO_BOTTOM);
        f(this.f22978g0, this.f22964Z, e.c.CIRCULAR_CONSTRAINT);
        int i10 = this.f22973e;
        if (i10 != 0) {
            this.f22978g0.y0(i10);
        }
        int i11 = this.f22975f;
        if (i11 != 0) {
            this.f22978g0.L0(i11);
        }
        float f10 = this.f22977g;
        if (f10 != -1.0f) {
            this.f22978g0.C0(f10);
        }
        float f11 = this.f22979h;
        if (f11 != -1.0f) {
            this.f22978g0.P0(f11);
        }
        this.f22978g0.x0(this.f22981i);
        this.f22978g0.K0(this.f22983j);
        Q1.e eVar2 = this.f22978g0;
        f fVar = eVar2.f27618n;
        fVar.f23070f = this.f22998y;
        fVar.f23071g = this.f22999z;
        fVar.f23072h = this.f22939A;
        fVar.f23073i = this.f22940B;
        fVar.f23074j = this.f22941C;
        fVar.f23075k = this.f22942D;
        fVar.f23076l = this.f22943E;
        fVar.f23077m = this.f22944F;
        fVar.f23078n = this.f22946H;
        fVar.f23079o = this.f22947I;
        fVar.f23080p = this.f22945G;
        int i12 = this.f22948J;
        fVar.f23082r = i12;
        eVar2.Q0(i12);
        HashMap<String, Integer> map = this.f22980h0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f22978g0.f27618n.g(str, 902, this.f22980h0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f22982i0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f22978g0.f27618n.f(str2, 901, this.f22982i0.get(str2).floatValue());
            }
        }
    }

    @Override // O1.d
    public void b(Q1.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f22978g0 = eVar;
        eVar.m0(this.f22976f0);
    }

    @Override // O1.d
    public void c(Object obj) {
        this.f22965a = obj;
    }

    @Override // O1.d
    public P1.e d() {
        return this.f22971d;
    }

    public a e(float f10) {
        this.f22945G = f10;
        return this;
    }

    public a g() {
        this.f22970c0 = e.c.BASELINE_TO_BASELINE;
        return this;
    }

    @Override // O1.d
    public Object getKey() {
        return this.f22965a;
    }

    public a h(Object obj) {
        this.f22970c0 = e.c.BASELINE_TO_BASELINE;
        this.f22961W = obj;
        return this;
    }

    public a i() {
        if (this.f22959U != null) {
            this.f22970c0 = e.c.BOTTOM_TO_TOP;
            return this;
        }
        this.f22970c0 = e.c.BOTTOM_TO_BOTTOM;
        return this;
    }

    public a j(Object obj) {
        this.f22970c0 = e.c.BOTTOM_TO_BOTTOM;
        this.f22960V = obj;
        return this;
    }

    public a k(Object obj) {
        this.f22970c0 = e.c.BOTTOM_TO_TOP;
        this.f22959U = obj;
        return this;
    }

    public a l() {
        e.c cVar = this.f22970c0;
        if (cVar == null) {
            this.f22949K = null;
            this.f22950L = null;
            this.f22984k = 0;
            this.f22951M = null;
            this.f22952N = null;
            this.f22985l = 0;
            this.f22953O = null;
            this.f22954P = null;
            this.f22986m = 0;
            this.f22955Q = null;
            this.f22956R = null;
            this.f22987n = 0;
            this.f22957S = null;
            this.f22958T = null;
            this.f22988o = 0;
            this.f22959U = null;
            this.f22960V = null;
            this.f22989p = 0;
            this.f22961W = null;
            this.f22964Z = null;
            this.f22981i = 0.5f;
            this.f22983j = 0.5f;
            this.f22990q = 0;
            this.f22991r = 0;
            this.f22992s = 0;
            this.f22993t = 0;
            this.f22994u = 0;
            this.f22995v = 0;
            return this;
        }
        switch (C0377a.f23000a[cVar.ordinal()]) {
            case 1:
            case 2:
                this.f22949K = null;
                this.f22950L = null;
                this.f22984k = 0;
                this.f22990q = 0;
                break;
            case 3:
            case 4:
                this.f22951M = null;
                this.f22952N = null;
                this.f22985l = 0;
                this.f22991r = 0;
                break;
            case 5:
            case 6:
                this.f22953O = null;
                this.f22954P = null;
                this.f22986m = 0;
                this.f22992s = 0;
                break;
            case 7:
            case 8:
                this.f22955Q = null;
                this.f22956R = null;
                this.f22987n = 0;
                this.f22993t = 0;
                break;
            case 9:
            case 10:
                this.f22957S = null;
                this.f22958T = null;
                this.f22988o = 0;
                this.f22994u = 0;
                break;
            case 11:
            case 12:
                this.f22959U = null;
                this.f22960V = null;
                this.f22989p = 0;
                this.f22995v = 0;
                break;
            case 15:
                this.f22961W = null;
                break;
            case 16:
                this.f22964Z = null;
                break;
        }
        return this;
    }

    public Q1.e o() {
        return new Q1.e(w().i(), u().i());
    }

    public a q() {
        if (this.f22955Q != null) {
            this.f22970c0 = e.c.END_TO_START;
            return this;
        }
        this.f22970c0 = e.c.END_TO_END;
        return this;
    }

    public a r(Object obj) {
        this.f22970c0 = e.c.END_TO_END;
        this.f22956R = obj;
        return this;
    }

    public a s(Object obj) {
        this.f22970c0 = e.c.END_TO_START;
        this.f22955Q = obj;
        return this;
    }

    public b u() {
        return this.f22974e0;
    }

    public b w() {
        return this.f22972d0;
    }

    public a y(float f10) {
        this.f22981i = f10;
        return this;
    }

    public a z() {
        if (this.f22949K != null) {
            this.f22970c0 = e.c.LEFT_TO_LEFT;
            return this;
        }
        this.f22970c0 = e.c.LEFT_TO_RIGHT;
        return this;
    }

    public a(e eVar) {
        Object obj = b.f23002j;
        this.f22972d0 = b.b(obj);
        this.f22974e0 = b.b(obj);
        this.f22980h0 = new HashMap<>();
        this.f22982i0 = new HashMap<>();
        this.f22967b = eVar;
    }

    private void f(Q1.e eVar, Object obj, e.c cVar) {
        Q1.e eVarV = v(obj);
        if (eVarV != null) {
            int[] iArr = C0377a.f23000a;
            int i10 = iArr[cVar.ordinal()];
            switch (iArr[cVar.ordinal()]) {
                case 1:
                    d.b bVar = d.b.LEFT;
                    eVar.j(bVar).a(eVarV.j(bVar), this.f22984k, this.f22990q, false);
                    break;
                case 2:
                    eVar.j(d.b.LEFT).a(eVarV.j(d.b.RIGHT), this.f22984k, this.f22990q, false);
                    break;
                case 3:
                    eVar.j(d.b.RIGHT).a(eVarV.j(d.b.LEFT), this.f22985l, this.f22991r, false);
                    break;
                case 4:
                    d.b bVar2 = d.b.RIGHT;
                    eVar.j(bVar2).a(eVarV.j(bVar2), this.f22985l, this.f22991r, false);
                    break;
                case 5:
                    d.b bVar3 = d.b.LEFT;
                    eVar.j(bVar3).a(eVarV.j(bVar3), this.f22986m, this.f22992s, false);
                    break;
                case 6:
                    eVar.j(d.b.LEFT).a(eVarV.j(d.b.RIGHT), this.f22986m, this.f22992s, false);
                    break;
                case 7:
                    eVar.j(d.b.RIGHT).a(eVarV.j(d.b.LEFT), this.f22987n, this.f22993t, false);
                    break;
                case 8:
                    d.b bVar4 = d.b.RIGHT;
                    eVar.j(bVar4).a(eVarV.j(bVar4), this.f22987n, this.f22993t, false);
                    break;
                case 9:
                    d.b bVar5 = d.b.TOP;
                    eVar.j(bVar5).a(eVarV.j(bVar5), this.f22988o, this.f22994u, false);
                    break;
                case 10:
                    eVar.j(d.b.TOP).a(eVarV.j(d.b.BOTTOM), this.f22988o, this.f22994u, false);
                    break;
                case 11:
                    eVar.j(d.b.BOTTOM).a(eVarV.j(d.b.TOP), this.f22989p, this.f22995v, false);
                    break;
                case 12:
                    d.b bVar6 = d.b.BOTTOM;
                    eVar.j(bVar6).a(eVarV.j(bVar6), this.f22989p, this.f22995v, false);
                    break;
                case 13:
                    eVar.U(d.b.BASELINE, eVarV, d.b.BOTTOM, this.f22996w, this.f22997x);
                    break;
                case 14:
                    eVar.U(d.b.BASELINE, eVarV, d.b.TOP, this.f22996w, this.f22997x);
                    break;
                case 15:
                    d.b bVar7 = d.b.BASELINE;
                    eVar.U(bVar7, eVarV, bVar7, this.f22996w, this.f22997x);
                    break;
                case 16:
                    eVar.g(eVarV, this.f22966a0, (int) this.f22968b0);
                    break;
            }
        }
    }

    public a Y(b bVar) {
        return P(bVar);
    }

    public a m() {
        Q().l();
        q().l();
        z().l();
        G().l();
        return this;
    }

    public a n() {
        T().l();
        g().l();
        i().l();
        return this;
    }

    public a x(b bVar) {
        return K(bVar);
    }
}
