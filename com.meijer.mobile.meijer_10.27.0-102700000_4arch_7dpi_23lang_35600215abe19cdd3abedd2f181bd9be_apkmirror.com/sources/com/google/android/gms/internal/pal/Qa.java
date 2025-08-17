package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Qa {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C10619be f82847a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C10619be f82848b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10619be f82849c;

    static {
        new Pa();
        C10619be c10619beU = C10619be.u();
        f82847a = c10619beU;
        f82848b = c10619beU;
        f82849c = c10619beU;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        Z7.o(new Va());
        Z7.n(new Pa(), true);
        if (X8.b()) {
            return;
        }
        Z7.n(new Fa(), true);
        Ma.a();
    }
}
