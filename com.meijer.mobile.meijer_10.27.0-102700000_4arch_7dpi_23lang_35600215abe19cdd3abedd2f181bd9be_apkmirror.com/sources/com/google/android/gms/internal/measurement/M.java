package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class M extends AbstractC10560x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        String str2;
        N n10 = N.ADD;
        int iOrdinal = C10545v2.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            C10545v2.a(N.ASSIGN.name(), 2, list);
            InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
            if (!(interfaceC10498qA instanceof C10533u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC10498qA.getClass().getCanonicalName()));
            }
            if (!u12.d(interfaceC10498qA.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC10498qA.zzc()));
            }
            InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(1));
            u12.e(interfaceC10498qA.zzc(), interfaceC10498qA2);
            return interfaceC10498qA2;
        }
        if (iOrdinal == 14) {
            C10545v2.b(N.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                InterfaceC10498q interfaceC10498qA3 = u12.a((InterfaceC10498q) list.get(i10));
                if (!(interfaceC10498qA3 instanceof C10533u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC10498qA3.getClass().getCanonicalName()));
                }
                u12.g(interfaceC10498qA3.zzc(), u12.a((InterfaceC10498q) list.get(i10 + 1)));
                i10 += 2;
            }
            return InterfaceC10498q.f82342i3;
        }
        if (iOrdinal == 24) {
            C10545v2.b(N.EXPRESSION_LIST.name(), 1, list);
            InterfaceC10498q interfaceC10498qA4 = InterfaceC10498q.f82342i3;
            while (i10 < list.size()) {
                interfaceC10498qA4 = u12.a((InterfaceC10498q) list.get(i10));
                if (interfaceC10498qA4 instanceof C10417h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return interfaceC10498qA4;
        }
        if (iOrdinal == 33) {
            C10545v2.a(N.GET.name(), 1, list);
            InterfaceC10498q interfaceC10498qA5 = u12.a((InterfaceC10498q) list.get(0));
            if (interfaceC10498qA5 instanceof C10533u) {
                return u12.h(interfaceC10498qA5.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC10498qA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            C10545v2.a(N.NULL.name(), 0, list);
            return InterfaceC10498q.f82343j3;
        }
        if (iOrdinal == 58) {
            C10545v2.a(N.SET_PROPERTY.name(), 3, list);
            InterfaceC10498q interfaceC10498qA6 = u12.a((InterfaceC10498q) list.get(0));
            InterfaceC10498q interfaceC10498qA7 = u12.a((InterfaceC10498q) list.get(1));
            InterfaceC10498q interfaceC10498qA8 = u12.a((InterfaceC10498q) list.get(2));
            if (interfaceC10498qA6 == InterfaceC10498q.f82342i3 || interfaceC10498qA6 == InterfaceC10498q.f82343j3) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC10498qA7.zzc(), interfaceC10498qA6.zzc()));
            }
            if ((interfaceC10498qA6 instanceof C10399f) && (interfaceC10498qA7 instanceof C10435j)) {
                ((C10399f) interfaceC10498qA6).p(interfaceC10498qA7.zzd().intValue(), interfaceC10498qA8);
                return interfaceC10498qA8;
            }
            if (!(interfaceC10498qA6 instanceof InterfaceC10462m)) {
                return interfaceC10498qA8;
            }
            ((InterfaceC10462m) interfaceC10498qA6).e(interfaceC10498qA7.zzc(), interfaceC10498qA8);
            return interfaceC10498qA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C10399f();
            }
            C10399f c10399f = new C10399f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10498q interfaceC10498qA9 = u12.a((InterfaceC10498q) it.next());
                if (interfaceC10498qA9 instanceof C10417h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c10399f.p(i10, interfaceC10498qA9);
                i10++;
            }
            return c10399f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C10471n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C10471n c10471n = new C10471n();
            while (i10 < list.size() - 1) {
                InterfaceC10498q interfaceC10498qA10 = u12.a((InterfaceC10498q) list.get(i10));
                InterfaceC10498q interfaceC10498qA11 = u12.a((InterfaceC10498q) list.get(i10 + 1));
                if ((interfaceC10498qA10 instanceof C10417h) || (interfaceC10498qA11 instanceof C10417h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c10471n.e(interfaceC10498qA10.zzc(), interfaceC10498qA11);
                i10 += 2;
            }
            return c10471n;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            C10545v2.a(N.GET_PROPERTY.name(), 2, list);
            InterfaceC10498q interfaceC10498qA12 = u12.a((InterfaceC10498q) list.get(0));
            InterfaceC10498q interfaceC10498qA13 = u12.a((InterfaceC10498q) list.get(1));
            if ((interfaceC10498qA12 instanceof C10399f) && C10545v2.d(interfaceC10498qA13)) {
                return ((C10399f) interfaceC10498qA12).o(interfaceC10498qA13.zzd().intValue());
            }
            if (interfaceC10498qA12 instanceof InterfaceC10462m) {
                return ((InterfaceC10462m) interfaceC10498qA12).W(interfaceC10498qA13.zzc());
            }
            if (interfaceC10498qA12 instanceof C10533u) {
                if ("length".equals(interfaceC10498qA13.zzc())) {
                    return new C10435j(Double.valueOf(interfaceC10498qA12.zzc().length()));
                }
                if (C10545v2.d(interfaceC10498qA13) && interfaceC10498qA13.zzd().doubleValue() < interfaceC10498qA12.zzc().length()) {
                    return new C10533u(String.valueOf(interfaceC10498qA12.zzc().charAt(interfaceC10498qA13.zzd().intValue())));
                }
            }
            return InterfaceC10498q.f82342i3;
        }
        switch (iOrdinal) {
            case 62:
                C10545v2.a(N.TYPEOF.name(), 1, list);
                InterfaceC10498q interfaceC10498qA14 = u12.a((InterfaceC10498q) list.get(0));
                if (interfaceC10498qA14 instanceof C10542v) {
                    str2 = "undefined";
                } else if (interfaceC10498qA14 instanceof C10408g) {
                    str2 = "boolean";
                } else if (interfaceC10498qA14 instanceof C10435j) {
                    str2 = "number";
                } else if (interfaceC10498qA14 instanceof C10533u) {
                    str2 = "string";
                } else if (interfaceC10498qA14 instanceof C10489p) {
                    str2 = "function";
                } else {
                    if ((interfaceC10498qA14 instanceof r) || (interfaceC10498qA14 instanceof C10417h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC10498qA14));
                    }
                    str2 = "object";
                }
                return new C10533u(str2);
            case 63:
                C10545v2.a(N.UNDEFINED.name(), 0, list);
                return InterfaceC10498q.f82342i3;
            case 64:
                C10545v2.b(N.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC10498q interfaceC10498qA15 = u12.a((InterfaceC10498q) it2.next());
                    if (!(interfaceC10498qA15 instanceof C10533u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC10498qA15.getClass().getCanonicalName()));
                    }
                    u12.f(interfaceC10498qA15.zzc(), InterfaceC10498q.f82342i3);
                }
                return InterfaceC10498q.f82342i3;
            default:
                return super.b(str);
        }
    }

    protected M() {
        this.f82452a.add(N.ASSIGN);
        this.f82452a.add(N.CONST);
        this.f82452a.add(N.CREATE_ARRAY);
        this.f82452a.add(N.CREATE_OBJECT);
        this.f82452a.add(N.EXPRESSION_LIST);
        this.f82452a.add(N.GET);
        this.f82452a.add(N.GET_INDEX);
        this.f82452a.add(N.GET_PROPERTY);
        this.f82452a.add(N.NULL);
        this.f82452a.add(N.SET_PROPERTY);
        this.f82452a.add(N.TYPEOF);
        this.f82452a.add(N.UNDEFINED);
        this.f82452a.add(N.VAR);
    }
}
