package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.widget.EditText;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13521g implements CardsCarouselView.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f126639a;

    public C13521g(CardsCarouselView cardsCarouselView) {
        this.f126639a = cardsCarouselView;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final Integer iconResForTextChange(String oldText, String newText) {
        Intrinsics.j(oldText, "oldText");
        Intrinsics.j(newText, "newText");
        CardsCarouselView.Listener listener = this.f126639a.getListener();
        if (listener != null) {
            return listener.iconResForTextChange(oldText, newText);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardIconTapped(CardData cardData, Integer num, String str) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener listener = this.f126639a.getListener();
        if (listener != null) {
            listener.onCardIconTapped(cardData, num, str);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardTapped(CardData cardData) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener listener = this.f126639a.getListener();
        if (listener != null) {
            listener.onCardTapped(cardData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldFinishedEditing(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f126639a.getListener();
        if (listener != null) {
            listener.onEditableFieldFinishedEditing(cardData, editText);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldTapped(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f126639a.getListener();
        if (listener != null) {
            listener.onEditableFieldTapped(cardData, editText);
        }
    }
}
