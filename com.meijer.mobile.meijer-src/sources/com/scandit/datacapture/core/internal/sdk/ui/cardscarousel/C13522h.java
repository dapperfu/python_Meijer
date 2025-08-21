package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.widget.EditText;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13522h implements CardsCarouselView.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselView f126640a;

    public C13522h(CardsCarouselView cardsCarouselView) {
        this.f126640a = cardsCarouselView;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final Integer iconResForTextChange(String oldText, String newText) {
        Intrinsics.j(oldText, "oldText");
        Intrinsics.j(newText, "newText");
        CardsCarouselView.Listener listener = this.f126640a.getListener();
        if (listener != null) {
            return listener.iconResForTextChange(oldText, newText);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardIconTapped(CardData cardData, Integer num, String str) {
        Intrinsics.j(cardData, "cardData");
        CardsCarouselView.Listener listener = this.f126640a.getListener();
        if (listener != null) {
            listener.onCardIconTapped(cardData, num, str);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onCardTapped(CardData cardData) {
        CardsCarouselView.Listener listener;
        Intrinsics.j(cardData, "cardData");
        if (this.f126640a.f126531c.size() > 1) {
            CardsCarouselView.UiListener uiListener = this.f126640a.getUiListener();
            if (uiListener != null) {
                uiListener.onTappedWhileCollapsed();
                return;
            }
            return;
        }
        CardData cardData2 = (CardData) CollectionsKt.u0(this.f126640a.f126531c);
        if (cardData2 == null || (listener = this.f126640a.getListener()) == null) {
            return;
        }
        listener.onCardTapped(cardData2);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldFinishedEditing(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f126640a.getListener();
        if (listener != null) {
            listener.onEditableFieldFinishedEditing(cardData, editText);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView.Listener
    public final void onEditableFieldTapped(CardData cardData, EditText editText) {
        Intrinsics.j(cardData, "cardData");
        Intrinsics.j(editText, "editText");
        CardsCarouselView.Listener listener = this.f126640a.getListener();
        if (listener != null) {
            listener.onEditableFieldTapped(cardData, editText);
        }
    }
}
