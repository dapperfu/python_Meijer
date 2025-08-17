package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Yp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7377Yp {
    static Uri a(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i10 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i10) + str2 + "=" + str3 + "&" + str.substring(i10));
    }

    public static String c(String str, Context context, boolean z10, Map map) {
        String strA;
        if ((((Boolean) Mc.A.c().a(C8659lf.f76600z0)).booleanValue() && !z10) || !Lc.v.r().p(context) || TextUtils.isEmpty(str) || (strA = Lc.v.r().a(context)) == null) {
            return str;
        }
        String str2 = (String) Mc.A.c().a(C8659lf.f76502s0);
        if (((Boolean) Mc.A.c().a(C8659lf.f76488r0)).booleanValue() && str.contains(str2)) {
            if (Lc.v.t().O(str)) {
                Lc.v.r().j(context, strA, (Map) map.get("_ac"));
                return d(str, context).replace(str2, strA);
            }
            if (!Lc.v.t().P(str)) {
                return str;
            }
            Lc.v.r().k(context, strA, (Map) map.get("_ai"));
            return d(str, context).replace(str2, strA);
        }
        if (str.contains("fbs_aeid")) {
            return str;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76474q0)).booleanValue()) {
            return str;
        }
        if (Lc.v.t().O(str)) {
            Lc.v.r().j(context, strA, (Map) map.get("_ac"));
            return a(d(str, context), "fbs_aeid", strA).toString();
        }
        if (!Lc.v.t().P(str)) {
            return str;
        }
        Lc.v.r().k(context, strA, (Map) map.get("_ai"));
        return a(d(str, context), "fbs_aeid", strA).toString();
    }

    public static String b(Uri uri, Context context, Map map) {
        if (!Lc.v.r().p(context)) {
            return uri.toString();
        }
        String strA = Lc.v.r().a(context);
        if (strA == null) {
            return uri.toString();
        }
        String str = (String) Mc.A.c().a(C8659lf.f76502s0);
        String string = uri.toString();
        if (((Boolean) Mc.A.c().a(C8659lf.f76488r0)).booleanValue() && string.contains(str)) {
            Lc.v.r().j(context, strA, (Map) map.get("_ac"));
            return d(string, context).replace(str, strA);
        }
        if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            if (!((Boolean) Mc.A.c().a(C8659lf.f76474q0)).booleanValue()) {
                String string2 = a(d(string, context), "fbs_aeid", strA).toString();
                Lc.v.r().j(context, strA, (Map) map.get("_ac"));
                return string2;
            }
        }
        return string;
    }

    private static String d(String str, Context context) {
        String strD = Lc.v.r().d(context);
        String strB = Lc.v.r().b(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strD)) {
            str = a(str, "gmp_app_id", strD).toString();
        }
        if (!str.contains("fbs_aiid") && !TextUtils.isEmpty(strB)) {
            return a(str, "fbs_aiid", strB).toString();
        }
        return str;
    }
}
