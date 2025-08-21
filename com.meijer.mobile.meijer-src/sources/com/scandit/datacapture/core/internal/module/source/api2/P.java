package com.scandit.datacapture.core.internal.module.source.api2;

import android.util.Range;
import kotlin.ranges.ClosedRange;

/* loaded from: classes12.dex */
public final class P implements ClosedRange {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Range f125808a;

    public P(Range range) {
        this.f125808a = range;
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getEndInclusive() {
        return this.f125808a.getUpper();
    }

    @Override // kotlin.ranges.ClosedRange
    public final Comparable getStart() {
        return this.f125808a.getLower();
    }

    public final boolean contains(Comparable comparable) {
        return ClosedRange.DefaultImpls.a(this, comparable);
    }

    @Override // kotlin.ranges.ClosedRange
    public final boolean isEmpty() {
        return ClosedRange.DefaultImpls.b(this);
    }
}
