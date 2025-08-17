package com.scandit.datacapture.core.internal.module.source.api2;

import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: classes11.dex */
public final class L implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt.d(Integer.valueOf(size.getWidth() * size.getHeight()), Integer.valueOf(size2.getWidth() * size2.getHeight()));
    }
}
