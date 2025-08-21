package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes6.dex */
final class Na extends AbstractC10952oa {
    @Override // com.google.android.gms.internal.pal.AbstractC10952oa
    public final /* bridge */ /* synthetic */ Object a(InterfaceC10815g1 interfaceC10815g1) throws GeneralSecurityException {
        Rc rc2 = (Rc) interfaceC10815g1;
        int iZ = rc2.z().z();
        SecretKeySpec secretKeySpec = new SecretKeySpec(rc2.A().z(), "HMAC");
        int iT = rc2.z().t();
        int i10 = iZ - 2;
        if (i10 == 1) {
            return new Ue(new Te("HMACSHA1", secretKeySpec), iT);
        }
        if (i10 == 2) {
            return new Ue(new Te("HMACSHA384", secretKeySpec), iT);
        }
        if (i10 == 3) {
            return new Ue(new Te("HMACSHA256", secretKeySpec), iT);
        }
        if (i10 == 4) {
            return new Ue(new Te("HMACSHA512", secretKeySpec), iT);
        }
        if (i10 == 5) {
            return new Ue(new Te("HMACSHA224", secretKeySpec), iT);
        }
        throw new GeneralSecurityException("unknown hash");
    }

    Na(Class cls) {
        super(cls);
    }
}
