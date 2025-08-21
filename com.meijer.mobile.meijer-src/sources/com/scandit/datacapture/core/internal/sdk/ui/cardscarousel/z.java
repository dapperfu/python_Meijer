package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.widget.EditText;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class z implements CardsCarouselView.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackedCardsView f126672a;

    public z(StackedCardsView stackedCardsView) {
        this.f126672a = stackedCardsView;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final Integer iconResForTextChange(String oldText, String newText) {
        Intrinsics.j(oldText, "oldText");
        Intrinsics.j(newText, "newText");
        CardsCarouselView.Listener cardEventListener = this.f126672a.getCardEventListener();
        if (cardEventListener != null) {
            return cardEventListener.iconResForTextChange(oldText, newText);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardIconTapped(CardData cardData, Integer num, String str) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener cardEventListener = this.f126672a.getCardEventListener();
        if (cardEventListener != null) {
            cardEventListener.onCardIconTapped(cardData, num, str);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardTapped(CardData cardData) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener cardEventListener = this.f126672a.getCardEventListener();
        if (cardEventListener != null) {
            cardEventListener.onCardTapped(cardData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldFinishedEditing(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener cardEventListener = this.f126672a.getCardEventListener();
        if (cardEventListener != null) {
            cardEventListener.onEditableFieldFinishedEditing(cardData, editText);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldTapped(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener cardEventListener = this.f126672a.getCardEventListener();
        if (cardEventListener != null) {
            cardEventListener.onEditableFieldTapped(cardData, editText);
        }
    }
}
