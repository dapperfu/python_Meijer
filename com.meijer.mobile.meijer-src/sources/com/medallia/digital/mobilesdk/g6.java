package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import io.constructor.data.local.PreferencesHelper;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class g6 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    String f92941a;

    /* renamed from: b, reason: collision with root package name */
    Long f92942b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f92943c;

    public g6(String str, Long l10, Boolean bool) {
        this.f92941a = str;
        this.f92942b = l10;
        this.f92943c = bool;
    }

    public Long a() {
        return this.f92942b;
    }

    public String b() {
        return this.f92941a;
    }

    public Boolean c() {
        return this.f92943c;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.QuarantineRule;
    }

    public String toJsonString() {
        try {
            return "{,\"id\":" + l3.c(this.f92941a) + ",\"expirationTime\":" + this.f92942b + ",\"status\":" + this.f92943c + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public g6(JSONObject jSONObject) {
        try {
            if (jSONObject.has(PreferencesHelper.PREF_ID) && !jSONObject.isNull(PreferencesHelper.PREF_ID)) {
                this.f92941a = jSONObject.getString(PreferencesHelper.PREF_ID);
            }
            if (jSONObject.has("status") && !jSONObject.isNull("status")) {
                this.f92943c = Boolean.valueOf(jSONObject.getBoolean("status"));
            }
            if (!jSONObject.has("expirationTime") || jSONObject.isNull("expirationTime")) {
                return;
            }
            this.f92942b = Long.valueOf(jSONObject.getLong("expirationTime"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
