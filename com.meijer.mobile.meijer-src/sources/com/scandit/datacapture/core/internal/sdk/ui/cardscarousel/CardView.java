package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;", "subView", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;)V", "cardData", "", "setCardData", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardData;)V", "updateSubView", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;)V", "", "getHasSubView", "()Z", "hasSubView", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CardView extends FrameLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static final Lazy f126520d = LazyKt.b(C13516b.f126634a);

    /* renamed from: e, reason: collision with root package name */
    private static final Lazy f126521e = LazyKt.b(C13515a.f126633a);

    /* renamed from: a, reason: collision with root package name */
    private CardSubView f126522a;

    /* renamed from: b, reason: collision with root package name */
    private CardData f126523b;

    /* renamed from: c, reason: collision with root package name */
    private final FrameLayout.LayoutParams f126524c;

    public /* synthetic */ CardView(Context context, CardSubView cardSubView, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : cardSubView);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardView$Companion;", "", "", "ELEVATION$delegate", "Lkotlin/Lazy;", "getELEVATION$scandit_capture_core", "()F", "ELEVATION", "", "BORDER_WIDTH$delegate", "getBORDER_WIDTH$scandit_capture_core", "()I", "BORDER_WIDTH", "DEFAULT_BORDER_COLOR", "I", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final int getBORDER_WIDTH$scandit_capture_core() {
            return ((Number) CardView.f126521e.getValue()).intValue();
        }

        public final float getELEVATION$scandit_capture_core() {
            return ((Number) CardView.f126520d.getValue()).floatValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardView(Context context, CardSubView<CardData> cardSubView) {
        super(context);
        Intrinsics.j(context, "context");
        this.f126522a = cardSubView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f126524c = layoutParams;
        setBackgroundResource(R.drawable.sc_item_card_background);
        Object obj = this.f126522a;
        View view = obj instanceof View ? (View) obj : null;
        if (view != null) {
            addView(view, layoutParams);
        }
    }

    public final boolean getHasSubView() {
        return this.f126522a != null;
    }

    public final void setCardData(CardData cardData) {
        Intrinsics.j(cardData, "cardData");
        this.f126523b = cardData;
        Drawable background = getBackground();
        Intrinsics.h(background, "null cannot be cast to non-null type android.graphics.drawable.RippleDrawable");
        Drawable drawableFindDrawableByLayerId = ((RippleDrawable) background).findDrawableByLayerId(android.R.id.background);
        Intrinsics.h(drawableFindDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) drawableFindDrawableByLayerId;
        gradientDrawable.setColor(cardData.getBackgroundColor());
        gradientDrawable.setStroke(INSTANCE.getBORDER_WIDTH$scandit_capture_core(), cardData.getShowError() ? cardData.getErrorColor() : -1);
        CardSubView cardSubView = this.f126522a;
        if (cardSubView != null) {
            cardSubView.setCardData(cardData);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void updateSubView(CardSubView<CardData> subView) {
        Object obj = this.f126522a;
        removeView(obj instanceof View ? (View) obj : null);
        this.f126522a = subView;
        View view = subView instanceof View ? (View) subView : null;
        if (view != null) {
            addView(view, this.f126524c);
        }
        CardData cardData = this.f126523b;
        if (cardData == null || subView == 0) {
            return;
        }
        subView.setCardData(cardData);
    }
}
