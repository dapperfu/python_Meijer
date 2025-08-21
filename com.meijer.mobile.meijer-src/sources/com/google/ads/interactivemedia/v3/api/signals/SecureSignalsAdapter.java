package com.google.ads.interactivemedia.v3.api.signals;

import android.content.Context;
import com.google.ads.interactivemedia.v3.api.VersionInfo;

/* loaded from: classes4.dex */
public interface SecureSignalsAdapter {
    void collectSignals(Context context, SecureSignalsCollectSignalsCallback secureSignalsCollectSignalsCallback);

    VersionInfo getSDKVersion();

    VersionInfo getVersion();

    void initialize(Context context, SecureSignalsInitializeCallback secureSignalsInitializeCallback);
}
