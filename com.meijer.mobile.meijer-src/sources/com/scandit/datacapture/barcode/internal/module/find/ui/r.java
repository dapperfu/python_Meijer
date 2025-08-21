package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;

/* loaded from: classes12.dex */
public final class r implements CardsCarouselView.UiListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f123226a;

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.UiListener
    public final void onAcceptScanButtonTapped() {
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.UiListener
    public final void onCancelScanButtonTapped() {
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.UiListener
    public final void onRestartScanButtonTapped() {
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.UiListener
    public final void onSwipedDownWhileExpanded() {
    }

    public r(u0 u0Var) {
        this.f123226a = u0Var;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.UiListener
    public final void onSwipedUpWhileCollapsed() {
        CardsCarouselView.setCollapsed$default(this.f123226a.f123241i, false, false, 2, null);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.UiListener
    public final void onTappedWhileCollapsed() {
        CardsCarouselView.setCollapsed$default(this.f123226a.f123241i, false, false, 2, null);
    }
}
