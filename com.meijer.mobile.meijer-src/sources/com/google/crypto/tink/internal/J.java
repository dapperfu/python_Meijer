package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class J extends AbstractC11420d {

    /* renamed from: a, reason: collision with root package name */
    private static final J f89012a = new J();

    public static J d() {
        return f89012a;
    }

    private J() {
    }

    @Override // com.google.crypto.tink.internal.AbstractC11420d
    public Class<?> a(Class<?> cls) {
        return Ke.A.b(cls);
    }

    @Override // com.google.crypto.tink.internal.AbstractC11420d
    public <P> P b(Ke.j jVar, Class<P> cls) throws GeneralSecurityException {
        return (P) t.c().b(jVar, cls);
    }

    @Override // com.google.crypto.tink.internal.AbstractC11420d
    public <B, P> P c(D<B> d10, Class<P> cls) throws GeneralSecurityException {
        return (P) Ke.A.e(d10, cls);
    }
}
