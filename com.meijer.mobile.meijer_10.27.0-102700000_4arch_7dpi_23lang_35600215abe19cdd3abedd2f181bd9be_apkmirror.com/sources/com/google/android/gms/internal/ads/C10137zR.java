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
public final class C10137zR implements InterfaceC7865e80 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f80420d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);

    /* renamed from: a, reason: collision with root package name */
    private final String f80421a;

    /* renamed from: b, reason: collision with root package name */
    private final K80 f80422b;

    /* renamed from: c, reason: collision with root package name */
    private final W80 f80423c;

    public C10137zR(String str, W80 w80, K80 k80) {
        this.f80421a = str;
        this.f80423c = w80;
        this.f80422b = k80;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
    public final /* bridge */ /* synthetic */ Object zza(Object obj) throws Exception {
        zzdvy zzdvyVar;
        JSONObject jSONObject;
        String strConcat;
        C10030yR c10030yR = (C10030yR) obj;
        int iOptInt = c10030yR.f80223a.optInt("http_timeout_millis", 60000);
        C10067yo c10067yo = c10030yR.f80224b;
        String strJoin = "";
        if (c10067yo.a() != -2) {
            if (c10067yo.a() == 1) {
                if (c10067yo.h() != null) {
                    strJoin = TextUtils.join(", ", c10067yo.h());
                    Qc.p.d(strJoin);
                }
                zzdvyVar = new zzdvy(2, "Error building request URL: ".concat(String.valueOf(strJoin)));
            } else {
                zzdvyVar = new zzdvy(1);
            }
            W80 w80 = this.f80423c;
            K80 k80 = this.f80422b;
            k80.e(zzdvyVar);
            k80.r0(false);
            w80.a(k80);
            throw zzdvyVar;
        }
        HashMap map = new HashMap();
        if (c10030yR.f80224b.j() && !TextUtils.isEmpty(this.f80421a)) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76237Z0)).booleanValue()) {
                String str = this.f80421a;
                if (TextUtils.isEmpty(str)) {
                    strConcat = "";
                } else {
                    Matcher matcher = f80420d.matcher(str);
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
                map.put("Cookie", this.f80421a);
            }
        }
        if (c10030yR.f80224b.k() && (jSONObject = c10030yR.f80223a) != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pii");
            if (jSONObjectOptJSONObject != null) {
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos", ""))) {
                    map.put("x-afma-drt-cookie", jSONObjectOptJSONObject.optString("doritos", ""));
                }
                if (!TextUtils.isEmpty(jSONObjectOptJSONObject.optString("doritos_v2", ""))) {
                    map.put("x-afma-drt-v2-cookie", jSONObjectOptJSONObject.optString("doritos_v2", ""));
                }
            } else {
                Pc.p0.k("DSID signal does not exist.");
            }
        }
        if (c10030yR.f80224b != null && !TextUtils.isEmpty(c10030yR.f80224b.f())) {
            strJoin = c10030yR.f80224b.f();
        }
        W80 w802 = this.f80423c;
        K80 k802 = this.f80422b;
        k802.r0(true);
        w802.a(k802);
        return new C9602uR(c10030yR.f80224b.g(), iOptInt, map, strJoin.getBytes(StandardCharsets.UTF_8), "", c10030yR.f80224b.k());
    }
}
