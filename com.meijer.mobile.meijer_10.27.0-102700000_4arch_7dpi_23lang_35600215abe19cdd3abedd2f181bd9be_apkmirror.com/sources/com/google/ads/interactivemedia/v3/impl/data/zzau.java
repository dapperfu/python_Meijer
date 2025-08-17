package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;

/* loaded from: classes4.dex */
final class zzau extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final zzrp<String, Object> extraParams;
    private final boolean forceAndroidTvMode;
    private final zzrm<Integer> forceExperimentIds;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    private zzau(boolean z10, boolean z11, boolean z12, zzrm<Integer> zzrmVar, boolean z13, float f10, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, zzrp<String, Object> zzrpVar) {
        this.disableExperiments = z10;
        this.disableOnScreenDetection = z11;
        this.disableSkipFadeTransition = z12;
        this.forceExperimentIds = zzrmVar;
        this.useVideoElementMock = z13;
        this.videoElementMockDuration = f10;
        this.useTestStreamManager = z14;
        this.enableMonitorAppLifecycle = z15;
        this.forceTvMode = z16;
        this.forceAndroidTvMode = z17;
        this.ignoreStrictModeFalsePositives = z18;
        this.extraParams = zzrpVar;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    public boolean equals(Object obj) {
        zzrm<Integer> zzrmVar;
        zzrp<String, Object> zzrpVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TestingConfiguration) {
            TestingConfiguration testingConfiguration = (TestingConfiguration) obj;
            if (this.disableExperiments == testingConfiguration.disableExperiments() && this.disableOnScreenDetection == testingConfiguration.disableOnScreenDetection() && this.disableSkipFadeTransition == testingConfiguration.disableSkipFadeTransition() && ((zzrmVar = this.forceExperimentIds) != null ? zzrmVar.equals(testingConfiguration.forceExperimentIds()) : testingConfiguration.forceExperimentIds() == null) && this.useVideoElementMock == testingConfiguration.useVideoElementMock() && Float.floatToIntBits(this.videoElementMockDuration) == Float.floatToIntBits(testingConfiguration.videoElementMockDuration()) && this.useTestStreamManager == testingConfiguration.useTestStreamManager() && this.enableMonitorAppLifecycle == testingConfiguration.enableMonitorAppLifecycle() && this.forceTvMode == testingConfiguration.forceTvMode() && this.forceAndroidTvMode == testingConfiguration.forceAndroidTvMode() && this.ignoreStrictModeFalsePositives == testingConfiguration.ignoreStrictModeFalsePositives() && ((zzrpVar = this.extraParams) != null ? zzrpVar.equals(testingConfiguration.extraParams()) : testingConfiguration.extraParams() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public zzrp<String, Object> extraParams() {
        return this.extraParams;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceAndroidTvMode() {
        return this.forceAndroidTvMode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public zzrm<Integer> forceExperimentIds() {
        return this.forceExperimentIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }

    public int hashCode() {
        zzrm<Integer> zzrmVar = this.forceExperimentIds;
        int iHashCode = ((((((((((((((((zzrmVar == null ? 0 : zzrmVar.hashCode()) ^ (((((((true != this.disableExperiments ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.disableOnScreenDetection ? 1237 : 1231)) * 1000003) ^ (true != this.disableSkipFadeTransition ? 1237 : 1231)) * 1000003)) * 1000003) ^ (true != this.useVideoElementMock ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.videoElementMockDuration)) * 1000003) ^ (true != this.useTestStreamManager ? 1237 : 1231)) * 1000003) ^ (true != this.enableMonitorAppLifecycle ? 1237 : 1231)) * 1000003) ^ (true != this.forceTvMode ? 1237 : 1231)) * 1000003) ^ (true != this.forceAndroidTvMode ? 1237 : 1231)) * 1000003) ^ (true != this.ignoreStrictModeFalsePositives ? 1237 : 1231)) * 1000003;
        zzrp<String, Object> zzrpVar = this.extraParams;
        return iHashCode ^ (zzrpVar != null ? zzrpVar.hashCode() : 0);
    }

    public String toString() {
        zzrp<String, Object> zzrpVar = this.extraParams;
        return "TestingConfiguration{disableExperiments=" + this.disableExperiments + ", disableOnScreenDetection=" + this.disableOnScreenDetection + ", disableSkipFadeTransition=" + this.disableSkipFadeTransition + ", forceExperimentIds=" + String.valueOf(this.forceExperimentIds) + ", useVideoElementMock=" + this.useVideoElementMock + ", videoElementMockDuration=" + this.videoElementMockDuration + ", useTestStreamManager=" + this.useTestStreamManager + ", enableMonitorAppLifecycle=" + this.enableMonitorAppLifecycle + ", forceTvMode=" + this.forceTvMode + ", forceAndroidTvMode=" + this.forceAndroidTvMode + ", ignoreStrictModeFalsePositives=" + this.ignoreStrictModeFalsePositives + ", extraParams=" + String.valueOf(zzrpVar) + "}";
    }
}
