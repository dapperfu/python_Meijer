package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class M extends AbstractC10685x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        String str2;
        N n10 = N.ADD;
        int iOrdinal = C10670v2.e(str).ordinal();
        int i10 = 0;
        if (iOrdinal == 3) {
            C10670v2.a(N.ASSIGN.name(), 2, list);
            InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
            if (!(interfaceC10623qA instanceof C10658u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC10623qA.getClass().getCanonicalName()));
            }
            if (!u12.d(interfaceC10623qA.zzc())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC10623qA.zzc()));
            }
            InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(1));
            u12.e(interfaceC10623qA.zzc(), interfaceC10623qA2);
            return interfaceC10623qA2;
        }
        if (iOrdinal == 14) {
            C10670v2.b(N.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i10 < list.size() - 1) {
                InterfaceC10623q interfaceC10623qA3 = u12.a((InterfaceC10623q) list.get(i10));
                if (!(interfaceC10623qA3 instanceof C10658u)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC10623qA3.getClass().getCanonicalName()));
                }
                u12.g(interfaceC10623qA3.zzc(), u12.a((InterfaceC10623q) list.get(i10 + 1)));
                i10 += 2;
            }
            return InterfaceC10623q.f83182i3;
        }
        if (iOrdinal == 24) {
            C10670v2.b(N.EXPRESSION_LIST.name(), 1, list);
            InterfaceC10623q interfaceC10623qA4 = InterfaceC10623q.f83182i3;
            while (i10 < list.size()) {
                interfaceC10623qA4 = u12.a((InterfaceC10623q) list.get(i10));
                if (interfaceC10623qA4 instanceof C10542h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i10++;
            }
            return interfaceC10623qA4;
        }
        if (iOrdinal == 33) {
            C10670v2.a(N.GET.name(), 1, list);
            InterfaceC10623q interfaceC10623qA5 = u12.a((InterfaceC10623q) list.get(0));
            if (interfaceC10623qA5 instanceof C10658u) {
                return u12.h(interfaceC10623qA5.zzc());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC10623qA5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            C10670v2.a(N.NULL.name(), 0, list);
            return InterfaceC10623q.f83183j3;
        }
        if (iOrdinal == 58) {
            C10670v2.a(N.SET_PROPERTY.name(), 3, list);
            InterfaceC10623q interfaceC10623qA6 = u12.a((InterfaceC10623q) list.get(0));
            InterfaceC10623q interfaceC10623qA7 = u12.a((InterfaceC10623q) list.get(1));
            InterfaceC10623q interfaceC10623qA8 = u12.a((InterfaceC10623q) list.get(2));
            if (interfaceC10623qA6 == InterfaceC10623q.f83182i3 || interfaceC10623qA6 == InterfaceC10623q.f83183j3) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC10623qA7.zzc(), interfaceC10623qA6.zzc()));
            }
            if ((interfaceC10623qA6 instanceof C10524f) && (interfaceC10623qA7 instanceof C10560j)) {
                ((C10524f) interfaceC10623qA6).p(interfaceC10623qA7.zzd().intValue(), interfaceC10623qA8);
                return interfaceC10623qA8;
            }
            if (!(interfaceC10623qA6 instanceof InterfaceC10587m)) {
                return interfaceC10623qA8;
            }
            ((InterfaceC10587m) interfaceC10623qA6).e(interfaceC10623qA7.zzc(), interfaceC10623qA8);
            return interfaceC10623qA8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C10524f();
            }
            C10524f c10524f = new C10524f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC10623q interfaceC10623qA9 = u12.a((InterfaceC10623q) it.next());
                if (interfaceC10623qA9 instanceof C10542h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c10524f.p(i10, interfaceC10623qA9);
                i10++;
            }
            return c10524f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C10596n();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C10596n c10596n = new C10596n();
            while (i10 < list.size() - 1) {
                InterfaceC10623q interfaceC10623qA10 = u12.a((InterfaceC10623q) list.get(i10));
                InterfaceC10623q interfaceC10623qA11 = u12.a((InterfaceC10623q) list.get(i10 + 1));
                if ((interfaceC10623qA10 instanceof C10542h) || (interfaceC10623qA11 instanceof C10542h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c10596n.e(interfaceC10623qA10.zzc(), interfaceC10623qA11);
                i10 += 2;
            }
            return c10596n;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            C10670v2.a(N.GET_PROPERTY.name(), 2, list);
            InterfaceC10623q interfaceC10623qA12 = u12.a((InterfaceC10623q) list.get(0));
            InterfaceC10623q interfaceC10623qA13 = u12.a((InterfaceC10623q) list.get(1));
            if ((interfaceC10623qA12 instanceof C10524f) && C10670v2.d(interfaceC10623qA13)) {
                return ((C10524f) interfaceC10623qA12).o(interfaceC10623qA13.zzd().intValue());
            }
            if (interfaceC10623qA12 instanceof InterfaceC10587m) {
                return ((InterfaceC10587m) interfaceC10623qA12).X(interfaceC10623qA13.zzc());
            }
            if (interfaceC10623qA12 instanceof C10658u) {
                if ("length".equals(interfaceC10623qA13.zzc())) {
                    return new C10560j(Double.valueOf(interfaceC10623qA12.zzc().length()));
                }
                if (C10670v2.d(interfaceC10623qA13) && interfaceC10623qA13.zzd().doubleValue() < interfaceC10623qA12.zzc().length()) {
                    return new C10658u(String.valueOf(interfaceC10623qA12.zzc().charAt(interfaceC10623qA13.zzd().intValue())));
                }
            }
            return InterfaceC10623q.f83182i3;
        }
        switch (iOrdinal) {
            case 62:
                C10670v2.a(N.TYPEOF.name(), 1, list);
                InterfaceC10623q interfaceC10623qA14 = u12.a((InterfaceC10623q) list.get(0));
                if (interfaceC10623qA14 instanceof C10667v) {
                    str2 = "undefined";
                } else if (interfaceC10623qA14 instanceof C10533g) {
                    str2 = "boolean";
                } else if (interfaceC10623qA14 instanceof C10560j) {
                    str2 = "number";
                } else if (interfaceC10623qA14 instanceof C10658u) {
                    str2 = "string";
                } else if (interfaceC10623qA14 instanceof C10614p) {
                    str2 = "function";
                } else {
                    if ((interfaceC10623qA14 instanceof r) || (interfaceC10623qA14 instanceof C10542h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC10623qA14));
                    }
                    str2 = "object";
                }
                return new C10658u(str2);
            case 63:
                C10670v2.a(N.UNDEFINED.name(), 0, list);
                return InterfaceC10623q.f83182i3;
            case 64:
                C10670v2.b(N.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    InterfaceC10623q interfaceC10623qA15 = u12.a((InterfaceC10623q) it2.next());
                    if (!(interfaceC10623qA15 instanceof C10658u)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC10623qA15.getClass().getCanonicalName()));
                    }
                    u12.f(interfaceC10623qA15.zzc(), InterfaceC10623q.f83182i3);
                }
                return InterfaceC10623q.f83182i3;
            default:
                return super.b(str);
        }
    }

    protected M() {
        this.f83292a.add(N.ASSIGN);
        this.f83292a.add(N.CONST);
        this.f83292a.add(N.CREATE_ARRAY);
        this.f83292a.add(N.CREATE_OBJECT);
        this.f83292a.add(N.EXPRESSION_LIST);
        this.f83292a.add(N.GET);
        this.f83292a.add(N.GET_INDEX);
        this.f83292a.add(N.GET_PROPERTY);
        this.f83292a.add(N.NULL);
        this.f83292a.add(N.SET_PROPERTY);
        this.f83292a.add(N.TYPEOF);
        this.f83292a.add(N.UNDEFINED);
        this.f83292a.add(N.VAR);
    }
}
