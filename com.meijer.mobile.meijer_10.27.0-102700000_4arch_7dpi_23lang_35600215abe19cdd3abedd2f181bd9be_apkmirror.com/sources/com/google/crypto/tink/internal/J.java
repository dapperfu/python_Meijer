package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class J extends AbstractC11295d {

    /* renamed from: a, reason: collision with root package name */
    private static final J f88172a = new J();

    public static J d() {
        return f88172a;
    }

    private J() {
    }

    @Override // com.google.crypto.tink.internal.AbstractC11295d
    public Class<?> a(Class<?> cls) {
        return Ie.A.b(cls);
    }

    @Override // com.google.crypto.tink.internal.AbstractC11295d
    public <P> P b(Ie.j jVar, Class<P> cls) throws GeneralSecurityException {
        return (P) t.c().b(jVar, cls);
    }

    @Override // com.google.crypto.tink.internal.AbstractC11295d
    public <B, P> P c(D<B> d10, Class<P> cls) throws GeneralSecurityException {
        return (P) Ie.A.e(d10, cls);
    }
}
