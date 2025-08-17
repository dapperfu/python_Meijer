package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import com.scandit.datacapture.core.common.geometry.Anchor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f125800a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125801b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Anchor f125802c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, Anchor anchor) {
        super(1);
        this.f125800a = trackedObjectAdvancedOverlay;
        this.f125801b = obj;
        this.f125802c = anchor;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f125800a.getAugmenter().setAnchorForTrackedObject(this.f125801b, this.f125802c);
        return Unit.f142422a;
    }
}
