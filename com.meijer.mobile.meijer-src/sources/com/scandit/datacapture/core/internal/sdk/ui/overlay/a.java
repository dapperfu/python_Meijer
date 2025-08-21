package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Augmentation f126748a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedTrackedObjectAugmenter f126749b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Augmentation augmentation, AnimatedTrackedObjectAugmenter animatedTrackedObjectAugmenter) {
        super(0);
        this.f126748a = augmentation;
        this.f126749b = animatedTrackedObjectAugmenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup containerView = this.f126748a.getContainerView();
        if (containerView != null) {
            containerView.setVisibility(0);
        }
        this.f126749b.a(this.f126748a, Transformation.INSTANCE.getID());
        return Unit.f143329a;
    }
}
