package com.google.ads.interactivemedia.pal;

import Vd.AbstractC5516j;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public interface PlatformSignalCollector {
    AbstractC5516j<Map<String, String>> collectSignals(Context context, ExecutorService executorService);
}
