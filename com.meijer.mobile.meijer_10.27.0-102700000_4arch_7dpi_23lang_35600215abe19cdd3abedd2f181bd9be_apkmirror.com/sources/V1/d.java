package V1;

import U1.i;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    public final e f36580b;

    /* renamed from: c, reason: collision with root package name */
    public final b f36581c;

    /* renamed from: d, reason: collision with root package name */
    public d f36582d;

    /* renamed from: g, reason: collision with root package name */
    U1.i f36585g;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f36579a = null;

    /* renamed from: e, reason: collision with root package name */
    public int f36583e = 0;

    /* renamed from: f, reason: collision with root package name */
    int f36584f = -1;

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
        this.f36582d = dVar;
        if (dVar.f36579a == null) {
            dVar.f36579a = new HashSet<>();
        }
        this.f36582d.f36579a.add(this);
        if (i10 > 0) {
            this.f36583e = i10;
        } else {
            this.f36583e = 0;
        }
        this.f36584f = i11;
        return true;
    }

    public boolean k(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarH = dVar.h();
        b bVar = this.f36581c;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (a.f36586a[bVar.ordinal()]) {
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
                throw new AssertionError(this.f36581c.name());
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36586a;

        static {
            int[] iArr = new int[b.values().length];
            f36586a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36586a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36586a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36586a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36586a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36586a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36586a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36586a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36586a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public int c() {
        d dVar;
        if (this.f36580b.O() == 8) {
            return 0;
        }
        return (this.f36584f <= -1 || (dVar = this.f36582d) == null || dVar.f36580b.O() != 8) ? this.f36583e : this.f36584f;
    }

    public final d d() {
        switch (a.f36586a[this.f36581c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f36580b.f36601D;
            case 3:
                return this.f36580b.f36599B;
            case 4:
                return this.f36580b.f36602E;
            case 5:
                return this.f36580b.f36600C;
            default:
                throw new AssertionError(this.f36581c.name());
        }
    }

    public e e() {
        return this.f36580b;
    }

    public U1.i f() {
        return this.f36585g;
    }

    public d g() {
        return this.f36582d;
    }

    public b h() {
        return this.f36581c;
    }

    public boolean i() {
        HashSet<d> hashSet = this.f36579a;
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
        return this.f36582d != null;
    }

    public void l() {
        HashSet<d> hashSet;
        d dVar = this.f36582d;
        if (dVar != null && (hashSet = dVar.f36579a) != null) {
            hashSet.remove(this);
        }
        this.f36582d = null;
        this.f36583e = 0;
        this.f36584f = -1;
    }

    public void m(U1.c cVar) {
        U1.i iVar = this.f36585g;
        if (iVar == null) {
            this.f36585g = new U1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public String toString() {
        return this.f36580b.r() + ":" + this.f36581c.toString();
    }

    public d(e eVar, b bVar) {
        this.f36580b = eVar;
        this.f36581c = bVar;
    }

    public void n(int i10) {
        if (j()) {
            this.f36584f = i10;
        }
    }
}
