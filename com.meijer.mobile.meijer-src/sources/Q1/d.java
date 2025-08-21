package Q1;

import M1.i;
import R1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f27537b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27538c;

    /* renamed from: d, reason: collision with root package name */
    public final e f27539d;

    /* renamed from: e, reason: collision with root package name */
    public final b f27540e;

    /* renamed from: f, reason: collision with root package name */
    public d f27541f;

    /* renamed from: i, reason: collision with root package name */
    M1.i f27544i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f27536a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f27542g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f27543h = Integer.MIN_VALUE;

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

    public boolean a(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z10 && !o(dVar)) {
            return false;
        }
        this.f27541f = dVar;
        if (dVar.f27536a == null) {
            dVar.f27536a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f27541f.f27536a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f27542g = i10;
        this.f27543h = i11;
        return true;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f27540e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().P() && g().P());
        }
        switch (a.f27545a[bVar.ordinal()]) {
            case 1:
                return (bVarJ == b.BASELINE || bVarJ == b.CENTER_X || bVarJ == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarJ == b.LEFT || bVarJ == b.RIGHT;
                return dVar.g() instanceof g ? z10 || bVarJ == b.CENTER_X : z10;
            case 4:
            case 5:
                boolean z11 = bVarJ == b.TOP || bVarJ == b.BOTTOM;
                return dVar.g() instanceof g ? z11 || bVarJ == b.CENTER_Y : z11;
            case 6:
                return (bVarJ == b.LEFT || bVarJ == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f27540e.name());
        }
    }

    public void q() {
        this.f27538c = false;
        this.f27537b = 0;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27545a;

        static {
            int[] iArr = new int[b.values().length];
            f27545a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27545a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27545a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27545a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27545a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27545a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27545a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27545a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27545a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f27536a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                R1.i.a(it.next().f27539d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f27536a;
    }

    public int d() {
        if (this.f27538c) {
            return this.f27537b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f27539d.L() == 8) {
            return 0;
        }
        return (this.f27543h == Integer.MIN_VALUE || (dVar = this.f27541f) == null || dVar.f27539d.L() != 8) ? this.f27542g : this.f27543h;
    }

    public final d f() {
        switch (a.f27545a[this.f27540e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f27539d.f27581P;
            case 3:
                return this.f27539d.f27579N;
            case 4:
                return this.f27539d.f27582Q;
            case 5:
                return this.f27539d.f27580O;
            default:
                throw new AssertionError(this.f27540e.name());
        }
    }

    public e g() {
        return this.f27539d;
    }

    public M1.i h() {
        return this.f27544i;
    }

    public d i() {
        return this.f27541f;
    }

    public b j() {
        return this.f27540e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f27536a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f27536a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f27538c;
    }

    public boolean n() {
        return this.f27541f != null;
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f27541f;
        if (dVar != null && (hashSet = dVar.f27536a) != null) {
            hashSet.remove(this);
            if (this.f27541f.f27536a.size() == 0) {
                this.f27541f.f27536a = null;
            }
        }
        this.f27536a = null;
        this.f27541f = null;
        this.f27542g = 0;
        this.f27543h = Integer.MIN_VALUE;
        this.f27538c = false;
        this.f27537b = 0;
    }

    public void r(M1.c cVar) {
        M1.i iVar = this.f27544i;
        if (iVar == null) {
            this.f27544i = new M1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.m();
        }
    }

    public void s(int i10) {
        this.f27537b = i10;
        this.f27538c = true;
    }

    public String toString() {
        return this.f27539d.o() + ":" + this.f27540e.toString();
    }

    public d(e eVar, b bVar) {
        this.f27539d = eVar;
        this.f27540e = bVar;
    }
}
