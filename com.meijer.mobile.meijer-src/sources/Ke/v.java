package Ke;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class v {
    public static p b(r rVar, C c10) throws GeneralSecurityException, IOException {
        if (c10 != null) {
            return C3888c.a(rVar);
        }
        throw new NullPointerException("SecretKeyAccess cannot be null");
    }

    public static void d(p pVar, s sVar, C c10) throws IOException {
        if (c10 == null) {
            throw new NullPointerException("SecretKeyAccess cannot be null");
        }
        C3888c.b(pVar, sVar);
    }

    public static p a(r rVar, InterfaceC3886a interfaceC3886a, byte[] bArr) throws GeneralSecurityException, IOException {
        return p.z(rVar, interfaceC3886a, bArr);
    }

    public static void c(p pVar, s sVar, InterfaceC3886a interfaceC3886a, byte[] bArr) throws GeneralSecurityException, IOException {
        pVar.E(sVar, interfaceC3886a, bArr);
    }
}
