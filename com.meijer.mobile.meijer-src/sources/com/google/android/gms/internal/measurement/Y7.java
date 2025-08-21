package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class Y7 extends AbstractC10569k {

    /* renamed from: c, reason: collision with root package name */
    private final C10689x3 f82949c;

    /* renamed from: d, reason: collision with root package name */
    final Map f82950d;

    public Y7(C10689x3 c10689x3) {
        super("require");
        this.f82950d = new HashMap();
        this.f82949c = c10689x3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10569k
    public final InterfaceC10623q b(U1 u12, List list) {
        InterfaceC10623q interfaceC10623q;
        C10670v2.a("require", 1, list);
        String strZzc = u12.a((InterfaceC10623q) list.get(0)).zzc();
        Map map = this.f82950d;
        if (map.containsKey(strZzc)) {
            return (InterfaceC10623q) map.get(strZzc);
        }
        Map map2 = this.f82949c.f83293a;
        if (map2.containsKey(strZzc)) {
            try {
                interfaceC10623q = (InterfaceC10623q) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            interfaceC10623q = InterfaceC10623q.f83182i3;
        }
        if (interfaceC10623q instanceof AbstractC10569k) {
            this.f82950d.put(strZzc, (AbstractC10569k) interfaceC10623q);
        }
        return interfaceC10623q;
    }
}
