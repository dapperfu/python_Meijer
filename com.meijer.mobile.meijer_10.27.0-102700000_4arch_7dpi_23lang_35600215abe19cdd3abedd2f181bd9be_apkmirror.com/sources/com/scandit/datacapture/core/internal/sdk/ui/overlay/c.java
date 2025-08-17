package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f125799a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay) {
        super(1);
        this.f125799a = trackedObjectAdvancedOverlay;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f125799a.getAugmenter().clearAugmentations();
        return Unit.f142422a;
    }
}
