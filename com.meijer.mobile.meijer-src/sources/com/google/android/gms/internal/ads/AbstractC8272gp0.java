package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8272gp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f75242a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f75243b;

    /* synthetic */ AbstractC8272gp0(Class cls, Class cls2, C8165fp0 c8165fp0) {
        this.f75242a = cls;
        this.f75243b = cls2;
    }

    public static AbstractC8272gp0 b(InterfaceC8058ep0 interfaceC8058ep0, Class cls, Class cls2) {
        return new C7951dp0(cls, cls2, interfaceC8058ep0);
    }

    public abstract Ap0 a(Qk0 qk0) throws GeneralSecurityException;

    public final Class c() {
        return this.f75242a;
    }

    public final Class d() {
        return this.f75243b;
    }
}
