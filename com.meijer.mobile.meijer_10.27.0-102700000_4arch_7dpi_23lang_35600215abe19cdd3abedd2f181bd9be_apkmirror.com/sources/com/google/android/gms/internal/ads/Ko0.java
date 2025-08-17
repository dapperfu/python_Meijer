package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class Ko0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Co0 f68168a = new Io0(null);

    public static Ho0 a(C9535tp0 c9535tp0) {
        Ek0 ek0;
        Eo0 eo0 = new Eo0();
        eo0.b(c9535tp0.a());
        Iterator it = c9535tp0.e().iterator();
        while (it.hasNext()) {
            for (C9321rp0 c9321rp0 : (List) it.next()) {
                int iF = c9321rp0.f() - 2;
                if (iF == 1) {
                    ek0 = Ek0.f66503b;
                } else if (iF == 2) {
                    ek0 = Ek0.f66504c;
                } else {
                    if (iF != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    ek0 = Ek0.f66505d;
                }
                int iA = c9321rp0.a();
                String strE = c9321rp0.e();
                if (strE.startsWith("type.googleapis.com/google.crypto.")) {
                    strE = strE.substring(34);
                }
                eo0.a(ek0, iA, strE, c9321rp0.b().name());
            }
        }
        if (c9535tp0.c() != null) {
            eo0.c(c9535tp0.c().a());
        }
        try {
            return eo0.d();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
