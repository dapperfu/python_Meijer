package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class r extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125702a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(CardsCarouselView cardsCarouselView) {
        super(0);
        this.f125702a = cardsCarouselView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CardsCarouselView.UiListener uiListener;
        if (this.f125702a.f125579c.size() > 1 && (uiListener = this.f125702a.getUiListener()) != null) {
            uiListener.onSwipedUpWhileCollapsed();
        }
        return Unit.f142422a;
    }
}
