package com.google.firebase.analytics.connector.internal;

import Ze.a;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    final Set f88619a;

    /* renamed from: b, reason: collision with root package name */
    private final a.b f88620b;

    /* renamed from: c, reason: collision with root package name */
    private final Nd.a f88621c;

    /* renamed from: d, reason: collision with root package name */
    private final c f88622d;

    final /* synthetic */ a.b a() {
        return this.f88620b;
    }

    public d(Nd.a aVar, a.b bVar) {
        this.f88620b = bVar;
        this.f88621c = aVar;
        c cVar = new c(this);
        this.f88622d = cVar;
        aVar.q(cVar);
        this.f88619a = new HashSet();
    }
}
