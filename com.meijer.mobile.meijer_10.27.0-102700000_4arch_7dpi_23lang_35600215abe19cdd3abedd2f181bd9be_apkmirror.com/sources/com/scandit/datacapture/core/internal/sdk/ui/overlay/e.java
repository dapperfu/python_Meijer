package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f125803a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125804b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointWithUnit f125805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, PointWithUnit pointWithUnit) {
        super(1);
        this.f125803a = trackedObjectAdvancedOverlay;
        this.f125804b = obj;
        this.f125805c = pointWithUnit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f125803a.getAugmenter().setOffsetForTrackedObject(this.f125804b, this.f125805c);
        return Unit.f142422a;
    }
}
