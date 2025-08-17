package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7677cO {

    /* renamed from: a, reason: collision with root package name */
    private Long f73162a;

    /* renamed from: b, reason: collision with root package name */
    private final String f73163b;

    /* renamed from: c, reason: collision with root package name */
    private String f73164c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f73165d;

    /* renamed from: e, reason: collision with root package name */
    private String f73166e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f73167f;

    /* synthetic */ C7677cO(String str, C7784dO c7784dO) {
        this.f73163b = str;
    }

    static /* bridge */ /* synthetic */ String a(C7677cO c7677cO) throws JSONException {
        String str = (String) Mc.A.c().a(C8659lf.f76134R9);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", c7677cO.f73162a);
            jSONObject.put("eventCategory", c7677cO.f73163b);
            jSONObject.putOpt("event", c7677cO.f73164c);
            jSONObject.putOpt("errorCode", c7677cO.f73165d);
            jSONObject.putOpt("rewardType", c7677cO.f73166e);
            jSONObject.putOpt("rewardAmount", c7677cO.f73167f);
        } catch (JSONException unused) {
            Qc.p.g("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
