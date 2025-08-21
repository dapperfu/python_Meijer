package Ke;

import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C f16580a = new C();

    static C a() {
        return f16580a;
    }

    public static C b(C c10) throws GeneralSecurityException {
        if (c10 != null) {
            return c10;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }

    private C() {
    }
}
