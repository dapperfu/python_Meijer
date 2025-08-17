package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.uo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9640uo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f78918a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f78919b;

    /* synthetic */ AbstractC9640uo0(Class cls, Class cls2, C9533to0 c9533to0) {
        this.f78918a = cls;
        this.f78919b = cls2;
    }

    public static AbstractC9640uo0 b(InterfaceC9426so0 interfaceC9426so0, Class cls, Class cls2) {
        return new C9319ro0(cls, cls2, interfaceC9426so0);
    }

    public abstract Ap0 a(Ck0 ck0, Uk0 uk0) throws GeneralSecurityException;

    public final Class c() {
        return this.f78918a;
    }

    public final Class d() {
        return this.f78919b;
    }
}
