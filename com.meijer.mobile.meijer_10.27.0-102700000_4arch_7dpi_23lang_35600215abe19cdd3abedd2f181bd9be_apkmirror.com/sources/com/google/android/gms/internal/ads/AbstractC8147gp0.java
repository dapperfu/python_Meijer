package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.gp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8147gp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f74402a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f74403b;

    /* synthetic */ AbstractC8147gp0(Class cls, Class cls2, C8040fp0 c8040fp0) {
        this.f74402a = cls;
        this.f74403b = cls2;
    }

    public static AbstractC8147gp0 b(InterfaceC7933ep0 interfaceC7933ep0, Class cls, Class cls2) {
        return new C7826dp0(cls, cls2, interfaceC7933ep0);
    }

    public abstract Ap0 a(Qk0 qk0) throws GeneralSecurityException;

    public final Class c() {
        return this.f74402a;
    }

    public final Class d() {
        return this.f74403b;
    }
}
