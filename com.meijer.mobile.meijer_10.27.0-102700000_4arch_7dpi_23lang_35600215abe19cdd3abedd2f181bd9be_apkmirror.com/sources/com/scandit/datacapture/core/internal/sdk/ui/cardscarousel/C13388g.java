package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.widget.EditText;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13388g implements CardsCarouselView.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125687a;

    public C13388g(CardsCarouselView cardsCarouselView) {
        this.f125687a = cardsCarouselView;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final Integer iconResForTextChange(String oldText, String newText) {
        Intrinsics.j(oldText, "oldText");
        Intrinsics.j(newText, "newText");
        CardsCarouselView.Listener listener = this.f125687a.getListener();
        if (listener != null) {
            return listener.iconResForTextChange(oldText, newText);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardIconTapped(CardData cardData, Integer num, String str) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener listener = this.f125687a.getListener();
        if (listener != null) {
            listener.onCardIconTapped(cardData, num, str);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardTapped(CardData cardData) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener listener = this.f125687a.getListener();
        if (listener != null) {
            listener.onCardTapped(cardData);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldFinishedEditing(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f125687a.getListener();
        if (listener != null) {
            listener.onEditableFieldFinishedEditing(cardData, editText);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldTapped(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f125687a.getListener();
        if (listener != null) {
            listener.onEditableFieldTapped(cardData, editText);
        }
    }
}
