package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class H implements K {

    /* renamed from: a, reason: collision with root package name */
    private final Ye.a f89009a;

    /* renamed from: b, reason: collision with root package name */
    private final We.A f89010b;

    public static H b(We.A a10) throws GeneralSecurityException {
        return new H(a10, M.b(a10.d0()));
    }

    public static H c(We.A a10) {
        return new H(a10, M.h(a10.d0()));
    }

    @Override // com.google.crypto.tink.internal.K
    public Ye.a a() {
        return this.f89009a;
    }

    public We.A d() {
        return this.f89010b;
    }

    private H(We.A a10, Ye.a aVar) {
        this.f89010b = a10;
        this.f89009a = aVar;
    }
}
