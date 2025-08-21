package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class J extends AbstractC10685x {
    private static InterfaceC10623q d(H h10, InterfaceC10623q interfaceC10623q, InterfaceC10623q interfaceC10623q2) {
        if (interfaceC10623q instanceof Iterable) {
            return e(h10, ((Iterable) interfaceC10623q).iterator(), interfaceC10623q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static InterfaceC10623q e(H h10, Iterator it, InterfaceC10623q interfaceC10623q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC10623q interfaceC10623qB = h10.a((InterfaceC10623q) it.next()).b((C10524f) interfaceC10623q);
                if (interfaceC10623qB instanceof C10542h) {
                    C10542h c10542h = (C10542h) interfaceC10623qB;
                    if ("break".equals(c10542h.b())) {
                        return InterfaceC10623q.f83182i3;
                    }
                    if ("return".equals(c10542h.b())) {
                        return c10542h;
                    }
                }
            }
        }
        return InterfaceC10623q.f83182i3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10670v2.e(str).ordinal();
        if (iOrdinal == 65) {
            C10670v2.a(N.WHILE.name(), 4, list);
            InterfaceC10623q interfaceC10623q = (InterfaceC10623q) list.get(0);
            InterfaceC10623q interfaceC10623q2 = (InterfaceC10623q) list.get(1);
            InterfaceC10623q interfaceC10623q3 = (InterfaceC10623q) list.get(2);
            InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(3));
            if (u12.a(interfaceC10623q3).zze().booleanValue()) {
                InterfaceC10623q interfaceC10623qB = u12.b((C10524f) interfaceC10623qA);
                if (interfaceC10623qB instanceof C10542h) {
                    C10542h c10542h = (C10542h) interfaceC10623qB;
                    if ("break".equals(c10542h.b())) {
                        return InterfaceC10623q.f83182i3;
                    }
                    if ("return".equals(c10542h.b())) {
                        return c10542h;
                    }
                }
            }
            while (u12.a(interfaceC10623q).zze().booleanValue()) {
                InterfaceC10623q interfaceC10623qB2 = u12.b((C10524f) interfaceC10623qA);
                if (interfaceC10623qB2 instanceof C10542h) {
                    C10542h c10542h2 = (C10542h) interfaceC10623qB2;
                    if ("break".equals(c10542h2.b())) {
                        return InterfaceC10623q.f83182i3;
                    }
                    if ("return".equals(c10542h2.b())) {
                        return c10542h2;
                    }
                }
                u12.a(interfaceC10623q2);
            }
            return InterfaceC10623q.f83182i3;
        }
        switch (iOrdinal) {
            case 26:
                C10670v2.a(N.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C10658u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new I(u12, ((InterfaceC10623q) list.get(0)).zzc()), u12.a((InterfaceC10623q) list.get(1)), u12.a((InterfaceC10623q) list.get(2)));
            case 27:
                C10670v2.a(N.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C10658u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new F(u12, ((InterfaceC10623q) list.get(0)).zzc()), u12.a((InterfaceC10623q) list.get(1)), u12.a((InterfaceC10623q) list.get(2)));
            case 28:
                C10670v2.a(N.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C10658u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new G(u12, ((InterfaceC10623q) list.get(0)).zzc()), u12.a((InterfaceC10623q) list.get(1)), u12.a((InterfaceC10623q) list.get(2)));
            case 29:
                C10670v2.a(N.FOR_LET.name(), 4, list);
                InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(0));
                if (!(interfaceC10623qA2 instanceof C10524f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C10524f c10524f = (C10524f) interfaceC10623qA2;
                InterfaceC10623q interfaceC10623q4 = (InterfaceC10623q) list.get(1);
                InterfaceC10623q interfaceC10623q5 = (InterfaceC10623q) list.get(2);
                InterfaceC10623q interfaceC10623qA3 = u12.a((InterfaceC10623q) list.get(3));
                U1 u1C = u12.c();
                for (int i10 = 0; i10 < c10524f.m(); i10++) {
                    String strZzc = c10524f.o(i10).zzc();
                    u1C.e(strZzc, u12.h(strZzc));
                }
                while (u12.a(interfaceC10623q4).zze().booleanValue()) {
                    InterfaceC10623q interfaceC10623qB3 = u12.b((C10524f) interfaceC10623qA3);
                    if (interfaceC10623qB3 instanceof C10542h) {
                        C10542h c10542h3 = (C10542h) interfaceC10623qB3;
                        if ("break".equals(c10542h3.b())) {
                            return InterfaceC10623q.f83182i3;
                        }
                        if ("return".equals(c10542h3.b())) {
                            return c10542h3;
                        }
                    }
                    U1 u1C2 = u12.c();
                    for (int i11 = 0; i11 < c10524f.m(); i11++) {
                        String strZzc2 = c10524f.o(i11).zzc();
                        u1C2.e(strZzc2, u1C.h(strZzc2));
                    }
                    u1C2.a(interfaceC10623q5);
                    u1C = u1C2;
                }
                return InterfaceC10623q.f83182i3;
            case 30:
                C10670v2.a(N.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C10658u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new I(u12, ((InterfaceC10623q) list.get(0)).zzc()), u12.a((InterfaceC10623q) list.get(1)), u12.a((InterfaceC10623q) list.get(2)));
            case 31:
                C10670v2.a(N.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C10658u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new F(u12, ((InterfaceC10623q) list.get(0)).zzc()), u12.a((InterfaceC10623q) list.get(1)), u12.a((InterfaceC10623q) list.get(2)));
            case com.medallia.digital.mobilesdk.l3.f93325e /* 32 */:
                C10670v2.a(N.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C10658u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new G(u12, ((InterfaceC10623q) list.get(0)).zzc()), u12.a((InterfaceC10623q) list.get(1)), u12.a((InterfaceC10623q) list.get(2)));
            default:
                return super.b(str);
        }
    }

    protected J() {
        this.f83292a.add(N.FOR_IN);
        this.f83292a.add(N.FOR_IN_CONST);
        this.f83292a.add(N.FOR_IN_LET);
        this.f83292a.add(N.FOR_LET);
        this.f83292a.add(N.FOR_OF);
        this.f83292a.add(N.FOR_OF_CONST);
        this.f83292a.add(N.FOR_OF_LET);
        this.f83292a.add(N.WHILE);
    }

    private static InterfaceC10623q c(H h10, InterfaceC10623q interfaceC10623q, InterfaceC10623q interfaceC10623q2) {
        return e(h10, interfaceC10623q.zzf(), interfaceC10623q2);
    }
}
