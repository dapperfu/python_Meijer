package O1;

import Q1.e;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f23008i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f23009j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f23010k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f23011l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f23012m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f23013n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final int f23014a;

    /* renamed from: b, reason: collision with root package name */
    int f23015b;

    /* renamed from: c, reason: collision with root package name */
    int f23016c;

    /* renamed from: d, reason: collision with root package name */
    float f23017d;

    /* renamed from: e, reason: collision with root package name */
    int f23018e;

    /* renamed from: f, reason: collision with root package name */
    String f23019f;

    /* renamed from: g, reason: collision with root package name */
    Object f23020g;

    /* renamed from: h, reason: collision with root package name */
    boolean f23021h;

    private b() {
        this.f23014a = -2;
        this.f23015b = 0;
        this.f23016c = a.e.API_PRIORITY_OTHER;
        this.f23017d = 1.0f;
        this.f23018e = 0;
        this.f23019f = null;
        this.f23020g = f23009j;
        this.f23021h = false;
    }

    public b g(int i10) {
        this.f23020g = null;
        this.f23018e = i10;
        return this;
    }

    public static b a(int i10) {
        b bVar = new b(f23008i);
        bVar.g(i10);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f23008i);
        bVar.h(obj);
        return bVar;
    }

    public static b c() {
        return new b(f23011l);
    }

    public static b d(Object obj) {
        b bVar = new b();
        bVar.n(obj);
        return bVar;
    }

    public static b e() {
        return new b(f23009j);
    }

    public void f(e eVar, Q1.e eVar2, int i10) {
        String str = this.f23019f;
        if (str != null) {
            eVar2.o0(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f23021h) {
                eVar2.A0(e.b.MATCH_CONSTRAINT);
                Object obj = this.f23020g;
                if (obj == f23009j) {
                    i11 = 1;
                } else if (obj != f23012m) {
                    i11 = 0;
                }
                eVar2.B0(i11, this.f23015b, this.f23016c, this.f23017d);
                return;
            }
            int i12 = this.f23015b;
            if (i12 > 0) {
                eVar2.I0(i12);
            }
            int i13 = this.f23016c;
            if (i13 < Integer.MAX_VALUE) {
                eVar2.F0(i13);
            }
            Object obj2 = this.f23020g;
            if (obj2 == f23009j) {
                eVar2.A0(e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f23011l) {
                eVar2.A0(e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar2.A0(e.b.FIXED);
                    eVar2.R0(this.f23018e);
                    return;
                }
                return;
            }
        }
        if (this.f23021h) {
            eVar2.N0(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f23020g;
            if (obj3 == f23009j) {
                i11 = 1;
            } else if (obj3 != f23012m) {
                i11 = 0;
            }
            eVar2.O0(i11, this.f23015b, this.f23016c, this.f23017d);
            return;
        }
        int i14 = this.f23015b;
        if (i14 > 0) {
            eVar2.H0(i14);
        }
        int i15 = this.f23016c;
        if (i15 < Integer.MAX_VALUE) {
            eVar2.E0(i15);
        }
        Object obj4 = this.f23020g;
        if (obj4 == f23009j) {
            eVar2.N0(e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f23011l) {
            eVar2.N0(e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar2.N0(e.b.FIXED);
            eVar2.w0(this.f23018e);
        }
    }

    public b h(Object obj) {
        this.f23020g = obj;
        if (obj instanceof Integer) {
            this.f23018e = ((Integer) obj).intValue();
            this.f23020g = null;
        }
        return this;
    }

    int i() {
        return this.f23018e;
    }

    public b j(int i10) {
        if (this.f23016c >= 0) {
            this.f23016c = i10;
        }
        return this;
    }

    public b k(Object obj) {
        Object obj2 = f23009j;
        if (obj == obj2 && this.f23021h) {
            this.f23020g = obj2;
            this.f23016c = a.e.API_PRIORITY_OTHER;
        }
        return this;
    }

    public b l(int i10) {
        if (i10 >= 0) {
            this.f23015b = i10;
        }
        return this;
    }

    public b m(Object obj) {
        if (obj == f23009j) {
            this.f23015b = -2;
        }
        return this;
    }

    public b n(Object obj) {
        this.f23020g = obj;
        this.f23021h = true;
        return this;
    }

    private b(Object obj) {
        this.f23014a = -2;
        this.f23015b = 0;
        this.f23016c = a.e.API_PRIORITY_OTHER;
        this.f23017d = 1.0f;
        this.f23018e = 0;
        this.f23019f = null;
        this.f23021h = false;
        this.f23020g = obj;
    }
}
