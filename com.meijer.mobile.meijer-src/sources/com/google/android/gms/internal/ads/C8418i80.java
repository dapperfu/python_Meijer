package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.i80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8418i80 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f75730a;

    /* renamed from: b, reason: collision with root package name */
    private final List f75731b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC9592t80 f75732c;

    /* synthetic */ C8418i80(AbstractC9592t80 abstractC9592t80, Object obj, List list, C9485s80 c9485s80) {
        this.f75732c = abstractC9592t80;
        this.f75730a = obj;
        this.f75731b = list;
    }

    public final C9378r80 a(Callable callable) {
        Kj0 kj0B = Mj0.b(this.f75731b);
        com.google.common.util.concurrent.q qVarA = kj0B.a(new Callable() { // from class: com.google.android.gms.internal.ads.h80
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, C7033Kq.f69020g);
        com.google.common.util.concurrent.q qVarA2 = kj0B.a(callable, this.f75732c.f79332a);
        return new C9378r80(this.f75732c, this.f75730a, qVarA, this.f75731b, qVarA2);
    }
}
