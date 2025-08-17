package Ie;

import com.google.crypto.tink.internal.C11302k;
import com.google.crypto.tink.internal.H;
import com.google.crypto.tink.shaded.protobuf.C11319o;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes7.dex */
public final class E {
    public static byte[] b(x xVar) throws GeneralSecurityException {
        return xVar instanceof C11302k ? ((C11302k) xVar).b().d().o() : ((H) com.google.crypto.tink.internal.w.c().o(xVar, H.class)).d().o();
    }

    public static x a(byte[] bArr) throws GeneralSecurityException {
        try {
            return com.google.crypto.tink.internal.w.c().i(H.b(Ue.A.h0(bArr, C11319o.b())));
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }
}
