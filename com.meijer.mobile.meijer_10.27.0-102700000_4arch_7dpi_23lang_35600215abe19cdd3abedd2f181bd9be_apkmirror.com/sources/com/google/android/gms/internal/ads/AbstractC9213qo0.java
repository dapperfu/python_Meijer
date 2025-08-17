package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.qo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9213qo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f77839a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f77840b;

    /* synthetic */ AbstractC9213qo0(Et0 et0, Class cls, C9106po0 c9106po0) {
        this.f77839a = et0;
        this.f77840b = cls;
    }

    public static AbstractC9213qo0 b(InterfaceC8999oo0 interfaceC8999oo0, Et0 et0, Class cls) {
        return new C8892no0(et0, cls, interfaceC8999oo0);
    }

    public abstract Ck0 a(Ap0 ap0, Uk0 uk0) throws GeneralSecurityException;

    public final Et0 c() {
        return this.f77839a;
    }

    public final Class d() {
        return this.f77840b;
    }
}
