package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class R9 {

    /* renamed from: a, reason: collision with root package name */
    private final C10745bf f83696a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f83697b;

    /* synthetic */ R9(C10745bf c10745bf, Class cls, Q9 q92) {
        this.f83696a = c10745bf;
        this.f83697b = cls;
    }

    public static R9 b(P9 p92, C10745bf c10745bf, Class cls) {
        return new O9(c10745bf, cls, p92);
    }

    public abstract AbstractC11028t7 a(InterfaceC11015sa interfaceC11015sa, C10721a8 c10721a8) throws GeneralSecurityException;

    public final C10745bf c() {
        return this.f83696a;
    }

    public final Class d() {
        return this.f83697b;
    }
}
