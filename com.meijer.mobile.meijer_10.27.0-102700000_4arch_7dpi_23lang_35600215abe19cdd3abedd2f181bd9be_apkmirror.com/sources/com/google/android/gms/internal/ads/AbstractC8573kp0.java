package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8573kp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f75706a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f75707b;

    /* synthetic */ AbstractC8573kp0(Class cls, Class cls2, C8466jp0 c8466jp0) {
        this.f75706a = cls;
        this.f75707b = cls2;
    }

    public static AbstractC8573kp0 b(InterfaceC8360ip0 interfaceC8360ip0, Class cls, Class cls2) {
        return new C8254hp0(cls, cls2, interfaceC8360ip0);
    }

    public abstract Object a(Ck0 ck0) throws GeneralSecurityException;

    public final Class c() {
        return this.f75706a;
    }

    public final Class d() {
        return this.f75707b;
    }
}
