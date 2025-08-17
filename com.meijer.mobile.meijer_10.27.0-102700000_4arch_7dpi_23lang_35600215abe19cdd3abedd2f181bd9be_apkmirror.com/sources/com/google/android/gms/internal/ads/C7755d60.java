package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.d60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7755d60 {

    /* renamed from: a, reason: collision with root package name */
    public final String f73363a;

    /* renamed from: b, reason: collision with root package name */
    public final String f73364b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f73365c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f73366d;

    C7755d60(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectI = Pc.U.i(jsonReader);
        this.f73366d = jSONObjectI;
        this.f73363a = jSONObjectI.optString("ad_html", null);
        this.f73364b = jSONObjectI.optString("ad_base_url", null);
        this.f73365c = jSONObjectI.optJSONObject("ad_json");
    }
}
