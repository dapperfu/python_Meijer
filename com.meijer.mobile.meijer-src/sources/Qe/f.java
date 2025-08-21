package Qe;

import We.J;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f28103a = a("type.googleapis.com/google.crypto.tink.AesSivKey");

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final J f28104b = J.Y();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final J f28105c = J.Y();

    private static String a(String str) {
        return str;
    }

    static {
        try {
            b();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void b() throws GeneralSecurityException {
        j.e();
        if (Oe.a.a()) {
            return;
        }
        d.f(true);
    }
}
