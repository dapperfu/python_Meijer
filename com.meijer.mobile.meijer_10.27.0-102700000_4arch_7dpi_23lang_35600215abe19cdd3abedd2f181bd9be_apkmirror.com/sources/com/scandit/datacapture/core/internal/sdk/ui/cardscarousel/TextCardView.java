package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.content.Context;
import android.os.Build;
import android.text.StaticLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fullstory.FS;
import com.scandit.datacapture.core.R;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardsCarouselView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nB#\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/TextCardView;", "Landroid/widget/FrameLayout;", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/TextCardData;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cardData", "", "setCardData", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/TextCardData;)V", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "getListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "setListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;)V", "listener", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class TextCardView extends FrameLayout implements CardSubView<TextCardData> {

    @Deprecated
    public static final int CONTENT_TEXT_MAX_TEXT_SIZE_SP = 12;

    @Deprecated
    public static final int CONTENT_TEXT_MIN_TEXT_SIZE_SP = 9;

    @Deprecated
    public static final int CONTENT_TEXT_STEP_TEXT_SIZE_SP = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CardsCarouselView.Listener listener;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f125676b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f125677c;

    /* renamed from: d, reason: collision with root package name */
    private final ImageView f125678d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f125679e;

    /* renamed from: f, reason: collision with root package name */
    private int f125680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextCardView(Context context) {
        super(context);
        Intrinsics.j(context, "context");
        this.f125680f = -1;
        LayoutInflater.from(getContext()).inflate(R.layout.sc_card_carousel_text_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.contentText);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f125677c = textView;
        View viewFindViewById2 = findViewById(R.id.titleText);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f125676b = textView2;
        textView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.J
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                TextCardView.a(this.f125651a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(9, 12, 1, 2);
        }
        View viewFindViewById3 = findViewById(R.id.imageView);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.f125678d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.iconImageView);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.f125679e = (ImageView) viewFindViewById4;
        setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextCardView.a(this.f125652a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TextCardView this$0, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.j(this$0, "this$0");
        if (this$0.f125676b.getWidth() != this$0.f125680f) {
            this$0.f125680f = this$0.f125676b.getWidth();
            this$0.a(this$0.f125677c.getText());
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView
    public CardsCarouselView.Listener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView
    public void setCardData(TextCardData cardData) {
        Intrinsics.j(cardData, "cardData");
        this.f125676b.setText(cardData.getTitle());
        a(cardData.getContent());
        setContentDescription(cardData.getContentDescription());
        if (cardData.getImage() != null) {
            this.f125678d.setImageBitmap(cardData.getImage());
        } else {
            FS.Resources_setImageResource(this.f125678d, R.drawable.sc_single_scan);
        }
        if (cardData.getIconRes() == null) {
            this.f125679e.setVisibility(4);
        } else {
            FS.Resources_setImageResource(this.f125679e, cardData.getIconRes().intValue());
            this.f125679e.setVisibility(0);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView
    public void setListener(CardsCarouselView.Listener listener) {
        this.listener = listener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(TextCardView this$0, View view) {
        Intrinsics.j(this$0, "this$0");
        this$0.getClass();
    }

    private final void a(CharSequence charSequence) {
        this.f125677c.setText(charSequence);
        if (charSequence != null && charSequence.length() != 0) {
            this.f125677c.setVisibility(0);
            TextView textView = this.f125677c;
            TextView textView2 = this.f125676b;
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(textView2.getText(), 0, textView2.getText().length(), textView2.getPaint(), textView2.getWidth()).build();
            Intrinsics.i(staticLayoutBuild, "build(...)");
            textView.setMaxLines(staticLayoutBuild.getLineCount() <= 1 ? 2 : 1);
            return;
        }
        this.f125677c.setVisibility(8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        this.f125680f = -1;
        LayoutInflater.from(getContext()).inflate(R.layout.sc_card_carousel_text_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.contentText);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f125677c = textView;
        View viewFindViewById2 = findViewById(R.id.titleText);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f125676b = textView2;
        textView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.J
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                TextCardView.a(this.f125651a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(9, 12, 1, 2);
        }
        View viewFindViewById3 = findViewById(R.id.imageView);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.f125678d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.iconImageView);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.f125679e = (ImageView) viewFindViewById4;
        setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextCardView.a(this.f125652a, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextCardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.j(context, "context");
        this.f125680f = -1;
        LayoutInflater.from(getContext()).inflate(R.layout.sc_card_carousel_text_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.contentText);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f125677c = textView;
        View viewFindViewById2 = findViewById(R.id.titleText);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f125676b = textView2;
        textView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.J
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i102, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                TextCardView.a(this.f125651a, view, i102, i11, i12, i13, i14, i15, i16, i17);
            }
        });
        if (Build.VERSION.SDK_INT >= 26) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(9, 12, 1, 2);
        }
        View viewFindViewById3 = findViewById(R.id.imageView);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.f125678d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.iconImageView);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.f125679e = (ImageView) viewFindViewById4;
        setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.K
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TextCardView.a(this.f125652a, view);
            }
        });
    }
}
