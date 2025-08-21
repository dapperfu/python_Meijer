package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.r;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map f91233a = new HashMap();

    /* renamed from: com.google.mlkit.vision.common.internal.a$a, reason: collision with other inner class name */
    public static class C1304a {

        /* renamed from: a, reason: collision with root package name */
        private final Class f91234a;

        /* renamed from: b, reason: collision with root package name */
        private final Kf.b f91235b;

        /* renamed from: c, reason: collision with root package name */
        private final int f91236c;

        final int a() {
            return this.f91236c;
        }

        final Class c() {
            return this.f91234a;
        }

        final Kf.b b() {
            return this.f91235b;
        }
    }

    a(Set set) {
        HashMap map = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C1304a c1304a = (C1304a) it.next();
            Class clsC = c1304a.c();
            if (!this.f91233a.containsKey(clsC) || c1304a.a() >= ((Integer) r.l((Integer) map.get(clsC))).intValue()) {
                this.f91233a.put(clsC, c1304a.b());
                map.put(clsC, Integer.valueOf(c1304a.a()));
            }
        }
    }
}
