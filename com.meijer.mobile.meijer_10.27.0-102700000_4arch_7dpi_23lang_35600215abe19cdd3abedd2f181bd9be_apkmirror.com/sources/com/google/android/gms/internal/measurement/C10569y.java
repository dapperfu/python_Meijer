package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10569y {

    /* renamed from: a, reason: collision with root package name */
    final Map f82457a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final L f82458b = new L();

    final void a(AbstractC10560x abstractC10560x) {
        Iterator it = abstractC10560x.f82452a.iterator();
        while (it.hasNext()) {
            this.f82457a.put(((N) it.next()).b().toString(), abstractC10560x);
        }
    }

    public C10569y() {
        a(new C10551w());
        a(new C10578z());
        a(new A());
        a(new E());
        a(new J());
        a(new K());
        a(new M());
    }

    public final InterfaceC10498q b(U1 u12, InterfaceC10498q interfaceC10498q) {
        AbstractC10560x abstractC10560x;
        C10545v2.l(u12);
        if (interfaceC10498q instanceof r) {
            r rVar = (r) interfaceC10498q;
            ArrayList arrayListB = rVar.b();
            String strA = rVar.a();
            Map map = this.f82457a;
            if (map.containsKey(strA)) {
                abstractC10560x = (AbstractC10560x) map.get(strA);
            } else {
                abstractC10560x = this.f82458b;
            }
            return abstractC10560x.a(strA, u12, arrayListB);
        }
        return interfaceC10498q;
    }
}
