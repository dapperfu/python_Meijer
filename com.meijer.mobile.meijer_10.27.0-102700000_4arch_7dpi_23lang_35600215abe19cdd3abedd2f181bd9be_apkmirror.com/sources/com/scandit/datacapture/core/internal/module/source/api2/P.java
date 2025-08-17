package com.scandit.datacapture.core.internal.module.source.api2;

import android.util.Range;
import kotlin.ranges.ClosedRange;

/* loaded from: classes11.dex */
public final class P implements ClosedRange {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Range f124856a;

    public P(Range range) {
        this.f124856a = range;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return this.f124856a.getUpper();
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return this.f124856a.getLower();
    }

    public final boolean contains(Comparable comparable) {
        return ClosedRange.DefaultImpls.a(this, comparable);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return ClosedRange.DefaultImpls.b(this);
    }
}
