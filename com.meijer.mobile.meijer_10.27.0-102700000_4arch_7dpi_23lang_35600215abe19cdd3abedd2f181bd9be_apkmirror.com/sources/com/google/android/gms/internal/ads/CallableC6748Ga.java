package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.Ga, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CallableC6748Ga implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final C8863na f67236a;

    /* renamed from: b, reason: collision with root package name */
    private final C8611l8 f67237b;

    public CallableC6748Ga(C8863na c8863na, C8611l8 c8611l8) {
        this.f67236a = c8863na;
        this.f67237b = c8611l8;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.f67236a.l() != null) {
            this.f67236a.l().get();
        }
        H8 h8C = this.f67236a.c();
        if (h8C == null) {
            return null;
        }
        try {
            synchronized (this.f67237b) {
                this.f67237b.d(h8C.j(), C9225qu0.a());
            }
            return null;
        } catch (zzgyg | NullPointerException unused) {
            return null;
        }
    }
}
