package Ke;

import com.google.crypto.tink.internal.C11427k;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.shaded.protobuf.C11444o;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes8.dex */
public final class E {
    public static byte[] b(x xVar) throws GeneralSecurityException {
        return xVar instanceof C11427k ? ((C11427k) xVar).b().d().o() : ((H) com.google.crypto.tink.internal.w.c().o(xVar, H.class)).d().o();
    }

    public static x a(byte[] bArr) throws GeneralSecurityException {
        try {
            return com.google.crypto.tink.internal.w.c().i(H.b(We.A.h0(bArr, C11444o.b())));
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
