package Q1;

import M1.i;
import R1.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private int f29524b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29525c;

    /* renamed from: d, reason: collision with root package name */
    public final e f29526d;

    /* renamed from: e, reason: collision with root package name */
    public final b f29527e;

    /* renamed from: f, reason: collision with root package name */
    public d f29528f;

    /* renamed from: i, reason: collision with root package name */
    M1.i f29531i;

    /* renamed from: a, reason: collision with root package name */
    private HashSet<d> f29523a = null;

    /* renamed from: g, reason: collision with root package name */
    public int f29529g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f29530h = Integer.MIN_VALUE;

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
        this.f29528f = dVar;
        if (dVar.f29523a == null) {
            dVar.f29523a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f29528f.f29523a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f29529g = i10;
        this.f29530h = i11;
        return true;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f29527e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().P() && g().P());
        }
        switch (a.f29532a[bVar.ordinal()]) {
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
                throw new AssertionError(this.f29527e.name());
        }
    }

    public void q() {
        this.f29525c = false;
        this.f29524b = 0;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29532a;

        static {
            int[] iArr = new int[b.values().length];
            f29532a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29532a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29532a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29532a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29532a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29532a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29532a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29532a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29532a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public void b(int i10, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f29523a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                R1.i.a(it.next().f29526d, i10, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f29523a;
    }

    public int d() {
        if (this.f29525c) {
            return this.f29524b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f29526d.L() == 8) {
            return 0;
        }
        return (this.f29530h == Integer.MIN_VALUE || (dVar = this.f29528f) == null || dVar.f29526d.L() != 8) ? this.f29529g : this.f29530h;
    }

    public final d f() {
        switch (a.f29532a[this.f29527e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f29526d.f29568P;
            case 3:
                return this.f29526d.f29566N;
            case 4:
                return this.f29526d.f29569Q;
            case 5:
                return this.f29526d.f29567O;
            default:
                throw new AssertionError(this.f29527e.name());
        }
    }

    public e g() {
        return this.f29526d;
    }

    public M1.i h() {
        return this.f29531i;
    }

    public d i() {
        return this.f29528f;
    }

    public b j() {
        return this.f29527e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f29523a;
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
        HashSet<d> hashSet = this.f29523a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f29525c;
    }

    public boolean n() {
        return this.f29528f != null;
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f29528f;
        if (dVar != null && (hashSet = dVar.f29523a) != null) {
            hashSet.remove(this);
            if (this.f29528f.f29523a.size() == 0) {
                this.f29528f.f29523a = null;
            }
        }
        this.f29523a = null;
        this.f29528f = null;
        this.f29529g = 0;
        this.f29530h = Integer.MIN_VALUE;
        this.f29525c = false;
        this.f29524b = 0;
    }

    public void r(M1.c cVar) {
        M1.i iVar = this.f29531i;
        if (iVar == null) {
            this.f29531i = new M1.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.m();
        }
    }

    public void s(int i10) {
        this.f29524b = i10;
        this.f29525c = true;
    }

    public String toString() {
        return this.f29526d.o() + ":" + this.f29527e.toString();
    }

    public d(e eVar, b bVar) {
        this.f29526d = eVar;
        this.f29527e = bVar;
    }
}
