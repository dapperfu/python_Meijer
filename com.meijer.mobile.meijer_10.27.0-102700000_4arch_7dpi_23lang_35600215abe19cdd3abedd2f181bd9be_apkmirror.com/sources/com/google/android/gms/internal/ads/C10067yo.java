package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.yo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10067yo {

    /* renamed from: a, reason: collision with root package name */
    private final List f80280a;

    /* renamed from: b, reason: collision with root package name */
    private final String f80281b;

    /* renamed from: c, reason: collision with root package name */
    private final String f80282c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f80283d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f80284e;

    /* renamed from: f, reason: collision with root package name */
    private final String f80285f;

    /* renamed from: g, reason: collision with root package name */
    private final int f80286g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f80287h;

    /* renamed from: i, reason: collision with root package name */
    private final String f80288i;

    /* renamed from: j, reason: collision with root package name */
    private final long f80289j;

    /* renamed from: k, reason: collision with root package name */
    private final long f80290k;

    private static boolean m(String str) {
        if (str != null) {
            return str.equals("1") || str.equals("true");
        }
        return false;
    }

    public final int a() {
        return this.f80286g;
    }

    public final long b() {
        return this.f80290k;
    }

    public final long c() {
        return this.f80289j;
    }

    public final String d() {
        return this.f80281b;
    }

    public final String e() {
        return this.f80288i;
    }

    public final String f() {
        return this.f80282c;
    }

    public final String g() {
        return this.f80285f;
    }

    public final List h() {
        return this.f80280a;
    }

    public final JSONObject i() {
        return this.f80287h;
    }

    public final boolean j() {
        return this.f80284e;
    }

    public final boolean k() {
        return this.f80283d;
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

    public C10067yo(JSONObject jSONObject) {
        List listAsList;
        this.f80285f = jSONObject.optString("url");
        this.f80281b = jSONObject.optString("base_uri");
        this.f80282c = jSONObject.optString("post_parameters");
        this.f80283d = m(jSONObject.optString("drt_include"));
        this.f80284e = m(jSONObject.optString("cookies_include", "true"));
        jSONObject.optString("request_id");
        jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        if (strOptString == null) {
            listAsList = null;
        } else {
            listAsList = Arrays.asList(strOptString.split(","));
        }
        this.f80280a = listAsList;
        this.f80286g = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f80287h = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f80288i = jSONObject.optString("pool_key");
        this.f80289j = l(jSONObject.optString("start_time")).longValue();
        this.f80290k = l(jSONObject.optString("end_time")).longValue();
    }
}
