package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class F7 {

    /* renamed from: a, reason: collision with root package name */
    private final Fd f83452a;

    /* renamed from: b, reason: collision with root package name */
    private final C10724ab f83453b = C10724ab.f83892b;

    static final F7 a(Fd fd2) throws GeneralSecurityException {
        if (fd2 == null || fd2.t() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new F7(fd2);
    }

    public final String toString() {
        return C10738b8.a(this.f83452a).toString();
    }

    private F7(Fd fd2) {
        this.f83452a = fd2;
    }

    public static final F7 b(G7 g72) throws GeneralSecurityException, IOException {
        try {
            Fd fdZzb = g72.zzb();
            for (Ed ed2 : fdZzb.z()) {
                if (ed2.u().u() == EnumC10987qd.UNKNOWN_KEYMATERIAL || ed2.u().u() == EnumC10987qd.SYMMETRIC || ed2.u().u() == EnumC10987qd.ASYMMETRIC_PRIVATE) {
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
            C10738b8.b(this.f83452a);
            N7 n72 = new N7(clsE, null);
            n72.c(this.f83453b);
            for (Ed ed2 : this.f83452a.z()) {
                if (ed2.E() == 3) {
                    Object objF = Z7.f(ed2.u(), clsE);
                    if (ed2.t() == this.f83452a.u()) {
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
