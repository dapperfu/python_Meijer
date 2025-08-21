package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13525k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f126643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f126644b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13525k(CardsCarouselView cardsCarouselView, Function0 function0) {
        super(0);
        this.f126643a = cardsCarouselView;
        this.f126644b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126643a.f126540l = true;
        if (this.f126643a.getButtonBarSettings().buttonBarVisibilityCanChange()) {
            this.f126643a.f126537i.setVisibility(this.f126643a.getButtonBarSettings().buttonBarVisibility(false));
        }
        this.f126644b.invoke();
        return Unit.f143329a;
    }
}
