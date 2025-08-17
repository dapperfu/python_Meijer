package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class MR {

    /* renamed from: a, reason: collision with root package name */
    private final FR f68639a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f68640b;

    public MR(FR fr2, Xj0 xj0) {
        this.f68639a = fr2;
        this.f68640b = xj0;
    }

    public final void a(InterfaceC7865e80 interfaceC7865e80) {
        final FR fr2 = this.f68639a;
        Objects.requireNonNull(fr2);
        Mj0.r(this.f68640b.i0(new Callable() { // from class: com.google.android.gms.internal.ads.JR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fr2.getWritableDatabase();
            }
        }), new KR(this, interfaceC7865e80), this.f68640b);
    }
}
