package com.scandit.datacapture.core.internal.sdk.ui.cardscarousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
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
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/EditableCardView;", "Landroid/widget/FrameLayout;", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardSubView;", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/EditableCardData;", "Landroid/content/Context;", "context", "", "useFlatLayout", "<init>", "(Landroid/content/Context;Z)V", "cardData", "", "setCardData", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/EditableCardData;)V", "takeFocus", "()V", "clearEditText", "finishEditing", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "a", "Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "getListener", "()Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;", "setListener", "(Lcom/scandit/datacapture/core/internal/sdk/ui/cardscarousel/CardsCarouselView$Listener;)V", "listener", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class EditableCardView extends FrameLayout implements CardSubView<EditableCardData> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private CardsCarouselView.Listener listener;

    /* renamed from: b, reason: collision with root package name */
    private EditableCardData f125624b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f125625c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f125626d;

    /* renamed from: e, reason: collision with root package name */
    private final ListenableEditText f125627e;

    /* renamed from: f, reason: collision with root package name */
    private final AnimatedGradientTextView f125628f;

    /* renamed from: g, reason: collision with root package name */
    private final ImageView f125629g;

    /* renamed from: h, reason: collision with root package name */
    private final ImageView f125630h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f125631i;

    /* renamed from: j, reason: collision with root package name */
    private final ColorBorderDrawable f125632j;

    public /* synthetic */ EditableCardView(Context context, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? false : z10);
    }

    private final void a() {
        this.f125627e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.F
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                EditableCardView.a(this.f125646a, view, z10);
            }
        });
        this.f125627e.addTextChangedListener(new TextWatcher() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.EditableCardView$setupListeners$2

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private String previousText = "";

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s10) {
            }

            public final String getPreviousText() {
                return this.previousText;
            }

            public final void setPreviousText(String str) {
                Intrinsics.j(str, "<set-?>");
                this.previousText = str;
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
                this.previousText = String.valueOf(s10);
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s10, int start, int before, int count) {
                Integer numIconResForTextChange;
                Unit unit;
                String strValueOf = String.valueOf(s10);
                CardsCarouselView.Listener listener = this.f125634b.getListener();
                if (listener != null) {
                    numIconResForTextChange = listener.iconResForTextChange(this.previousText, strValueOf);
                } else {
                    numIconResForTextChange = null;
                }
                if (!Intrinsics.e(this.f125634b.f125625c, numIconResForTextChange)) {
                    this.f125634b.f125625c = numIconResForTextChange;
                    if (numIconResForTextChange != null) {
                        FS.Resources_setImageResource(this.f125634b.f125630h, numIconResForTextChange.intValue());
                        unit = Unit.f142422a;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        this.f125634b.f125630h.setImageDrawable(null);
                    }
                }
            }
        });
        this.f125627e.setOnCloseKeyboardButtonTapped(new v(this));
        this.f125627e.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.G
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                return EditableCardView.a(this.f125647a, textView, i10, keyEvent);
            }
        });
        this.f125630h.setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.H
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EditableCardView.a(this.f125648a, view);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditableCardView(Context context, boolean z10) {
        super(context);
        Intrinsics.j(context, "context");
        this.f125632j = new ColorBorderDrawable();
        LayoutInflater.from(getContext()).inflate(z10 ? R.layout.sc_card_carousel_editable_item_flat : R.layout.sc_card_carousel_editable_item, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.titleText);
        Intrinsics.i(viewFindViewById, "findViewById(...)");
        this.f125626d = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.editText);
        Intrinsics.i(viewFindViewById2, "findViewById(...)");
        this.f125627e = (ListenableEditText) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.editTextHint);
        Intrinsics.i(viewFindViewById3, "findViewById(...)");
        this.f125628f = (AnimatedGradientTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.image_line);
        Intrinsics.i(viewFindViewById4, "findViewById(...)");
        this.f125629g = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.iconImageView);
        Intrinsics.i(viewFindViewById5, "findViewById(...)");
        this.f125630h = (ImageView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.errorText);
        Intrinsics.i(viewFindViewById6, "findViewById(...)");
        this.f125631i = (TextView) viewFindViewById6;
        a();
    }

    public final void clearEditText() {
        this.f125627e.setText("");
    }

    public final void finishEditing() {
        CardsCarouselView.Listener listener;
        EditableCardData editableCardData = this.f125624b;
        if (editableCardData == null || (listener = getListener()) == null) {
            return;
        }
        listener.onEditableFieldFinishedEditing(editableCardData, this.f125627e);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView
    public CardsCarouselView.Listener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView
    public void setCardData(EditableCardData cardData) {
        Intrinsics.j(cardData, "cardData");
        this.f125624b = cardData;
        this.f125625c = cardData.getIconRes();
        this.f125626d.setText(cardData.getTitle());
        setContentDescription(cardData.getContentDescription());
        this.f125627e.setHint(cardData.getHint());
        this.f125627e.setText(cardData.getText());
        this.f125627e.setInputType(cardData.getInputType());
        this.f125631i.setText(cardData.getErrorText());
        this.f125631i.setVisibility(!cardData.getShowError() ? 4 : 0);
        this.f125631i.setTextColor(cardData.getErrorColor());
        this.f125629g.setImageTintList(ColorStateList.valueOf(cardData.getShowError() ? cardData.getErrorColor() : -16777216));
        if (cardData.getIconRes() != null) {
            FS.Resources_setImageResource(this.f125630h, cardData.getIconRes().intValue());
            this.f125630h.setVisibility(0);
        } else {
            this.f125630h.setVisibility(4);
        }
        if (cardData.getShowLoading()) {
            setBackground(this.f125632j);
            this.f125632j.start();
            this.f125628f.setVisibility(0);
            this.f125628f.start();
            return;
        }
        setBackground(null);
        this.f125632j.stop();
        this.f125628f.setVisibility(8);
        this.f125628f.stop();
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.CardSubView
    public void setListener(CardsCarouselView.Listener listener) {
        this.listener = listener;
    }

    public final void takeFocus() {
        this.f125627e.requestFocus();
        ListenableEditText listenableEditText = this.f125627e;
        listenableEditText.setSelection(listenableEditText.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EditableCardView this$0, View view, boolean z10) {
        EditableCardData editableCardData;
        CardsCarouselView.Listener listener;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(view, "view");
        if (!z10 || (editableCardData = this$0.f125624b) == null || (listener = this$0.getListener()) == null) {
            return;
        }
        listener.onEditableFieldTapped(editableCardData, this$0.f125627e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean a(EditableCardView this$0, TextView textView, int i10, KeyEvent keyEvent) {
        Intrinsics.j(this$0, "this$0");
        Integer numValueOf = keyEvent != null ? Integer.valueOf(keyEvent.getKeyCode()) : null;
        this$0.getClass();
        if ((numValueOf == null || numValueOf.intValue() != 66) && i10 != 6 && i10 != 5) {
            return false;
        }
        this$0.finishEditing();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(EditableCardView this$0, View view) {
        CardsCarouselView.Listener listener;
        Intrinsics.j(this$0, "this$0");
        EditableCardData editableCardData = this$0.f125624b;
        if (editableCardData == null || (listener = this$0.getListener()) == null) {
            return;
        }
        listener.onCardIconTapped(editableCardData, this$0.f125625c, this$0.f125627e.getText().toString());
    }
}
