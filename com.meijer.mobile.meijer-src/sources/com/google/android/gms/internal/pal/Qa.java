package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Qa {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83687a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83688b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83689c;

    static {
        new Pa();
        C10744be c10744beU = C10744be.u();
        f83687a = c10744beU;
        f83688b = c10744beU;
        f83689c = c10744beU;
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
