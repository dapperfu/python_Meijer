package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.O0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class B0 extends C0<O0.e> {
    @Override // com.google.android.gms.internal.vision.C0
    final G0<O0.e> b(Object obj) {
        return ((O0.c) obj).zzc;
    }

    @Override // com.google.android.gms.internal.vision.C0
    final boolean e(InterfaceC11208w1 interfaceC11208w1) {
        return interfaceC11208w1 instanceof O0.c;
    }

    @Override // com.google.android.gms.internal.vision.C0
    final G0<O0.e> f(Object obj) {
        return ((O0.c) obj).p();
    }

    B0() {
    }

    @Override // com.google.android.gms.internal.vision.C0
    final int a(Map.Entry<?, ?> entry) {
        return ((O0.e) entry.getKey()).f85250a;
    }

    @Override // com.google.android.gms.internal.vision.C0
    final Object c(A0 a02, InterfaceC11208w1 interfaceC11208w1, int i10) {
        return a02.a(interfaceC11208w1, i10);
    }

    @Override // com.google.android.gms.internal.vision.C0
    final void d(C2 c22, Map.Entry<?, ?> entry) throws IOException {
        O0.e eVar = (O0.e) entry.getKey();
        if (eVar.f85252c) {
            switch (E0.f85133a[eVar.f85251b.ordinal()]) {
                case 1:
                    P1.l(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 2:
                    P1.y(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 3:
                    P1.C(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 4:
                    P1.G(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 5:
                    P1.T(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 6:
                    P1.N(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 7:
                    P1.a0(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 8:
                    P1.d0(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 9:
                    P1.W(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 10:
                    P1.b0(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 11:
                    P1.Q(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 12:
                    P1.Z(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 13:
                    P1.K(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 14:
                    P1.T(eVar.f85250a, (List) entry.getValue(), c22, false);
                    break;
                case 15:
                    P1.w(eVar.f85250a, (List) entry.getValue(), c22);
                    break;
                case 16:
                    P1.j(eVar.f85250a, (List) entry.getValue(), c22);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        P1.x(eVar.f85250a, (List) entry.getValue(), c22, J1.a().b(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        P1.k(eVar.f85250a, (List) entry.getValue(), c22, J1.a().b(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (E0.f85133a[eVar.f85251b.ordinal()]) {
            case 1:
                c22.k(eVar.f85250a, ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                c22.l(eVar.f85250a, ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                c22.zza(eVar.f85250a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                c22.zzc(eVar.f85250a, ((Long) entry.getValue()).longValue());
                break;
            case 5:
                c22.g(eVar.f85250a, ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                c22.zzd(eVar.f85250a, ((Long) entry.getValue()).longValue());
                break;
            case 7:
                c22.r(eVar.f85250a, ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                c22.o(eVar.f85250a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                c22.s(eVar.f85250a, ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                c22.j(eVar.f85250a, ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                c22.e(eVar.f85250a, ((Long) entry.getValue()).longValue());
                break;
            case 12:
                c22.m(eVar.f85250a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                c22.n(eVar.f85250a, ((Long) entry.getValue()).longValue());
                break;
            case 14:
                c22.g(eVar.f85250a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                c22.p(eVar.f85250a, (AbstractC11161h0) entry.getValue());
                break;
            case 16:
                c22.c(eVar.f85250a, (String) entry.getValue());
                break;
            case 17:
                c22.B(eVar.f85250a, entry.getValue(), J1.a().b(entry.getValue().getClass()));
                break;
            case 18:
                c22.A(eVar.f85250a, entry.getValue(), J1.a().b(entry.getValue().getClass()));
                break;
        }
    }

    @Override // com.google.android.gms.internal.vision.C0
    final void g(Object obj) {
        b(obj).i();
    }
}
