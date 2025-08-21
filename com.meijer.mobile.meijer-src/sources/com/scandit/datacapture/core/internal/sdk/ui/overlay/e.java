package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class e extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f126755a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PointWithUnit f126757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, PointWithUnit pointWithUnit) {
        super(1);
        this.f126755a = trackedObjectAdvancedOverlay;
        this.f126756b = obj;
        this.f126757c = pointWithUnit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f126755a.getAugmenter().setOffsetForTrackedObject(this.f126756b, this.f126757c);
        return Unit.f143329a;
    }
}
