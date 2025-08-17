package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map<V6.e, k<?>> f63977a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<V6.e, k<?>> f63978b = new HashMap();

    private Map<V6.e, k<?>> b(boolean z10) {
        return z10 ? this.f63978b : this.f63977a;
    }

    p() {
    }

    k<?> a(V6.e eVar, boolean z10) {
        return b(z10).get(eVar);
    }

    void c(V6.e eVar, k<?> kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    void d(V6.e eVar, k<?> kVar) {
        Map<V6.e, k<?>> mapB = b(kVar.p());
        if (kVar.equals(mapB.get(eVar))) {
            mapB.remove(eVar);
        }
    }
}
