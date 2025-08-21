package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10694y {

    /* renamed from: a, reason: collision with root package name */
    final Map f83297a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final L f83298b = new L();

    final void a(AbstractC10685x abstractC10685x) {
        Iterator it = abstractC10685x.f83292a.iterator();
        while (it.hasNext()) {
            this.f83297a.put(((N) it.next()).b().toString(), abstractC10685x);
        }
    }

    public C10694y() {
        a(new C10676w());
        a(new C10703z());
        a(new A());
        a(new E());
        a(new J());
        a(new K());
        a(new M());
    }

    public final InterfaceC10623q b(U1 u12, InterfaceC10623q interfaceC10623q) {
        AbstractC10685x abstractC10685x;
        C10670v2.l(u12);
        if (interfaceC10623q instanceof r) {
            r rVar = (r) interfaceC10623q;
            ArrayList arrayListB = rVar.b();
            String strA = rVar.a();
            Map map = this.f83297a;
            if (map.containsKey(strA)) {
                abstractC10685x = (AbstractC10685x) map.get(strA);
            } else {
                abstractC10685x = this.f83298b;
            }
            return abstractC10685x.a(strA, u12, arrayListB);
        }
        return interfaceC10623q;
    }
}
