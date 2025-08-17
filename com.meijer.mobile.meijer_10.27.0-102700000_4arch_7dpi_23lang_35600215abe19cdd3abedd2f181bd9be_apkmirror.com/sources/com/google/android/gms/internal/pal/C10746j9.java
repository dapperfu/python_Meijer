package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.j9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10746j9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83196a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83197b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83198c;

    static {
        new C10730i9();
        new C10698g9();
        f83196a = C10619be.u();
        f83197b = C10619be.u();
        f83198c = C10619be.u();
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        Z7.o(new C10778l9());
        Z7.o(new C10826o9());
        C10630c8.a();
        if (X8.b()) {
            return;
        }
        Z7.l(new C10698g9(), new C10730i9(), true);
        Z7.l(new F9(), new H9(), true);
    }
}
