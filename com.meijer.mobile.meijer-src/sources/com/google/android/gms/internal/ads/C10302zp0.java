package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.zp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10302zp0 extends AbstractC8696ko0 {

    /* renamed from: a, reason: collision with root package name */
    private static final C10302zp0 f81344a = new C10302zp0();

    private C10302zp0() {
    }

    public static C10302zp0 d() {
        return f81344a;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8696ko0
    public final Object c(C9660tp0 c9660tp0, Class cls) throws GeneralSecurityException {
        int i10 = Tk0.f71287a;
        return Uo0.a().d(c9660tp0, cls);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8696ko0
    public final Class a(Class cls) {
        return Tk0.a(cls);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8696ko0
    public final Object b(Ck0 ck0, Class cls) throws GeneralSecurityException {
        return Uo0.a().c(ck0, cls);
    }
}
