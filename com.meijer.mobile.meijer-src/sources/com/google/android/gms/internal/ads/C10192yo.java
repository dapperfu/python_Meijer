package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10192yo {

    /* renamed from: a, reason: collision with root package name */
    private final List f81120a;

    /* renamed from: b, reason: collision with root package name */
    private final String f81121b;

    /* renamed from: c, reason: collision with root package name */
    private final String f81122c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f81123d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f81124e;

    /* renamed from: f, reason: collision with root package name */
    private final String f81125f;

    /* renamed from: g, reason: collision with root package name */
    private final int f81126g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f81127h;

    /* renamed from: i, reason: collision with root package name */
    private final String f81128i;

    /* renamed from: j, reason: collision with root package name */
    private final long f81129j;

    /* renamed from: k, reason: collision with root package name */
    private final long f81130k;

    private static boolean m(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    public final int a() {
        return this.f81126g;
    }

    public final long b() {
        return this.f81130k;
    }

    public final long c() {
        return this.f81129j;
    }

    public final String d() {
        return this.f81121b;
    }

    public final String e() {
        return this.f81128i;
    }

    public final String f() {
        return this.f81122c;
    }

    public final String g() {
        return this.f81125f;
    }

    public final List h() {
        return this.f81120a;
    }

    public final JSONObject i() {
        return this.f81127h;
    }

    public final boolean j() {
        return this.f81124e;
    }

    public final boolean k() {
        return this.f81123d;
    }

    private static Long l(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public C10192yo(JSONObject jSONObject) {
        List listAsList;
        this.f81125f = jSONObject.optString("url");
        this.f81121b = jSONObject.optString("base_uri");
        this.f81122c = jSONObject.optString("post_parameters");
        this.f81123d = m(jSONObject.optString("drt_include"));
        this.f81124e = m(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        if (strOptString == null) {
            listAsList = null;
        } else {
            listAsList = Arrays.asList(strOptString.split(","));
        }
        this.f81120a = listAsList;
        this.f81126g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f81127h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f81128i = jSONObject.optString("pool_key");
        this.f81129j = l(jSONObject.optString("start_time")).longValue();
        this.f81130k = l(jSONObject.optString("end_time")).longValue();
    }
}
