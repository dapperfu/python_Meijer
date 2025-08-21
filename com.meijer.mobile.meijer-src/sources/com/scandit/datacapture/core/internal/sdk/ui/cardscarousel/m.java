package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f126646a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CardsCarouselView cardsCarouselView) {
        super(0);
        this.f126646a = cardsCarouselView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126646a.f126540l = false;
        this.f126646a.f126539k.setVisibility(8);
        this.f126646a.f126538j.setVisibility(0);
        return Unit.f143329a;
    }
}
