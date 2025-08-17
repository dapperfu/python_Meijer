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
public final class C9643uq {

    /* renamed from: d, reason: collision with root package name */
    private String f78925d;

    /* renamed from: e, reason: collision with root package name */
    private String f78926e;

    /* renamed from: f, reason: collision with root package name */
    private long f78927f;

    /* renamed from: g, reason: collision with root package name */
    private JSONObject f78928g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f78929h;

    /* renamed from: j, reason: collision with root package name */
    private boolean f78931j;

    /* renamed from: a, reason: collision with root package name */
    private final List f78922a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f78923b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final Map f78924c = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final List f78930i = new ArrayList();

    public final long a() {
        return this.f78927f;
    }

    public final String b() {
        return this.f78925d;
    }

    public final String c() {
        return this.f78926e;
    }

    public final List d() {
        return this.f78930i;
    }

    public final Map e() {
        return this.f78924c;
    }

    public final JSONObject f() {
        return this.f78928g;
    }

    public final void g(long j10) {
        this.f78927f = j10;
    }

    public final boolean h() {
        return this.f78931j;
    }

    public final boolean i() {
        return this.f78929h;
    }

    public final boolean j() {
        if (!TextUtils.isEmpty(this.f78926e) && this.f78928g != null) {
            AbstractC7593bf abstractC7593bf = C8659lf.f75926Cb;
            long jLongValue = ((Long) Mc.A.c().a(abstractC7593bf)).longValue();
            if (((Boolean) Mc.A.c().a(C8659lf.f75912Bb)).booleanValue() && !TextUtils.isEmpty(this.f78926e)) {
                jLongValue = this.f78928g.optLong("cache_ttl_sec", ((Long) Mc.A.c().a(abstractC7593bf)).longValue());
            }
            long jA = Lc.v.c().a();
            if (jLongValue >= 0) {
                long j10 = this.f78927f;
                if (j10 > jA || TimeUnit.MILLISECONDS.toSeconds(jA - j10) > jLongValue) {
                    this.f78922a.clear();
                    this.f78923b.clear();
                    this.f78924c.clear();
                    this.f78925d = "";
                    this.f78926e = "";
                    this.f78928g = null;
                    this.f78929h = false;
                    this.f78930i.clear();
                    this.f78931j = false;
                    return true;
                }
            }
        }
        return false;
    }

    public C9643uq(String str, long j10) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f78925d = "";
        this.f78929h = false;
        this.f78931j = false;
        this.f78926e = str;
        this.f78927f = j10;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f78928g = new JSONObject(str);
                if (((Boolean) Mc.A.c().a(C8659lf.f76611zb)).booleanValue() && j()) {
                    return;
                }
                if (this.f78928g.optInt("status", -1) != 1) {
                    this.f78929h = false;
                    Qc.p.g("App settings could not be fetched successfully.");
                    return;
                }
                this.f78929h = true;
                this.f78925d = this.f78928g.optString("app_id");
                JSONArray jSONArrayOptJSONArray2 = this.f78928g.optJSONArray("ad_unit_id_settings");
                if (jSONArrayOptJSONArray2 != null) {
                    for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                        JSONObject jSONObject = jSONArrayOptJSONArray2.getJSONObject(i10);
                        String strOptString = jSONObject.optString("format");
                        String strOptString2 = jSONObject.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                            if ("interstitial".equalsIgnoreCase(strOptString)) {
                                this.f78923b.add(strOptString2);
                            } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject.optJSONObject("mediation_config")) != null) {
                                this.f78924c.put(strOptString2, new C9740vl(jSONObjectOptJSONObject3));
                            }
                        }
                    }
                }
                JSONArray jSONArrayOptJSONArray3 = this.f78928g.optJSONArray("persistable_banner_ad_unit_ids");
                if (jSONArrayOptJSONArray3 != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray3.length(); i11++) {
                        this.f78922a.add(jSONArrayOptJSONArray3.optString(i11));
                    }
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76005I6)).booleanValue() && (jSONObjectOptJSONObject2 = this.f78928g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray.length(); i12++) {
                        this.f78930i.add(jSONArrayOptJSONArray.get(i12).toString());
                    }
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76312e6)).booleanValue() && (jSONObjectOptJSONObject = this.f78928g.optJSONObject("common_settings")) != null) {
                    this.f78931j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e10) {
                Qc.p.h("Exception occurred while processing app setting json", e10);
                Lc.v.s().x(e10, "AppSettings.parseAppSettingsJson");
            }
        }
    }
}
