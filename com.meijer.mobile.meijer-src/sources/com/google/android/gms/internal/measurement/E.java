package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class E extends AbstractC10685x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10670v2.e(str).ordinal();
        if (iOrdinal == 1) {
            C10670v2.a(N.AND.name(), 2, list);
            InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
            return interfaceC10623qA.zze().booleanValue() ? u12.a((InterfaceC10623q) list.get(1)) : interfaceC10623qA;
        }
        if (iOrdinal == 47) {
            C10670v2.a(N.NOT.name(), 1, list);
            return new C10533g(Boolean.valueOf(!u12.a((InterfaceC10623q) list.get(0)).zze().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        C10670v2.a(N.OR.name(), 2, list);
        InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(0));
        return !interfaceC10623qA2.zze().booleanValue() ? u12.a((InterfaceC10623q) list.get(1)) : interfaceC10623qA2;
    }

    protected E() {
        this.f83292a.add(N.AND);
        this.f83292a.add(N.NOT);
        this.f83292a.add(N.OR);
    }
}
