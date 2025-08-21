package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10676w extends AbstractC10685x {
    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        N n10 = N.ADD;
        switch (C10670v2.e(str).ordinal()) {
            case 4:
                C10670v2.a(N.BITWISE_AND.name(), 2, list);
                return new C10560j(Double.valueOf(C10670v2.g(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()) & C10670v2.g(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue())));
            case 5:
                C10670v2.a(N.BITWISE_LEFT_SHIFT.name(), 2, list);
                return new C10560j(Double.valueOf(C10670v2.g(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()) << ((int) (C10670v2.h(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue()) & 31))));
            case 6:
                C10670v2.a(N.BITWISE_NOT.name(), 1, list);
                return new C10560j(Double.valueOf(~C10670v2.g(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue())));
            case 7:
                C10670v2.a(N.BITWISE_OR.name(), 2, list);
                return new C10560j(Double.valueOf(C10670v2.g(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()) | C10670v2.g(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue())));
            case 8:
                C10670v2.a(N.BITWISE_RIGHT_SHIFT.name(), 2, list);
                return new C10560j(Double.valueOf(C10670v2.g(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()) >> ((int) (C10670v2.h(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue()) & 31))));
            case 9:
                C10670v2.a(N.BITWISE_UNSIGNED_RIGHT_SHIFT.name(), 2, list);
                return new C10560j(Double.valueOf(C10670v2.h(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()) >>> ((int) (C10670v2.h(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue()) & 31))));
            case 10:
                C10670v2.a(N.BITWISE_XOR.name(), 2, list);
                return new C10560j(Double.valueOf(C10670v2.g(u12.a((InterfaceC10623q) list.get(0)).zzd().doubleValue()) ^ C10670v2.g(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue())));
            default:
                return super.b(str);
        }
    }

    public C10676w() {
        this.f83292a.add(N.BITWISE_AND);
        this.f83292a.add(N.BITWISE_LEFT_SHIFT);
        this.f83292a.add(N.BITWISE_NOT);
        this.f83292a.add(N.BITWISE_OR);
        this.f83292a.add(N.BITWISE_RIGHT_SHIFT);
        this.f83292a.add(N.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f83292a.add(N.BITWISE_XOR);
    }
}
