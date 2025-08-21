package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.su0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9563su0 extends AbstractC9456ru0 {
    C9563su0() {
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9456ru0
    final void a(Object obj) {
        ((Cu0) obj).zza.g();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9456ru0
    final void b(InterfaceC8605jw0 interfaceC8605jw0, Map.Entry entry) throws IOException {
        Du0 du0 = (Du0) entry.getKey();
        if (du0.f67138c) {
            EnumC8393hw0 enumC8393hw0 = EnumC8393hw0.f75657b;
            switch (du0.f67137b.ordinal()) {
                case 0:
                    Jv0.D(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 1:
                    Jv0.H(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 2:
                    Jv0.a(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 3:
                    Jv0.i(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 4:
                    Jv0.J(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 5:
                    Jv0.G(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 6:
                    Jv0.F(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 7:
                    Jv0.B(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 8:
                    Jv0.g(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0);
                    break;
                case 9:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        Jv0.I(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, C10207yv0.a().b(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 10:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        Jv0.b(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, C10207yv0.a().b(list2.get(0).getClass()));
                        break;
                    }
                    break;
                case 11:
                    Jv0.C(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0);
                    break;
                case 12:
                    Jv0.h(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 13:
                    Jv0.J(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 14:
                    Jv0.c(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 15:
                    Jv0.d(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 16:
                    Jv0.e(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
                case 17:
                    Jv0.f(du0.f67136a, (List) entry.getValue(), interfaceC8605jw0, du0.f67139d);
                    break;
            }
        }
        EnumC8393hw0 enumC8393hw02 = EnumC8393hw0.f75657b;
        switch (du0.f67137b.ordinal()) {
            case 0:
                interfaceC8605jw0.zzf(du0.f67136a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                interfaceC8605jw0.zzo(du0.f67136a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                interfaceC8605jw0.zzt(du0.f67136a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                interfaceC8605jw0.zzK(du0.f67136a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                interfaceC8605jw0.zzr(du0.f67136a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                interfaceC8605jw0.zzm(du0.f67136a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                interfaceC8605jw0.zzk(du0.f67136a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                interfaceC8605jw0.zzb(du0.f67136a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                interfaceC8605jw0.zzG(du0.f67136a, (String) entry.getValue());
                break;
            case 9:
                interfaceC8605jw0.a(du0.f67136a, entry.getValue(), C10207yv0.a().b(entry.getValue().getClass()));
                break;
            case 10:
                interfaceC8605jw0.b(du0.f67136a, entry.getValue(), C10207yv0.a().b(entry.getValue().getClass()));
                break;
            case 11:
                interfaceC8605jw0.c(du0.f67136a, (Zt0) entry.getValue());
                break;
            case 12:
                interfaceC8605jw0.zzI(du0.f67136a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                interfaceC8605jw0.zzr(du0.f67136a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                interfaceC8605jw0.zzx(du0.f67136a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                interfaceC8605jw0.zzz(du0.f67136a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                interfaceC8605jw0.zzB(du0.f67136a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                interfaceC8605jw0.zzD(du0.f67136a, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
