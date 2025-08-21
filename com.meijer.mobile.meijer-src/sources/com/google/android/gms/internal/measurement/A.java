package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class A extends AbstractC10685x {
    private static InterfaceC10623q c(U1 u12, List list) {
        C10670v2.b(N.FN.name(), 2, list);
        InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
        InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(1));
        if (!(interfaceC10623qA2 instanceof C10524f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC10623qA2.getClass().getCanonicalName()));
        }
        List listK = ((C10524f) interfaceC10623qA2).k();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C10614p(interfaceC10623qA.zzc(), listK, arrayList, u12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10670v2.e(str).ordinal();
        if (iOrdinal == 2) {
            C10670v2.a(N.APPLY.name(), 3, list);
            InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
            String strZzc = u12.a((InterfaceC10623q) list.get(1)).zzc();
            InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(2));
            if (!(interfaceC10623qA2 instanceof C10524f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC10623qA2.getClass().getCanonicalName()));
            }
            if (strZzc.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return interfaceC10623qA.f(strZzc, u12, ((C10524f) interfaceC10623qA2).k());
        }
        if (iOrdinal == 15) {
            C10670v2.a(N.BREAK.name(), 0, list);
            return InterfaceC10623q.f83184k3;
        }
        if (iOrdinal == 25) {
            return c(u12, list);
        }
        if (iOrdinal == 41) {
            C10670v2.b(N.IF.name(), 2, list);
            InterfaceC10623q interfaceC10623qA3 = u12.a((InterfaceC10623q) list.get(0));
            InterfaceC10623q interfaceC10623qA4 = u12.a((InterfaceC10623q) list.get(1));
            InterfaceC10623q interfaceC10623qA5 = list.size() > 2 ? u12.a((InterfaceC10623q) list.get(2)) : null;
            InterfaceC10623q interfaceC10623q = InterfaceC10623q.f83182i3;
            InterfaceC10623q interfaceC10623qB = interfaceC10623qA3.zze().booleanValue() ? u12.b((C10524f) interfaceC10623qA4) : interfaceC10623qA5 != null ? u12.b((C10524f) interfaceC10623qA5) : interfaceC10623q;
            return true != (interfaceC10623qB instanceof C10542h) ? interfaceC10623q : interfaceC10623qB;
        }
        if (iOrdinal == 54) {
            return new C10524f(list);
        }
        if (iOrdinal == 57) {
            if (list.isEmpty()) {
                return InterfaceC10623q.f83186m3;
            }
            C10670v2.a(N.RETURN.name(), 1, list);
            return new C10542h("return", u12.a((InterfaceC10623q) list.get(0)));
        }
        if (iOrdinal != 19) {
            if (iOrdinal == 20) {
                C10670v2.b(N.DEFINE_FUNCTION.name(), 2, list);
                C10614p c10614p = (C10614p) c(u12, list);
                if (c10614p.c() == null) {
                    u12.e("", c10614p);
                    return c10614p;
                }
                u12.e(c10614p.c(), c10614p);
                return c10614p;
            }
            if (iOrdinal == 60) {
                C10670v2.a(N.SWITCH.name(), 3, list);
                InterfaceC10623q interfaceC10623qA6 = u12.a((InterfaceC10623q) list.get(0));
                InterfaceC10623q interfaceC10623qA7 = u12.a((InterfaceC10623q) list.get(1));
                InterfaceC10623q interfaceC10623qA8 = u12.a((InterfaceC10623q) list.get(2));
                if (!(interfaceC10623qA7 instanceof C10524f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(interfaceC10623qA8 instanceof C10524f)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                C10524f c10524f = (C10524f) interfaceC10623qA7;
                C10524f c10524f2 = (C10524f) interfaceC10623qA8;
                boolean z10 = false;
                for (int i10 = 0; i10 < c10524f.m(); i10++) {
                    if (z10 || interfaceC10623qA6.equals(u12.a(c10524f.o(i10)))) {
                        InterfaceC10623q interfaceC10623qA9 = u12.a(c10524f2.o(i10));
                        if (interfaceC10623qA9 instanceof C10542h) {
                            return ((C10542h) interfaceC10623qA9).b().equals("break") ? InterfaceC10623q.f83182i3 : interfaceC10623qA9;
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                if (c10524f.m() + 1 == c10524f2.m()) {
                    InterfaceC10623q interfaceC10623qA10 = u12.a(c10524f2.o(c10524f.m()));
                    if (interfaceC10623qA10 instanceof C10542h) {
                        String strB = ((C10542h) interfaceC10623qA10).b();
                        if (strB.equals("return") || strB.equals("continue")) {
                            return interfaceC10623qA10;
                        }
                    }
                }
                return InterfaceC10623q.f83182i3;
            }
            if (iOrdinal == 61) {
                C10670v2.a(N.TERNARY.name(), 3, list);
                return u12.a((InterfaceC10623q) list.get(0)).zze().booleanValue() ? u12.a((InterfaceC10623q) list.get(1)) : u12.a((InterfaceC10623q) list.get(2));
            }
            switch (iOrdinal) {
                case 11:
                    return u12.c().b(new C10524f(list));
                case 12:
                    C10670v2.a(N.BREAK.name(), 0, list);
                    return InterfaceC10623q.f83185l3;
                case 13:
                    break;
                default:
                    return super.b(str);
            }
        }
        if (list.isEmpty()) {
            return InterfaceC10623q.f83182i3;
        }
        InterfaceC10623q interfaceC10623qA11 = u12.a((InterfaceC10623q) list.get(0));
        return interfaceC10623qA11 instanceof C10524f ? u12.b((C10524f) interfaceC10623qA11) : InterfaceC10623q.f83182i3;
    }

    protected A() {
        this.f83292a.add(N.APPLY);
        this.f83292a.add(N.BLOCK);
        this.f83292a.add(N.BREAK);
        this.f83292a.add(N.CASE);
        this.f83292a.add(N.DEFAULT);
        this.f83292a.add(N.CONTINUE);
        this.f83292a.add(N.DEFINE_FUNCTION);
        this.f83292a.add(N.FN);
        this.f83292a.add(N.IF);
        this.f83292a.add(N.QUOTE);
        this.f83292a.add(N.RETURN);
        this.f83292a.add(N.SWITCH);
        this.f83292a.add(N.TERNARY);
    }
}
