package com.google.android.gms.internal.ads;

import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ul, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9758ul {

    /* renamed from: a, reason: collision with root package name */
    public final List f79742a;

    /* renamed from: b, reason: collision with root package name */
    public final String f79743b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79744c;

    public C9758ul(JSONObject jSONObject) throws JSONException {
        String string;
        jSONObject.optString(PreferencesHelper.PREF_ID);
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        this.f79742a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("allocation_id", null);
        Nc.v.k();
        C9972wl.a(jSONObject, "clickurl");
        Nc.v.k();
        C9972wl.a(jSONObject, "imp_urls");
        Nc.v.k();
        C9972wl.a(jSONObject, "downloaded_imp_urls");
        Nc.v.k();
        C9972wl.a(jSONObject, "fill_urls");
        Nc.v.k();
        C9972wl.a(jSONObject, "video_start_urls");
        Nc.v.k();
        C9972wl.a(jSONObject, "video_complete_urls");
        Nc.v.k();
        C9972wl.a(jSONObject, "video_reward_urls");
        jSONObject.optString("transaction_id");
        jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            Nc.v.k();
            C9972wl.a(jSONObjectOptJSONObject, "manual_impression_urls");
        }
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.toString();
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        if (jSONObjectOptJSONObject2 != null) {
            string = jSONObjectOptJSONObject2.toString();
        } else {
            string = null;
        }
        this.f79743b = string;
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.optString("class_name");
        }
        jSONObject.optString("html_template", null);
        jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        if (jSONObjectOptJSONObject3 != null) {
            jSONObjectOptJSONObject3.toString();
        }
        Nc.v.k();
        C9972wl.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.toString();
        }
        this.f79744c = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
