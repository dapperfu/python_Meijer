package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10262zR implements InterfaceC7990e80 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f81260d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a, reason: collision with root package name */
    private final String f81261a;

    /* renamed from: b, reason: collision with root package name */
    private final K80 f81262b;

    /* renamed from: c, reason: collision with root package name */
    private final W80 f81263c;

    public C10262zR(String str, W80 w80, K80 k80) {
        this.f81261a = str;
        this.f81263c = w80;
        this.f81262b = k80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdvy zzdvyVar;
        JSONObject jSONObject;
        String strConcat;
        C10155yR c10155yR = (C10155yR) obj;
        int iOptInt = c10155yR.f81063a.optInt("http_timeout_millis", 60000);
        C10192yo c10192yo = c10155yR.f81064b;
        String strJoin = "";
        if (c10192yo.a() != -2) {
            if (c10192yo.a() == 1) {
                if (c10192yo.h() != null) {
                    strJoin = TextUtils.join(", ", c10192yo.h());
                    Sc.p.d(strJoin);
                }
                zzdvyVar = new zzdvy(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdvyVar = new zzdvy(1);
            }
            W80 w80 = this.f81263c;
            K80 k80 = this.f81262b;
            k80.e(zzdvyVar);
            k80.s0(false);
            w80.a(k80);
            throw zzdvyVar;
        }
        HashMap map = new HashMap();
        if (c10155yR.f81064b.j() && !TextUtils.isEmpty(this.f81261a)) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77077Z0)).booleanValue()) {
                String str = this.f81261a;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f81260d.matcher(str);
                    strConcat = "";
                    while (matcher.find()) {
                        String strGroup = matcher.group(1);
                        if (strGroup != null) {
                            Locale locale = Locale.ROOT;
                            if (strGroup.toLowerCase(locale).startsWith("id=") || strGroup.toLowerCase(locale).startsWith("ide=")) {
                                if (!TextUtils.isEmpty(strConcat)) {
                                    strConcat = strConcat.concat("; ");
                                }
                                strConcat = strConcat.concat(strGroup);
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(strConcat)) {
                    map.put("Cookie", strConcat);
                }
            } else {
                map.put("Cookie", this.f81261a);
            }
        }
        if (c10155yR.f81064b.k() && (jSONObject = c10155yR.f81063a) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                Rc.p0.k("DSID signal does not exist.");
            }
        }
        if (c10155yR.f81064b != null && !TextUtils.isEmpty(c10155yR.f81064b.f())) {
            strJoin = c10155yR.f81064b.f();
        }
        W80 w802 = this.f81263c;
        K80 k802 = this.f81262b;
        k802.s0(true);
        w802.a(k802);
        return new C9727uR(c10155yR.f81064b.g(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "", c10155yR.f81064b.k());
    }
}
