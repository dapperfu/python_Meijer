package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class v extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EditableCardView f126667a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(EditableCardView editableCardView) {
        super(0);
        this.f126667a = editableCardView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        EditableCardView editableCardView;
        CardsCarouselView.Listener listener;
        EditableCardData editableCardData = this.f126667a.f126576b;
        if (editableCardData != null && (listener = (editableCardView = this.f126667a).getListener()) != null) {
            listener.onEditableFieldFinishedEditing(editableCardData, editableCardView.f126579e);
        }
        return Unit.f143329a;
    }
}
