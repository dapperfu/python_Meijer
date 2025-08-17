package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Y7 extends AbstractC10444k {

    /* renamed from: c, reason: collision with root package name */
    private final C10564x3 f82109c;

    /* renamed from: d, reason: collision with root package name */
    final Map f82110d;

    public Y7(C10564x3 c10564x3) {
        super("require");
        this.f82110d = new HashMap();
        this.f82109c = c10564x3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10444k
    public final InterfaceC10498q b(U1 u12, List list) {
        InterfaceC10498q interfaceC10498q;
        C10545v2.a("require", 1, list);
        String strZzc = u12.a((InterfaceC10498q) list.get(0)).zzc();
        Map map = this.f82110d;
        if (map.containsKey(strZzc)) {
            return (InterfaceC10498q) map.get(strZzc);
        }
        Map map2 = this.f82109c.f82453a;
        if (map2.containsKey(strZzc)) {
            try {
                interfaceC10498q = (InterfaceC10498q) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            interfaceC10498q = InterfaceC10498q.f82342i3;
        }
        if (interfaceC10498q instanceof AbstractC10444k) {
            this.f82110d.put(strZzc, (AbstractC10444k) interfaceC10498q);
        }
        return interfaceC10498q;
    }
}
