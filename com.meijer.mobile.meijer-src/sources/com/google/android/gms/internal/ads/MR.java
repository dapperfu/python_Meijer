package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes6.dex */
public final class MR {

    /* renamed from: a, reason: collision with root package name */
    private final FR f69479a;

    /* renamed from: b, reason: collision with root package name */
    private final Xj0 f69480b;

    public MR(FR fr2, Xj0 xj0) {
        this.f69479a = fr2;
        this.f69480b = xj0;
    }

    public final void a(InterfaceC7990e80 interfaceC7990e80) {
        final FR fr2 = this.f69479a;
        Objects.requireNonNull(fr2);
        Mj0.r(this.f69480b.k0(new Callable() { // from class: com.google.android.gms.internal.ads.JR
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fr2.getWritableDatabase();
            }
        }), new KR(this, interfaceC7990e80), this.f69480b);
    }
}
