package com.medallia.digital.mobilesdk;

import io.constructor.data.local.PreferencesHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class Component {

    /* renamed from: id, reason: collision with root package name */
    private String f91517id;
    private boolean isCsat;
    private String role;
    private String type;
    private String uniqueName;
    private String value;

    protected Component() {
    }

    protected String getId() {
        return this.f91517id;
    }

    protected String getRole() {
        return this.role;
    }

    protected String getType() {
        return this.type;
    }

    protected String getUniqueName() {
        return this.uniqueName;
    }

    protected String getValue() {
        return this.value;
    }

    protected boolean isCsat() {
        return this.isCsat;
    }

    protected void setCsat(boolean z10) {
        this.isCsat = z10;
    }

    protected void setId(String str) {
        this.f91517id = str;
    }

    protected void setRole(String str) {
        this.role = str;
    }

    protected void setType(String str) {
        this.type = str;
    }

    protected void setUniqueName(String str) {
        this.uniqueName = str;
    }

    protected void setValue(String str) {
        this.value = str;
    }

    protected Component(String str, String str2, String str3, String str4, boolean z10, String str5) {
        this.f91517id = str;
        this.uniqueName = str2;
        this.type = str3;
        this.value = str4;
        this.isCsat = z10;
        this.role = str5;
    }

    protected Component(JSONObject jSONObject) {
        try {
            if (jSONObject.has(PreferencesHelper.PREF_ID) && !jSONObject.isNull(PreferencesHelper.PREF_ID)) {
                this.f91517id = jSONObject.getString(PreferencesHelper.PREF_ID);
            }
            if (jSONObject.has("uniqueName") && !jSONObject.isNull("uniqueName")) {
                this.uniqueName = jSONObject.getString("uniqueName");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.type = jSONObject.getString("type");
            }
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.value = jSONObject.getString("value");
            }
            if (jSONObject.has("isCsat") && !jSONObject.isNull("isCsat")) {
                this.isCsat = jSONObject.getBoolean("isCsat");
            }
            if (!jSONObject.has("role") || jSONObject.isNull("role")) {
                return;
            }
            this.role = jSONObject.getString("role");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
