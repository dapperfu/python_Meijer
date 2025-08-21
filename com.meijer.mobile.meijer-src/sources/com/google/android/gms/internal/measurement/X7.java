package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class X7 extends AbstractC10569k {

    /* renamed from: c, reason: collision with root package name */
    private final b8 f82938c;

    public X7(b8 b8Var) {
        super("internal.registerCallback");
        this.f82938c = b8Var;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        C10670v2.a(this.f83067a, 3, list);
        String strZzc = u12.a((InterfaceC10623q) list.get(0)).zzc();
        InterfaceC10623q interfaceC10623qA = u12.a((InterfaceC10623q) list.get(1));
        if (!(interfaceC10623qA instanceof C10614p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC10623q interfaceC10623qA2 = u12.a((InterfaceC10623q) list.get(2));
        if (!(interfaceC10623qA2 instanceof C10596n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C10596n c10596n = (C10596n) interfaceC10623qA2;
        if (!c10596n.S("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f82938c.a(strZzc, c10596n.S("priority") ? C10670v2.g(c10596n.X("priority").zzd().doubleValue()) : 1000, (C10614p) interfaceC10623qA, c10596n.X("type").zzc());
        return InterfaceC10623q.f83182i3;
    }
}
