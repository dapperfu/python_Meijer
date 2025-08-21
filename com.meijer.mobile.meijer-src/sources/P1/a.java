package P1;

import O1.e;
import java.util.Iterator;

/* loaded from: classes.dex */
public class a extends O1.c {

    /* renamed from: n0, reason: collision with root package name */
    private float f25281n0;

    public a(O1.e eVar) {
        super(eVar, e.EnumC0378e.ALIGN_VERTICALLY);
        this.f25281n0 = 0.5f;
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        Iterator<Object> it = this.f23017l0.iterator();
        while (it.hasNext()) {
            O1.a aVarB = this.f23015j0.b(it.next());
            aVarB.m();
            Object obj = this.f22953O;
            if (obj != null) {
                aVarB.S(obj);
            } else {
                Object obj2 = this.f22954P;
                if (obj2 != null) {
                    aVarB.R(obj2);
                } else {
                    aVarB.S(O1.e.f23019f);
                }
            }
            Object obj3 = this.f22955Q;
            if (obj3 != null) {
                aVarB.s(obj3);
            } else {
                Object obj4 = this.f22956R;
                if (obj4 != null) {
                    aVarB.r(obj4);
                } else {
                    aVarB.r(O1.e.f23019f);
                }
            }
            float f10 = this.f25281n0;
            if (f10 != 0.5f) {
                aVarB.y(f10);
            }
        }
    }
}
