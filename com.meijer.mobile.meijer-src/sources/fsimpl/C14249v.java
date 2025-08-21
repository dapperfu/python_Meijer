package fsimpl;

import android.view.SurfaceView;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: fsimpl.v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14249v {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f133622a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f133623b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f133624c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f133625d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final C14091ar f133626e;

    /* renamed from: f, reason: collision with root package name */
    private final C14185ee f133627f;

    /* renamed from: g, reason: collision with root package name */
    private final C14138ck f133628g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f133629h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC14076ac f133630i;

    C14249v(C14138ck c14138ck, C14091ar c14091ar, C14185ee c14185ee) {
        this.f133628g = c14138ck;
        this.f133626e = c14091ar;
        this.f133627f = c14185ee;
        this.f133630i = AbstractC14076ac.a(c14138ck);
        this.f133629h = (C14118br.a() || c14138ck.b()) ? false : true;
    }

    private dQ a(Object obj, C14181ea c14181ea, boolean z10) {
        if (c14181ea != null) {
            return c14181ea.a(this.f133627f, obj, z10);
        }
        return null;
    }

    private EnumC14251x a(Object obj, boolean z10) {
        EnumC14251x enumC14251x = z10 ? (EnumC14251x) this.f133622a.get(obj) : null;
        if (enumC14251x != null) {
            return enumC14251x;
        }
        gd.a(obj);
        aK aKVarA = this.f133627f.a(obj);
        EnumC14251x enumC14251xA = EnumC14251x.Unblocked;
        if (a(this.f133626e, obj, aKVarA)) {
            enumC14251xA = EnumC14251x.Omitted;
        } else if (d(this.f133626e, obj, aKVarA)) {
            enumC14251xA = EnumC14251x.Blocked;
        } else {
            Object objA = gd.a(this.f133627f, obj);
            if (objA != null) {
                enumC14251xA = a(objA, z10);
            }
        }
        this.f133622a.put(obj, enumC14251xA);
        return enumC14251xA;
    }

    private C14252y a(Object obj, aK aKVar, C14252y c14252y, dQ dQVar) {
        this.f133630i.a(obj, aKVar, c14252y, dQVar);
        return a(obj, c14252y);
    }

    private C14252y a(Object obj, aK aKVar, C14252y c14252y, Object obj2) {
        this.f133630i.a(obj, aKVar, c14252y, obj2);
        return a(obj, c14252y);
    }

    private C14252y a(Object obj, aK aKVar, C14252y c14252y, String str) {
        this.f133630i.a(obj, aKVar, c14252y, str);
        return a(obj, c14252y);
    }

    private C14252y a(Object obj, C14252y c14252y) {
        this.f133623b.put(obj, c14252y);
        return c14252y;
    }

    private void a() {
        if (this.f133627f.b()) {
            this.f133622a.clear();
            this.f133623b.clear();
            this.f133624c.clear();
            this.f133625d.clear();
        }
    }

    private boolean a(C14091ar c14091ar, Object obj, aK aKVar) {
        dQ dQVarA = a(obj, c14091ar.g(), c14091ar.e());
        boolean z10 = dQVarA != null;
        if (z10) {
            this.f133630i.a(obj, aKVar, EnumC14080ag.Omitted, dQVarA);
        }
        return z10;
    }

    private C14252y b(Object obj, boolean z10) {
        C14181ea c14181eaH;
        dQ dQVarA;
        C14252y c14252y = z10 ? (C14252y) this.f133623b.get(obj) : null;
        if (c14252y != null) {
            return c14252y;
        }
        gd.a(obj);
        aK aKVarA = this.f133627f.a(obj);
        if (this.f133629h && C14250w.a(obj)) {
            return a(obj, aKVarA, C14252y.e(), "Compose with no enhanced Compose support");
        }
        boolean zE = this.f133626e.e();
        C14181ea c14181eaI = this.f133626e.i();
        if (c14181eaI != null) {
            dQ dQVarA2 = a(obj, c14181eaI, zE);
            if (dQVarA2 != null) {
                return a(obj, aKVarA, C14252y.e(), dQVarA2);
            }
            dQ dQVarA3 = dV.a(this.f133627f, obj, c14181eaI.c());
            if (dQVarA3 != null) {
                return zE ? a(obj, aKVarA, C14252y.f(), dQVarA3) : a(obj, aKVarA, C14252y.e(), dQVarA3);
            }
        }
        if (zE && (c14181eaH = this.f133626e.h()) != null && (dQVarA = dV.a(this.f133627f, obj, c14181eaH.c())) != null) {
            return a(obj, aKVarA, C14252y.f(), dQVarA);
        }
        C14181ea c14181eaJ = this.f133626e.j();
        if (c14181eaJ != null) {
            dQ dQVarA4 = a(obj, c14181eaJ, zE);
            if (dQVarA4 != null) {
                return a(obj, aKVarA, C14252y.f(), dQVarA4);
            }
            dQ dQVarA5 = dV.a(this.f133627f, obj, c14181eaJ.b());
            if (dQVarA5 != null) {
                return zE ? a(obj, aKVarA, C14252y.f(), dQVarA5) : a(obj, aKVarA, C14252y.e(), dQVarA5);
            }
        }
        C14252y c14252yB = C14252y.b(this.f133628g);
        Object objA = gd.a(this.f133627f, obj);
        if (objA != null) {
            c14252yB = b(objA, z10);
        }
        return a(obj, aKVarA, c14252yB, objA);
    }

    private boolean b(C14091ar c14091ar, Object obj, aK aKVar) {
        dQ dQVarA = a(obj, c14091ar.k(), c14091ar.e());
        boolean z10 = dQVarA != null;
        if (z10) {
            this.f133630i.a(obj, aKVar, EnumC14080ag.Watched, dQVarA);
        }
        return z10;
    }

    private boolean c(C14091ar c14091ar, Object obj, aK aKVar) {
        dQ dQVarA = a(obj, c14091ar.l(), c14091ar.e());
        boolean z10 = dQVarA != null;
        if (z10) {
            this.f133630i.a(obj, aKVar, EnumC14080ag.Kept, dQVarA);
        }
        return z10;
    }

    private boolean d(C14091ar c14091ar, Object obj, aK aKVar) {
        if (aKVar.f132742h == 4) {
            this.f133630i.a(obj, aKVar, EnumC14080ag.Blocked, "Password");
            return true;
        }
        if ((obj instanceof View) && (obj instanceof SurfaceView)) {
            this.f133630i.a(obj, aKVar, EnumC14080ag.Blocked, "SurfaceView");
            return true;
        }
        dQ dQVarA = a(obj, c14091ar.h(), c14091ar.e());
        if (dQVarA == null) {
            return false;
        }
        this.f133630i.a(obj, aKVar, EnumC14080ag.Blocked, dQVarA);
        return true;
    }

    private boolean f(Object obj) {
        Boolean bool = (Boolean) this.f133624c.get(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(b(this.f133626e, obj, this.f133627f.a(obj)));
        this.f133624c.put(obj, boolValueOf);
        return boolValueOf.booleanValue();
    }

    private boolean g(Object obj) {
        Object objA;
        Boolean bool = (Boolean) this.f133625d.get(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(c(this.f133626e, obj, this.f133627f.a(obj)));
        if (!boolValueOf.booleanValue() && (objA = gd.a(this.f133627f, obj)) != null) {
            boolValueOf = Boolean.valueOf(g(objA));
        }
        this.f133625d.put(obj, boolValueOf);
        return boolValueOf.booleanValue();
    }

    boolean a(Object obj) {
        a();
        EnumC14251x enumC14251xA = a(obj, true);
        if (C14228fu.f133538b) {
            C14228fu.a(enumC14251xA, a(obj, false), "isOmitted block state for %s", obj);
        }
        return enumC14251xA == EnumC14251x.Omitted;
    }

    public boolean b(Object obj) {
        C14228fu.a("BlockView#isBlocked must be run on UI thread", new Object[0]);
        a();
        EnumC14251x enumC14251xA = a(obj, true);
        if (C14228fu.f133538b) {
            C14228fu.a(enumC14251xA, a(obj, false), "isBlocked block state for %s", obj);
        }
        return enumC14251xA == EnumC14251x.Blocked || enumC14251xA == EnumC14251x.Omitted;
    }

    boolean c(Object obj) {
        a();
        return g(obj);
    }

    boolean d(Object obj) {
        a();
        return f(obj);
    }

    C14252y e(Object obj) {
        a();
        C14252y c14252yB = b(obj, true);
        if (C14228fu.f133538b) {
            C14228fu.a(c14252yB, b(obj, false), "getPrivacyState privacy state for %s", obj);
            C14228fu.a(b(obj), "getPrivacyState privacy state incorrectly retrieved for blocked element %s", obj);
        }
        return c14252yB;
    }
}
