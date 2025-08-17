package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Y4 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Y5 f82107c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Y4(C10566x5 c10566x5, String str, Y5 y52) {
        super("getValue");
        this.f82107c = y52;
        Objects.requireNonNull(c10566x5);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        C10545v2.a("getValue", 2, list);
        InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(0));
        InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(1));
        String strZza = this.f82107c.zza(interfaceC10498qA.zzc());
        return strZza != null ? new C10533u(strZza) : interfaceC10498qA2;
    }
}
