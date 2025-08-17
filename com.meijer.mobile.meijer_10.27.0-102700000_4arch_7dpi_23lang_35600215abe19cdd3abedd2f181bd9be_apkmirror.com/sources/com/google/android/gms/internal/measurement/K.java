package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class K extends AbstractC10560x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        int iOrdinal = C10545v2.e(str).ordinal();
        if (iOrdinal == 0) {
            C10545v2.a(N.ADD.name(), 2, list);
            InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
            InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(1));
            if (!(interfaceC10498qA instanceof InterfaceC10462m) && !(interfaceC10498qA instanceof C10533u) && !(interfaceC10498qA2 instanceof InterfaceC10462m) && !(interfaceC10498qA2 instanceof C10533u)) {
                return new C10435j(Double.valueOf(interfaceC10498qA.zzd().doubleValue() + interfaceC10498qA2.zzd().doubleValue()));
            }
            return new C10533u(String.valueOf(interfaceC10498qA.zzc()).concat(String.valueOf(interfaceC10498qA2.zzc())));
        }
        if (iOrdinal == 21) {
            C10545v2.a(N.DIVIDE.name(), 2, list);
            return new C10435j(Double.valueOf(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue() / u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()));
        }
        if (iOrdinal == 59) {
            C10545v2.a(N.SUBTRACT.name(), 2, list);
            return new C10435j(Double.valueOf(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue() + new C10435j(Double.valueOf(-u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue())).zzd().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            C10545v2.a(str, 2, list);
            InterfaceC10498q interfaceC10498qA3 = u12.a((InterfaceC10498q) list.get(0));
            u12.a((InterfaceC10498q) list.get(1));
            return interfaceC10498qA3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            C10545v2.a(str, 1, list);
            return u12.a((InterfaceC10498q) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                C10545v2.a(N.MODULUS.name(), 2, list);
                return new C10435j(Double.valueOf(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue() % u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()));
            case 45:
                C10545v2.a(N.MULTIPLY.name(), 2, list);
                return new C10435j(Double.valueOf(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue() * u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()));
            case 46:
                C10545v2.a(N.NEGATE.name(), 1, list);
                return new C10435j(Double.valueOf(-u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()));
            default:
                return super.b(str);
        }
    }

    protected K() {
        this.f82452a.add(N.ADD);
        this.f82452a.add(N.DIVIDE);
        this.f82452a.add(N.MODULUS);
        this.f82452a.add(N.MULTIPLY);
        this.f82452a.add(N.NEGATE);
        this.f82452a.add(N.POST_DECREMENT);
        this.f82452a.add(N.POST_INCREMENT);
        this.f82452a.add(N.PRE_DECREMENT);
        this.f82452a.add(N.PRE_INCREMENT);
        this.f82452a.add(N.SUBTRACT);
    }
}
