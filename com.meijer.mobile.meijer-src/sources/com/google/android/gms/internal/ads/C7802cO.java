package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7802cO {

    /* renamed from: a, reason: collision with root package name */
    private Long f74002a;

    /* renamed from: b, reason: collision with root package name */
    private final String f74003b;

    /* renamed from: c, reason: collision with root package name */
    private String f74004c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f74005d;

    /* renamed from: e, reason: collision with root package name */
    private String f74006e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f74007f;

    /* synthetic */ C7802cO(String str, C7909dO c7909dO) {
        this.f74003b = str;
    }

    static /* bridge */ /* synthetic */ String a(C7802cO c7802cO) throws JSONException {
        String str = (String) Oc.A.c().a(C8784lf.f76974R9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", c7802cO.f74002a);
            jSONObject.put("eventCategory", c7802cO.f74003b);
            jSONObject.putOpt("event", c7802cO.f74004c);
            jSONObject.putOpt("errorCode", c7802cO.f74005d);
            jSONObject.putOpt("rewardType", c7802cO.f74006e);
            jSONObject.putOpt("rewardAmount", c7802cO.f74007f);
        } catch (JSONException unused) {
            Sc.p.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
