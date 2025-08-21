package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.zzps;
import com.google.ads.interactivemedia.v3.internal.zzrm;
import com.google.ads.interactivemedia.v3.internal.zzrp;

@zzps(zza = zzau.class, zzb = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
/* loaded from: classes4.dex */
public abstract class TestingConfiguration {
    public static final String PARAMETER_KEY = "tcnfp";

    public interface Builder {
        TestingConfiguration build();

        Builder disableExperiments(boolean z10);

        Builder disableOnScreenDetection(boolean z10);

        Builder disableSkipFadeTransition(boolean z10);

        Builder enableMonitorAppLifecycle(boolean z10);

        Builder extraParams(zzrp<String, Object> zzrpVar);

        Builder forceAndroidTvMode(boolean z10);

        Builder forceExperimentIds(zzrm<Integer> zzrmVar);

        Builder forceTvMode(boolean z10);

        Builder ignoreStrictModeFalsePositives(boolean z10);

        Builder useTestStreamManager(boolean z10);

        Builder useVideoElementMock(boolean z10);

        Builder videoElementMockDuration(float f10);
    }

    TestingConfiguration() {
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract zzrp<String, Object> extraParams();

    public abstract boolean forceAndroidTvMode();

    public abstract zzrm<Integer> forceExperimentIds();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();

    public static Builder builder() {
        zzas zzasVar = new zzas();
        zzasVar.disableExperiments(true);
        zzasVar.disableOnScreenDetection(false);
        zzasVar.disableSkipFadeTransition(true);
        zzasVar.useVideoElementMock(false);
        zzasVar.videoElementMockDuration(30.0f);
        zzasVar.useTestStreamManager(false);
        zzasVar.ignoreStrictModeFalsePositives(false);
        zzasVar.forceTvMode(false);
        zzasVar.forceAndroidTvMode(false);
        zzasVar.forceExperimentIds(null);
        zzasVar.enableMonitorAppLifecycle(true);
        return zzasVar;
    }

    public Builder copy() {
        zzas zzasVar = new zzas();
        zzasVar.disableExperiments(disableExperiments());
        zzasVar.disableOnScreenDetection(disableOnScreenDetection());
        zzasVar.disableSkipFadeTransition(disableSkipFadeTransition());
        zzasVar.useVideoElementMock(useVideoElementMock());
        zzasVar.videoElementMockDuration(videoElementMockDuration());
        zzasVar.useTestStreamManager(useTestStreamManager());
        zzasVar.forceExperimentIds(forceExperimentIds());
        zzasVar.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        zzasVar.forceTvMode(forceTvMode());
        zzasVar.forceAndroidTvMode(forceAndroidTvMode());
        zzasVar.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        zzasVar.extraParams(extraParams());
        return zzasVar;
    }
}
