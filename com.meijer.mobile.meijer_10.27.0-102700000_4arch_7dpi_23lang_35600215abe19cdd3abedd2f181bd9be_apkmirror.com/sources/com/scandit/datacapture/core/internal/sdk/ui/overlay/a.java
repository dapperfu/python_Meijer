package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Augmentation f125796a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AnimatedTrackedObjectAugmenter f125797b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Augmentation augmentation, AnimatedTrackedObjectAugmenter animatedTrackedObjectAugmenter) {
        super(0);
        this.f125796a = augmentation;
        this.f125797b = animatedTrackedObjectAugmenter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ViewGroup containerView = this.f125796a.getContainerView();
        if (containerView != null) {
            containerView.setVisibility(0);
        }
        this.f125797b.a(this.f125796a, Transformation.INSTANCE.getID());
        return Unit.f142422a;
    }
}
