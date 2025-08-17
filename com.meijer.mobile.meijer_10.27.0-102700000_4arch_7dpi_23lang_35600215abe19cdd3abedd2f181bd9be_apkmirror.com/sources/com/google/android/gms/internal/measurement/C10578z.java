package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10578z extends AbstractC10560x {
    private static boolean c(InterfaceC10498q interfaceC10498q, InterfaceC10498q interfaceC10498q2) {
        if (interfaceC10498q instanceof InterfaceC10462m) {
            interfaceC10498q = new C10533u(interfaceC10498q.zzc());
        }
        if (interfaceC10498q2 instanceof InterfaceC10462m) {
            interfaceC10498q2 = new C10533u(interfaceC10498q2.zzc());
        }
        if ((interfaceC10498q instanceof C10533u) && (interfaceC10498q2 instanceof C10533u)) {
            return interfaceC10498q.zzc().compareTo(interfaceC10498q2.zzc()) < 0;
        }
        double dDoubleValue = interfaceC10498q.zzd().doubleValue();
        double dDoubleValue2 = interfaceC10498q2.zzd().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    private static boolean e(InterfaceC10498q interfaceC10498q, InterfaceC10498q interfaceC10498q2) {
        if (interfaceC10498q instanceof InterfaceC10462m) {
            interfaceC10498q = new C10533u(interfaceC10498q.zzc());
        }
        if (interfaceC10498q2 instanceof InterfaceC10462m) {
            interfaceC10498q2 = new C10533u(interfaceC10498q2.zzc());
        }
        return (((interfaceC10498q instanceof C10533u) && (interfaceC10498q2 instanceof C10533u)) || !(Double.isNaN(interfaceC10498q.zzd().doubleValue()) || Double.isNaN(interfaceC10498q2.zzd().doubleValue()))) && !c(interfaceC10498q2, interfaceC10498q);
    }

    public C10578z() {
        this.f82452a.add(N.EQUALS);
        this.f82452a.add(N.GREATER_THAN);
        this.f82452a.add(N.GREATER_THAN_EQUALS);
        this.f82452a.add(N.IDENTITY_EQUALS);
        this.f82452a.add(N.IDENTITY_NOT_EQUALS);
        this.f82452a.add(N.LESS_THAN);
        this.f82452a.add(N.LESS_THAN_EQUALS);
        this.f82452a.add(N.NOT_EQUALS);
    }

    private static boolean d(InterfaceC10498q interfaceC10498q, InterfaceC10498q interfaceC10498q2) {
        if (interfaceC10498q.getClass().equals(interfaceC10498q2.getClass())) {
            if ((interfaceC10498q instanceof C10542v) || (interfaceC10498q instanceof C10480o)) {
                return true;
            }
            if (interfaceC10498q instanceof C10435j) {
                if (Double.isNaN(interfaceC10498q.zzd().doubleValue()) || Double.isNaN(interfaceC10498q2.zzd().doubleValue()) || interfaceC10498q.zzd().doubleValue() != interfaceC10498q2.zzd().doubleValue()) {
                    return false;
                }
                return true;
            }
            if (interfaceC10498q instanceof C10533u) {
                return interfaceC10498q.zzc().equals(interfaceC10498q2.zzc());
            }
            if (interfaceC10498q instanceof C10408g) {
                return interfaceC10498q.zze().equals(interfaceC10498q2.zze());
            }
            if (interfaceC10498q != interfaceC10498q2) {
                return false;
            }
            return true;
        }
        if (((interfaceC10498q instanceof C10542v) || (interfaceC10498q instanceof C10480o)) && ((interfaceC10498q2 instanceof C10542v) || (interfaceC10498q2 instanceof C10480o))) {
            return true;
        }
        boolean z10 = interfaceC10498q instanceof C10435j;
        if (z10 && (interfaceC10498q2 instanceof C10533u)) {
            return d(interfaceC10498q, new C10435j(interfaceC10498q2.zzd()));
        }
        boolean z11 = interfaceC10498q instanceof C10533u;
        if (z11 && (interfaceC10498q2 instanceof C10435j)) {
            return d(new C10435j(interfaceC10498q.zzd()), interfaceC10498q2);
        }
        if (interfaceC10498q instanceof C10408g) {
            return d(new C10435j(interfaceC10498q.zzd()), interfaceC10498q2);
        }
        if (interfaceC10498q2 instanceof C10408g) {
            return d(interfaceC10498q, new C10435j(interfaceC10498q2.zzd()));
        }
        if ((!z11 && !z10) || !(interfaceC10498q2 instanceof InterfaceC10462m)) {
            if (!(interfaceC10498q instanceof InterfaceC10462m) || (!(interfaceC10498q2 instanceof C10533u) && !(interfaceC10498q2 instanceof C10435j))) {
                return false;
            }
            return d(new C10533u(interfaceC10498q.zzc()), interfaceC10498q2);
        }
        return d(interfaceC10498q, new C10533u(interfaceC10498q2.zzc()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10560x
    public final InterfaceC10498q a(String str, U1 u12, List list) {
        boolean zD;
        boolean zD2;
        C10545v2.a(C10545v2.e(str).name(), 2, list);
        InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
        InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(1));
        int iOrdinal = C10545v2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal != 48) {
                if (iOrdinal != 42) {
                    if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zD = c(interfaceC10498qA2, interfaceC10498qA);
                                break;
                            case 38:
                                zD = e(interfaceC10498qA2, interfaceC10498qA);
                                break;
                            case 39:
                                zD = C10545v2.f(interfaceC10498qA, interfaceC10498qA2);
                                break;
                            case 40:
                                zD2 = C10545v2.f(interfaceC10498qA, interfaceC10498qA2);
                                break;
                            default:
                                return super.b(str);
                        }
                    } else {
                        zD = e(interfaceC10498qA, interfaceC10498qA2);
                    }
                } else {
                    zD = c(interfaceC10498qA, interfaceC10498qA2);
                }
            } else {
                zD2 = d(interfaceC10498qA, interfaceC10498qA2);
            }
            zD = !zD2;
        } else {
            zD = d(interfaceC10498qA, interfaceC10498qA2);
        }
        if (zD) {
            return InterfaceC10498q.f82347n3;
        }
        return InterfaceC10498q.f82348o3;
    }
}
