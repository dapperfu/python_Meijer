package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7845cp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f74102a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f74103b;

    /* synthetic */ AbstractC7845cp0(Et0 et0, Class cls, C7739bp0 c7739bp0) {
        this.f74102a = et0;
        this.f74103b = cls;
    }

    public static AbstractC7845cp0 b(InterfaceC7632ap0 interfaceC7632ap0, Et0 et0, Class cls) {
        return new Zo0(et0, cls, interfaceC7632ap0);
    }

    public abstract Qk0 a(Ap0 ap0) throws GeneralSecurityException;

    public final Et0 c() {
        return this.f74102a;
    }

    public final Class d() {
        return this.f74103b;
    }
}
