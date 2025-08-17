package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125694a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CardsCarouselView cardsCarouselView) {
        super(0);
        this.f125694a = cardsCarouselView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125694a.f125588l = false;
        this.f125694a.f125587k.setVisibility(8);
        this.f125694a.f125586j.setVisibility(0);
        return Unit.f142422a;
    }
}
