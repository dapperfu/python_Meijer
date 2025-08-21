package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f82976a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f82977b = new TreeMap();

    public final void a(String str, int i10, C10614p c10614p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f82977b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f82976a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c10614p);
    }

    public final void b(U1 u12, C10497c c10497c) {
        C10699y4 c10699y4 = new C10699y4(c10497c);
        TreeMap treeMap = this.f82976a;
        for (Integer num : treeMap.keySet()) {
            C10488b c10488bClone = c10497c.c().clone();
            int iC = c(u12, (C10614p) treeMap.get(num), c10699y4);
            if (iC == 2 || iC == -1) {
                c10497c.d(c10488bClone);
            }
        }
        TreeMap treeMap2 = this.f82977b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(u12, (C10614p) treeMap2.get((Integer) it.next()), c10699y4);
        }
    }

    private static final int c(U1 u12, C10614p c10614p, InterfaceC10623q interfaceC10623q) {
        InterfaceC10623q interfaceC10623qB = c10614p.b(u12, Collections.singletonList(interfaceC10623q));
        if (interfaceC10623qB instanceof C10560j) {
            return C10670v2.g(interfaceC10623qB.zzd().doubleValue());
        }
        return -1;
    }
}
