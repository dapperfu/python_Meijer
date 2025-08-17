package Ie;

import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private static final C f13834a = new C();

    static C a() {
        return f13834a;
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
