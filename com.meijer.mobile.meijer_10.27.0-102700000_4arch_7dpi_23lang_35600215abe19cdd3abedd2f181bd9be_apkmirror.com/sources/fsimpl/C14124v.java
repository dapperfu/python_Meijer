package fsimpl;

import android.view.SurfaceView;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: fsimpl.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14124v {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap f132372a = new WeakHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final WeakHashMap f132373b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap f132374c = new WeakHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap f132375d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final C13966ar f132376e;

    /* renamed from: f, reason: collision with root package name */
    private final C14060ee f132377f;

    /* renamed from: g, reason: collision with root package name */
    private final C14013ck f132378g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f132379h;

    /* renamed from: i, reason: collision with root package name */
    private final AbstractC13951ac f132380i;

    C14124v(C14013ck c14013ck, C13966ar c13966ar, C14060ee c14060ee) {
        this.f132378g = c14013ck;
        this.f132376e = c13966ar;
        this.f132377f = c14060ee;
        this.f132380i = AbstractC13951ac.a(c14013ck);
        this.f132379h = (C13993br.a() || c14013ck.b()) ? false : true;
    }

    private dQ a(Object obj, C14056ea c14056ea, boolean z10) {
        if (c14056ea != null) {
            return c14056ea.a(this.f132377f, obj, z10);
        }
        return null;
    }

    private EnumC14126x a(Object obj, boolean z10) {
        EnumC14126x enumC14126x = z10 ? (EnumC14126x) this.f132372a.get(obj) : null;
        if (enumC14126x != null) {
            return enumC14126x;
        }
        gd.a(obj);
        aK aKVarA = this.f132377f.a(obj);
        EnumC14126x enumC14126xA = EnumC14126x.Unblocked;
        if (a(this.f132376e, obj, aKVarA)) {
            enumC14126xA = EnumC14126x.Omitted;
        } else if (d(this.f132376e, obj, aKVarA)) {
            enumC14126xA = EnumC14126x.Blocked;
        } else {
            Object objA = gd.a(this.f132377f, obj);
            if (objA != null) {
                enumC14126xA = a(objA, z10);
            }
        }
        this.f132372a.put(obj, enumC14126xA);
        return enumC14126xA;
    }

    private C14127y a(Object obj, aK aKVar, C14127y c14127y, dQ dQVar) {
        this.f132380i.a(obj, aKVar, c14127y, dQVar);
        return a(obj, c14127y);
    }

    private C14127y a(Object obj, aK aKVar, C14127y c14127y, Object obj2) {
        this.f132380i.a(obj, aKVar, c14127y, obj2);
        return a(obj, c14127y);
    }

    private C14127y a(Object obj, aK aKVar, C14127y c14127y, String str) {
        this.f132380i.a(obj, aKVar, c14127y, str);
        return a(obj, c14127y);
    }

    private C14127y a(Object obj, C14127y c14127y) {
        this.f132373b.put(obj, c14127y);
        return c14127y;
    }

    private void a() {
        if (this.f132377f.b()) {
            this.f132372a.clear();
            this.f132373b.clear();
            this.f132374c.clear();
            this.f132375d.clear();
        }
    }

    private boolean a(C13966ar c13966ar, Object obj, aK aKVar) {
        dQ dQVarA = a(obj, c13966ar.g(), c13966ar.e());
        boolean z10 = dQVarA != null;
        if (z10) {
            this.f132380i.a(obj, aKVar, EnumC13955ag.Omitted, dQVarA);
        }
        return z10;
    }

    private C14127y b(Object obj, boolean z10) {
        C14056ea c14056eaH;
        dQ dQVarA;
        C14127y c14127y = z10 ? (C14127y) this.f132373b.get(obj) : null;
        if (c14127y != null) {
            return c14127y;
        }
        gd.a(obj);
        aK aKVarA = this.f132377f.a(obj);
        if (this.f132379h && C14125w.a(obj)) {
            return a(obj, aKVarA, C14127y.e(), "Compose with no enhanced Compose support");
        }
        boolean zE = this.f132376e.e();
        C14056ea c14056eaI = this.f132376e.i();
        if (c14056eaI != null) {
            dQ dQVarA2 = a(obj, c14056eaI, zE);
            if (dQVarA2 != null) {
                return a(obj, aKVarA, C14127y.e(), dQVarA2);
            }
            dQ dQVarA3 = dV.a(this.f132377f, obj, c14056eaI.c());
            if (dQVarA3 != null) {
                return zE ? a(obj, aKVarA, C14127y.f(), dQVarA3) : a(obj, aKVarA, C14127y.e(), dQVarA3);
            }
        }
        if (zE && (c14056eaH = this.f132376e.h()) != null && (dQVarA = dV.a(this.f132377f, obj, c14056eaH.c())) != null) {
            return a(obj, aKVarA, C14127y.f(), dQVarA);
        }
        C14056ea c14056eaJ = this.f132376e.j();
        if (c14056eaJ != null) {
            dQ dQVarA4 = a(obj, c14056eaJ, zE);
            if (dQVarA4 != null) {
                return a(obj, aKVarA, C14127y.f(), dQVarA4);
            }
            dQ dQVarA5 = dV.a(this.f132377f, obj, c14056eaJ.b());
            if (dQVarA5 != null) {
                return zE ? a(obj, aKVarA, C14127y.f(), dQVarA5) : a(obj, aKVarA, C14127y.e(), dQVarA5);
            }
        }
        C14127y c14127yB = C14127y.b(this.f132378g);
        Object objA = gd.a(this.f132377f, obj);
        if (objA != null) {
            c14127yB = b(objA, z10);
        }
        return a(obj, aKVarA, c14127yB, objA);
    }

    private boolean b(C13966ar c13966ar, Object obj, aK aKVar) {
        dQ dQVarA = a(obj, c13966ar.k(), c13966ar.e());
        boolean z10 = dQVarA != null;
        if (z10) {
            this.f132380i.a(obj, aKVar, EnumC13955ag.Watched, dQVarA);
        }
        return z10;
    }

    private boolean c(C13966ar c13966ar, Object obj, aK aKVar) {
        dQ dQVarA = a(obj, c13966ar.l(), c13966ar.e());
        boolean z10 = dQVarA != null;
        if (z10) {
            this.f132380i.a(obj, aKVar, EnumC13955ag.Kept, dQVarA);
        }
        return z10;
    }

    private boolean d(C13966ar c13966ar, Object obj, aK aKVar) {
        if (aKVar.f131492h == 4) {
            this.f132380i.a(obj, aKVar, EnumC13955ag.Blocked, "Password");
            return true;
        }
        if ((obj instanceof View) && (obj instanceof SurfaceView)) {
            this.f132380i.a(obj, aKVar, EnumC13955ag.Blocked, "SurfaceView");
            return true;
        }
        dQ dQVarA = a(obj, c13966ar.h(), c13966ar.e());
        if (dQVarA == null) {
            return false;
        }
        this.f132380i.a(obj, aKVar, EnumC13955ag.Blocked, dQVarA);
        return true;
    }

    private boolean f(Object obj) {
        Boolean bool = (Boolean) this.f132374c.get(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(b(this.f132376e, obj, this.f132377f.a(obj)));
        this.f132374c.put(obj, boolValueOf);
        return boolValueOf.booleanValue();
    }

    private boolean g(Object obj) {
        Object objA;
        Boolean bool = (Boolean) this.f132375d.get(obj);
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean boolValueOf = Boolean.valueOf(c(this.f132376e, obj, this.f132377f.a(obj)));
        if (!boolValueOf.booleanValue() && (objA = gd.a(this.f132377f, obj)) != null) {
            boolValueOf = Boolean.valueOf(g(objA));
        }
        this.f132375d.put(obj, boolValueOf);
        return boolValueOf.booleanValue();
    }

    boolean a(Object obj) {
        a();
        EnumC14126x enumC14126xA = a(obj, true);
        if (C14103fu.f132288b) {
            C14103fu.a(enumC14126xA, a(obj, false), "isOmitted block state for %s", obj);
        }
        return enumC14126xA == EnumC14126x.Omitted;
    }

    public boolean b(Object obj) {
        C14103fu.a("BlockView#isBlocked must be run on UI thread", new Object[0]);
        a();
        EnumC14126x enumC14126xA = a(obj, true);
        if (C14103fu.f132288b) {
            C14103fu.a(enumC14126xA, a(obj, false), "isBlocked block state for %s", obj);
        }
        return enumC14126xA == EnumC14126x.Blocked || enumC14126xA == EnumC14126x.Omitted;
    }

    boolean c(Object obj) {
        a();
        return g(obj);
    }

    boolean d(Object obj) {
        a();
        return f(obj);
    }

    C14127y e(Object obj) {
        a();
        C14127y c14127yB = b(obj, true);
        if (C14103fu.f132288b) {
            C14103fu.a(c14127yB, b(obj, false), "getPrivacyState privacy state for %s", obj);
            C14103fu.a(b(obj), "getPrivacyState privacy state incorrectly retrieved for blocked element %s", obj);
        }
        return c14127yB;
    }
}
