package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.k80, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8630k80 {
    public static final C9378r80 b(Callable callable, Xj0 xj0, Object obj, AbstractC9592t80 abstractC9592t80) {
        return new C9378r80(abstractC9592t80, obj, AbstractC9592t80.f79331d, Collections.EMPTY_LIST, xj0.k0(callable));
    }

    public static final C9378r80 c(com.google.common.util.concurrent.q qVar, Object obj, AbstractC9592t80 abstractC9592t80) {
        return new C9378r80(abstractC9592t80, obj, AbstractC9592t80.f79331d, Collections.EMPTY_LIST, qVar);
    }

    public static final C9378r80 d(final InterfaceC8097f80 interfaceC8097f80, Xj0 xj0, Object obj, AbstractC9592t80 abstractC9592t80) {
        return b(new Callable() { // from class: com.google.android.gms.internal.ads.j80
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                interfaceC8097f80.zza();
                return null;
            }
        }, xj0, obj, abstractC9592t80);
    }

    public static final C9378r80 a(Callable callable, Object obj, AbstractC9592t80 abstractC9592t80) {
        return b(callable, abstractC9592t80.f79332a, obj, abstractC9592t80);
    }
}
