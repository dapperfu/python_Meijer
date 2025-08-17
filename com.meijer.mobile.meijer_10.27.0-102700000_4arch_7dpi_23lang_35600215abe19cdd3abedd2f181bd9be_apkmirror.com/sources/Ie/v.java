package Ie;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class v {
    public static p b(r rVar, C c10) throws GeneralSecurityException, IOException {
        if (c10 != null) {
            return C3729c.a(rVar);
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void d(p pVar, s sVar, C c10) throws IOException {
        if (c10 == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        C3729c.b(pVar, sVar);
    }

    public static p a(r rVar, InterfaceC3727a interfaceC3727a, byte[] bArr) throws GeneralSecurityException, IOException {
        return p.z(rVar, interfaceC3727a, bArr);
    }

    public static void c(p pVar, s sVar, InterfaceC3727a interfaceC3727a, byte[] bArr) throws GeneralSecurityException, IOException {
        pVar.E(sVar, interfaceC3727a, bArr);
    }
}
