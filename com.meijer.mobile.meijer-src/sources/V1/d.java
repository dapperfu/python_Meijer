package V1;

import U1.i;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final e f39440b;

    /* renamed from: c, reason: collision with root package name */
    public final b f39441c;

    /* renamed from: d, reason: collision with root package name */
    public d f39442d;

    /* renamed from: g, reason: collision with root package name */
    U1.i f39445g;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f39439a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f39443e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f39444f = -1;

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, -1, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            l();
            return true;
        }
        if (!z10 && !k(dVar)) {
            return false;
        }
        this.f39442d = dVar;
        if (dVar.f39439a == null) {
            dVar.f39439a = new HashSet<>();
        }
        this.f39442d.f39439a.add(this);
        if (i10 > 0) {
            this.f39443e = i10;
        } else {
            this.f39443e = 0;
        }
        this.f39444f = i11;
        return true;
    }

    public boolean k(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarH = dVar.h();
        b bVar = this.f39441c;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (a.f39446a[bVar.ordinal()]) {
            case 1:
                return (bVarH == b.BASELINE || bVarH == b.CENTER_X || bVarH == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarH == b.LEFT || bVarH == b.RIGHT;
                return dVar.e() instanceof h ? z10 || bVarH == b.CENTER_X : z10;
            case 4:
            case 5:
                boolean z11 = bVarH == b.TOP || bVarH == b.BOTTOM;
                return dVar.e() instanceof h ? z11 || bVarH == b.CENTER_Y : z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f39441c.name());
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39446a;

        static {
            int[] iArr = new int[b.values().length];
            f39446a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39446a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39446a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39446a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39446a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39446a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39446a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39446a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39446a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public int c() {
        d dVar;
        if (this.f39440b.O() == 8) {
            return 0;
        }
        return (this.f39444f <= -1 || (dVar = this.f39442d) == null || dVar.f39440b.O() != 8) ? this.f39443e : this.f39444f;
    }

    public final d d() {
        switch (a.f39446a[this.f39441c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f39440b.f39461D;
            case 3:
                return this.f39440b.f39459B;
            case 4:
                return this.f39440b.f39462E;
            case 5:
                return this.f39440b.f39460C;
            default:
                throw new AssertionError(this.f39441c.name());
        }
    }

    public e e() {
        return this.f39440b;
    }

    public U1.i f() {
        return this.f39445g;
    }

    public d g() {
        return this.f39442d;
    }

    public b h() {
        return this.f39441c;
    }

    public boolean i() {
        HashSet<d> hashSet = this.f39439a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f39442d != null;
    }

    public void l() {
        HashSet<d> hashSet;
        d dVar = this.f39442d;
        if (dVar != null && (hashSet = dVar.f39439a) != null) {
            hashSet.remove(this);
        }
        this.f39442d = null;
        this.f39443e = 0;
        this.f39444f = -1;
    }

    public void m(U1.c cVar) {
        U1.i iVar = this.f39445g;
        if (iVar == null) {
            this.f39445g = new U1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f39440b.r() + ":" + this.f39441c.toString();
    }

    public d(e eVar, b bVar) {
        this.f39440b = eVar;
        this.f39441c = bVar;
    }

    public void n(int i10) {
        if (j()) {
            this.f39444f = i10;
        }
    }
}
