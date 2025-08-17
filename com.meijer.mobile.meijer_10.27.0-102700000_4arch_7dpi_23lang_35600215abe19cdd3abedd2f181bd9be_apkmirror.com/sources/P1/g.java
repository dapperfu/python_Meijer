package P1;

import O1.e;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g extends d {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f24598a;

        static {
            int[] iArr = new int[e.b.values().length];
            f24598a = iArr;
            try {
                iArr[e.b.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24598a[e.b.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24598a[e.b.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(O1.e eVar) {
        super(eVar, e.EnumC0372e.HORIZONTAL_CHAIN);
    }

    @Override // O1.c, O1.a, O1.d
    public void apply() {
        Iterator<Object> it = this.f23024l0.iterator();
        while (it.hasNext()) {
            this.f23022j0.b(it.next()).m();
        }
        Iterator<Object> it2 = this.f23024l0.iterator();
        O1.a aVar = null;
        O1.a aVar2 = null;
        while (it2.hasNext()) {
            O1.a aVarB = this.f23022j0.b(it2.next());
            if (aVar2 == null) {
                Object obj = this.f22960O;
                if (obj != null) {
                    aVarB.S(obj).C(this.f22993m).E(this.f22999s);
                } else {
                    Object obj2 = this.f22961P;
                    if (obj2 != null) {
                        aVarB.R(obj2).C(this.f22993m).E(this.f22999s);
                    } else {
                        Object obj3 = this.f22956K;
                        if (obj3 != null) {
                            aVarB.S(obj3).C(this.f22991k).E(this.f22997q);
                        } else {
                            Object obj4 = this.f22957L;
                            if (obj4 != null) {
                                aVarB.R(obj4).C(this.f22991k).E(this.f22997q);
                            } else {
                                aVarB.S(O1.e.f23026f);
                            }
                        }
                    }
                }
                aVar2 = aVarB;
            }
            if (aVar != null) {
                aVar.s(aVarB.getKey());
                aVarB.R(aVar.getKey());
            }
            aVar = aVarB;
        }
        if (aVar != null) {
            Object obj5 = this.f22962Q;
            if (obj5 != null) {
                aVar.s(obj5).C(this.f22994n).E(this.f23000t);
            } else {
                Object obj6 = this.f22963R;
                if (obj6 != null) {
                    aVar.r(obj6).C(this.f22994n).E(this.f23000t);
                } else {
                    Object obj7 = this.f22958M;
                    if (obj7 != null) {
                        aVar.s(obj7).C(this.f22992l).E(this.f22998r);
                    } else {
                        Object obj8 = this.f22959N;
                        if (obj8 != null) {
                            aVar.r(obj8).C(this.f22992l).E(this.f22998r);
                        } else {
                            aVar.r(O1.e.f23026f);
                        }
                    }
                }
            }
        }
        if (aVar2 == null) {
            return;
        }
        float f10 = this.f24589n0;
        if (f10 != 0.5f) {
            aVar2.y(f10);
        }
        int i10 = a.f24598a[this.f24590o0.ordinal()];
        if (i10 == 1) {
            aVar2.L(0);
        } else if (i10 == 2) {
            aVar2.L(1);
        } else {
            if (i10 != 3) {
                return;
            }
            aVar2.L(2);
        }
    }
}
