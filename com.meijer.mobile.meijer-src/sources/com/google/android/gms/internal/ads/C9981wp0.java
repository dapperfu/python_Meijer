package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.wp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9981wp0 implements Ap0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f80387a;

    /* renamed from: b, reason: collision with root package name */
    private final C7957ds0 f80388b;

    private C9981wp0(C7957ds0 c7957ds0, Et0 et0) {
        this.f80388b = c7957ds0;
        this.f80387a = et0;
    }

    public final C7957ds0 c() {
        return this.f80388b;
    }

    @Override // com.google.android.gms.internal.ads.Ap0
    public final Et0 zzd() {
        return this.f80387a;
    }

    public static C9981wp0 a(C7957ds0 c7957ds0) throws GeneralSecurityException {
        return new C9981wp0(c7957ds0, Hp0.a(c7957ds0.i0()));
    }

    public static C9981wp0 b(C7957ds0 c7957ds0) {
        return new C9981wp0(c7957ds0, Hp0.b(c7957ds0.i0()));
    }
}
