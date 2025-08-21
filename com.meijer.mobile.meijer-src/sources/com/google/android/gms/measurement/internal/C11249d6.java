package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C10536g2;
import com.google.android.gms.internal.measurement.C10555i3;
import com.google.android.gms.internal.measurement.C10618p3;
import com.google.android.gms.internal.measurement.EnumC10573k3;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.measurement.internal.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11249d6 extends W5 {
    private final String i(String str) {
        String strV = this.f86107b.B0().v(str);
        if (TextUtils.isEmpty(strV)) {
            return (String) C11245d2.f86336r.b(null);
        }
        Uri uri = Uri.parse((String) C11245d2.f86336r.b(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        String authority = uri.getAuthority();
        StringBuilder sb2 = new StringBuilder(String.valueOf(strV).length() + 1 + String.valueOf(authority).length());
        sb2.append(strV);
        sb2.append(".");
        sb2.append(authority);
        builderBuildUpon.authority(sb2.toString());
        return builderBuildUpon.build().toString();
    }

    private static final boolean j(String str) {
        String str2 = (String) C11245d2.f86340t.b(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    public final C11241c6 g(String str) {
        C11384w2 c11384w2H0;
        q6 q6Var = this.f86107b;
        C11384w2 c11384w2H02 = q6Var.D0().H0(str);
        C11241c6 c11241c6 = null;
        if (c11384w2H02 == null || !c11384w2H02.V()) {
            return new C11241c6(i(str), Collections.EMPTY_MAP, Qd.G.GOOGLE_ANALYTICS, null);
        }
        C10555i3 c10555i3F = C10618p3.F();
        c10555i3F.u(2);
        c10555i3F.t((EnumC10573k3) com.google.android.gms.common.internal.r.l(EnumC10573k3.a(c11384w2H02.M())));
        String strP0 = c11384w2H02.p0();
        C10536g2 c10536g2U = q6Var.B0().u(str);
        if (c10536g2U == null || (c11384w2H0 = q6Var.D0().H0(str)) == null || ((!c10536g2U.S() || c10536g2U.T().G() != 100) && !this.f85708a.A().N(str, c11384w2H0.l0()) && (TextUtils.isEmpty(strP0) || Math.abs(strP0.hashCode() % 100) >= c10536g2U.T().G()))) {
            c10555i3F.v(3);
            return new C11241c6(i(str), Collections.EMPTY_MAP, Qd.G.GOOGLE_ANALYTICS, (C10618p3) c10555i3F.q());
        }
        String strO0 = c11384w2H02.o0();
        c10555i3F.u(2);
        C10536g2 c10536g2U2 = q6Var.B0().u(c11384w2H02.o0());
        if (c10536g2U2 == null || !c10536g2U2.S()) {
            this.f85708a.a().u().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
            c10555i3F.v(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(c11384w2H02.l0())) {
                map.put("x-gtm-server-preview", c11384w2H02.l0());
            }
            String strH = c10536g2U2.T().H();
            EnumC10573k3 enumC10573k3A = EnumC10573k3.a(c11384w2H02.M());
            if (enumC10573k3A != null && enumC10573k3A != EnumC10573k3.CLIENT_UPLOAD_ELIGIBLE) {
                c10555i3F.t(enumC10573k3A);
            } else if (j(c11384w2H02.o0())) {
                c10555i3F.t(EnumC10573k3.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strH)) {
                c10555i3F.t(EnumC10573k3.MISSING_SGTM_SERVER_URL);
            } else {
                this.f85708a.a().u().b("[sgtm] Eligible for client side upload. appId", strO0);
                c10555i3F.u(3);
                c10555i3F.t(EnumC10573k3.CLIENT_UPLOAD_ELIGIBLE);
                c11241c6 = new C11241c6(strH, map, Qd.G.SGTM_CLIENT, (C10618p3) c10555i3F.q());
            }
            c10536g2U2.T().E();
            c10536g2U2.T().F();
            X2 x22 = this.f85708a;
            x22.c();
            if (TextUtils.isEmpty(strH)) {
                c10555i3F.v(6);
                x22.a().u().b("[sgtm] Local service, missing sgtm_server_url", c11384w2H02.o0());
            } else {
                x22.a().u().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                c10555i3F.u(5);
                c10555i3F.v(2);
                c11241c6 = new C11241c6(strH, map, Qd.G.SGTM, (C10618p3) c10555i3F.q());
            }
        }
        return c11241c6 != null ? c11241c6 : new C11241c6(i(str), Collections.EMPTY_MAP, Qd.G.GOOGLE_ANALYTICS, (C10618p3) c10555i3F.q());
    }

    C11249d6(q6 q6Var) {
        super(q6Var);
    }

    final boolean h(String str, EnumC10573k3 enumC10573k3) {
        C10536g2 c10536g2U;
        f();
        if (enumC10573k3 != EnumC10573k3.CLIENT_UPLOAD_ELIGIBLE || j(str) || (c10536g2U = this.f86107b.B0().u(str)) == null || !c10536g2U.S() || c10536g2U.T().H().isEmpty()) {
            return false;
        }
        return true;
    }
}
