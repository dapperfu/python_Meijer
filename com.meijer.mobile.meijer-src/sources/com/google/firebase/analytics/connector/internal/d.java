package com.google.firebase.analytics.connector.internal;

import bf.InterfaceC6375a;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final Set f89459a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC6375a.b f89460b;

    /* renamed from: c, reason: collision with root package name */
    private final Pd.a f89461c;

    /* renamed from: d, reason: collision with root package name */
    private final c f89462d;

    final /* synthetic */ InterfaceC6375a.b a() {
        return this.f89460b;
    }

    public d(Pd.a aVar, InterfaceC6375a.b bVar) {
        this.f89460b = bVar;
        this.f89461c = aVar;
        c cVar = new c(this);
        this.f89462d = cVar;
        aVar.q(cVar);
        this.f89459a = new HashSet();
    }
}
