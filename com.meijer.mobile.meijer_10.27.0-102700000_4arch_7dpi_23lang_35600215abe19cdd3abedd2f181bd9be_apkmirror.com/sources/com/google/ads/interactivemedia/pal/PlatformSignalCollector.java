package com.google.ads.interactivemedia.pal;

import Td.AbstractC5232j;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public interface PlatformSignalCollector {
    AbstractC5232j<Map<String, String>> collectSignals(Context context, ExecutorService executorService);
}
