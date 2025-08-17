package Ie;

import Ue.C;
import Ue.D;
import Ue.I;
import Ue.y;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes7.dex */
final class F {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f13835a = Charset.forName("UTF-8");

    public static D.c a(C.c cVar) {
        return D.c.c0().A(cVar.c0().d0()).z(cVar.f0()).y(cVar.e0()).x(cVar.d0()).build();
    }

    public static Ue.D b(Ue.C c10) {
        D.b bVarY = Ue.D.c0().y(c10.f0());
        Iterator<C.c> it = c10.e0().iterator();
        while (it.hasNext()) {
            bVarY.x(a(it.next()));
        }
        return bVarY.build();
    }

    public static void c(C.c cVar) throws GeneralSecurityException {
        if (cVar.g0()) {
            if (cVar.e0() != I.UNKNOWN_PREFIX) {
                if (cVar.f0() != Ue.z.UNKNOWN_STATUS) {
                    return;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.d0())));
                }
            }
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.d0())));
        }
        throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.d0())));
    }

    public static void d(Ue.C c10) throws GeneralSecurityException {
        int iF0 = c10.f0();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (C.c cVar : c10.e0()) {
            if (cVar.f0() == Ue.z.ENABLED) {
                c(cVar);
                if (cVar.d0() == iF0) {
                    if (!z10) {
                        z10 = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (cVar.c0().c0() != y.c.ASYMMETRIC_PUBLIC) {
                    z11 = false;
                }
                i10++;
            }
        }
        if (i10 != 0) {
            if (!z10 && !z11) {
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}
