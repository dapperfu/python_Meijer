package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes6.dex */
public final class X7 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    private final b8 f82098c;

    public X7(b8 b8Var) {
        super("internal.registerCallback");
        this.f82098c = b8Var;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        C10545v2.a(this.f82227a, 3, list);
        String strZzc = u12.a((InterfaceC10498q) list.get(0)).zzc();
        InterfaceC10498q interfaceC10498qA = u12.a((InterfaceC10498q) list.get(1));
        if (!(interfaceC10498qA instanceof C10489p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC10498q interfaceC10498qA2 = u12.a((InterfaceC10498q) list.get(2));
        if (!(interfaceC10498qA2 instanceof C10471n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C10471n c10471n = (C10471n) interfaceC10498qA2;
        if (!c10471n.S("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f82098c.a(strZzc, c10471n.S("priority") ? C10545v2.g(c10471n.W("priority").zzd().doubleValue()) : 1000, (C10489p) interfaceC10498qA, c10471n.W("type").zzc());
        return InterfaceC10498q.f82342i3;
    }
}
