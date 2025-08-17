package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.i80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8293i80 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74890a;

    /* renamed from: b, reason: collision with root package name */
    private final List f74891b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC9467t80 f74892c;

    /* synthetic */ C8293i80(AbstractC9467t80 abstractC9467t80, Object obj, List list, C9360s80 c9360s80) {
        this.f74892c = abstractC9467t80;
        this.f74890a = obj;
        this.f74891b = list;
    }

    public final C9253r80 a(Callable callable) {
        Kj0 kj0B = Mj0.b(this.f74891b);
        com.google.common.util.concurrent.q qVarA = kj0B.a(new Callable() { // from class: com.google.android.gms.internal.ads.h80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, C6908Kq.f68180g);
        com.google.common.util.concurrent.q qVarA2 = kj0B.a(callable, this.f74892c.f78492a);
        return new C9253r80(this.f74892c, this.f74890a, qVarA, this.f74891b, qVarA2);
    }
}
