package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class ConfigurationContract extends e0 {
    ConfigurationUUID configurationUUID;
    KillStatus killStatus;
    y3 localization;
    PropertyConfigurationContract propertyConfiguration;
    SDKConfigurationContract sdkConfiguration;
    l7 targetEvaluatorContract;
    TargetRuleEngineContract targetRuleEngine;

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
    }

    protected ConfigurationUUID getConfigurationUUID() {
        return this.configurationUUID;
    }

    protected KillStatus getKillStatus() {
        return this.killStatus;
    }

    protected y3 getLocalization() {
        return this.localization;
    }

    protected PropertyConfigurationContract getPropertyConfiguration() {
        return this.propertyConfiguration;
    }

    protected SDKConfigurationContract getSdkConfiguration() {
        return this.sdkConfiguration;
    }

    protected l7 getTargetEvaluatorContract() {
        return this.targetEvaluatorContract;
    }

    protected TargetRuleEngineContract getTargetRuleEngine() {
        return this.targetRuleEngine;
    }

    protected String toJsonString() {
        try {
            String jsonString = com.google.maps.android.BuildConfig.TRAVIS;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"propertyConfiguration\":");
            PropertyConfigurationContract propertyConfigurationContract = this.propertyConfiguration;
            sb2.append(propertyConfigurationContract == null ? com.google.maps.android.BuildConfig.TRAVIS : propertyConfigurationContract.toJsonString());
            sb2.append(",\"configurationUUID\":");
            ConfigurationUUID configurationUUID = this.configurationUUID;
            sb2.append(configurationUUID == null ? com.google.maps.android.BuildConfig.TRAVIS : configurationUUID.toJsonString());
            sb2.append(",\"sdkConfiguration\":");
            SDKConfigurationContract sDKConfigurationContract = this.sdkConfiguration;
            sb2.append(sDKConfigurationContract == null ? com.google.maps.android.BuildConfig.TRAVIS : sDKConfigurationContract.toJsonString());
            sb2.append(",\"targetRuleEngine\":");
            TargetRuleEngineContract targetRuleEngineContract = this.targetRuleEngine;
            sb2.append(targetRuleEngineContract == null ? com.google.maps.android.BuildConfig.TRAVIS : targetRuleEngineContract.toJsonString());
            sb2.append(",\"killConfiguration\":");
            KillStatus killStatus = this.killStatus;
            sb2.append(killStatus == null ? com.google.maps.android.BuildConfig.TRAVIS : killStatus.toJsonString());
            sb2.append(",\"localization\":");
            y3 y3Var = this.localization;
            sb2.append(y3Var == null ? com.google.maps.android.BuildConfig.TRAVIS : y3Var.toJsonString());
            sb2.append(",\"targetEvaluatorContract\":");
            l7 l7Var = this.targetEvaluatorContract;
            if (l7Var != null) {
                jsonString = l7Var.toJsonString();
            }
            sb2.append(jsonString);
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract, KillStatus killStatus) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
        this.killStatus = killStatus;
    }

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, ConfigurationUUID configurationUUID, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract, KillStatus killStatus, y3 y3Var, l7 l7Var) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.configurationUUID = configurationUUID;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
        this.killStatus = killStatus;
        this.localization = y3Var;
        this.targetEvaluatorContract = l7Var;
    }

    protected ConfigurationContract(PropertyConfigurationContract propertyConfigurationContract, SDKConfigurationContract sDKConfigurationContract, TargetRuleEngineContract targetRuleEngineContract) {
        this.propertyConfiguration = propertyConfigurationContract;
        this.sdkConfiguration = sDKConfigurationContract;
        this.targetRuleEngine = targetRuleEngineContract;
    }

    ConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("propertyConfiguration") && !jSONObject.isNull("propertyConfiguration")) {
                this.propertyConfiguration = new PropertyConfigurationContract(jSONObject.getJSONObject("propertyConfiguration"));
            }
            if (jSONObject.has("configurationUUID") && !jSONObject.isNull("configurationUUID")) {
                this.configurationUUID = new ConfigurationUUID(jSONObject.getJSONObject("configurationUUID"));
            }
            if (jSONObject.has("sdkConfiguration") && !jSONObject.isNull("sdkConfiguration")) {
                this.sdkConfiguration = new SDKConfigurationContract(jSONObject.getJSONObject("sdkConfiguration"));
            }
            if (jSONObject.has("targetRuleEngine") && !jSONObject.isNull("targetRuleEngine")) {
                this.targetRuleEngine = new TargetRuleEngineContract(jSONObject.getJSONObject("targetRuleEngine"));
            }
            if (jSONObject.has("killConfiguration") && !jSONObject.isNull("killConfiguration")) {
                this.killStatus = new KillStatus(jSONObject.getJSONObject("killConfiguration"));
            }
            if (jSONObject.has("localization") && !jSONObject.isNull("localization")) {
                this.localization = new y3(jSONObject.getJSONObject("localization"));
            }
            if (!jSONObject.has("targetEvaluatorContract") || jSONObject.isNull("targetEvaluatorContract")) {
                return;
            }
            this.targetEvaluatorContract = new l7(jSONObject.getJSONObject("targetEvaluatorContract"));
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
