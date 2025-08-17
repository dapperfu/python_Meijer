package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class A extends AbstractC10560x {
    private static InterfaceC10498q c(U1 u12, List list) {
        C10545v2.b(N.FN.name(), 2, list);
        InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
        InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(1));
        if (!(interfaceC10498qA2 instanceof C10399f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC10498qA2.getClass().getCanonicalName()));
        }
        List listK = ((C10399f) interfaceC10498qA2).k();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C10489p(interfaceC10498qA.zzc(), listK, arrayList, u12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10545v2.e(str).ordinal();
        if (iOrdinal == 2) {
            C10545v2.a(N.APPLY.name(), 3, list);
            InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
            String strZzc = u12.a((InterfaceC10498q) list.get(1)).zzc();
            InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(2));
            if (!(interfaceC10498qA2 instanceof C10399f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC10498qA2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC10498qA.f(strZzc, u12, ((C10399f) interfaceC10498qA2).k());
        }
        if (iOrdinal == 15) {
            C10545v2.a(N.BREAK.name(), 0, list);
            return InterfaceC10498q.f82344k3;
        }
        if (iOrdinal == 25) {
            return c(u12, list);
        }
        if (iOrdinal == 41) {
            C10545v2.b(N.IF.name(), 2, list);
            InterfaceC10498q interfaceC10498qA3 = u12.a((InterfaceC10498q) list.get(0));
            InterfaceC10498q interfaceC10498qA4 = u12.a((InterfaceC10498q) list.get(1));
            InterfaceC10498q interfaceC10498qA5 = list.size() > 2 ? u12.a((InterfaceC10498q) list.get(2)) : null;
            InterfaceC10498q interfaceC10498q = InterfaceC10498q.f82342i3;
            InterfaceC10498q interfaceC10498qB = interfaceC10498qA3.zze().booleanValue() ? u12.b((C10399f) interfaceC10498qA4) : interfaceC10498qA5 != null ? u12.b((C10399f) interfaceC10498qA5) : interfaceC10498q;
            return true != (interfaceC10498qB instanceof C10417h) ? interfaceC10498q : interfaceC10498qB;
        }
        if (iOrdinal == 54) {
            return new C10399f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC10498q.f82346m3;
            }
            C10545v2.a(N.RETURN.name(), 1, list);
            return new C10417h("return", u12.a((InterfaceC10498q) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                C10545v2.b(N.DEFINE_FUNCTION.name(), 2, list);
                C10489p c10489p = (C10489p) c(u12, list);
                if (c10489p.c() == null) {
                    u12.e("", c10489p);
                    return c10489p;
                }
                u12.e(c10489p.c(), c10489p);
                return c10489p;
            }
            if (iOrdinal == 60) {
                C10545v2.a(N.SWITCH.name(), 3, list);
                InterfaceC10498q interfaceC10498qA6 = u12.a((InterfaceC10498q) list.get(0));
                InterfaceC10498q interfaceC10498qA7 = u12.a((InterfaceC10498q) list.get(1));
                InterfaceC10498q interfaceC10498qA8 = u12.a((InterfaceC10498q) list.get(2));
                if (!(interfaceC10498qA7 instanceof C10399f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC10498qA8 instanceof C10399f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C10399f c10399f = (C10399f) interfaceC10498qA7;
                C10399f c10399f2 = (C10399f) interfaceC10498qA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < c10399f.m(); i10++) {
                    if (z10 || interfaceC10498qA6.equals(u12.a(c10399f.o(i10)))) {
                        InterfaceC10498q interfaceC10498qA9 = u12.a(c10399f2.o(i10));
                        if (interfaceC10498qA9 instanceof C10417h) {
                            return ((C10417h) interfaceC10498qA9).b().equals("break") ? InterfaceC10498q.f82342i3 : interfaceC10498qA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c10399f.m() + 1 == c10399f2.m()) {
                    InterfaceC10498q interfaceC10498qA10 = u12.a(c10399f2.o(c10399f.m()));
                    if (interfaceC10498qA10 instanceof C10417h) {
                        String strB = ((C10417h) interfaceC10498qA10).b();
                        if (strB.equals("return") || strB.equals("continue")) {
                            return interfaceC10498qA10;
                        }
                    }
                }
                return InterfaceC10498q.f82342i3;
            }
            if (iOrdinal == 61) {
                C10545v2.a(N.TERNARY.name(), 3, list);
                return u12.a((InterfaceC10498q) list.get(0)).zze().booleanValue() ? u12.a((InterfaceC10498q) list.get(1)) : u12.a((InterfaceC10498q) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return u12.c().b(new C10399f(list));
                case 12:
                    C10545v2.a(N.BREAK.name(), 0, list);
                    return InterfaceC10498q.f82345l3;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC10498q.f82342i3;
        }
        InterfaceC10498q interfaceC10498qA11 = u12.a((InterfaceC10498q) list.get(0));
        return interfaceC10498qA11 instanceof C10399f ? u12.b((C10399f) interfaceC10498qA11) : InterfaceC10498q.f82342i3;
    }

    protected A() {
        this.f82452a.add(N.APPLY);
        this.f82452a.add(N.BLOCK);
        this.f82452a.add(N.BREAK);
        this.f82452a.add(N.CASE);
        this.f82452a.add(N.DEFAULT);
        this.f82452a.add(N.CONTINUE);
        this.f82452a.add(N.DEFINE_FUNCTION);
        this.f82452a.add(N.FN);
        this.f82452a.add(N.IF);
        this.f82452a.add(N.QUOTE);
        this.f82452a.add(N.RETURN);
        this.f82452a.add(N.SWITCH);
        this.f82452a.add(N.TERNARY);
    }
}
