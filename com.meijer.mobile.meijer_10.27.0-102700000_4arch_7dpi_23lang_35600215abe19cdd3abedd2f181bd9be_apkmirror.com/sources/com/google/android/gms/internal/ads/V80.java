package com.google.android.gms.internal.ads;

import Vc.C5366c;
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

    public static int f(C9570u60 c9570u60) {
        int iF = C5366c.f(c9570u60) - 1;
        return (iF == 0 || iF == 1) ? 7 : 23;
    }

    public static void c(com.google.common.util.concurrent.q qVar, W80 w80, K80 k80) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            Mj0.r(Cj0.D(qVar), new U80(w80, k80), C6908Kq.f68180g);
        }
    }

    public static void d(com.google.common.util.concurrent.q qVar, K80 k80) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            Mj0.r(Cj0.D(qVar), new S80(k80), C6908Kq.f68180g);
        }
    }

    private static void g(com.google.common.util.concurrent.q qVar, W80 w80, K80 k80, boolean z10) {
        if (((Boolean) C8021fg.f74136c.e()).booleanValue()) {
            Mj0.r(Cj0.D(qVar), new T80(w80, k80, z10), C6908Kq.f68180g);
        }
    }

    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) Mc.A.c().a(C8659lf.f76007I8), str);
    }
}
