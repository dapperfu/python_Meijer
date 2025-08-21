package com.meijer.mobile.core.design.widget.stepperview;

import Cj.c;
import Cj.f;
import Cj.o;
import Cj.p;
import Oj.u;
import Xj.ValueState;
import Xj.ViewVisibilityState;
import Xj.n;
import Z1.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ce.C6503b;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.meijer.mobile.core.design.widget.stepperview.CarouselItemStepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001QB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\fB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000eJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010\u0014J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R*\u00106\u001a\u00020/2\u0006\u0010)\u001a\u00020/8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R$\u0010<\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u001eR\u0018\u0010@\u001a\u00060=R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R$\u0010D\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u00188\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\u001aR$\u0010L\u001a\u0004\u0018\u00010E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/CarouselItemStepperView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LXj/n;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "S", "M", "(I)V", "V", "()V", "K", "U", "I", "", "T", "()Z", "LXj/a;", "listener", "setOnActionListener", "(LXj/a;)V", "J", "f", "LXj/u;", "viewVisibilityState", "setViewVisibility", "(LXj/u;)V", "Landroid/graphics/Rect;", "getViewBoundsInWindow", "()Landroid/graphics/Rect;", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "value", "x", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "getControlState", "()Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "LXj/t;", "y", "LXj/t;", "getValueState", "()LXj/t;", "setValueState", "(LXj/t;)V", "valueState", "z", "LXj/a;", "getActionListener", "()LXj/a;", "setActionListener", "actionListener", "Lcom/meijer/mobile/core/design/widget/stepperview/CarouselItemStepperView$a;", "A", "Lcom/meijer/mobile/core/design/widget/stepperview/CarouselItemStepperView$a;", "debounceRunnable", "B", "Z", "getDebouncing", "debouncing", "", "C", "Ljava/lang/String;", "getEntryCountButtonContentDescription", "()Ljava/lang/String;", "setEntryCountButtonContentDescription", "(Ljava/lang/String;)V", "entryCountButtonContentDescription", "LOj/u;", "D", "LOj/u;", "binding", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CarouselItemStepperView extends ConstraintLayout implements n {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final a debounceRunnable;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean debouncing;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private String entryCountButtonContentDescription;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private u binding;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.core.design.widget.stepperview.a controlState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ValueState valueState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Xj.a actionListener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/CarouselItemStepperView$a;", "Ljava/lang/Runnable;", "<init>", "(Lcom/meijer/mobile/core/design/widget/stepperview/CarouselItemStepperView;)V", "", "run", "()V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CarouselItemStepperView.this.debouncing = false;
            Xj.a actionListener = CarouselItemStepperView.this.getActionListener();
            if (actionListener != null) {
                actionListener.a(CarouselItemStepperView.this.getControlState(), CarouselItemStepperView.this.getViewBoundsInWindow());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselItemStepperView(Context context) {
        this(context, null);
        Intrinsics.j(context, "context");
    }

    @Override // Xj.n
    public /* bridge */ /* synthetic */ String getQuantityText() {
        return super.getQuantityText();
    }

    public Rect getViewBoundsInWindow() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        Rect rect = new Rect();
        getHitRect(rect);
        rect.set(rect.left, iArr[1], rect.right, getHeight() + iArr[1]);
        return rect;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselItemStepperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.f4656j);
        Intrinsics.j(context, "context");
    }

    private final void M(int defStyleRes) {
        u uVarC = u.c(LayoutInflater.from(new ContextThemeWrapper(getContext(), defStyleRes)), this, true);
        this.binding = uVarC;
        if (uVarC == null) {
            Intrinsics.x("binding");
            uVarC = null;
        }
        uVarC.f24422b.setOnClickListener(new View.OnClickListener() { // from class: Xj.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarouselItemStepperView.N(this.f42286a, view);
            }
        });
        uVarC.f24427g.setOnClickListener(new View.OnClickListener() { // from class: Xj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarouselItemStepperView.O(this.f42287a, view);
            }
        });
        uVarC.f24425e.setOnClickListener(new View.OnClickListener() { // from class: Xj.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarouselItemStepperView.P(this.f42288a, view);
            }
        });
        uVarC.f24428h.setOnClickListener(new View.OnClickListener() { // from class: Xj.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarouselItemStepperView.Q(this.f42289a, view);
            }
        });
        uVarC.f24423c.setOnClickListener(new View.OnClickListener() { // from class: Xj.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CarouselItemStepperView.R(this.f42290a, view);
            }
        });
    }

    @Override // Xj.n
    public void f() {
        u uVar = this.binding;
        if (uVar == null) {
            Intrinsics.x("binding");
            uVar = null;
        }
        uVar.f24432l.setText(getQuantityText());
        uVar.f24427g.setText(getQuantityText());
        if (StringsKt.b0(getValueState().getUnitOfMeasure(), "pound", true)) {
            uVar.f24431k.setText(getResources().getString(o.f5087s0));
            uVar.f24427g.setContentDescription(getContext().getString(o.f5032N0, uVar.f24432l.getText()));
            this.entryCountButtonContentDescription = getContext().getString(o.f5032N0, uVar.f24432l.getText());
        } else {
            uVar.f24431k.setText(getResources().getString(o.f5085r0));
            uVar.f24427g.setContentDescription(getContext().getString(o.f5030M0, uVar.f24432l.getText()));
            this.entryCountButtonContentDescription = getContext().getString(o.f5030M0, uVar.f24432l.getText());
        }
        super.f();
    }

    public Xj.a getActionListener() {
        return this.actionListener;
    }

    @Override // Xj.n
    public com.meijer.mobile.core.design.widget.stepperview.a getControlState() {
        return this.controlState;
    }

    public final boolean getDebouncing() {
        return this.debouncing;
    }

    public final String getEntryCountButtonContentDescription() {
        return this.entryCountButtonContentDescription;
    }

    @Override // Xj.n
    public ValueState getValueState() {
        return this.valueState;
    }

    public void setActionListener(Xj.a aVar) {
        this.actionListener = aVar;
    }

    public final void setEntryCountButtonContentDescription(String str) {
        this.entryCountButtonContentDescription = str;
    }

    public final void setOnActionListener(Xj.a listener) {
        Intrinsics.j(listener, "listener");
        setActionListener(listener);
    }

    @Override // Xj.n
    public void setValueState(ValueState value) {
        Intrinsics.j(value, "value");
        this.valueState = value;
        J();
    }

    @Override // Xj.n
    public void setViewVisibility(ViewVisibilityState viewVisibilityState) throws Resources.NotFoundException {
        Intrinsics.j(viewVisibilityState, "viewVisibilityState");
        Context context = getContext();
        u uVar = this.binding;
        if (uVar == null) {
            Intrinsics.x("binding");
            uVar = null;
        }
        ProgressBar loadingState = uVar.f24430j;
        Intrinsics.i(loadingState, "loadingState");
        loadingState.setVisibility(viewVisibilityState.getUpdateLoadingVisible() ? 0 : 8);
        MaterialButton addToCartButton = uVar.f24422b;
        Intrinsics.i(addToCartButton, "addToCartButton");
        addToCartButton.setVisibility(viewVisibilityState.getAddButtonVisible() ? 0 : 8);
        MaterialCardView entryContainer = uVar.f24426f;
        Intrinsics.i(entryContainer, "entryContainer");
        entryContainer.setVisibility(viewVisibilityState.getUpdateEntryViewVisible() ? 0 : 8);
        MaterialButton entryCountBtn = uVar.f24427g;
        Intrinsics.i(entryCountBtn, "entryCountBtn");
        entryCountBtn.setVisibility(viewVisibilityState.getEntryCountBtnVisible() ? 0 : 8);
        ImageButton deleteEntryBtn = uVar.f24425e;
        Intrinsics.i(deleteEntryBtn, "deleteEntryBtn");
        deleteEntryBtn.setVisibility(viewVisibilityState.getDeleteEntryBtnVisible() ? 0 : 8);
        ImageButton decreaseQuantityBtn = uVar.f24423c;
        Intrinsics.i(decreaseQuantityBtn, "decreaseQuantityBtn");
        decreaseQuantityBtn.setVisibility(viewVisibilityState.getDecreaseQuantityBtnVisible() ? 0 : 8);
        if (!viewVisibilityState.getIncrementEnabled()) {
            ImageButton increaseQuantityBtn = uVar.f24428h;
            Intrinsics.i(increaseQuantityBtn, "increaseQuantityBtn");
            c.a(increaseQuantityBtn);
            TextView limitReachedText = uVar.f24429i;
            Intrinsics.i(limitReachedText, "limitReachedText");
            limitReachedText.setVisibility(0);
            return;
        }
        TextView limitReachedText2 = uVar.f24429i;
        Intrinsics.i(limitReachedText2, "limitReachedText");
        limitReachedText2.setVisibility(8);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{C6503b.f61552q});
        Intrinsics.i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ImageButton increaseQuantityBtn2 = uVar.f24428h;
        Intrinsics.i(increaseQuantityBtn2, "increaseQuantityBtn");
        c.b(increaseQuantityBtn2, typedArrayObtainStyledAttributes.getColor(typedArrayObtainStyledAttributes.getIndex(0), 0));
        Unit unit = Unit.f143329a;
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void I() {
        if (T()) {
            announceForAccessibility(getResources().getString(o.f5026K0));
            setValueState(ValueState.b(getControlState().getValueState(), 0.0d, 0.0d, false, null, false, 0.0d, 47, null));
            Xj.a actionListener = getActionListener();
            if (actionListener != null) {
                actionListener.b(getControlState(), getViewBoundsInWindow());
            }
        }
    }

    private final void K() {
        announceForAccessibility(getResources().getString(o.f5028L0));
        setValueState(ValueState.b(getControlState().getValueState(), 0.0d, 0.0d, false, null, true, 0.0d, 47, null));
        post(new Runnable() { // from class: Xj.g
            @Override // java.lang.Runnable
            public final void run() {
                CarouselItemStepperView.L(this.f42291a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(CarouselItemStepperView carouselItemStepperView) {
        Xj.a actionListener = carouselItemStepperView.getActionListener();
        if (actionListener != null) {
            actionListener.b(carouselItemStepperView.getControlState(), carouselItemStepperView.getViewBoundsInWindow());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(CarouselItemStepperView carouselItemStepperView, View view) {
        carouselItemStepperView.V();
        carouselItemStepperView.c();
        carouselItemStepperView.U();
        carouselItemStepperView.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(CarouselItemStepperView carouselItemStepperView, View view) {
        carouselItemStepperView.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(CarouselItemStepperView carouselItemStepperView, View view) {
        carouselItemStepperView.V();
        carouselItemStepperView.i();
        carouselItemStepperView.U();
        carouselItemStepperView.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(CarouselItemStepperView carouselItemStepperView, View view) {
        carouselItemStepperView.V();
        carouselItemStepperView.h();
        carouselItemStepperView.U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(CarouselItemStepperView carouselItemStepperView, View view) {
        carouselItemStepperView.V();
        carouselItemStepperView.a();
        carouselItemStepperView.U();
    }

    private final void S(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        M(defStyleRes);
    }

    private final boolean T() {
        return getControlState().getValueState().getIsInTransition();
    }

    private final void U() {
        Handler handler = getHandler();
        if (handler != null) {
            this.debouncing = true;
            handler.removeCallbacks(this.debounceRunnable);
            handler.postDelayed(this.debounceRunnable, AnimatedGradientTextView.ANIMATION_DURATION);
        }
    }

    private final void V() {
        Vibrator vibrator = (Vibrator) b.j(getContext(), Vibrator.class);
        if (vibrator != null) {
            Lk.c.a(vibrator, 50L, 50);
        }
    }

    public void J() {
        com.meijer.mobile.core.design.widget.stepperview.a showQuantity;
        if (getValueState().getIsLoading()) {
            showQuantity = new a.Loading(getValueState());
        } else if (getValueState().getQuantity() > getValueState().getStepperValue() && getValueState().getIsInTransition()) {
            showQuantity = new a.MultipleQuantity(getValueState());
        } else if (getValueState().getQuantity() == getValueState().getStepperValue() && getValueState().getIsInTransition()) {
            showQuantity = new a.SingleQuantity(getValueState());
        } else if (getValueState().getQuantity() == 0.0d) {
            showQuantity = new a.NotAdded(getValueState());
        } else {
            showQuantity = new a.ShowQuantity(getValueState());
        }
        this.controlState = showQuantity;
        f();
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CarouselItemStepperView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, p.f5120s);
        Intrinsics.j(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselItemStepperView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.j(context, "context");
        this.controlState = new a.NotAdded(new ValueState(0.0d, 0.0d, false, "", false, 2.147483647E9d, 3, null));
        this.valueState = new ValueState(1.0d, 0.0d, false, "Each", false, 2.147483647E9d);
        this.debounceRunnable = new a();
        S(context, attributeSet, i10, i11);
    }
}
