package com.radiusnetworks.flybuy.sdk.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/util/Averager;", "", "maxCount", "", "(I)V", "count", "<set-?>", "", "value", "getValue", "()F", "add", "", "newValue", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Averager {
    private int count;
    private final int maxCount;
    private float value;

    public final void add(float newValue) {
        float fMin = Math.min(this.count, this.maxCount - 1);
        this.value = ((this.value * fMin) + newValue) / (fMin + 1);
        this.count++;
    }

    public final float getValue() {
        return this.value;
    }

    public Averager(int i10) {
        this.maxCount = i10;
    }
}
