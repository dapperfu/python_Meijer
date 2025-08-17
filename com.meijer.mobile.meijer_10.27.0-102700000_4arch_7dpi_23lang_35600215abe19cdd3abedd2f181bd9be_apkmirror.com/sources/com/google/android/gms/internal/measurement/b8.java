package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes6.dex */
public final class b8 {

    /* renamed from: a, reason: collision with root package name */
    final TreeMap f82136a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    final TreeMap f82137b = new TreeMap();

    public final void a(String str, int i10, C10489p c10489p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f82137b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f82136a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c10489p);
    }

    public final void b(U1 u12, C10372c c10372c) {
        C10574y4 c10574y4 = new C10574y4(c10372c);
        TreeMap treeMap = this.f82136a;
        for (Integer num : treeMap.keySet()) {
            C10363b c10363bClone = c10372c.c().clone();
            int iC = c(u12, (C10489p) treeMap.get(num), c10574y4);
            if (iC == 2 || iC == -1) {
                c10372c.d(c10363bClone);
            }
        }
        TreeMap treeMap2 = this.f82137b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(u12, (C10489p) treeMap2.get((Integer) it.next()), c10574y4);
        }
    }

    private static final int c(U1 u12, C10489p c10489p, InterfaceC10498q interfaceC10498q) {
        InterfaceC10498q interfaceC10498qB = c10489p.b(u12, Collections.singletonList(interfaceC10498q));
        if (interfaceC10498qB instanceof C10435j) {
            return C10545v2.g(interfaceC10498qB.zzd().doubleValue());
        }
        return -1;
    }
}
