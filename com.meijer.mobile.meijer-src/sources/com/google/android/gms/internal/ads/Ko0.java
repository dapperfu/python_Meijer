package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ko0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Co0 f69008a = new Io0(null);

    public static Ho0 a(C9660tp0 c9660tp0) {
        Ek0 ek0;
        Eo0 eo0 = new Eo0();
        eo0.b(c9660tp0.a());
        Iterator it = c9660tp0.e().iterator();
        while (it.hasNext()) {
            for (C9446rp0 c9446rp0 : (List) it.next()) {
                int iF = c9446rp0.f() - 2;
                if (iF == 1) {
                    ek0 = Ek0.f67343b;
                } else if (iF == 2) {
                    ek0 = Ek0.f67344c;
                } else {
                    if (iF != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    ek0 = Ek0.f67345d;
                }
                int iA = c9446rp0.a();
                String strE = c9446rp0.e();
                if (strE.startsWith("type.googleapis.com/google.crypto.")) {
                    strE = strE.substring(34);
                }
                eo0.a(ek0, iA, strE, c9446rp0.b().name());
            }
        }
        if (c9660tp0.c() != null) {
            eo0.c(c9660tp0.c().a());
        }
        try {
            return eo0.d();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
