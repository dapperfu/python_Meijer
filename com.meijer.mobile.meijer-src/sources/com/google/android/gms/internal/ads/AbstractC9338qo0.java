package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9338qo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f78679a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f78680b;

    /* synthetic */ AbstractC9338qo0(Et0 et0, Class cls, C9231po0 c9231po0) {
        this.f78679a = et0;
        this.f78680b = cls;
    }

    public static AbstractC9338qo0 b(InterfaceC9124oo0 interfaceC9124oo0, Et0 et0, Class cls) {
        return new C9017no0(et0, cls, interfaceC9124oo0);
    }

    public abstract Ck0 a(Ap0 ap0, Uk0 uk0) throws GeneralSecurityException;

    public final Et0 c() {
        return this.f78679a;
    }

    public final Class d() {
        return this.f78680b;
    }
}
