package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f125806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f125808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, View view) {
        super(1);
        this.f125806a = trackedObjectAdvancedOverlay;
        this.f125807b = obj;
        this.f125808c = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f125806a.getAugmenter().setViewForTrackedObject(this.f125807b, this.f125808c);
        return Unit.f142422a;
    }
}
