package com.bumptech.glide.load.engine;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Map<X6.e, k<?>> f64817a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<X6.e, k<?>> f64818b = new HashMap();

    private Map<X6.e, k<?>> b(boolean z10) {
        return z10 ? this.f64818b : this.f64817a;
    }

    p() {
    }

    k<?> a(X6.e eVar, boolean z10) {
        return b(z10).get(eVar);
    }

    void c(X6.e eVar, k<?> kVar) {
        b(kVar.p()).put(eVar, kVar);
    }

    void d(X6.e eVar, k<?> kVar) {
        Map<X6.e, k<?>> mapB = b(kVar.p());
        if (kVar.equals(mapB.get(eVar))) {
            mapB.remove(eVar);
        }
    }
}
