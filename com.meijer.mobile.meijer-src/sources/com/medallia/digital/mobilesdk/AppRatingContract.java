package com.medallia.digital.mobilesdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class AppRatingContract extends EngagementContract {
    private String appRatingId;
    private String appRatingLanguage;
    private String appRatingUrl;
    private String customParams;
    private boolean isAppRatingDirectApi;
    private boolean isDarkModeEnabled;

    AppRatingContract(String str, InviteData inviteData, JSONObject jSONObject, String str2, String str3, String str4, String str5, boolean z10, boolean z11) {
        super(str, inviteData, jSONObject);
        this.appRatingId = str2;
        this.appRatingUrl = str3;
        this.customParams = str4;
        this.appRatingLanguage = str5;
        this.isDarkModeEnabled = z10;
        this.isAppRatingDirectApi = z11;
    }

    protected String getAppRatingId() {
        return this.appRatingId;
    }

    protected String getAppRatingLanguage() {
        return this.appRatingLanguage;
    }

    protected String getAppRatingUrl() {
        return this.appRatingUrl;
    }

    protected boolean isAppRatingDirectApi() {
        return this.isAppRatingDirectApi;
    }

    protected boolean isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    protected String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"appRatingId\":");
            sb2.append(l3.c(this.appRatingId));
            sb2.append(",\"inviteData\":");
            InviteData inviteData = getInviteData();
            String string = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(inviteData != null ? getInviteData().toJsonString() : com.google.maps.android.BuildConfig.TRAVIS);
            sb2.append(",\"triggerData\":");
            if (getTriggerData() != null) {
                string = getTriggerData().toString();
            }
            sb2.append(string);
            sb2.append(",\"appRatingUrl\":");
            sb2.append(l3.c(this.appRatingUrl));
            sb2.append(",\"customParams\":");
            sb2.append(l3.c(this.customParams));
            sb2.append(",\"appRatingLanguage\":");
            sb2.append(l3.c(this.appRatingLanguage));
            sb2.append(",\"isDarkModeEnabled\":");
            sb2.append(this.isDarkModeEnabled);
            sb2.append(",\"isAppRatingDirectApi\":");
            sb2.append(this.isAppRatingDirectApi);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    AppRatingContract(JSONObject jSONObject) {
        String strB;
        super(jSONObject);
        try {
            if (jSONObject.has("appRatingId") && !jSONObject.isNull("appRatingId")) {
                this.appRatingId = jSONObject.getString("appRatingId");
            }
            if (jSONObject.has("appRatingUrl") && !jSONObject.isNull("appRatingUrl")) {
                this.appRatingUrl = jSONObject.getString("appRatingUrl");
            }
            if (jSONObject.has("customParams")) {
                if (jSONObject.get("customParams") instanceof JSONArray) {
                    strB = jSONObject.getJSONArray("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof JSONObject) {
                    strB = jSONObject.getJSONObject("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof String) {
                    strB = l3.b(jSONObject.getString("customParams"));
                }
                this.customParams = strB;
            }
            if (jSONObject.has("appRatingLanguage") && !jSONObject.isNull("appRatingLanguage")) {
                this.appRatingLanguage = jSONObject.getString("appRatingLanguage");
            }
            if (jSONObject.has("isDarkModeEnabled") && !jSONObject.isNull("isDarkModeEnabled")) {
                this.isDarkModeEnabled = jSONObject.getBoolean("isDarkModeEnabled");
            }
            if (!jSONObject.has("isAppRatingDirectApi") || jSONObject.isNull("isAppRatingDirectApi")) {
                return;
            }
            this.isAppRatingDirectApi = jSONObject.getBoolean("isAppRatingDirectApi");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
