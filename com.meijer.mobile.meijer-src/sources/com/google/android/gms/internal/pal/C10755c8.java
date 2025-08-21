package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.c8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10755c8 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83914a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f83915b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83916c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83917d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83918e;

    static {
        new C10854i8();
        f83914a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new C10997r8();
        f83915b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new C11061v8();
        new C10950o8();
        new B8();
        new F8();
        new C11109y8();
        new I8();
        C10744be c10744beU = C10744be.u();
        f83916c = c10744beU;
        f83917d = c10744beU;
        f83918e = c10744beU;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        Z7.o(new C10806f8());
        Qa.a();
        Z7.n(new C10854i8(), true);
        Z7.n(new C10997r8(), true);
        if (X8.b()) {
            return;
        }
        Z7.n(new C10950o8(), true);
        C11061v8.k(true);
        Z7.n(new C11109y8(), true);
        Z7.n(new B8(), true);
        Z7.n(new F8(), true);
        Z7.n(new I8(), true);
    }
}
