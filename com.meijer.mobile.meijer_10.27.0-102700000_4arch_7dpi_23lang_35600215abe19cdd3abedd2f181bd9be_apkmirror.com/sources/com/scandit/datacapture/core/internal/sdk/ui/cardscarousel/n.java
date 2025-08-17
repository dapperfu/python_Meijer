package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class n extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125695a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ExpandedCardsView f125696b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CardsCarouselView cardsCarouselView, ExpandedCardsView expandedCardsView) {
        super(1);
        this.f125695a = cardsCarouselView;
        this.f125696b = expandedCardsView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        if (this.f125695a.f125589m && this.f125696b.getVisibility() == 0) {
            this.f125695a.f125585i.setTranslationY(Math.max(0.0f, -iIntValue));
        }
        return Unit.f142422a;
    }
}
