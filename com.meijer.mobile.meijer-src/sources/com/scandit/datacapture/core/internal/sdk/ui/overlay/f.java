package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class f extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TrackedObjectAdvancedOverlay f126758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f126759b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f126760c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TrackedObjectAdvancedOverlay trackedObjectAdvancedOverlay, Object obj, View view) {
        super(1);
        this.f126758a = trackedObjectAdvancedOverlay;
        this.f126759b = obj;
        this.f126760c = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TrackedObjectAdvancedOverlay it = (TrackedObjectAdvancedOverlay) obj;
        Intrinsics.j(it, "it");
        this.f126758a.getAugmenter().setViewForTrackedObject(this.f126759b, this.f126760c);
        return Unit.f143329a;
    }
}
