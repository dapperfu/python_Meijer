package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class K extends AbstractC10685x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10670v2.e(str).ordinal();
        if (iOrdinal == 0) {
            C10670v2.a(N.ADD.name(), 2, list);
            InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
            InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(1));
            if (!(interfaceC10623qA instanceof InterfaceC10587m) && !(interfaceC10623qA instanceof C10658u) && !(interfaceC10623qA2 instanceof InterfaceC10587m) && !(interfaceC10623qA2 instanceof C10658u)) {
                return new C10560j(Double.valueOf(interfaceC10623qA.zzd().doubleValue() + interfaceC10623qA2.zzd().doubleValue()));
            }
            return new C10658u(String.valueOf(interfaceC10623qA.zzc()).concat(String.valueOf(interfaceC10623qA2.zzc())));
        }
        if (iOrdinal == 21) {
            C10670v2.a(N.DIVIDE.name(), 2, list);
            return new C10560j(Double.valueOf(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue() / u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            C10670v2.a(N.SUBTRACT.name(), 2, list);
            return new C10560j(Double.valueOf(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue() + new C10560j(Double.valueOf(-u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            C10670v2.a(str, 2, list);
            InterfaceC10623q interfaceC10623qA3 = u12.a((InterfaceC10623q) list.get(0));
            u12.a((InterfaceC10623q) list.get(1));
            return interfaceC10623qA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            C10670v2.a(str, 1, list);
            return u12.a((InterfaceC10623q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                C10670v2.a(N.MODULUS.name(), 2, list);
                return new C10560j(Double.valueOf(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue() % u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue()));
            case 45:
                C10670v2.a(N.MULTIPLY.name(), 2, list);
                return new C10560j(Double.valueOf(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue() * u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue()));
            case 46:
                C10670v2.a(N.NEGATE.name(), 1, list);
                return new C10560j(Double.valueOf(-u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()));
            default:
                return super.b(str);
        }
    }

    protected K() {
        this.f83292a.add(N.ADD);
        this.f83292a.add(N.DIVIDE);
        this.f83292a.add(N.MODULUS);
        this.f83292a.add(N.MULTIPLY);
        this.f83292a.add(N.NEGATE);
        this.f83292a.add(N.POST_DECREMENT);
        this.f83292a.add(N.POST_INCREMENT);
        this.f83292a.add(N.PRE_DECREMENT);
        this.f83292a.add(N.PRE_INCREMENT);
        this.f83292a.add(N.SUBTRACT);
    }
}
