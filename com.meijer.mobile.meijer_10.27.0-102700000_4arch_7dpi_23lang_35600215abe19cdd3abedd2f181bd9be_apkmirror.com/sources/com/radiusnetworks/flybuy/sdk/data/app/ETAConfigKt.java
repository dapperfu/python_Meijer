package com.radiusnetworks.flybuy.sdk.data.app;

import com.radiusnetworks.flybuy.api.model.ETASettings;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toETAConfig", "Lcom/radiusnetworks/flybuy/sdk/data/app/ETAConfig;", "Lcom/radiusnetworks/flybuy/api/model/ETASettings;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ETAConfigKt {
    public static final ETAConfig toETAConfig(ETASettings eTASettings) {
        Intrinsics.j(eTASettings, "<this>");
        if (eTASettings.getMinimumETACacheInterval() == null || eTASettings.getCacheFilterETASecondsMultiplier() == null) {
            return null;
        }
        Integer minimumETACacheInterval = eTASettings.getMinimumETACacheInterval();
        Intrinsics.g(minimumETACacheInterval);
        int iIntValue = minimumETACacheInterval.intValue();
        Double cacheFilterETASecondsMultiplier = eTASettings.getCacheFilterETASecondsMultiplier();
        Intrinsics.g(cacheFilterETASecondsMultiplier);
        return new ETAConfig(iIntValue, cacheFilterETASecondsMultiplier.doubleValue());
    }
}
