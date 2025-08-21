package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10703z extends AbstractC10685x {
    private static boolean c(InterfaceC10623q interfaceC10623q, InterfaceC10623q interfaceC10623q2) {
        if (interfaceC10623q instanceof InterfaceC10587m) {
            interfaceC10623q = new C10658u(interfaceC10623q.zzc());
        }
        if (interfaceC10623q2 instanceof InterfaceC10587m) {
            interfaceC10623q2 = new C10658u(interfaceC10623q2.zzc());
        }
        if ((interfaceC10623q instanceof C10658u) && (interfaceC10623q2 instanceof C10658u)) {
            return interfaceC10623q.zzc().compareTo(interfaceC10623q2.zzc()) < 0;
        }
        double dDoubleValue = interfaceC10623q.zzd().doubleValue();
        double dDoubleValue2 = interfaceC10623q2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC10623q interfaceC10623q, InterfaceC10623q interfaceC10623q2) {
        if (interfaceC10623q instanceof InterfaceC10587m) {
            interfaceC10623q = new C10658u(interfaceC10623q.zzc());
        }
        if (interfaceC10623q2 instanceof InterfaceC10587m) {
            interfaceC10623q2 = new C10658u(interfaceC10623q2.zzc());
        }
        return (((interfaceC10623q instanceof C10658u) && (interfaceC10623q2 instanceof C10658u)) || !(Double.isNaN(interfaceC10623q.zzd().doubleValue()) || Double.isNaN(interfaceC10623q2.zzd().doubleValue()))) && !c(interfaceC10623q2, interfaceC10623q);
    }

    public C10703z() {
        this.f83292a.add(N.EQUALS);
        this.f83292a.add(N.GREATER_THAN);
        this.f83292a.add(N.GREATER_THAN_EQUALS);
        this.f83292a.add(N.IDENTITY_EQUALS);
        this.f83292a.add(N.IDENTITY_NOT_EQUALS);
        this.f83292a.add(N.LESS_THAN);
        this.f83292a.add(N.LESS_THAN_EQUALS);
        this.f83292a.add(N.NOT_EQUALS);
    }

    private static boolean d(InterfaceC10623q interfaceC10623q, InterfaceC10623q interfaceC10623q2) {
        if (interfaceC10623q.getClass().equals(interfaceC10623q2.getClass())) {
            if ((interfaceC10623q instanceof C10667v) || (interfaceC10623q instanceof C10605o)) {
                return true;
            }
            if (interfaceC10623q instanceof C10560j) {
                if (Double.isNaN(interfaceC10623q.zzd().doubleValue()) || Double.isNaN(interfaceC10623q2.zzd().doubleValue()) || interfaceC10623q.zzd().doubleValue() != interfaceC10623q2.zzd().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (interfaceC10623q instanceof C10658u) {
                return interfaceC10623q.zzc().equals(interfaceC10623q2.zzc());
            }
            if (interfaceC10623q instanceof C10533g) {
                return interfaceC10623q.zze().equals(interfaceC10623q2.zze());
            }
            if (interfaceC10623q != interfaceC10623q2) {
                return false;
            }
            return true;
        }
        if (((interfaceC10623q instanceof C10667v) || (interfaceC10623q instanceof C10605o)) && ((interfaceC10623q2 instanceof C10667v) || (interfaceC10623q2 instanceof C10605o))) {
            return true;
        }
        boolean z10 = interfaceC10623q instanceof C10560j;
        if (z10 && (interfaceC10623q2 instanceof C10658u)) {
            return d(interfaceC10623q, new C10560j(interfaceC10623q2.zzd()));
        }
        boolean z11 = interfaceC10623q instanceof C10658u;
        if (z11 && (interfaceC10623q2 instanceof C10560j)) {
            return d(new C10560j(interfaceC10623q.zzd()), interfaceC10623q2);
        }
        if (interfaceC10623q instanceof C10533g) {
            return d(new C10560j(interfaceC10623q.zzd()), interfaceC10623q2);
        }
        if (interfaceC10623q2 instanceof C10533g) {
            return d(interfaceC10623q, new C10560j(interfaceC10623q2.zzd()));
        }
        if ((!z11 && !z10) || !(interfaceC10623q2 instanceof InterfaceC10587m)) {
            if (!(interfaceC10623q instanceof InterfaceC10587m) || (!(interfaceC10623q2 instanceof C10658u) && !(interfaceC10623q2 instanceof C10560j))) {
                return false;
            }
            return d(new C10658u(interfaceC10623q.zzc()), interfaceC10623q2);
        }
        return d(interfaceC10623q, new C10658u(interfaceC10623q2.zzc()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10685x
    public final InterfaceC10623q a(String str, U1 u12, List list) {
        boolean zD;
        boolean zD2;
        C10670v2.a(C10670v2.e(str).name(), 2, list);
        InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
        InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(1));
        int iOrdinal = C10670v2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal != 48) {
                if (iOrdinal != 42) {
                    if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zD = c(interfaceC10623qA2, interfaceC10623qA);
                                break;
                            case 38:
                                zD = e(interfaceC10623qA2, interfaceC10623qA);
                                break;
                            case 39:
                                zD = C10670v2.f(interfaceC10623qA, interfaceC10623qA2);
                                break;
                            case 40:
                                zD2 = C10670v2.f(interfaceC10623qA, interfaceC10623qA2);
                                break;
                            default:
                                return super.b(str);
                        }
                    } else {
                        zD = e(interfaceC10623qA, interfaceC10623qA2);
                    }
                } else {
                    zD = c(interfaceC10623qA, interfaceC10623qA2);
                }
            } else {
                zD2 = d(interfaceC10623qA, interfaceC10623qA2);
            }
            zD = !zD2;
        } else {
            zD = d(interfaceC10623qA, interfaceC10623qA2);
        }
        if (zD) {
            return InterfaceC10623q.f83187n3;
        }
        return InterfaceC10623q.f83188o3;
    }
}
