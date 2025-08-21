package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC6873Ga implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final C8988na f68076a;

    /* renamed from: b, reason: collision with root package name */
    private final C8736l8 f68077b;

    public CallableC6873Ga(C8988na c8988na, C8736l8 c8736l8) {
        this.f68076a = c8988na;
        this.f68077b = c8736l8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f68076a.l() != null) {
            this.f68076a.l().get();
        }
        H8 h8C = this.f68076a.c();
        if (h8C == null) {
            return null;
        }
        try {
            synchronized (this.f68077b) {
                this.f68077b.d(h8C.j(), C9350qu0.a());
            }
            return null;
        } catch (zzgyg | NullPointerException unused) {
            return null;
        }
    }
}
