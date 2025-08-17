package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C10411g2;
import com.google.android.gms.internal.measurement.C10430i3;
import com.google.android.gms.internal.measurement.C10493p3;
import com.google.android.gms.internal.measurement.EnumC10448k3;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.measurement.internal.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11124d6 extends W5 {
    private final String i(String str) {
        String strV = this.f85267b.B0().v(str);
        if (TextUtils.isEmpty(strV)) {
            return (String) C11120d2.f85496r.b(null);
        }
        Uri uri = Uri.parse((String) C11120d2.f85496r.b(null));
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
        String str2 = (String) C11120d2.f85500t.b(null);
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

    public final C11116c6 g(String str) {
        C11259w2 c11259w2H0;
        q6 q6Var = this.f85267b;
        C11259w2 c11259w2H02 = q6Var.D0().H0(str);
        C11116c6 c11116c6 = null;
        if (c11259w2H02 == null || !c11259w2H02.V()) {
            return new C11116c6(i(str), Collections.EMPTY_MAP, Od.G.GOOGLE_ANALYTICS, null);
        }
        C10430i3 c10430i3F = C10493p3.F();
        c10430i3F.u(2);
        c10430i3F.t((EnumC10448k3) com.google.android.gms.common.internal.r.l(EnumC10448k3.a(c11259w2H02.M())));
        String strP0 = c11259w2H02.p0();
        C10411g2 c10411g2U = q6Var.B0().u(str);
        if (c10411g2U == null || (c11259w2H0 = q6Var.D0().H0(str)) == null || ((!c10411g2U.S() || c10411g2U.T().G() != 100) && !this.f84868a.A().N(str, c11259w2H0.l0()) && (TextUtils.isEmpty(strP0) || Math.abs(strP0.hashCode() % 100) >= c10411g2U.T().G()))) {
            c10430i3F.v(3);
            return new C11116c6(i(str), Collections.EMPTY_MAP, Od.G.GOOGLE_ANALYTICS, (C10493p3) c10430i3F.q());
        }
        String strO0 = c11259w2H02.o0();
        c10430i3F.u(2);
        C10411g2 c10411g2U2 = q6Var.B0().u(c11259w2H02.o0());
        if (c10411g2U2 == null || !c10411g2U2.S()) {
            this.f84868a.a().u().b("[sgtm] Missing sgtm_setting in remote config. appId", strO0);
            c10430i3F.v(4);
        } else {
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(c11259w2H02.l0())) {
                map.put("x-gtm-server-preview", c11259w2H02.l0());
            }
            String strH = c10411g2U2.T().H();
            EnumC10448k3 enumC10448k3A = EnumC10448k3.a(c11259w2H02.M());
            if (enumC10448k3A != null && enumC10448k3A != EnumC10448k3.CLIENT_UPLOAD_ELIGIBLE) {
                c10430i3F.t(enumC10448k3A);
            } else if (j(c11259w2H02.o0())) {
                c10430i3F.t(EnumC10448k3.PINNED_TO_SERVICE_UPLOAD);
            } else if (TextUtils.isEmpty(strH)) {
                c10430i3F.t(EnumC10448k3.MISSING_SGTM_SERVER_URL);
            } else {
                this.f84868a.a().u().b("[sgtm] Eligible for client side upload. appId", strO0);
                c10430i3F.u(3);
                c10430i3F.t(EnumC10448k3.CLIENT_UPLOAD_ELIGIBLE);
                c11116c6 = new C11116c6(strH, map, Od.G.SGTM_CLIENT, (C10493p3) c10430i3F.q());
            }
            c10411g2U2.T().E();
            c10411g2U2.T().F();
            X2 x22 = this.f84868a;
            x22.c();
            if (TextUtils.isEmpty(strH)) {
                c10430i3F.v(6);
                x22.a().u().b("[sgtm] Local service, missing sgtm_server_url", c11259w2H02.o0());
            } else {
                x22.a().u().b("[sgtm] Eligible for local service direct upload. appId", strO0);
                c10430i3F.u(5);
                c10430i3F.v(2);
                c11116c6 = new C11116c6(strH, map, Od.G.SGTM, (C10493p3) c10430i3F.q());
            }
        }
        return c11116c6 != null ? c11116c6 : new C11116c6(i(str), Collections.EMPTY_MAP, Od.G.GOOGLE_ANALYTICS, (C10493p3) c10430i3F.q());
    }

    C11124d6(q6 q6Var) {
        super(q6Var);
    }

    final boolean h(String str, EnumC10448k3 enumC10448k3) {
        C10411g2 c10411g2U;
        f();
        if (enumC10448k3 != EnumC10448k3.CLIENT_UPLOAD_ELIGIBLE || j(str) || (c10411g2U = this.f85267b.B0().u(str)) == null || !c10411g2U.S() || c10411g2U.T().H().isEmpty()) {
            return false;
        }
        return true;
    }
}
