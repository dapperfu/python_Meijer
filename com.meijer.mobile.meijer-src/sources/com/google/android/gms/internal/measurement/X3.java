package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class X3 extends AbstractC10569k {

    /* renamed from: c, reason: collision with root package name */
    private final C10497c f82935c;

    public X3(C10497c c10497c) {
        super("internal.eventLogger");
        this.f82935c = c10497c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        C10670v2.a(this.f83067a, 3, list);
        String strZzc = u12.a((InterfaceC10623q) list.get(0)).zzc();
        long jI = (long) C10670v2.i(u12.a((InterfaceC10623q) list.get(1)).zzd().doubleValue());
        InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(2));
        this.f82935c.e(strZzc, jI, interfaceC10623qA instanceof C10596n ? C10670v2.k((C10596n) interfaceC10623qA) : new HashMap());
        return InterfaceC10623q.f83182i3;
    }
}
