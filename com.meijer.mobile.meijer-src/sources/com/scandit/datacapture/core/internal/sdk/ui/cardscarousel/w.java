package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class w extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExpandedCardsView f126668a;

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    public w(ExpandedCardsView expandedCardsView) {
        this.f126668a = expandedCardsView;
    }

    public static final void a(ExpandedCardsView this$0, View view) {
        int positionForView;
        Intrinsics.j(this$0, "this$0");
        CardsCarouselView.Listener cardEventListener = this$0.getCardEventListener();
        if (cardEventListener == null || (positionForView = this$0.getPositionForView(view)) == -1) {
            return;
        }
        cardEventListener.onCardTapped((CardData) this$0.f126589c.get(positionForView));
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f126668a.f126589c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        return this.f126668a.f126589c.get(i10);
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup container) {
        CardSubView textCardView;
        Intrinsics.j(container, "container");
        Object obj = this.f126668a.f126589c.get(i10);
        Intrinsics.h(obj, "null cannot be cast to non-null type com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardData");
        CardData cardData = (CardData) obj;
        CardView cardView = view instanceof CardView ? (CardView) view : null;
        if (cardView == null) {
            Context context = container.getContext();
            Intrinsics.i(context, "getContext(...)");
            CardSubView.Companion companion = CardSubView.INSTANCE;
            Context context2 = this.f126668a.getContext();
            Intrinsics.i(context2, "getContext(...)");
            Class<?> cls = cardData.getClass();
            if (Intrinsics.e(cls, EditableCardData.class)) {
                textCardView = new EditableCardView(context2, false, 2, null);
            } else {
                if (!Intrinsics.e(cls, TextCardData.class)) {
                    throw new IllegalStateException("Unsupported configuration type");
                }
                textCardView = new TextCardView(context2);
            }
            textCardView.setListener(this.f126668a.f126592f);
            CardView cardView2 = new CardView(context, textCardView);
            final ExpandedCardsView expandedCardsView = this.f126668a;
            cardView2.setElevation(CardView.INSTANCE.getELEVATION$scandit_capture_core());
            cardView2.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.L
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    w.a(expandedCardsView, view2);
                }
            });
            cardView = cardView2;
        }
        ExpandedCardsView.access$bind(this.f126668a, cardView, cardData);
        return cardView;
    }
}
