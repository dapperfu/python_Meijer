package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.j9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10871j9 {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final C10744be f84036a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C10744be f84037b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10744be f84038c;

    static {
        new C10855i9();
        new C10823g9();
        f84036a = C10744be.u();
        f84037b = C10744be.u();
        f84038c = C10744be.u();
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        Z7.o(new C10903l9());
        Z7.o(new C10951o9());
        C10755c8.a();
        if (X8.b()) {
            return;
        }
        Z7.l(new C10823g9(), new C10855i9(), true);
        Z7.l(new F9(), new H9(), true);
    }
}
