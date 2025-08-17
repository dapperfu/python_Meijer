package P1;

import O1.e;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24599a;

        static {
            int[] iArr = new int[e.b.values().length];
            f24599a = iArr;
            try {
                iArr[e.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24599a[e.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24599a[e.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(O1.e eVar) {
        super(eVar, e.EnumC0372e.VERTICAL_CHAIN);
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        Iterator<Object> it = this.f23024l0.iterator();
        while (it.hasNext()) {
            this.f23022j0.b(it.next()).n();
        }
        Iterator<Object> it2 = this.f23024l0.iterator();
        O1.a aVar = null;
        O1.a aVar2 = null;
        while (it2.hasNext()) {
            O1.a aVarB = this.f23022j0.b(it2.next());
            if (aVar2 == null) {
                Object obj = this.f22964S;
                if (obj != null) {
                    aVarB.V(obj).C(this.f22995o).E(this.f23001u);
                } else {
                    Object obj2 = this.f22965T;
                    if (obj2 != null) {
                        aVarB.U(obj2).C(this.f22995o).E(this.f23001u);
                    } else {
                        aVarB.V(O1.e.f23026f);
                    }
                }
                aVar2 = aVarB;
            }
            if (aVar != null) {
                aVar.k(aVarB.getKey());
                aVarB.U(aVar.getKey());
            }
            aVar = aVarB;
        }
        if (aVar != null) {
            Object obj3 = this.f22966U;
            if (obj3 != null) {
                aVar.k(obj3).C(this.f22996p).E(this.f23002v);
            } else {
                Object obj4 = this.f22967V;
                if (obj4 != null) {
                    aVar.j(obj4).C(this.f22996p).E(this.f23002v);
                } else {
                    aVar.j(O1.e.f23026f);
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f10 = this.f24589n0;
        if (f10 != 0.5f) {
            aVar2.W(f10);
        }
        int i10 = a.f24599a[this.f24590o0.ordinal()];
        if (i10 == 1) {
            aVar2.N(0);
        } else if (i10 == 2) {
            aVar2.N(1);
        } else {
            if (i10 != 3) {
                return;
            }
            aVar2.N(2);
        }
    }
}
