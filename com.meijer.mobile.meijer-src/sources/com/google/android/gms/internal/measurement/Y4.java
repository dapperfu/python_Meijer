package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Y4 extends AbstractC10569k {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y5 f82947c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y4(C10691x5 c10691x5, String str, Y5 y52) {
        super("getValue");
        this.f82947c = y52;
        Objects.requireNonNull(c10691x5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        C10670v2.a("getValue", 2, list);
        InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(0));
        InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(1));
        String strZza = this.f82947c.zza(interfaceC10623qA.zzc());
        return strZza != null ? new C10658u(strZza) : interfaceC10623qA2;
    }
}
