package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f126752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Anchor f126754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, Anchor anchor) {
        super(1);
        this.f126752a = trackedObjectAdvancedOverlay;
        this.f126753b = obj;
        this.f126754c = anchor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f126752a.getAugmenter().setAnchorForTrackedObject(this.f126753b, this.f126754c);
        return Unit.f143329a;
    }
}
