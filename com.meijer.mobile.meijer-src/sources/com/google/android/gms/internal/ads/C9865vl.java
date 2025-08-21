package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.vl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9865vl {

    /* renamed from: a, reason: collision with root package name */
    public final List f79960a;

    public C9865vl(JSONObject jSONObject) throws JSONException {
        if (Sc.p.j(2)) {
            Rc.p0.k("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i10 = -1;
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                C9758ul c9758ul = new C9758ul(jSONArray.getJSONObject(i11));
                "banner".equalsIgnoreCase(c9758ul.f79744c);
                arrayList.add(c9758ul);
                if (i10 < 0) {
                    Iterator it = c9758ul.f79742a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i10 = i11;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f79960a = Collections.unmodifiableList(arrayList);
        jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
            Nc.v.k();
            C9972wl.a(jSONObjectOptJSONObject, "click_urls");
            Nc.v.k();
            C9972wl.a(jSONObjectOptJSONObject, "imp_urls");
            Nc.v.k();
            C9972wl.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
            Nc.v.k();
            C9972wl.a(jSONObjectOptJSONObject, "nofill_urls");
            Nc.v.k();
            C9972wl.a(jSONObjectOptJSONObject, "remote_ping_urls");
            jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
            jSONObjectOptJSONObject.optLong("refresh", -1L);
            C7402Vo.B(jSONObjectOptJSONObject.optJSONArray("rewards"));
            jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
        }
    }
}
