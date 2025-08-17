package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.k80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8505k80 {
    public static final C9253r80 b(Callable callable, Xj0 xj0, Object obj, AbstractC9467t80 abstractC9467t80) {
        return new C9253r80(abstractC9467t80, obj, AbstractC9467t80.f78491d, Collections.EMPTY_LIST, xj0.i0(callable));
    }

    public static final C9253r80 c(com.google.common.util.concurrent.q qVar, Object obj, AbstractC9467t80 abstractC9467t80) {
        return new C9253r80(abstractC9467t80, obj, AbstractC9467t80.f78491d, Collections.EMPTY_LIST, qVar);
    }

    public static final C9253r80 d(final InterfaceC7972f80 interfaceC7972f80, Xj0 xj0, Object obj, AbstractC9467t80 abstractC9467t80) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.j80
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                interfaceC7972f80.zza();
                return null;
            }
        }, xj0, obj, abstractC9467t80);
    }

    public static final C9253r80 a(Callable callable, Object obj, AbstractC9467t80 abstractC9467t80) {
        return b(callable, abstractC9467t80.f78492a, obj, abstractC9467t80);
    }
}
