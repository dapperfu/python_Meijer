package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.content.Context;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardData;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000e*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001\u000eJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0002\u0010\rR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;", "C", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;", "", "listener", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "getListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "setListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;)V", "setCardData", "", "cardData", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CardSubView<C extends CardData> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f126519a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J8\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0086\b¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView$Companion;", "", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;", "C", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "cardData", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;", "create", "(Landroid/content/Context;Ljava/lang/Class;)Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f126519a = new Companion();

        public final /* synthetic */ <C extends CardData> CardSubView<C> create(Context context, Class<C> cardData) {
            Intrinsics.j(context, "context");
            Intrinsics.j(cardData, "cardData");
            if (Intrinsics.e(cardData, EditableCardData.class)) {
                return new EditableCardView(context, false, 2, null);
            }
            if (Intrinsics.e(cardData, TextCardData.class)) {
                return new TextCardView(context);
            }
            throw new IllegalStateException("Unsupported configuration type");
        }

        private Companion() {
        }
    }

    CardsCarouselView.Listener getListener();

    void setCardData(C cardData);

    void setListener(CardsCarouselView.Listener listener);
}
