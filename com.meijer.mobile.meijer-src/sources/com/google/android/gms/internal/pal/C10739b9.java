package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.pal.b9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10739b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f83905a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83906b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final C10744be f83907c;

    static {
        new C10722a9();
        f83905a = "type.googleapis.com/google.crypto.tink.AesSivKey";
        f83906b = C10744be.u();
        f83907c = C10744be.u();
        try {
            Z7.o(new C10773d9());
            if (X8.b()) {
                return;
            }
            Z7.n(new C10722a9(), true);
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }
}
