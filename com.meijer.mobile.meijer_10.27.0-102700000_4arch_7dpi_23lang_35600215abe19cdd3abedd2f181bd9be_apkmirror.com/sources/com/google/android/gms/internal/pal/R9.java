package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class R9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10620bf f82856a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f82857b;

    /* synthetic */ R9(C10620bf c10620bf, Class cls, Q9 q92) {
        this.f82856a = c10620bf;
        this.f82857b = cls;
    }

    public static R9 b(P9 p92, C10620bf c10620bf, Class cls) {
        return new O9(c10620bf, cls, p92);
    }

    public abstract AbstractC10903t7 a(InterfaceC10890sa interfaceC10890sa, C10596a8 c10596a8) throws GeneralSecurityException;

    public final C10620bf c() {
        return this.f82856a;
    }

    public final Class d() {
        return this.f82857b;
    }
}
