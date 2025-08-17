package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class F7 {

    /* renamed from: a, reason: collision with root package name */
    private final Fd f82612a;

    /* renamed from: b, reason: collision with root package name */
    private final C10599ab f82613b = C10599ab.f83052b;

    static final F7 a(Fd fd2) throws GeneralSecurityException {
        if (fd2 == null || fd2.t() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new F7(fd2);
    }

    public final String toString() {
        return C10613b8.a(this.f82612a).toString();
    }

    private F7(Fd fd2) {
        this.f82612a = fd2;
    }

    public static final F7 b(G7 g72) throws GeneralSecurityException, IOException {
        try {
            Fd fdZzb = g72.zzb();
            for (Ed ed2 : fdZzb.z()) {
                if (ed2.u().u() == EnumC10862qd.UNKNOWN_KEYMATERIAL || ed2.u().u() == EnumC10862qd.SYMMETRIC || ed2.u().u() == EnumC10862qd.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", ed2.u().u().name(), ed2.u().z()));
                }
            }
            return a(fdZzb);
        } catch (zzadi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }

    public final Object c(Class cls) throws GeneralSecurityException {
        Class clsE = Z7.e(cls);
        if (clsE != null) {
            C10613b8.b(this.f82612a);
            N7 n72 = new N7(clsE, null);
            n72.c(this.f82613b);
            for (Ed ed2 : this.f82612a.z()) {
                if (ed2.E() == 3) {
                    Object objF = Z7.f(ed2.u(), clsE);
                    if (ed2.t() == this.f82612a.u()) {
                        n72.a(objF, ed2);
                    } else {
                        n72.b(objF, ed2);
                    }
                }
            }
            return Z7.j(n72.d(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.getName()));
    }
}
