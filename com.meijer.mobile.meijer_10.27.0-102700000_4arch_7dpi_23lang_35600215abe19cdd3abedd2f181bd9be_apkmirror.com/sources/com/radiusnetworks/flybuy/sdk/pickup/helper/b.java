package com.radiusnetworks.flybuy.sdk.pickup.helper;

import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes11.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ComparisonsKt.d(Integer.valueOf(((com.radiusnetworks.flybuy.sdk.pickup.data.a) obj).f119988a), Integer.valueOf(((com.radiusnetworks.flybuy.sdk.pickup.data.a) obj2).f119988a));
    }
}
