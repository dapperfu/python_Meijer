package Re;

import Ue.J;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32189a = b("type.googleapis.com/google.crypto.tink.HmacKey");

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final J f32190b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final J f32191c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final J f32192d;

    private static String b(String str) {
        return str;
    }

    static {
        J jY = J.Y();
        f32190b = jY;
        f32191c = jY;
        f32192d = jY;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    @Deprecated
    public static void a() throws GeneralSecurityException {
        c();
    }

    public static void c() throws GeneralSecurityException {
        s.e();
        h.e();
        m.c(true);
        if (Me.a.a()) {
            return;
        }
        e.h(true);
    }
}
