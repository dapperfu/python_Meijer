package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.c8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10630c8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83074a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f83075b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83076c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83077d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C10619be f83078e;

    static {
        new C10729i8();
        f83074a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new C10872r8();
        f83075b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new C10936v8();
        new C10825o8();
        new B8();
        new F8();
        new C10984y8();
        new I8();
        C10619be c10619beU = C10619be.u();
        f83076c = c10619beU;
        f83077d = c10619beU;
        f83078e = c10619beU;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        Z7.o(new C10681f8());
        Qa.a();
        Z7.n(new C10729i8(), true);
        Z7.n(new C10872r8(), true);
        if (X8.b()) {
            return;
        }
        Z7.n(new C10825o8(), true);
        C10936v8.k(true);
        Z7.n(new C10984y8(), true);
        Z7.n(new B8(), true);
        Z7.n(new F8(), true);
        Z7.n(new I8(), true);
    }
}
