package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class PropertyConfigurationContract extends AbstractC11690a<SDKConfigurationFormContract> {
    private Integer accountId;
    private ArrayList<c1> customParameters;
    private boolean isDigitalAnalyticsEnabled;
    private boolean isOCQEnabled;
    private String mecIntegrationId;
    private ArrayList<String> omniChannelRulesIds;
    private String propertyType;
    private Integer textAreaLimit;
    private HashMap<String, t7> themes;

    protected PropertyConfigurationContract(String str, String str2, List<ResourceContract> list, List<SDKConfigurationFormContract> list2, HashMap<String, Boolean> map, List<AppRatingContract> list3, HashMap<String, t7> map2) {
        super(str, str2, list, list2, map, list3);
        this.themes = map2;
    }

    public Integer getAccountId() {
        return this.accountId;
    }

    public ArrayList<c1> getCustomParameters() {
        return this.customParameters;
    }

    public String getMecIntegrationId() {
        return this.mecIntegrationId;
    }

    public ArrayList<String> getOmniChannelRulesIds() {
        return this.omniChannelRulesIds;
    }

    public String getPropertyType() {
        return this.propertyType;
    }

    public Integer getTextAreaLimit() {
        return this.textAreaLimit;
    }

    protected HashMap<String, t7> getThemes() {
        return this.themes;
    }

    public boolean isDigitalAnalyticsEnabled() {
        return this.isDigitalAnalyticsEnabled;
    }

    public boolean isOCQEnabled() {
        return this.isOCQEnabled;
    }

    protected String toJsonString() {
        try {
            return "{\"formJsonFileLocalUrl\":" + l3.c(getFormJsonFileLocalUrl()) + ",\"globalConfigurationFileLocalUrl\":" + l3.c(getGlobalConfigurationFileLocalUrl()) + ",\"formFileLocationQueryParam\":" + l3.c(getFormFileLocationQueryParam()) + ",\"preloadFormJsonFileLocalUrl\":" + l3.c(getPreloadFormJsonFileLocalUrl()) + ",\"globalResources\":" + ModelFactory.getInstance().getResourcesAsJsonString(getGlobalResources()) + ",\"forms\":" + ModelFactory.getInstance().getFormsAsJsonString(getForms()) + ",\"provisions\":" + ModelFactory.getInstance().getProvisionsAsJsonString(getProvisions()) + ",\"appRatings\":" + ModelFactory.getInstance().getAppRatingsAsJsonString(getAppRatings()) + ",\"themes\":" + ModelFactory.getInstance().getThemesMapAsJsonString(getThemes()) + ",\"isNewLiveFormEnable\":" + isNewLiveFormEnable() + ",\"isOCQEnabled\":" + isOCQEnabled() + ",\"omniChannelRulesIds\":" + ModelFactory.getInstance().getStringArrayAsJsonString(getOmniChannelRulesIds()) + ",\"textAreaLimit\":" + getTextAreaLimit() + ",\"customParameters\":" + ModelFactory.getInstance().customParameterContractsToJsonString(getCustomParameters()) + ",\"isDigitalAnalyticsEnabled\":" + isDigitalAnalyticsEnabled() + ",\"mecIntegrationId\":" + getMecIntegrationId() + ",\"accountId\":" + getAccountId() + ",\"propertyType\":" + l3.c(getPropertyType()) + "}";
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    PropertyConfigurationContract(JSONObject jSONObject) {
        super(jSONObject);
        try {
            if (jSONObject.has("forms") && !jSONObject.isNull("forms")) {
                setForms(ModelFactory.getInstance().getFormContractsArray(jSONObject.getJSONArray("forms")));
            }
            if (jSONObject.has("themes") && !jSONObject.isNull("themes")) {
                this.themes = ModelFactory.getInstance().getStringThemeMap(jSONObject.getJSONObject("themes"));
            }
            if (jSONObject.has("isOCQEnabled") && !jSONObject.isNull("isOCQEnabled")) {
                this.isOCQEnabled = jSONObject.getBoolean("isOCQEnabled");
            }
            if (jSONObject.has("omniChannelRulesIds") && !jSONObject.isNull("omniChannelRulesIds")) {
                this.omniChannelRulesIds = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("omniChannelRulesIds"));
            }
            if (jSONObject.has("textAreaLimit") && !jSONObject.isNull("textAreaLimit")) {
                this.textAreaLimit = Integer.valueOf(jSONObject.getInt("textAreaLimit"));
            }
            if (jSONObject.has("customParams") && !jSONObject.isNull("customParams")) {
                this.customParameters = ModelFactory.getInstance().getCustomParameterContractArray(jSONObject.getJSONArray("customParams"));
            }
            if (jSONObject.has("isDigitalAnalyticsEnabled") && !jSONObject.isNull("isDigitalAnalyticsEnabled")) {
                this.isDigitalAnalyticsEnabled = jSONObject.getBoolean("isDigitalAnalyticsEnabled");
            }
            if (jSONObject.has("mecIntegrationId") && !jSONObject.isNull("mecIntegrationId")) {
                this.mecIntegrationId = jSONObject.getString("mecIntegrationId");
            }
            if (jSONObject.has("accountId") && !jSONObject.isNull("accountId")) {
                this.accountId = Integer.valueOf(jSONObject.getInt("accountId"));
            }
            if (!jSONObject.has("propertyType") || jSONObject.isNull("propertyType")) {
                return;
            }
            this.propertyType = jSONObject.getString("propertyType");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
