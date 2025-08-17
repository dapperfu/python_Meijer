package Oe;

import Ue.J;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final String f23615a = a("type.googleapis.com/google.crypto.tink.AesSivKey");

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final J f23616b = J.Y();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final J f23617c = J.Y();

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
        if (Me.a.a()) {
            return;
        }
        d.f(true);
    }
}
