package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class X3 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    private final C10372c f82095c;

    public X3(C10372c c10372c) {
        super("internal.eventLogger");
        this.f82095c = c10372c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        C10545v2.a(this.f82227a, 3, list);
        String strZzc = u12.a((InterfaceC10498q) list.get(0)).zzc();
        long jI = (long) C10545v2.i(u12.a((InterfaceC10498q) list.get(1)).zzd().doubleValue());
        InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(2));
        this.f82095c.e(strZzc, jI, interfaceC10498qA instanceof C10471n ? C10545v2.k((C10471n) interfaceC10498qA) : new HashMap());
        return InterfaceC10498q.f82342i3;
    }
}
