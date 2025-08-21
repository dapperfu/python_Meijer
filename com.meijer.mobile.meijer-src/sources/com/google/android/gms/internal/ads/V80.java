package com.google.android.gms.internal.ads;

import Xc.C5569c;
import android.text.TextUtils;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class V80 {
    public static void a(com.google.common.util.concurrent.q qVar, W80 w80, K80 k80) {
        g(qVar, w80, k80, false);
    }

    public static void b(com.google.common.util.concurrent.q qVar, W80 w80, K80 k80) {
        g(qVar, w80, k80, true);
    }

    public static int f(C9695u60 c9695u60) {
        int iF = C5569c.f(c9695u60) - 1;
        return (iF == 0 || iF == 1) ? 7 : 23;
    }

    public static void c(com.google.common.util.concurrent.q qVar, W80 w80, K80 k80) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            Mj0.r(Cj0.D(qVar), new U80(w80, k80), C7033Kq.f69020g);
        }
    }

    public static void d(com.google.common.util.concurrent.q qVar, K80 k80) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            Mj0.r(Cj0.D(qVar), new S80(k80), C7033Kq.f69020g);
        }
    }

    private static void g(com.google.common.util.concurrent.q qVar, W80 w80, K80 k80, boolean z10) {
        if (((Boolean) C8146fg.f74976c.e()).booleanValue()) {
            Mj0.r(Cj0.D(qVar), new T80(w80, k80, z10), C7033Kq.f69020g);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) Oc.A.c().a(C8784lf.f76847I8), str);
    }
}
