package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.wp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9856wp0 implements Ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f79547a;

    /* renamed from: b, reason: collision with root package name */
    private final C7832ds0 f79548b;

    private C9856wp0(C7832ds0 c7832ds0, Et0 et0) {
        this.f79548b = c7832ds0;
        this.f79547a = et0;
    }

    public final C7832ds0 c() {
        return this.f79548b;
    }

    @Override // com.google.android.gms.internal.ads.Ap0
    public final Et0 zzd() {
        return this.f79547a;
    }

    public static C9856wp0 a(C7832ds0 c7832ds0) throws GeneralSecurityException {
        return new C9856wp0(c7832ds0, Hp0.a(c7832ds0.i0()));
    }

    public static C9856wp0 b(C7832ds0 c7832ds0) {
        return new C9856wp0(c7832ds0, Hp0.b(c7832ds0.i0()));
    }
}
