package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class H implements K {

    /* renamed from: a, reason: collision with root package name */
    private final We.a f88169a;

    /* renamed from: b, reason: collision with root package name */
    private final Ue.A f88170b;

    public static H b(Ue.A a10) throws GeneralSecurityException {
        return new H(a10, M.b(a10.d0()));
    }

    public static H c(Ue.A a10) {
        return new H(a10, M.h(a10.d0()));
    }

    @Override // com.google.crypto.tink.internal.K
    public We.a a() {
        return this.f88169a;
    }

    public Ue.A d() {
        return this.f88170b;
    }

    private H(Ue.A a10, We.a aVar) {
        this.f88170b = a10;
        this.f88169a = aVar;
    }
}
