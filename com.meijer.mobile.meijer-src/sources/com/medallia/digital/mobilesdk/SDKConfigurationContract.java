package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class SDKConfigurationContract extends e0 {
    private CollectorsConfigurationContract collectorsConfigurations;
    private i eventsConfigurations;
    private JSONObject features;
    private FormConfigurations formConfigurations;
    private MedalliaDigitalBrainConfigurationContract medalliaDigitalBrain;
    private MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig;
    private t6 sdkVersionsContract;

    protected SDKConfigurationContract() {
    }

    protected CollectorsConfigurationContract getCollectorsConfigurations() {
        return this.collectorsConfigurations;
    }

    i getEventsConfigurations() {
        return this.eventsConfigurations;
    }

    public JSONObject getFeatures() {
        return this.features;
    }

    public FormConfigurations getFormConfigurations() {
        return this.formConfigurations;
    }

    protected MedalliaDigitalBrainConfigurationContract getMedalliaDigitalBrain() {
        return this.medalliaDigitalBrain;
    }

    public MedalliaDigitalClientConfigurationContract getMedalliaDigitalClientConfig() {
        return this.medalliaDigitalClientConfig;
    }

    protected t6 getSdkVersionsContract() {
        return this.sdkVersionsContract;
    }

    protected String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"collectorsConfigurations\":");
            CollectorsConfigurationContract collectorsConfigurationContract = this.collectorsConfigurations;
            String jsonString = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(collectorsConfigurationContract == null ? com.google.maps.android.BuildConfig.TRAVIS : collectorsConfigurationContract.toJsonString());
            sb2.append(",\"medalliaDigitalClientConfig\":");
            MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract = this.medalliaDigitalClientConfig;
            sb2.append(medalliaDigitalClientConfigurationContract == null ? com.google.maps.android.BuildConfig.TRAVIS : medalliaDigitalClientConfigurationContract.toJsonString());
            sb2.append(",\"medalliaDigitalBrain\":");
            MedalliaDigitalBrainConfigurationContract medalliaDigitalBrainConfigurationContract = this.medalliaDigitalBrain;
            sb2.append(medalliaDigitalBrainConfigurationContract == null ? com.google.maps.android.BuildConfig.TRAVIS : medalliaDigitalBrainConfigurationContract.toJsonString());
            sb2.append(",\"formConfigurations\":");
            FormConfigurations formConfigurations = this.formConfigurations;
            sb2.append(formConfigurations == null ? com.google.maps.android.BuildConfig.TRAVIS : formConfigurations.toJsonString());
            sb2.append(",\"analyticsEventsConfigurationContract\":");
            i iVar = this.eventsConfigurations;
            sb2.append(iVar == null ? com.google.maps.android.BuildConfig.TRAVIS : iVar.e());
            sb2.append(",\"features\":");
            JSONObject jSONObject = this.features;
            sb2.append(jSONObject == null ? com.google.maps.android.BuildConfig.TRAVIS : jSONObject.toString());
            sb2.append(",\"sdkVersionsContract\":");
            t6 t6Var = this.sdkVersionsContract;
            if (t6Var != null) {
                jsonString = t6Var.toJsonString();
            }
            sb2.append(jsonString);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    SDKConfigurationContract(CollectorsConfigurationContract collectorsConfigurationContract, MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract, MedalliaDigitalBrainConfigurationContract medalliaDigitalBrainConfigurationContract) {
        this.collectorsConfigurations = collectorsConfigurationContract;
        this.medalliaDigitalClientConfig = medalliaDigitalClientConfigurationContract;
        this.medalliaDigitalBrain = medalliaDigitalBrainConfigurationContract;
    }

    SDKConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("collectorsConfigurations") && !jSONObject.isNull("collectorsConfigurations")) {
                this.collectorsConfigurations = new CollectorsConfigurationContract(jSONObject.getJSONObject("collectorsConfigurations"));
            }
            if (jSONObject.has("medalliaDigitalClientConfig") && !jSONObject.isNull("medalliaDigitalClientConfig")) {
                this.medalliaDigitalClientConfig = new MedalliaDigitalClientConfigurationContract(jSONObject.getJSONObject("medalliaDigitalClientConfig"));
            }
            if (jSONObject.has("medalliaDigitalBrain") && !jSONObject.isNull("medalliaDigitalBrain")) {
                this.medalliaDigitalBrain = new MedalliaDigitalBrainConfigurationContract(jSONObject.getJSONObject("medalliaDigitalBrain"));
            }
            if (jSONObject.has("formConfigurations") && !jSONObject.isNull("formConfigurations")) {
                this.formConfigurations = new FormConfigurations(jSONObject.getJSONObject("formConfigurations"));
            }
            if (jSONObject.has("analyticsEventsConfigurationContract") && !jSONObject.isNull("analyticsEventsConfigurationContract")) {
                this.eventsConfigurations = new i(jSONObject.getJSONObject("analyticsEventsConfigurationContract"));
            }
            if (jSONObject.has("features") && !jSONObject.isNull("features")) {
                this.features = jSONObject.getJSONObject("features");
            }
            if (!jSONObject.has("sdkTerminationConfiguration") || jSONObject.isNull("sdkTerminationConfiguration")) {
                return;
            }
            this.sdkVersionsContract = new t6(jSONObject.getJSONObject("sdkTerminationConfiguration"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
