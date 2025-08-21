package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f126751a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay) {
        super(1);
        this.f126751a = trackedObjectAdvancedOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f126751a.getAugmenter().clearAugmentations();
        return Unit.f143329a;
    }
}
