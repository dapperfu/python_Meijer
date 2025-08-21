package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class Kq0 implements Pk0 {
    private Kq0(Pk0 pk0, Es0 es0, byte[] bArr) {
    }

    public static Pk0 a(C10086xo0 c10086xo0) throws GeneralSecurityException {
        byte[] bArrC;
        C9874vp0 c9874vp0A = c10086xo0.a(Bk0.a());
        Wr0 wr0B0 = Zr0.b0();
        wr0B0.v(c9874vp0A.f());
        wr0B0.w(c9874vp0A.d());
        wr0B0.u(c9874vp0A.b());
        Pk0 pk0 = (Pk0) Tk0.b((Zr0) wr0B0.p(), Pk0.class);
        Es0 es0C = c9874vp0A.c();
        int iOrdinal = es0C.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    bArrC = Yo0.a(c10086xo0.b().intValue()).c();
                } else {
                    bArrC = Yo0.f72453a.c();
                }
            } else {
                bArrC = Yo0.a(c10086xo0.b().intValue()).c();
            }
        } else {
            bArrC = Yo0.b(c10086xo0.b().intValue()).c();
        }
        return new Kq0(pk0, es0C, bArrC);
    }
}
