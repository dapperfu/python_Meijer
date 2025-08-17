package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.cp0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7720cp0 {

    /* renamed from: a, reason: collision with root package name */
    private final Et0 f73262a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f73263b;

    /* synthetic */ AbstractC7720cp0(Et0 et0, Class cls, C7614bp0 c7614bp0) {
        this.f73262a = et0;
        this.f73263b = cls;
    }

    public static AbstractC7720cp0 b(InterfaceC7507ap0 interfaceC7507ap0, Et0 et0, Class cls) {
        return new Zo0(et0, cls, interfaceC7507ap0);
    }

    public abstract Qk0 a(Ap0 ap0) throws GeneralSecurityException;

    public final Et0 c() {
        return this.f73262a;
    }

    public final Class d() {
        return this.f73263b;
    }
}
