package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.kp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8698kp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f76546a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f76547b;

    /* synthetic */ AbstractC8698kp0(Class cls, Class cls2, C8591jp0 c8591jp0) {
        this.f76546a = cls;
        this.f76547b = cls2;
    }

    public static AbstractC8698kp0 b(InterfaceC8485ip0 interfaceC8485ip0, Class cls, Class cls2) {
        return new C8379hp0(cls, cls2, interfaceC8485ip0);
    }

    public abstract Object a(Ck0 ck0) throws GeneralSecurityException;

    public final Class c() {
        return this.f76546a;
    }

    public final Class d() {
        return this.f76547b;
    }
}
