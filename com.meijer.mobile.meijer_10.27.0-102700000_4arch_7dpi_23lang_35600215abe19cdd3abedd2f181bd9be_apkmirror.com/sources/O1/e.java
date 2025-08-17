package O1;

import P1.g;
import P1.h;
import Q1.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e {

    /* renamed from: f, reason: collision with root package name */
    public static final Integer f23026f = 0;

    /* renamed from: a, reason: collision with root package name */
    protected HashMap<Object, O1.d> f23027a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    protected HashMap<Object, O1.c> f23028b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    HashMap<String, ArrayList<String>> f23029c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final O1.a f23030d;

    /* renamed from: e, reason: collision with root package name */
    private int f23031e;

    public enum b {
        SPREAD,
        SPREAD_INSIDE,
        PACKED
    }

    public enum c {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum d {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* renamed from: O1.e$e, reason: collision with other inner class name */
    public enum EnumC0372e {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        FLOW
    }

    public P1.f o(Object obj) {
        return f(obj, 1);
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23032a;

        static {
            int[] iArr = new int[EnumC0372e.values().length];
            f23032a = iArr;
            try {
                iArr[EnumC0372e.HORIZONTAL_CHAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23032a[EnumC0372e.VERTICAL_CHAIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23032a[EnumC0372e.ALIGN_HORIZONTALLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23032a[EnumC0372e.ALIGN_VERTICALLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23032a[EnumC0372e.BARRIER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private String e() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f23031e;
        this.f23031e = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public O1.a b(Object obj) {
        O1.d dVarD = this.f23027a.get(obj);
        if (dVarD == null) {
            dVarD = d(obj);
            this.f23027a.put(obj, dVarD);
            dVarD.c(obj);
        }
        if (dVarD instanceof O1.a) {
            return (O1.a) dVarD;
        }
        return null;
    }

    public int c(Object obj) {
        if (obj instanceof Float) {
            return ((Float) obj).intValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public O1.a d(Object obj) {
        return new O1.a(this);
    }

    public O1.c h(Object obj, EnumC0372e enumC0372e) {
        if (obj == null) {
            obj = e();
        }
        O1.c cVar = this.f23028b.get(obj);
        if (cVar == null) {
            int i10 = a.f23032a[enumC0372e.ordinal()];
            cVar = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? new O1.c(this, enumC0372e) : new P1.c(this) : new P1.b(this) : new P1.a(this) : new h(this) : new g(this);
            cVar.c(obj);
            this.f23028b.put(obj, cVar);
        }
        return cVar;
    }

    O1.d j(Object obj) {
        return this.f23027a.get(obj);
    }

    public void k() {
        this.f23028b.clear();
        this.f23029c.clear();
    }

    public e l(O1.b bVar) {
        this.f23030d.K(bVar);
        return this;
    }

    public e n(O1.b bVar) {
        this.f23030d.P(bVar);
        return this;
    }

    public e() {
        O1.a aVar = new O1.a(this);
        this.f23030d = aVar;
        this.f23031e = 0;
        this.f23027a.put(f23026f, aVar);
    }

    public void a(Q1.f fVar) {
        O1.c cVar;
        i iVarA0;
        i iVarA02;
        fVar.b1();
        this.f23030d.w().f(this, fVar, 0);
        this.f23030d.u().f(this, fVar, 1);
        for (Object obj : this.f23028b.keySet()) {
            i iVarA03 = this.f23028b.get(obj).a0();
            if (iVarA03 != null) {
                O1.d dVarB = this.f23027a.get(obj);
                if (dVarB == null) {
                    dVarB = b(obj);
                }
                dVarB.b(iVarA03);
            }
        }
        for (Object obj2 : this.f23027a.keySet()) {
            O1.d dVar = this.f23027a.get(obj2);
            if (dVar != this.f23030d && (dVar.d() instanceof O1.c) && (iVarA02 = ((O1.c) dVar.d()).a0()) != null) {
                O1.d dVarB2 = this.f23027a.get(obj2);
                if (dVarB2 == null) {
                    dVarB2 = b(obj2);
                }
                dVarB2.b(iVarA02);
            }
        }
        Iterator<Object> it = this.f23027a.keySet().iterator();
        while (it.hasNext()) {
            O1.d dVar2 = this.f23027a.get(it.next());
            if (dVar2 != this.f23030d) {
                Q1.e eVarA = dVar2.a();
                eVarA.n0(dVar2.getKey().toString());
                eVarA.J0(null);
                if (dVar2.d() instanceof P1.f) {
                    dVar2.apply();
                }
                fVar.X0(eVarA);
            } else {
                dVar2.b(fVar);
            }
        }
        Iterator<Object> it2 = this.f23028b.keySet().iterator();
        while (it2.hasNext()) {
            O1.c cVar2 = this.f23028b.get(it2.next());
            if (cVar2.a0() != null) {
                Iterator<Object> it3 = cVar2.f23024l0.iterator();
                while (it3.hasNext()) {
                    cVar2.a0().X0(this.f23027a.get(it3.next()).a());
                }
                cVar2.apply();
            } else {
                cVar2.apply();
            }
        }
        Iterator<Object> it4 = this.f23027a.keySet().iterator();
        while (it4.hasNext()) {
            O1.d dVar3 = this.f23027a.get(it4.next());
            if (dVar3 != this.f23030d && (dVar3.d() instanceof O1.c) && (iVarA0 = (cVar = (O1.c) dVar3.d()).a0()) != null) {
                Iterator<Object> it5 = cVar.f23024l0.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    O1.d dVar4 = this.f23027a.get(next);
                    if (dVar4 != null) {
                        iVarA0.X0(dVar4.a());
                    } else if (next instanceof O1.d) {
                        iVarA0.X0(((O1.d) next).a());
                    } else {
                        System.out.println("couldn't find reference for " + next);
                    }
                }
                dVar3.apply();
            }
        }
        for (Object obj3 : this.f23027a.keySet()) {
            O1.d dVar5 = this.f23027a.get(obj3);
            dVar5.apply();
            Q1.e eVarA2 = dVar5.a();
            if (eVarA2 != null && obj3 != null) {
                eVarA2.f29607o = obj3.toString();
            }
        }
    }

    public P1.f f(Object obj, int i10) {
        O1.a aVarB = b(obj);
        if (aVarB.d() == null || !(aVarB.d() instanceof P1.f)) {
            P1.f fVar = new P1.f(this);
            fVar.f(i10);
            fVar.c(obj);
            aVarB.J(fVar);
        }
        return (P1.f) aVarB.d();
    }

    public e g(O1.b bVar) {
        return l(bVar);
    }

    public void i(Object obj, Object obj2) {
        O1.a aVarB = b(obj);
        if (aVarB != null) {
            aVarB.O(obj2);
        }
    }

    public void m(String str, String str2) {
        ArrayList<String> arrayList;
        O1.a aVarB = b(str);
        if (aVarB != null) {
            aVarB.M(str2);
            if (!this.f23029c.containsKey(str2)) {
                arrayList = new ArrayList<>();
                this.f23029c.put(str2, arrayList);
            } else {
                arrayList = this.f23029c.get(str2);
            }
            arrayList.add(str);
        }
    }

    public e p(O1.b bVar) {
        return n(bVar);
    }
}
