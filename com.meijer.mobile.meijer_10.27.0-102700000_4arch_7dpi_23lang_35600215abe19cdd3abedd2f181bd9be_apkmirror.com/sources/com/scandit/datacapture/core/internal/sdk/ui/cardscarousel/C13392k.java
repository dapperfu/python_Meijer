package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13392k extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125691a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f125692b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13392k(CardsCarouselView cardsCarouselView, Function0 function0) {
        super(0);
        this.f125691a = cardsCarouselView;
        this.f125692b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125691a.f125588l = true;
        if (this.f125691a.getButtonBarSettings().buttonBarVisibilityCanChange()) {
            this.f125691a.f125585i.setVisibility(this.f125691a.getButtonBarSettings().buttonBarVisibility(false));
        }
        this.f125692b.invoke();
        return Unit.f142422a;
    }
}
