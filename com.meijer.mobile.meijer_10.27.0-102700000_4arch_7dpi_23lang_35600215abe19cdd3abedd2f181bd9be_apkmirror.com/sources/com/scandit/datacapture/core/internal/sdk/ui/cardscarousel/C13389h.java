package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.widget.EditText;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13389h implements CardsCarouselView.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f125688a;

    public C13389h(CardsCarouselView cardsCarouselView) {
        this.f125688a = cardsCarouselView;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final Integer iconResForTextChange(String oldText, String newText) {
        Intrinsics.j(oldText, "oldText");
        Intrinsics.j(newText, "newText");
        CardsCarouselView.Listener listener = this.f125688a.getListener();
        if (listener != null) {
            return listener.iconResForTextChange(oldText, newText);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardIconTapped(CardData cardData, Integer num, String str) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener listener = this.f125688a.getListener();
        if (listener != null) {
            listener.onCardIconTapped(cardData, num, str);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardTapped(CardData cardData) {
        CardsCarouselView.Listener listener;
        Intrinsics.j(cardData, "cardData");
        if (this.f125688a.f125579c.size() > 1) {
            CardsCarouselView.UiListener uiListener = this.f125688a.getUiListener();
            if (uiListener != null) {
                uiListener.onTappedWhileCollapsed();
                return;
            }
            return;
        }
        CardData cardData2 = (CardData) CollectionsKt.u0(this.f125688a.f125579c);
        if (cardData2 == null || (listener = this.f125688a.getListener()) == null) {
            return;
        }
        listener.onCardTapped(cardData2);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldFinishedEditing(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f125688a.getListener();
        if (listener != null) {
            listener.onEditableFieldFinishedEditing(cardData, editText);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldTapped(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f125688a.getListener();
        if (listener != null) {
            listener.onEditableFieldTapped(cardData, editText);
        }
    }
}
