package com.google.android.gms.internal.pal;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10649da {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC10616bb f83086a = new C10632ca(null);

    public static C10716hb a(V7 v72) {
        C7 c72;
        C10650db c10650db = new C10650db();
        c10650db.b(v72.b());
        Iterator it = v72.d().iterator();
        while (it.hasNext()) {
            for (O7 o72 : (List) it.next()) {
                int iE = o72.e() - 2;
                if (iE == 1) {
                    c72 = C7.f82504b;
                } else if (iE == 2) {
                    c72 = C7.f82505c;
                } else {
                    if (iE != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c72 = C7.f82506d;
                }
                c10650db.a(c72, o72.a(), o72.b());
            }
        }
        if (v72.a() != null) {
            c10650db.c(v72.a().a());
        }
        try {
            return c10650db.d();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
