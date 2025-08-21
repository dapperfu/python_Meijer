package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Zt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7539Zt {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f73120a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f73121b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(Z50 z50) throws JSONException {
        if (((Boolean) Oc.A.c().a(C8784lf.f77165f5)).booleanValue() && z50.f72854T && z50.f72856V.b() && z50.f72863b != 4) {
            ZS zs2 = z50.f72856V.c() == 1 ? ZS.VIDEO : ZS.HTML_DISPLAY;
            String str = z50.f72884l0;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("creativeType", zs2.toString());
                jSONObject.put("contentUrl", str);
                return "<script>Object.defineProperty(window,'GOOG_OMID_JAVASCRIPT_SESSION_SERVICE_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
            } catch (JSONException e10) {
                Sc.p.h("Unable to build OMID ENV JSON", e10);
            }
        }
        return null;
    }

    public static String b(String str, String... strArr) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        Matcher matcher = f73120a.matcher(str);
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb2.append(str.substring(0, iEnd));
            String str3 = strArr[0];
            if (str3 != null) {
                sb2.append(str3);
            }
            sb2.append(str.substring(iEnd));
        } else {
            if (!f73121b.matcher(str).find() && (str2 = strArr[0]) != null) {
                sb2.append(str2);
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
