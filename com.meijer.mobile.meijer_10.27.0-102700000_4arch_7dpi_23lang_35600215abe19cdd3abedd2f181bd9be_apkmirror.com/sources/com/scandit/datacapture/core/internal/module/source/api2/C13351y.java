package com.scandit.datacapture.core.internal.module.source.api2;

import android.util.Size;
import java.util.Comparator;
import kotlin.comparisons.ComparisonsKt;

/* renamed from: com.scandit.datacapture.core.internal.module.source.api2.y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13351y implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Size size = (Size) obj;
        Size size2 = (Size) obj2;
        return ComparisonsKt.d(Integer.valueOf(size.getHeight() * size.getWidth()), Integer.valueOf(size2.getHeight() * size2.getWidth()));
    }
}
