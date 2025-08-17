package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class E extends AbstractC10560x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10545v2.e(str).ordinal();
        if (iOrdinal == 1) {
            C10545v2.a(N.AND.name(), 2, list);
            InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
            return interfaceC10498qA.zze().booleanValue() ? u12.a((InterfaceC10498q) list.get(1)) : interfaceC10498qA;
        }
        if (iOrdinal == 47) {
            C10545v2.a(N.NOT.name(), 1, list);
            return new C10408g(Boolean.valueOf(!u12.a((InterfaceC10498q) list.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        C10545v2.a(N.OR.name(), 2, list);
        InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(0));
        return !interfaceC10498qA2.zze().booleanValue() ? u12.a((InterfaceC10498q) list.get(1)) : interfaceC10498qA2;
    }

    protected E() {
        this.f82452a.add(N.AND);
        this.f82452a.add(N.NOT);
        this.f82452a.add(N.OR);
    }
}
