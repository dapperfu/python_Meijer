package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9765uo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f79758a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f79759b;

    /* synthetic */ AbstractC9765uo0(Class cls, Class cls2, C9658to0 c9658to0) {
        this.f79758a = cls;
        this.f79759b = cls2;
    }

    public static AbstractC9765uo0 b(InterfaceC9551so0 interfaceC9551so0, Class cls, Class cls2) {
        return new C9444ro0(cls, cls2, interfaceC9551so0);
    }

    public abstract Ap0 a(Ck0 ck0, Uk0 uk0) throws GeneralSecurityException;

    public final Class c() {
        return this.f79758a;
    }

    public final Class d() {
        return this.f79759b;
    }
}
