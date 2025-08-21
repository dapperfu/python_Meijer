package P1;

import O1.e;
import java.util.Iterator;

/* loaded from: classes.dex */
public class b extends O1.c {

    /* renamed from: n0, reason: collision with root package name */
    private float f25282n0;

    public b(O1.e eVar) {
        super(eVar, e.EnumC0378e.ALIGN_VERTICALLY);
        this.f25282n0 = 0.5f;
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        Iterator<Object> it = this.f23017l0.iterator();
        while (it.hasNext()) {
            O1.a aVarB = this.f23015j0.b(it.next());
            aVarB.n();
            Object obj = this.f22957S;
            if (obj != null) {
                aVarB.V(obj);
            } else {
                Object obj2 = this.f22958T;
                if (obj2 != null) {
                    aVarB.U(obj2);
                } else {
                    aVarB.V(O1.e.f23019f);
                }
            }
            Object obj3 = this.f22959U;
            if (obj3 != null) {
                aVarB.k(obj3);
            } else {
                Object obj4 = this.f22960V;
                if (obj4 != null) {
                    aVarB.j(obj4);
                } else {
                    aVarB.j(O1.e.f23019f);
                }
            }
            float f10 = this.f25282n0;
            if (f10 != 0.5f) {
                aVarB.W(f10);
            }
        }
    }
}
