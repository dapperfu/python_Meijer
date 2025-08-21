package com.radiusnetworks.flybuy.sdk.pickup.helper;

import com.radiusnetworks.flybuy.sdk.pickup.data.LocationFilter;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes12.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Integer.valueOf(((LocationFilter) obj).getProximityToSite()), Integer.valueOf(((LocationFilter) obj2).getProximityToSite()));
    }
}
