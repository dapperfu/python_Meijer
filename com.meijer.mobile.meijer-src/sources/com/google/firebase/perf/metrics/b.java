package com.google.firebase.perf.metrics;

import ag.C5688a;
import dg.k;
import dg.m;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Trace f89935a;

    b(Trace trace) {
        this.f89935a = trace;
    }

    m a() {
        m.b bVarP = m.F0().Q(this.f89935a.getName()).O(this.f89935a.g().e()).P(this.f89935a.g().d(this.f89935a.e()));
        for (a aVar : this.f89935a.d().values()) {
            bVarP.M(aVar.getName(), aVar.a());
        }
        List<Trace> listH = this.f89935a.h();
        if (!listH.isEmpty()) {
            Iterator<Trace> it = listH.iterator();
            while (it.hasNext()) {
                bVarP.J(new b(it.next()).a());
            }
        }
        bVarP.L(this.f89935a.getAttributes());
        k[] kVarArrB = C5688a.b(this.f89935a.f());
        if (kVarArrB != null) {
            bVarP.G(Arrays.asList(kVarArrB));
        }
        return bVarP.build();
    }
}
