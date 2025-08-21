package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9768uq {

    /* renamed from: d, reason: collision with root package name */
    private String f79765d;

    /* renamed from: e, reason: collision with root package name */
    private String f79766e;

    /* renamed from: f, reason: collision with root package name */
    private long f79767f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f79768g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f79769h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f79771j;

    /* renamed from: a, reason: collision with root package name */
    private final List f79762a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f79763b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f79764c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List f79770i = new ArrayList();

    public final long a() {
        return this.f79767f;
    }

    public final String b() {
        return this.f79765d;
    }

    public final String c() {
        return this.f79766e;
    }

    public final List d() {
        return this.f79770i;
    }

    public final Map e() {
        return this.f79764c;
    }

    public final JSONObject f() {
        return this.f79768g;
    }

    public final void g(long j10) {
        this.f79767f = j10;
    }

    public final boolean h() {
        return this.f79771j;
    }

    public final boolean i() {
        return this.f79769h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.f79766e) && this.f79768g != null) {
            AbstractC7718bf abstractC7718bf = C8784lf.f76766Cb;
            long jLongValue = ((Long) Oc.A.c().a(abstractC7718bf)).longValue();
            if (((Boolean) Oc.A.c().a(C8784lf.f76752Bb)).booleanValue() && !TextUtils.isEmpty(this.f79766e)) {
                jLongValue = this.f79768g.optLong("cache_ttl_sec", ((Long) Oc.A.c().a(abstractC7718bf)).longValue());
            }
            long jA = Nc.v.c().a();
            if (jLongValue >= 0) {
                long j10 = this.f79767f;
                if (j10 > jA || TimeUnit.MILLISECONDS.toSeconds(jA - j10) > jLongValue) {
                    this.f79762a.clear();
                    this.f79763b.clear();
                    this.f79764c.clear();
                    this.f79765d = "";
                    this.f79766e = "";
                    this.f79768g = null;
                    this.f79769h = false;
                    this.f79770i.clear();
                    this.f79771j = false;
                    return true;
                }
            }
        }
        return false;
    }

    public C9768uq(String str, long j10) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f79765d = "";
        this.f79769h = false;
        this.f79771j = false;
        this.f79766e = str;
        this.f79767f = j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f79768g = new JSONObject(str);
                if (((Boolean) Oc.A.c().a(C8784lf.f77451zb)).booleanValue() && j()) {
                    return;
                }
                if (this.f79768g.optInt("status", -1) != 1) {
                    this.f79769h = false;
                    Sc.p.g("App settings could not be fetched successfully.");
                    return;
                }
                this.f79769h = true;
                this.f79765d = this.f79768g.optString("app_id");
                JSONArray jSONArrayOptJSONArray2 = this.f79768g.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                        String strOptString = jSONObject.optString("format");
                        String strOptString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                            if ("interstitial".equalsIgnoreCase(strOptString)) {
                                this.f79763b.add(strOptString2);
                            } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                this.f79764c.put(strOptString2, new C9865vl(jSONObjectOptJSONObject3));
                            }
                        }
                    }
                }
                JSONArray jSONArrayOptJSONArray3 = this.f79768g.optJSONArray("persistable_banner_ad_unit_ids");
                if (jSONArrayOptJSONArray3 != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                        this.f79762a.add(jSONArrayOptJSONArray3.optString(i11));
                    }
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76845I6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f79768g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                        this.f79770i.add(jSONArrayOptJSONArray.get(i12).toString());
                    }
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f77152e6)).booleanValue() && (jSONObjectOptJSONObject = this.f79768g.optJSONObject("common_settings")) != null) {
                    this.f79771j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e10) {
                Sc.p.h("Exception occurred while processing app setting json", e10);
                Nc.v.s().x(e10, "AppSettings.parseAppSettingsJson");
            }
        }
    }
}
