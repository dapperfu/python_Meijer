package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.d60, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7880d60 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74203a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74204b;

    /* renamed from: c, reason: collision with root package name */
    public final JSONObject f74205c;

    /* renamed from: d, reason: collision with root package name */
    public final JSONObject f74206d;

    C7880d60(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        JSONObject jSONObjectI = Rc.U.i(jsonReader);
        this.f74206d = jSONObjectI;
        this.f74203a = jSONObjectI.optString("ad_html", null);
        this.f74204b = jSONObjectI.optString("ad_base_url", null);
        this.f74205c = jSONObjectI.optJSONObject("ad_json");
    }
}
