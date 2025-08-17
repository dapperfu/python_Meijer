package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.b9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10614b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83065a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83066b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83067c;

    static {
        new C10597a9();
        f83065a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f83066b = C10619be.u();
        f83067c = C10619be.u();
        try {
            Z7.o(new C10648d9());
            if (X8.b()) {
                return;
            }
            Z7.n(new C10597a9(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
