package O1;

import Q1.e;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f23001i = new Object();

    /* renamed from: j, reason: collision with root package name */
    public static final Object f23002j = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final Object f23003k = new Object();

    /* renamed from: l, reason: collision with root package name */
    public static final Object f23004l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f23005m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f23006n = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final int f23007a;

    /* renamed from: b, reason: collision with root package name */
    int f23008b;

    /* renamed from: c, reason: collision with root package name */
    int f23009c;

    /* renamed from: d, reason: collision with root package name */
    float f23010d;

    /* renamed from: e, reason: collision with root package name */
    int f23011e;

    /* renamed from: f, reason: collision with root package name */
    String f23012f;

    /* renamed from: g, reason: collision with root package name */
    Object f23013g;

    /* renamed from: h, reason: collision with root package name */
    boolean f23014h;

    private b() {
        this.f23007a = -2;
        this.f23008b = 0;
        this.f23009c = a.e.API_PRIORITY_OTHER;
        this.f23010d = 1.0f;
        this.f23011e = 0;
        this.f23012f = null;
        this.f23013g = f23002j;
        this.f23014h = false;
    }

    public b g(int i10) {
        this.f23013g = null;
        this.f23011e = i10;
        return this;
    }

    public static b a(int i10) {
        b bVar = new b(f23001i);
        bVar.g(i10);
        return bVar;
    }

    public static b b(Object obj) {
        b bVar = new b(f23001i);
        bVar.h(obj);
        return bVar;
    }

    public static b c() {
        return new b(f23004l);
    }

    public static b d(Object obj) {
        b bVar = new b();
        bVar.n(obj);
        return bVar;
    }

    public static b e() {
        return new b(f23002j);
    }

    public void f(e eVar, Q1.e eVar2, int i10) {
        String str = this.f23012f;
        if (str != null) {
            eVar2.o0(str);
        }
        int i11 = 2;
        if (i10 == 0) {
            if (this.f23014h) {
                eVar2.A0(e.b.MATCH_CONSTRAINT);
                Object obj = this.f23013g;
                if (obj == f23002j) {
                    i11 = 1;
                } else if (obj != f23005m) {
                    i11 = 0;
                }
                eVar2.B0(i11, this.f23008b, this.f23009c, this.f23010d);
                return;
            }
            int i12 = this.f23008b;
            if (i12 > 0) {
                eVar2.I0(i12);
            }
            int i13 = this.f23009c;
            if (i13 < Integer.MAX_VALUE) {
                eVar2.F0(i13);
            }
            Object obj2 = this.f23013g;
            if (obj2 == f23002j) {
                eVar2.A0(e.b.WRAP_CONTENT);
                return;
            }
            if (obj2 == f23004l) {
                eVar2.A0(e.b.MATCH_PARENT);
                return;
            } else {
                if (obj2 == null) {
                    eVar2.A0(e.b.FIXED);
                    eVar2.R0(this.f23011e);
                    return;
                }
                return;
            }
        }
        if (this.f23014h) {
            eVar2.N0(e.b.MATCH_CONSTRAINT);
            Object obj3 = this.f23013g;
            if (obj3 == f23002j) {
                i11 = 1;
            } else if (obj3 != f23005m) {
                i11 = 0;
            }
            eVar2.O0(i11, this.f23008b, this.f23009c, this.f23010d);
            return;
        }
        int i14 = this.f23008b;
        if (i14 > 0) {
            eVar2.H0(i14);
        }
        int i15 = this.f23009c;
        if (i15 < Integer.MAX_VALUE) {
            eVar2.E0(i15);
        }
        Object obj4 = this.f23013g;
        if (obj4 == f23002j) {
            eVar2.N0(e.b.WRAP_CONTENT);
            return;
        }
        if (obj4 == f23004l) {
            eVar2.N0(e.b.MATCH_PARENT);
        } else if (obj4 == null) {
            eVar2.N0(e.b.FIXED);
            eVar2.w0(this.f23011e);
        }
    }

    public b h(Object obj) {
        this.f23013g = obj;
        if (obj instanceof Integer) {
            this.f23011e = ((Integer) obj).intValue();
            this.f23013g = null;
        }
        return this;
    }

    int i() {
        return this.f23011e;
    }

    public b j(int i10) {
        if (this.f23009c >= 0) {
            this.f23009c = i10;
        }
        return this;
    }

    public b k(Object obj) {
        Object obj2 = f23002j;
        if (obj == obj2 && this.f23014h) {
            this.f23013g = obj2;
            this.f23009c = a.e.API_PRIORITY_OTHER;
        }
        return this;
    }

    public b l(int i10) {
        if (i10 >= 0) {
            this.f23008b = i10;
        }
        return this;
    }

    public b m(Object obj) {
        if (obj == f23002j) {
            this.f23008b = -2;
        }
        return this;
    }

    public b n(Object obj) {
        this.f23013g = obj;
        this.f23014h = true;
        return this;
    }

    private b(Object obj) {
        this.f23007a = -2;
        this.f23008b = 0;
        this.f23009c = a.e.API_PRIORITY_OTHER;
        this.f23010d = 1.0f;
        this.f23011e = 0;
        this.f23012f = null;
        this.f23014h = false;
        this.f23013g = obj;
    }
}
