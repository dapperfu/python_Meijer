package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class FormConfigurations {
    private ArrayList<String> feedbackPayloadExcludedTypes;
    private ArrayList<String> feedbackPayloadTypes;
    private boolean formsIterativeLoadingEnabled;
    private boolean inheritOrientation;
    private boolean isCloseFormQuarantine;
    private boolean isPinchGestureEnabled;
    private Long loadFormIndicatorDelay;
    private long loadingIndicatorTimeout;
    private int maxFontSize;
    private int minFontSize;
    private ArrayList<String> redirectLinks;
    private boolean showUnavailableForms;
    private boolean vulnEnabled;

    protected FormConfigurations(Long l10, ArrayList<String> arrayList) {
        this.loadFormIndicatorDelay = l10;
        this.feedbackPayloadTypes = arrayList;
    }

    protected ArrayList<String> getFeedbackPayloadExcludedTypes() {
        return this.feedbackPayloadExcludedTypes;
    }

    protected ArrayList<String> getFeedbackPayloadTypes() {
        return this.feedbackPayloadTypes;
    }

    protected Long getLoadFormIndicatorDelay() {
        return this.loadFormIndicatorDelay;
    }

    public long getLoadingIndicatorTimeout() {
        return this.loadingIndicatorTimeout;
    }

    public int getMaxFontSize() {
        return this.maxFontSize;
    }

    public int getMinFontSize() {
        return this.minFontSize;
    }

    public ArrayList<String> getRedirectLinks() {
        return this.redirectLinks;
    }

    protected boolean isCloseFormQuarantine() {
        return this.isCloseFormQuarantine;
    }

    protected boolean isFormsIterativeLoadingEnabled() {
        return this.formsIterativeLoadingEnabled;
    }

    protected boolean isInheritOrientation() {
        return this.inheritOrientation;
    }

    public boolean isPinchGestureEnabled() {
        return this.isPinchGestureEnabled;
    }

    public boolean isShowUnavailableForms() {
        return this.showUnavailableForms;
    }

    protected boolean isVulnEnabled() {
        return this.vulnEnabled;
    }

    protected String toJsonString() {
        return "{\"loadFormIndicatorDelay\":" + this.loadFormIndicatorDelay + ",\"feedbackPayloadTypes\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.feedbackPayloadTypes) + ",\"feedbackPayloadExcludedTypes\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.feedbackPayloadExcludedTypes) + ",\"vulnEnabled\":" + this.vulnEnabled + ",\"inheritOrientation\":" + this.inheritOrientation + ",\"redirectLinks\":" + ModelFactory.getInstance().getStringArrayAsJsonString(this.redirectLinks) + ",\"isPinchGestureEnabled\":" + this.isPinchGestureEnabled + ",\"minFontSize\":" + this.minFontSize + ",\"maxFontSize\":" + this.maxFontSize + ",\"showUnavailableForms\":" + this.showUnavailableForms + ",\"loadingIndicatorTimeout\":" + this.loadingIndicatorTimeout + ",\"isCloseFormQuarantine\":" + this.isCloseFormQuarantine + ",\"formsIterativeLoadingEnabled\":" + this.formsIterativeLoadingEnabled + "}";
    }

    protected FormConfigurations(Long l10, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.loadFormIndicatorDelay = l10;
        this.feedbackPayloadTypes = arrayList;
        this.feedbackPayloadExcludedTypes = arrayList2;
    }

    FormConfigurations(JSONObject jSONObject) {
        try {
            if (jSONObject.has("loadFormIndicatorDelay") && !jSONObject.isNull("loadFormIndicatorDelay")) {
                this.loadFormIndicatorDelay = Long.valueOf(jSONObject.getLong("loadFormIndicatorDelay"));
            }
            if (jSONObject.has("feedbackPayloadTypes") && !jSONObject.isNull("feedbackPayloadTypes")) {
                this.feedbackPayloadTypes = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("feedbackPayloadTypes"));
            }
            if (jSONObject.has("feedbackPayloadExcludedTypes") && !jSONObject.isNull("feedbackPayloadExcludedTypes")) {
                this.feedbackPayloadExcludedTypes = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("feedbackPayloadExcludedTypes"));
            }
            if (jSONObject.has("vulnEnabled") && !jSONObject.isNull("vulnEnabled")) {
                this.vulnEnabled = jSONObject.getBoolean("vulnEnabled");
            }
            if (jSONObject.has("inheritOrientation") && !jSONObject.isNull("inheritOrientation")) {
                this.inheritOrientation = jSONObject.getBoolean("inheritOrientation");
            }
            if (jSONObject.has("redirectLinks") && !jSONObject.isNull("redirectLinks")) {
                this.redirectLinks = ModelFactory.getInstance().getStringArray(jSONObject.getJSONArray("redirectLinks"));
            }
            if (jSONObject.has("isPinchGestureEnabled") && !jSONObject.isNull("isPinchGestureEnabled")) {
                this.isPinchGestureEnabled = jSONObject.getBoolean("isPinchGestureEnabled");
            }
            if (jSONObject.has("minFontSize") && !jSONObject.isNull("minFontSize")) {
                this.minFontSize = jSONObject.getInt("minFontSize");
            }
            if (jSONObject.has("maxFontSize") && !jSONObject.isNull("maxFontSize")) {
                this.maxFontSize = jSONObject.getInt("maxFontSize");
            }
            if (jSONObject.has("showUnavailableForms") && !jSONObject.isNull("showUnavailableForms")) {
                this.showUnavailableForms = jSONObject.getBoolean("showUnavailableForms");
            }
            if (jSONObject.has("loadingIndicatorTimeout") && !jSONObject.isNull("loadingIndicatorTimeout")) {
                this.loadingIndicatorTimeout = jSONObject.getLong("loadingIndicatorTimeout");
            }
            if (jSONObject.has("isCloseFormQuarantine") && !jSONObject.isNull("isCloseFormQuarantine")) {
                this.isCloseFormQuarantine = jSONObject.getBoolean("isCloseFormQuarantine");
            }
            if (!jSONObject.has("formsIterativeLoadingEnabled") || jSONObject.isNull("formsIterativeLoadingEnabled")) {
                return;
            }
            this.formsIterativeLoadingEnabled = jSONObject.getBoolean("formsIterativeLoadingEnabled");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }
}
