package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10551w extends AbstractC10560x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        switch (C10545v2.e(str).ordinal()) {
            case 4:
                C10545v2.a(N.BITWISE_AND.name(), 2, list);
                return new C10435j(Double.valueOf(C10545v2.g(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) & C10545v2.g(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue())));
            case 5:
                C10545v2.a(N.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C10435j(Double.valueOf(C10545v2.g(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) << ((int) (C10545v2.h(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                C10545v2.a(N.BITWISE_NOT.name(), 1, list);
                return new C10435j(Double.valueOf(~C10545v2.g(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue())));
            case 7:
                C10545v2.a(N.BITWISE_OR.name(), 2, list);
                return new C10435j(Double.valueOf(C10545v2.g(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) | C10545v2.g(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue())));
            case 8:
                C10545v2.a(N.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C10435j(Double.valueOf(C10545v2.g(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) >> ((int) (C10545v2.h(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                C10545v2.a(N.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C10435j(Double.valueOf(C10545v2.h(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) >>> ((int) (C10545v2.h(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                C10545v2.a(N.BITWISE_XOR.name(), 2, list);
                return new C10435j(Double.valueOf(C10545v2.g(u12.a((InterfaceC10498q) list.get(0)).zzd().doubleValue()) ^ C10545v2.g(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue())));
            default:
                return super.b(str);
        }
    }

    public C10551w() {
        this.f82452a.add(N.BITWISE_AND);
        this.f82452a.add(N.BITWISE_LEFT_SHIFT);
        this.f82452a.add(N.BITWISE_NOT);
        this.f82452a.add(N.BITWISE_OR);
        this.f82452a.add(N.BITWISE_RIGHT_SHIFT);
        this.f82452a.add(N.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f82452a.add(N.BITWISE_XOR);
    }
}
