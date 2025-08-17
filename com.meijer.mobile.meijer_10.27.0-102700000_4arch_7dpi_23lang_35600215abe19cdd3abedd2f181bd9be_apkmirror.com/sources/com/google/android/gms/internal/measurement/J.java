package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class J extends AbstractC10560x {
    private static InterfaceC10498q d(H h10, InterfaceC10498q interfaceC10498q, InterfaceC10498q interfaceC10498q2) {
        if (interfaceC10498q instanceof Iterable) {
            return e(h10, ((Iterable) interfaceC10498q).iterator(), interfaceC10498q2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    private static InterfaceC10498q e(H h10, Iterator it, InterfaceC10498q interfaceC10498q) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC10498q interfaceC10498qB = h10.a((InterfaceC10498q) it.next()).b((C10399f) interfaceC10498q);
                if (interfaceC10498qB instanceof C10417h) {
                    C10417h c10417h = (C10417h) interfaceC10498qB;
                    if ("break".equals(c10417h.b())) {
                        return InterfaceC10498q.f82342i3;
                    }
                    if ("return".equals(c10417h.b())) {
                        return c10417h;
                    }
                }
            }
        }
        return InterfaceC10498q.f82342i3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10545v2.e(str).ordinal();
        if (iOrdinal == 65) {
            C10545v2.a(N.WHILE.name(), 4, list);
            InterfaceC10498q interfaceC10498q = (InterfaceC10498q) list.get(0);
            InterfaceC10498q interfaceC10498q2 = (InterfaceC10498q) list.get(1);
            InterfaceC10498q interfaceC10498q3 = (InterfaceC10498q) list.get(2);
            InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(3));
            if (u12.a(interfaceC10498q3).zze().booleanValue()) {
                InterfaceC10498q interfaceC10498qB = u12.b((C10399f) interfaceC10498qA);
                if (interfaceC10498qB instanceof C10417h) {
                    C10417h c10417h = (C10417h) interfaceC10498qB;
                    if ("break".equals(c10417h.b())) {
                        return InterfaceC10498q.f82342i3;
                    }
                    if ("return".equals(c10417h.b())) {
                        return c10417h;
                    }
                }
            }
            while (u12.a(interfaceC10498q).zze().booleanValue()) {
                InterfaceC10498q interfaceC10498qB2 = u12.b((C10399f) interfaceC10498qA);
                if (interfaceC10498qB2 instanceof C10417h) {
                    C10417h c10417h2 = (C10417h) interfaceC10498qB2;
                    if ("break".equals(c10417h2.b())) {
                        return InterfaceC10498q.f82342i3;
                    }
                    if ("return".equals(c10417h2.b())) {
                        return c10417h2;
                    }
                }
                u12.a(interfaceC10498q2);
            }
            return InterfaceC10498q.f82342i3;
        }
        switch (iOrdinal) {
            case 26:
                C10545v2.a(N.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C10533u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return c(new I(u12, ((InterfaceC10498q) list.get(0)).zzc()), u12.a((InterfaceC10498q) list.get(1)), u12.a((InterfaceC10498q) list.get(2)));
            case 27:
                C10545v2.a(N.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C10533u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new F(u12, ((InterfaceC10498q) list.get(0)).zzc()), u12.a((InterfaceC10498q) list.get(1)), u12.a((InterfaceC10498q) list.get(2)));
            case 28:
                C10545v2.a(N.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C10533u)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return c(new G(u12, ((InterfaceC10498q) list.get(0)).zzc()), u12.a((InterfaceC10498q) list.get(1)), u12.a((InterfaceC10498q) list.get(2)));
            case 29:
                C10545v2.a(N.FOR_LET.name(), 4, list);
                InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(0));
                if (!(interfaceC10498qA2 instanceof C10399f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C10399f c10399f = (C10399f) interfaceC10498qA2;
                InterfaceC10498q interfaceC10498q4 = (InterfaceC10498q) list.get(1);
                InterfaceC10498q interfaceC10498q5 = (InterfaceC10498q) list.get(2);
                InterfaceC10498q interfaceC10498qA3 = u12.a((InterfaceC10498q) list.get(3));
                U1 u1C = u12.c();
                for (int i10 = 0; i10 < c10399f.m(); i10++) {
                    String strZzc = c10399f.o(i10).zzc();
                    u1C.e(strZzc, u12.h(strZzc));
                }
                while (u12.a(interfaceC10498q4).zze().booleanValue()) {
                    InterfaceC10498q interfaceC10498qB3 = u12.b((C10399f) interfaceC10498qA3);
                    if (interfaceC10498qB3 instanceof C10417h) {
                        C10417h c10417h3 = (C10417h) interfaceC10498qB3;
                        if ("break".equals(c10417h3.b())) {
                            return InterfaceC10498q.f82342i3;
                        }
                        if ("return".equals(c10417h3.b())) {
                            return c10417h3;
                        }
                    }
                    U1 u1C2 = u12.c();
                    for (int i11 = 0; i11 < c10399f.m(); i11++) {
                        String strZzc2 = c10399f.o(i11).zzc();
                        u1C2.e(strZzc2, u1C.h(strZzc2));
                    }
                    u1C2.a(interfaceC10498q5);
                    u1C = u1C2;
                }
                return InterfaceC10498q.f82342i3;
            case 30:
                C10545v2.a(N.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C10533u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new I(u12, ((InterfaceC10498q) list.get(0)).zzc()), u12.a((InterfaceC10498q) list.get(1)), u12.a((InterfaceC10498q) list.get(2)));
            case 31:
                C10545v2.a(N.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C10533u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new F(u12, ((InterfaceC10498q) list.get(0)).zzc()), u12.a((InterfaceC10498q) list.get(1)), u12.a((InterfaceC10498q) list.get(2)));
            case com.medallia.digital.mobilesdk.l3.f92486e /* 32 */:
                C10545v2.a(N.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C10533u)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new G(u12, ((InterfaceC10498q) list.get(0)).zzc()), u12.a((InterfaceC10498q) list.get(1)), u12.a((InterfaceC10498q) list.get(2)));
            default:
                return super.b(str);
        }
    }

    protected J() {
        this.f82452a.add(N.FOR_IN);
        this.f82452a.add(N.FOR_IN_CONST);
        this.f82452a.add(N.FOR_IN_LET);
        this.f82452a.add(N.FOR_LET);
        this.f82452a.add(N.FOR_OF);
        this.f82452a.add(N.FOR_OF_CONST);
        this.f82452a.add(N.FOR_OF_LET);
        this.f82452a.add(N.WHILE);
    }

    private static InterfaceC10498q c(H h10, InterfaceC10498q interfaceC10498q, InterfaceC10498q interfaceC10498q2) {
        return e(h10, interfaceC10498q.zzf(), interfaceC10498q2);
    }
}
