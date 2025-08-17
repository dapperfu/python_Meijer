package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class MedalliaDigitalClientConfigurationContract extends e0 {
    private long accessTokenValidationBufferTime;
    private Boolean blockNetworkInForm;
    private r1 digitalAnalyticsConfigurationContract;
    private String getConfigEndPoint;
    private Integer httpRequestTimeout;
    private b5 mediaCaptureConfiguration;
    private String ocqCUuidUrlPrefix;
    private String quarantineValidationEndpoint;
    private w4 serverHttpRequestsConfiguration;
    private String submitUrlPrefix;
    private String submitUrlSuffix;

    MedalliaDigitalClientConfigurationContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("serverHttpRequestsConfiguration") && !jSONObject.isNull("serverHttpRequestsConfiguration")) {
                this.serverHttpRequestsConfiguration = new w4(jSONObject.getJSONObject("serverHttpRequestsConfiguration"));
            }
            if (jSONObject.has("httpRequestTimeout") && !jSONObject.isNull("httpRequestTimeout")) {
                this.httpRequestTimeout = Integer.valueOf(jSONObject.getInt("httpRequestTimeout"));
            }
            if (jSONObject.has("getConfigEndPoint") && !jSONObject.isNull("getConfigEndPoint")) {
                this.getConfigEndPoint = jSONObject.getString("getConfigEndPoint");
            }
            if (jSONObject.has("submitUrlPrefix") && !jSONObject.isNull("submitUrlPrefix")) {
                this.submitUrlPrefix = jSONObject.getString("submitUrlPrefix");
            }
            if (jSONObject.has("submitUrlSuffix") && !jSONObject.isNull("submitUrlSuffix")) {
                this.submitUrlSuffix = jSONObject.getString("submitUrlSuffix");
            }
            if (jSONObject.has("blockNetworkInForm") && !jSONObject.isNull("blockNetworkInForm")) {
                this.blockNetworkInForm = Boolean.valueOf(jSONObject.getBoolean("blockNetworkInForm"));
            }
            if (jSONObject.has("accessTokenValidationBufferTime") && !jSONObject.isNull("accessTokenValidationBufferTime")) {
                this.accessTokenValidationBufferTime = jSONObject.getLong("accessTokenValidationBufferTime");
            }
            if (jSONObject.has("digitalAnalyticsConfigurationContract") && !jSONObject.isNull("digitalAnalyticsConfigurationContract")) {
                this.digitalAnalyticsConfigurationContract = new r1(jSONObject.getJSONObject("digitalAnalyticsConfigurationContract"));
            }
            if (jSONObject.has("mediaCaptureConfiguration") && !jSONObject.isNull("mediaCaptureConfiguration")) {
                this.mediaCaptureConfiguration = new b5(jSONObject.getJSONObject("mediaCaptureConfiguration"));
            }
            if (jSONObject.has("quarantineValidationEndpoint") && !jSONObject.isNull("quarantineValidationEndpoint")) {
                this.quarantineValidationEndpoint = jSONObject.getString("quarantineValidationEndpoint");
            }
            if (!jSONObject.has("ocqCuuidUrlPrefix") || jSONObject.isNull("ocqCuuidUrlPrefix")) {
                return;
            }
            this.ocqCUuidUrlPrefix = jSONObject.getString("ocqCuuidUrlPrefix");
        } catch (JSONException e10) {
            a4.c(e10.getMessage());
        }
    }

    protected long getAccessTokenValidationBufferTime() {
        return this.accessTokenValidationBufferTime;
    }

    public Boolean getBlockNetworkInForm() {
        return this.blockNetworkInForm;
    }

    r1 getDigitalAnalyticsConfigurationContract() {
        return this.digitalAnalyticsConfigurationContract;
    }

    protected String getGetConfigEndPoint() {
        return this.getConfigEndPoint;
    }

    protected Integer getHttpRequestTimeout() {
        return this.httpRequestTimeout;
    }

    public b5 getMediaCaptureConfiguration() {
        return this.mediaCaptureConfiguration;
    }

    public String getOcqCUuidUrlPrefix() {
        return this.ocqCUuidUrlPrefix;
    }

    public String getQuarantineValidationEndpoint() {
        return this.quarantineValidationEndpoint;
    }

    protected w4 getServerHttpRequestsConfiguration() {
        return this.serverHttpRequestsConfiguration;
    }

    public String getSubmitUrlPrefix() {
        return this.submitUrlPrefix;
    }

    public String getSubmitUrlSuffix() {
        return this.submitUrlSuffix;
    }

    protected String toJsonString() {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{\"serverHttpRequestsConfiguration\":");
            w4 w4Var = this.serverHttpRequestsConfiguration;
            String strI = com.google.maps.android.BuildConfig.TRAVIS;
            sb2.append(w4Var == null ? com.google.maps.android.BuildConfig.TRAVIS : w4Var.i());
            sb2.append(",\"httpRequestTimeout\":");
            sb2.append(this.httpRequestTimeout);
            sb2.append(",\"getConfigEndPoint\":");
            sb2.append(l3.c(this.getConfigEndPoint));
            sb2.append(",\"submitUrlPrefix\":");
            sb2.append(l3.c(this.submitUrlPrefix));
            sb2.append(",\"submitUrlSuffix\":");
            sb2.append(l3.c(this.submitUrlSuffix));
            sb2.append(",\"blockNetworkInForm\":");
            sb2.append(this.blockNetworkInForm);
            sb2.append(",\"accessTokenValidationBufferTime\":");
            sb2.append(this.accessTokenValidationBufferTime);
            sb2.append(",\"digitalAnalyticsConfigurationContract\":");
            r1 r1Var = this.digitalAnalyticsConfigurationContract;
            sb2.append(r1Var == null ? com.google.maps.android.BuildConfig.TRAVIS : r1Var.e());
            sb2.append(",\"mediaCaptureConfiguration\":");
            b5 b5Var = this.mediaCaptureConfiguration;
            if (b5Var != null) {
                strI = b5Var.i();
            }
            sb2.append(strI);
            sb2.append(",\"quarantineValidationEndpoint\":");
            sb2.append(l3.c(this.quarantineValidationEndpoint));
            sb2.append(",\"ocqCuuidUrlPrefix\":");
            sb2.append(l3.c(this.ocqCUuidUrlPrefix));
            sb2.append("}");
            return sb2.toString();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return "";
        }
    }
}
