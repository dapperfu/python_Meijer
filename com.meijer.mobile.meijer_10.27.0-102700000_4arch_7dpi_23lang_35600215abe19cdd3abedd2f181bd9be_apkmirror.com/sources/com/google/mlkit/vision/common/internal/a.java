package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f90394a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C1295a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f90395a;

        /* renamed from: b, reason: collision with root package name */
        private final If.b f90396b;

        /* renamed from: c, reason: collision with root package name */
        private final int f90397c;

        final int a() {
            return this.f90397c;
        }

        final Class c() {
            return this.f90395a;
        }

        final If.b b() {
            return this.f90396b;
        }
    }

    a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1295a c1295a = (C1295a) it.next();
            Class clsC = c1295a.c();
            if (!this.f90394a.containsKey(clsC) || c1295a.a() >= ((Integer) r.l((Integer) map.get(clsC))).intValue()) {
                this.f90394a.put(clsC, c1295a.b());
                map.put(clsC, Integer.valueOf(c1295a.a()));
            }
        }
    }
}
