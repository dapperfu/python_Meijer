package O1;

import O1.e;
import Q1.d;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private Object f22972a;

    /* renamed from: a0, reason: collision with root package name */
    private float f22973a0;

    /* renamed from: b, reason: collision with root package name */
    final e f22974b;

    /* renamed from: b0, reason: collision with root package name */
    private float f22975b0;

    /* renamed from: d0, reason: collision with root package name */
    b f22979d0;

    /* renamed from: e0, reason: collision with root package name */
    b f22981e0;

    /* renamed from: f0, reason: collision with root package name */
    private Object f22983f0;

    /* renamed from: g0, reason: collision with root package name */
    private Q1.e f22985g0;

    /* renamed from: h0, reason: collision with root package name */
    private HashMap<String, Integer> f22987h0;

    /* renamed from: i0, reason: collision with root package name */
    private HashMap<String, Float> f22989i0;

    /* renamed from: c, reason: collision with root package name */
    String f22976c = null;

    /* renamed from: d, reason: collision with root package name */
    P1.e f22978d = null;

    /* renamed from: e, reason: collision with root package name */
    int f22980e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f22982f = 0;

    /* renamed from: g, reason: collision with root package name */
    float f22984g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    float f22986h = -1.0f;

    /* renamed from: i, reason: collision with root package name */
    float f22988i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    float f22990j = 0.5f;

    /* renamed from: k, reason: collision with root package name */
    protected int f22991k = 0;

    /* renamed from: l, reason: collision with root package name */
    protected int f22992l = 0;

    /* renamed from: m, reason: collision with root package name */
    protected int f22993m = 0;

    /* renamed from: n, reason: collision with root package name */
    protected int f22994n = 0;

    /* renamed from: o, reason: collision with root package name */
    protected int f22995o = 0;

    /* renamed from: p, reason: collision with root package name */
    protected int f22996p = 0;

    /* renamed from: q, reason: collision with root package name */
    protected int f22997q = 0;

    /* renamed from: r, reason: collision with root package name */
    protected int f22998r = 0;

    /* renamed from: s, reason: collision with root package name */
    protected int f22999s = 0;

    /* renamed from: t, reason: collision with root package name */
    protected int f23000t = 0;

    /* renamed from: u, reason: collision with root package name */
    protected int f23001u = 0;

    /* renamed from: v, reason: collision with root package name */
    protected int f23002v = 0;

    /* renamed from: w, reason: collision with root package name */
    int f23003w = 0;

    /* renamed from: x, reason: collision with root package name */
    int f23004x = 0;

    /* renamed from: y, reason: collision with root package name */
    float f23005y = Float.NaN;

    /* renamed from: z, reason: collision with root package name */
    float f23006z = Float.NaN;

    /* renamed from: A, reason: collision with root package name */
    float f22946A = Float.NaN;

    /* renamed from: B, reason: collision with root package name */
    float f22947B = Float.NaN;

    /* renamed from: C, reason: collision with root package name */
    float f22948C = Float.NaN;

    /* renamed from: D, reason: collision with root package name */
    float f22949D = Float.NaN;

    /* renamed from: E, reason: collision with root package name */
    float f22950E = Float.NaN;

    /* renamed from: F, reason: collision with root package name */
    float f22951F = Float.NaN;

    /* renamed from: G, reason: collision with root package name */
    float f22952G = Float.NaN;

    /* renamed from: H, reason: collision with root package name */
    float f22953H = Float.NaN;

    /* renamed from: I, reason: collision with root package name */
    float f22954I = Float.NaN;

    /* renamed from: J, reason: collision with root package name */
    int f22955J = 0;

    /* renamed from: K, reason: collision with root package name */
    protected Object f22956K = null;

    /* renamed from: L, reason: collision with root package name */
    protected Object f22957L = null;

    /* renamed from: M, reason: collision with root package name */
    protected Object f22958M = null;

    /* renamed from: N, reason: collision with root package name */
    protected Object f22959N = null;

    /* renamed from: O, reason: collision with root package name */
    protected Object f22960O = null;

    /* renamed from: P, reason: collision with root package name */
    protected Object f22961P = null;

    /* renamed from: Q, reason: collision with root package name */
    protected Object f22962Q = null;

    /* renamed from: R, reason: collision with root package name */
    protected Object f22963R = null;

    /* renamed from: S, reason: collision with root package name */
    protected Object f22964S = null;

    /* renamed from: T, reason: collision with root package name */
    protected Object f22965T = null;

    /* renamed from: U, reason: collision with root package name */
    protected Object f22966U = null;

    /* renamed from: V, reason: collision with root package name */
    protected Object f22967V = null;

    /* renamed from: W, reason: collision with root package name */
    Object f22968W = null;

    /* renamed from: X, reason: collision with root package name */
    Object f22969X = null;

    /* renamed from: Y, reason: collision with root package name */
    Object f22970Y = null;

    /* renamed from: Z, reason: collision with root package name */
    Object f22971Z = null;

    /* renamed from: c0, reason: collision with root package name */
    e.c f22977c0 = null;

    /* renamed from: O1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0371a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23007a;

        static {
            int[] iArr = new int[e.c.values().length];
            f23007a = iArr;
            try {
                iArr[e.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23007a[e.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23007a[e.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23007a[e.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23007a[e.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23007a[e.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23007a[e.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23007a[e.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23007a[e.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23007a[e.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23007a[e.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23007a[e.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23007a[e.c.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23007a[e.c.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23007a[e.c.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23007a[e.c.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23007a[e.c.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23007a[e.c.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    private void p() {
        this.f22956K = t(this.f22956K);
        this.f22957L = t(this.f22957L);
        this.f22958M = t(this.f22958M);
        this.f22959N = t(this.f22959N);
        this.f22960O = t(this.f22960O);
        this.f22961P = t(this.f22961P);
        this.f22962Q = t(this.f22962Q);
        this.f22963R = t(this.f22963R);
        this.f22964S = t(this.f22964S);
        this.f22965T = t(this.f22965T);
        this.f22966U = t(this.f22966U);
        this.f22967V = t(this.f22967V);
        this.f22968W = t(this.f22968W);
        this.f22969X = t(this.f22969X);
        this.f22970Y = t(this.f22970Y);
    }

    private Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof a) ? this.f22974b.j(obj) : obj;
    }

    private Q1.e v(Object obj) {
        if (obj instanceof d) {
            return ((d) obj).a();
        }
        return null;
    }

    public a A(Object obj) {
        this.f22977c0 = e.c.LEFT_TO_LEFT;
        this.f22956K = obj;
        return this;
    }

    public a B(Object obj) {
        this.f22977c0 = e.c.LEFT_TO_RIGHT;
        this.f22957L = obj;
        return this;
    }

    public a C(int i10) {
        e.c cVar = this.f22977c0;
        if (cVar == null) {
            this.f22991k = i10;
            this.f22992l = i10;
            this.f22993m = i10;
            this.f22994n = i10;
            this.f22995o = i10;
            this.f22996p = i10;
            return this;
        }
        switch (C0371a.f23007a[cVar.ordinal()]) {
            case 1:
            case 2:
                this.f22991k = i10;
                break;
            case 3:
            case 4:
                this.f22992l = i10;
                break;
            case 5:
            case 6:
                this.f22993m = i10;
                break;
            case 7:
            case 8:
                this.f22994n = i10;
                break;
            case 9:
            case 10:
                this.f22995o = i10;
                break;
            case 11:
            case 12:
                this.f22996p = i10;
                break;
            case 13:
            case 14:
            case 15:
                this.f23003w = i10;
                break;
            case 16:
                this.f22975b0 = i10;
                break;
        }
        return this;
    }

    public a D(Object obj) {
        return C(this.f22974b.c(obj));
    }

    public a E(int i10) {
        e.c cVar = this.f22977c0;
        if (cVar == null) {
            this.f22997q = i10;
            this.f22998r = i10;
            this.f22999s = i10;
            this.f23000t = i10;
            this.f23001u = i10;
            this.f23002v = i10;
            return this;
        }
        switch (C0371a.f23007a[cVar.ordinal()]) {
            case 1:
            case 2:
                this.f22997q = i10;
                break;
            case 3:
            case 4:
                this.f22998r = i10;
                break;
            case 5:
            case 6:
                this.f22999s = i10;
                break;
            case 7:
            case 8:
                this.f23000t = i10;
                break;
            case 9:
            case 10:
                this.f23001u = i10;
                break;
            case 11:
            case 12:
                this.f23002v = i10;
                break;
            case 13:
            case 14:
            case 15:
                this.f23004x = i10;
                break;
        }
        return this;
    }

    public a F(Object obj) {
        return E(this.f22974b.c(obj));
    }

    public a G() {
        if (this.f22958M != null) {
            this.f22977c0 = e.c.RIGHT_TO_LEFT;
            return this;
        }
        this.f22977c0 = e.c.RIGHT_TO_RIGHT;
        return this;
    }

    public a H(Object obj) {
        this.f22977c0 = e.c.RIGHT_TO_LEFT;
        this.f22958M = obj;
        return this;
    }

    public a I(Object obj) {
        this.f22977c0 = e.c.RIGHT_TO_RIGHT;
        this.f22959N = obj;
        return this;
    }

    public void J(P1.e eVar) {
        this.f22978d = eVar;
        if (eVar != null) {
            b(eVar.a());
        }
    }

    public a K(b bVar) {
        this.f22981e0 = bVar;
        return this;
    }

    public void L(int i10) {
        this.f22980e = i10;
    }

    public void M(String str) {
        this.f22976c = str;
    }

    public void N(int i10) {
        this.f22982f = i10;
    }

    public void O(Object obj) {
        this.f22983f0 = obj;
        Q1.e eVar = this.f22985g0;
        if (eVar != null) {
            eVar.m0(obj);
        }
    }

    public a P(b bVar) {
        this.f22979d0 = bVar;
        return this;
    }

    public a Q() {
        if (this.f22960O != null) {
            this.f22977c0 = e.c.START_TO_START;
            return this;
        }
        this.f22977c0 = e.c.START_TO_END;
        return this;
    }

    public a R(Object obj) {
        this.f22977c0 = e.c.START_TO_END;
        this.f22961P = obj;
        return this;
    }

    public a S(Object obj) {
        this.f22977c0 = e.c.START_TO_START;
        this.f22960O = obj;
        return this;
    }

    public a T() {
        if (this.f22964S != null) {
            this.f22977c0 = e.c.TOP_TO_TOP;
            return this;
        }
        this.f22977c0 = e.c.TOP_TO_BOTTOM;
        return this;
    }

    public a U(Object obj) {
        this.f22977c0 = e.c.TOP_TO_BOTTOM;
        this.f22965T = obj;
        return this;
    }

    public a V(Object obj) {
        this.f22977c0 = e.c.TOP_TO_TOP;
        this.f22964S = obj;
        return this;
    }

    public a W(float f10) {
        this.f22990j = f10;
        return this;
    }

    public a X(int i10) {
        this.f22955J = i10;
        return this;
    }

    @Override // O1.d
    public Q1.e a() {
        if (this.f22985g0 == null) {
            Q1.e eVarO = o();
            this.f22985g0 = eVarO;
            eVarO.m0(this.f22983f0);
        }
        return this.f22985g0;
    }

    @Override // O1.d
    public void apply() {
        if (this.f22985g0 == null) {
            return;
        }
        P1.e eVar = this.f22978d;
        if (eVar != null) {
            eVar.apply();
        }
        this.f22979d0.f(this.f22974b, this.f22985g0, 0);
        this.f22981e0.f(this.f22974b, this.f22985g0, 1);
        p();
        f(this.f22985g0, this.f22956K, e.c.LEFT_TO_LEFT);
        f(this.f22985g0, this.f22957L, e.c.LEFT_TO_RIGHT);
        f(this.f22985g0, this.f22958M, e.c.RIGHT_TO_LEFT);
        f(this.f22985g0, this.f22959N, e.c.RIGHT_TO_RIGHT);
        f(this.f22985g0, this.f22960O, e.c.START_TO_START);
        f(this.f22985g0, this.f22961P, e.c.START_TO_END);
        f(this.f22985g0, this.f22962Q, e.c.END_TO_START);
        f(this.f22985g0, this.f22963R, e.c.END_TO_END);
        f(this.f22985g0, this.f22964S, e.c.TOP_TO_TOP);
        f(this.f22985g0, this.f22965T, e.c.TOP_TO_BOTTOM);
        f(this.f22985g0, this.f22966U, e.c.BOTTOM_TO_TOP);
        f(this.f22985g0, this.f22967V, e.c.BOTTOM_TO_BOTTOM);
        f(this.f22985g0, this.f22968W, e.c.BASELINE_TO_BASELINE);
        f(this.f22985g0, this.f22969X, e.c.BASELINE_TO_TOP);
        f(this.f22985g0, this.f22970Y, e.c.BASELINE_TO_BOTTOM);
        f(this.f22985g0, this.f22971Z, e.c.CIRCULAR_CONSTRAINT);
        int i10 = this.f22980e;
        if (i10 != 0) {
            this.f22985g0.y0(i10);
        }
        int i11 = this.f22982f;
        if (i11 != 0) {
            this.f22985g0.L0(i11);
        }
        float f10 = this.f22984g;
        if (f10 != -1.0f) {
            this.f22985g0.C0(f10);
        }
        float f11 = this.f22986h;
        if (f11 != -1.0f) {
            this.f22985g0.P0(f11);
        }
        this.f22985g0.x0(this.f22988i);
        this.f22985g0.K0(this.f22990j);
        Q1.e eVar2 = this.f22985g0;
        f fVar = eVar2.f29605n;
        fVar.f23077f = this.f23005y;
        fVar.f23078g = this.f23006z;
        fVar.f23079h = this.f22946A;
        fVar.f23080i = this.f22947B;
        fVar.f23081j = this.f22948C;
        fVar.f23082k = this.f22949D;
        fVar.f23083l = this.f22950E;
        fVar.f23084m = this.f22951F;
        fVar.f23085n = this.f22953H;
        fVar.f23086o = this.f22954I;
        fVar.f23087p = this.f22952G;
        int i12 = this.f22955J;
        fVar.f23089r = i12;
        eVar2.Q0(i12);
        HashMap<String, Integer> map = this.f22987h0;
        if (map != null) {
            for (String str : map.keySet()) {
                this.f22985g0.f29605n.g(str, 902, this.f22987h0.get(str).intValue());
            }
        }
        HashMap<String, Float> map2 = this.f22989i0;
        if (map2 != null) {
            for (String str2 : map2.keySet()) {
                this.f22985g0.f29605n.f(str2, 901, this.f22989i0.get(str2).floatValue());
            }
        }
    }

    @Override // O1.d
    public void b(Q1.e eVar) {
        if (eVar == null) {
            return;
        }
        this.f22985g0 = eVar;
        eVar.m0(this.f22983f0);
    }

    @Override // O1.d
    public void c(Object obj) {
        this.f22972a = obj;
    }

    @Override // O1.d
    public P1.e d() {
        return this.f22978d;
    }

    public a e(float f10) {
        this.f22952G = f10;
        return this;
    }

    public a g() {
        this.f22977c0 = e.c.BASELINE_TO_BASELINE;
        return this;
    }

    @Override // O1.d
    public Object getKey() {
        return this.f22972a;
    }

    public a h(Object obj) {
        this.f22977c0 = e.c.BASELINE_TO_BASELINE;
        this.f22968W = obj;
        return this;
    }

    public a i() {
        if (this.f22966U != null) {
            this.f22977c0 = e.c.BOTTOM_TO_TOP;
            return this;
        }
        this.f22977c0 = e.c.BOTTOM_TO_BOTTOM;
        return this;
    }

    public a j(Object obj) {
        this.f22977c0 = e.c.BOTTOM_TO_BOTTOM;
        this.f22967V = obj;
        return this;
    }

    public a k(Object obj) {
        this.f22977c0 = e.c.BOTTOM_TO_TOP;
        this.f22966U = obj;
        return this;
    }

    public a l() {
        e.c cVar = this.f22977c0;
        if (cVar == null) {
            this.f22956K = null;
            this.f22957L = null;
            this.f22991k = 0;
            this.f22958M = null;
            this.f22959N = null;
            this.f22992l = 0;
            this.f22960O = null;
            this.f22961P = null;
            this.f22993m = 0;
            this.f22962Q = null;
            this.f22963R = null;
            this.f22994n = 0;
            this.f22964S = null;
            this.f22965T = null;
            this.f22995o = 0;
            this.f22966U = null;
            this.f22967V = null;
            this.f22996p = 0;
            this.f22968W = null;
            this.f22971Z = null;
            this.f22988i = 0.5f;
            this.f22990j = 0.5f;
            this.f22997q = 0;
            this.f22998r = 0;
            this.f22999s = 0;
            this.f23000t = 0;
            this.f23001u = 0;
            this.f23002v = 0;
            return this;
        }
        switch (C0371a.f23007a[cVar.ordinal()]) {
            case 1:
            case 2:
                this.f22956K = null;
                this.f22957L = null;
                this.f22991k = 0;
                this.f22997q = 0;
                break;
            case 3:
            case 4:
                this.f22958M = null;
                this.f22959N = null;
                this.f22992l = 0;
                this.f22998r = 0;
                break;
            case 5:
            case 6:
                this.f22960O = null;
                this.f22961P = null;
                this.f22993m = 0;
                this.f22999s = 0;
                break;
            case 7:
            case 8:
                this.f22962Q = null;
                this.f22963R = null;
                this.f22994n = 0;
                this.f23000t = 0;
                break;
            case 9:
            case 10:
                this.f22964S = null;
                this.f22965T = null;
                this.f22995o = 0;
                this.f23001u = 0;
                break;
            case 11:
            case 12:
                this.f22966U = null;
                this.f22967V = null;
                this.f22996p = 0;
                this.f23002v = 0;
                break;
            case 15:
                this.f22968W = null;
                break;
            case 16:
                this.f22971Z = null;
                break;
        }
        return this;
    }

    public Q1.e o() {
        return new Q1.e(w().i(), u().i());
    }

    public a q() {
        if (this.f22962Q != null) {
            this.f22977c0 = e.c.END_TO_START;
            return this;
        }
        this.f22977c0 = e.c.END_TO_END;
        return this;
    }

    public a r(Object obj) {
        this.f22977c0 = e.c.END_TO_END;
        this.f22963R = obj;
        return this;
    }

    public a s(Object obj) {
        this.f22977c0 = e.c.END_TO_START;
        this.f22962Q = obj;
        return this;
    }

    public b u() {
        return this.f22981e0;
    }

    public b w() {
        return this.f22979d0;
    }

    public a y(float f10) {
        this.f22988i = f10;
        return this;
    }

    public a z() {
        if (this.f22956K != null) {
            this.f22977c0 = e.c.LEFT_TO_LEFT;
            return this;
        }
        this.f22977c0 = e.c.LEFT_TO_RIGHT;
        return this;
    }

    public a(e eVar) {
        Object obj = b.f23009j;
        this.f22979d0 = b.b(obj);
        this.f22981e0 = b.b(obj);
        this.f22987h0 = new HashMap<>();
        this.f22989i0 = new HashMap<>();
        this.f22974b = eVar;
    }

    private void f(Q1.e eVar, Object obj, e.c cVar) {
        Q1.e eVarV = v(obj);
        if (eVarV != null) {
            int[] iArr = C0371a.f23007a;
            int i10 = iArr[cVar.ordinal()];
            switch (iArr[cVar.ordinal()]) {
                case 1:
                    d.b bVar = d.b.LEFT;
                    eVar.j(bVar).a(eVarV.j(bVar), this.f22991k, this.f22997q, false);
                    break;
                case 2:
                    eVar.j(d.b.LEFT).a(eVarV.j(d.b.RIGHT), this.f22991k, this.f22997q, false);
                    break;
                case 3:
                    eVar.j(d.b.RIGHT).a(eVarV.j(d.b.LEFT), this.f22992l, this.f22998r, false);
                    break;
                case 4:
                    d.b bVar2 = d.b.RIGHT;
                    eVar.j(bVar2).a(eVarV.j(bVar2), this.f22992l, this.f22998r, false);
                    break;
                case 5:
                    d.b bVar3 = d.b.LEFT;
                    eVar.j(bVar3).a(eVarV.j(bVar3), this.f22993m, this.f22999s, false);
                    break;
                case 6:
                    eVar.j(d.b.LEFT).a(eVarV.j(d.b.RIGHT), this.f22993m, this.f22999s, false);
                    break;
                case 7:
                    eVar.j(d.b.RIGHT).a(eVarV.j(d.b.LEFT), this.f22994n, this.f23000t, false);
                    break;
                case 8:
                    d.b bVar4 = d.b.RIGHT;
                    eVar.j(bVar4).a(eVarV.j(bVar4), this.f22994n, this.f23000t, false);
                    break;
                case 9:
                    d.b bVar5 = d.b.TOP;
                    eVar.j(bVar5).a(eVarV.j(bVar5), this.f22995o, this.f23001u, false);
                    break;
                case 10:
                    eVar.j(d.b.TOP).a(eVarV.j(d.b.BOTTOM), this.f22995o, this.f23001u, false);
                    break;
                case 11:
                    eVar.j(d.b.BOTTOM).a(eVarV.j(d.b.TOP), this.f22996p, this.f23002v, false);
                    break;
                case 12:
                    d.b bVar6 = d.b.BOTTOM;
                    eVar.j(bVar6).a(eVarV.j(bVar6), this.f22996p, this.f23002v, false);
                    break;
                case 13:
                    eVar.U(d.b.BASELINE, eVarV, d.b.BOTTOM, this.f23003w, this.f23004x);
                    break;
                case 14:
                    eVar.U(d.b.BASELINE, eVarV, d.b.TOP, this.f23003w, this.f23004x);
                    break;
                case 15:
                    d.b bVar7 = d.b.BASELINE;
                    eVar.U(bVar7, eVarV, bVar7, this.f23003w, this.f23004x);
                    break;
                case 16:
                    eVar.g(eVarV, this.f22973a0, (int) this.f22975b0);
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
