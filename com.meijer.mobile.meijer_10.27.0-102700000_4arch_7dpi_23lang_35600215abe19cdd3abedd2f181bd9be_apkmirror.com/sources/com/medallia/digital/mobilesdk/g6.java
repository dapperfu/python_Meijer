package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import io.constructor.data.local.PreferencesHelper;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class g6 extends b0 {

    /* renamed from: a, reason: collision with root package name */
    String f92102a;

    /* renamed from: b, reason: collision with root package name */
    Long f92103b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f92104c;

    public g6(String str, Long l10, Boolean bool) {
        this.f92102a = str;
        this.f92103b = l10;
        this.f92104c = bool;
    }

    public Long a() {
        return this.f92103b;
    }

    public String b() {
        return this.f92102a;
    }

    public Boolean c() {
        return this.f92104c;
    }

    @Override // com.medallia.digital.mobilesdk.b0
    protected b0.a getDataTableObjectType() {
        return b0.a.QuarantineRule;
    }

    public String toJsonString() {
        try {
            return "{,\"id\":" + l3.c(this.f92102a) + ",\"expirationTime\":" + this.f92103b + ",\"status\":" + this.f92104c + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    public g6(JSONObject jSONObject) {
        try {
            if (jSONObject.has(PreferencesHelper.PREF_ID) && !jSONObject.isNull(PreferencesHelper.PREF_ID)) {
                this.f92102a = jSONObject.getString(PreferencesHelper.PREF_ID);
            }
            if (jSONObject.has("status") && !jSONObject.isNull("status")) {
                this.f92104c = Boolean.valueOf(jSONObject.getBoolean("status"));
            }
            if (!jSONObject.has("expirationTime") || jSONObject.isNull("expirationTime")) {
                return;
            }
            this.f92103b = Long.valueOf(jSONObject.getLong("expirationTime"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }
}
