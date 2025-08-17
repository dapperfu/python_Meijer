package com.google.firebase.perf.metrics;

import bg.k;
import bg.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Trace f89093a;

    b(Trace trace) {
        this.f89093a = trace;
    }

    m a() {
        m.b bVarP = m.F0().Q(this.f89093a.getName()).O(this.f89093a.g().e()).P(this.f89093a.g().d(this.f89093a.e()));
        for (a aVar : this.f89093a.d().values()) {
            bVarP.M(aVar.getName(), aVar.a());
        }
        List<Trace> listH = this.f89093a.h();
        if (!listH.isEmpty()) {
            Iterator<Trace> it = listH.iterator();
            while (it.hasNext()) {
                bVarP.J(new b(it.next()).a());
            }
        }
        bVarP.L(this.f89093a.getAttributes());
        k[] kVarArrB = Yf.a.b(this.f89093a.f());
        if (kVarArrB != null) {
            bVarP.G(Arrays.asList(kVarArrB));
        }
        return bVarP.build();
    }
}
