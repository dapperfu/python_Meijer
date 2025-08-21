package P1;

import O1.e;
import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f25297a;

        static {
            int[] iArr = new int[e.b.values().length];
            f25297a = iArr;
            try {
                iArr[e.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25297a[e.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25297a[e.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h(O1.e eVar) {
        super(eVar, e.EnumC0378e.VERTICAL_CHAIN);
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        Iterator<Object> it = this.f23017l0.iterator();
        while (it.hasNext()) {
            this.f23015j0.b(it.next()).n();
        }
        Iterator<Object> it2 = this.f23017l0.iterator();
        O1.a aVar = null;
        O1.a aVar2 = null;
        while (it2.hasNext()) {
            O1.a aVarB = this.f23015j0.b(it2.next());
            if (aVar2 == null) {
                Object obj = this.f22957S;
                if (obj != null) {
                    aVarB.V(obj).C(this.f22988o).E(this.f22994u);
                } else {
                    Object obj2 = this.f22958T;
                    if (obj2 != null) {
                        aVarB.U(obj2).C(this.f22988o).E(this.f22994u);
                    } else {
                        aVarB.V(O1.e.f23019f);
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
            Object obj3 = this.f22959U;
            if (obj3 != null) {
                aVar.k(obj3).C(this.f22989p).E(this.f22995v);
            } else {
                Object obj4 = this.f22960V;
                if (obj4 != null) {
                    aVar.j(obj4).C(this.f22989p).E(this.f22995v);
                } else {
                    aVar.j(O1.e.f23019f);
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f10 = this.f25287n0;
        if (f10 != 0.5f) {
            aVar2.W(f10);
        }
        int i10 = a.f25297a[this.f25288o0.ordinal()];
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
