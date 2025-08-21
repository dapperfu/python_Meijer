package com.meijer.mobile.core.design.widget.stepperview;

import Cj.c;
import Cj.f;
import Cj.k;
import Cj.m;
import Cj.o;
import Cj.p;
import Cj.q;
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
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ce.C6503b;
import com.google.android.material.button.MaterialButton;
import com.meijer.mobile.core.design.widget.stepperview.StepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001iB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0018J1\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\rJ\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b#\u0010\u0011J\u000f\u0010$\u001a\u00020\u000fH\u0002¢\u0006\u0004\b$\u0010\u0018R$\u0010+\u001a\u00020%2\u0006\u0010&\u001a\u00020%8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R*\u00103\u001a\u00020,2\u0006\u0010&\u001a\u00020,8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00109\u001a\u0002042\u0006\u0010&\u001a\u0002048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010?\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010<R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010G\u001a\u00020D8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010I\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010<R\u0016\u0010K\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010<R\u0016\u0010N\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010MR\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010MR\u0016\u0010Q\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010MR\u0016\u0010S\u001a\u00020L8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010MR$\u0010Y\u001a\u0004\u0018\u00010\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u0016R\u0018\u0010]\u001a\u00060ZR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R(\u0010b\u001a\u0004\u0018\u00010^2\b\u0010&\u001a\u0004\u0018\u00010^8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\b\u0010\u0010aR$\u0010f\u001a\u0002042\u0006\u0010&\u001a\u0002048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bc\u00108\"\u0004\bd\u0010eR(\u0010h\u001a\u0004\u0018\u00010^2\b\u0010&\u001a\u0004\u0018\u00010^8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bg\u0010`\"\u0004\b\u0012\u0010a¨\u0006j"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/StepperView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LXj/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "resId", "", "setAddButtonText", "(I)V", "setLoadingText", "LXj/a;", "listener", "setOnActionListener", "(LXj/a;)V", "G", "()V", "LXj/u;", "viewVisibilityState", "setViewVisibility", "(LXj/u;)V", "f", "Landroid/graphics/Rect;", "getViewBoundsInWindow", "()Landroid/graphics/Rect;", "O", "M", "H", "N", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "value", "x", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "getControlState", "()Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "LXj/t;", "y", "LXj/t;", "getValueState", "()LXj/t;", "setValueState", "(LXj/t;)V", "valueState", "", "z", "Z", "getDebouncing", "()Z", "debouncing", "Landroid/view/View;", "A", "Landroid/view/View;", "updateLoadingView", "B", "updateEntryView", "Lcom/google/android/material/button/MaterialButton;", "C", "Lcom/google/android/material/button/MaterialButton;", "addButton", "Landroid/widget/ImageButton;", "D", "Landroid/widget/ImageButton;", "increaseQuantityBtn", "E", "decreaseQuantityBtn", "F", "deleteEntryBtn", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "quantityText", "quantityLabelText", "I", "progressTextView", "J", "limitReachedText", "K", "LXj/a;", "getActionListener", "()LXj/a;", "setActionListener", "actionListener", "Lcom/meijer/mobile/core/design/widget/stepperview/StepperView$a;", "L", "Lcom/meijer/mobile/core/design/widget/stepperview/StepperView$a;", "debounceRunnable", "", "getAddButtonText", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "addButtonText", "getAddButtonEnabled", "setAddButtonEnabled", "(Z)V", "addButtonEnabled", "getLoadingText", "loadingText", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StepperView extends ConstraintLayout implements n {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private View updateLoadingView;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private View updateEntryView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private MaterialButton addButton;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private ImageButton increaseQuantityBtn;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private View decreaseQuantityBtn;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private View deleteEntryBtn;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private TextView quantityText;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private TextView quantityLabelText;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private TextView progressTextView;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private TextView limitReachedText;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private Xj.a actionListener;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final a debounceRunnable;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.core.design.widget.stepperview.a controlState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ValueState valueState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean debouncing;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/StepperView$a;", "Ljava/lang/Runnable;", "<init>", "(Lcom/meijer/mobile/core/design/widget/stepperview/StepperView;)V", "", "run", "()V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StepperView.this.debouncing = false;
            Xj.a actionListener = StepperView.this.getActionListener();
            if (actionListener != null) {
                actionListener.a(StepperView.this.getControlState(), StepperView.this.getViewBoundsInWindow());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.f4657k);
        Intrinsics.j(context, "context");
    }

    private final void setLoadingText(CharSequence charSequence) {
        TextView textView = this.progressTextView;
        if (textView == null) {
            Intrinsics.x("progressTextView");
            textView = null;
        }
        textView.setText(charSequence);
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

    public final void setAddButtonText(CharSequence charSequence) {
        MaterialButton materialButton = this.addButton;
        if (materialButton == null) {
            Intrinsics.x("addButton");
            materialButton = null;
        }
        materialButton.setText(charSequence);
    }

    private final void H(int defStyleRes) {
        LayoutInflater.from(new ContextThemeWrapper(getContext(), defStyleRes)).inflate(m.f4975B, this);
        this.progressTextView = (TextView) findViewById(k.f4859D0);
        this.updateLoadingView = findViewById(k.f4947o0);
        this.addButton = (MaterialButton) findViewById(k.f4910c);
        this.updateEntryView = findViewById(k.f4868I);
        this.increaseQuantityBtn = (ImageButton) findViewById(k.f4902Z);
        this.decreaseQuantityBtn = findViewById(k.f4858D);
        this.deleteEntryBtn = findViewById(k.f4862F);
        this.quantityText = (TextView) findViewById(k.f4867H0);
        this.quantityLabelText = (TextView) findViewById(k.f4865G0);
        this.limitReachedText = (TextView) findViewById(k.f4944n0);
        MaterialButton materialButton = this.addButton;
        View view = null;
        if (materialButton == null) {
            Intrinsics.x("addButton");
            materialButton = null;
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: Xj.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                StepperView.I(this.f42298a, view2);
            }
        });
        View view2 = this.deleteEntryBtn;
        if (view2 == null) {
            Intrinsics.x("deleteEntryBtn");
            view2 = null;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: Xj.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StepperView.J(this.f42299a, view3);
            }
        });
        ImageButton imageButton = this.increaseQuantityBtn;
        if (imageButton == null) {
            Intrinsics.x("increaseQuantityBtn");
            imageButton = null;
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: Xj.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                StepperView.K(this.f42300a, view3);
            }
        });
        View view3 = this.decreaseQuantityBtn;
        if (view3 == null) {
            Intrinsics.x("decreaseQuantityBtn");
        } else {
            view = view3;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: Xj.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                StepperView.L(this.f42301a, view4);
            }
        });
    }

    private final CharSequence getLoadingText() {
        TextView textView = this.progressTextView;
        if (textView == null) {
            Intrinsics.x("progressTextView");
            textView = null;
        }
        return textView.getText();
    }

    @Override // Xj.n
    public void f() {
        TextView textView = this.quantityText;
        TextView textView2 = null;
        if (textView == null) {
            Intrinsics.x("quantityText");
            textView = null;
        }
        textView.setText(getQuantityText());
        if (StringsKt.b0(getValueState().getUnitOfMeasure(), "pound", true)) {
            TextView textView3 = this.quantityLabelText;
            if (textView3 == null) {
                Intrinsics.x("quantityLabelText");
            } else {
                textView2 = textView3;
            }
            textView2.setText(getResources().getString(o.f5087s0));
        }
        super.f();
    }

    public Xj.a getActionListener() {
        return this.actionListener;
    }

    public final boolean getAddButtonEnabled() {
        MaterialButton materialButton = this.addButton;
        if (materialButton == null) {
            Intrinsics.x("addButton");
            materialButton = null;
        }
        return materialButton.isEnabled();
    }

    public final CharSequence getAddButtonText() {
        MaterialButton materialButton = this.addButton;
        if (materialButton == null) {
            Intrinsics.x("addButton");
            materialButton = null;
        }
        return materialButton.getText();
    }

    @Override // Xj.n
    public com.meijer.mobile.core.design.widget.stepperview.a getControlState() {
        return this.controlState;
    }

    public final boolean getDebouncing() {
        return this.debouncing;
    }

    @Override // Xj.n
    public ValueState getValueState() {
        return this.valueState;
    }

    public void setActionListener(Xj.a aVar) {
        this.actionListener = aVar;
    }

    public final void setAddButtonEnabled(boolean z10) {
        MaterialButton materialButton = this.addButton;
        if (materialButton == null) {
            Intrinsics.x("addButton");
            materialButton = null;
        }
        materialButton.setEnabled(z10);
    }

    public final void setAddButtonText(int resId) {
        setAddButtonText(getContext().getString(resId));
    }

    public final void setLoadingText(int resId) {
        setLoadingText(getContext().getString(resId));
    }

    public final void setOnActionListener(Xj.a listener) {
        Intrinsics.j(listener, "listener");
        setActionListener(listener);
    }

    @Override // Xj.n
    public void setValueState(ValueState value) {
        Intrinsics.j(value, "value");
        this.valueState = value;
        G();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.widget.TextView] */
    @Override // Xj.n
    public void setViewVisibility(ViewVisibilityState viewVisibilityState) throws Resources.NotFoundException {
        Intrinsics.j(viewVisibilityState, "viewVisibilityState");
        View view = this.updateLoadingView;
        ImageButton imageButton = null;
        if (view == null) {
            Intrinsics.x("updateLoadingView");
            view = null;
        }
        view.setVisibility(viewVisibilityState.getUpdateLoadingVisible() ? 0 : 8);
        MaterialButton materialButton = this.addButton;
        if (materialButton == null) {
            Intrinsics.x("addButton");
            materialButton = null;
        }
        materialButton.setVisibility(viewVisibilityState.getAddButtonVisible() ? 0 : 8);
        View view2 = this.updateEntryView;
        if (view2 == null) {
            Intrinsics.x("updateEntryView");
            view2 = null;
        }
        view2.setVisibility(viewVisibilityState.getUpdateEntryViewVisible() ? 0 : 8);
        View view3 = this.deleteEntryBtn;
        if (view3 == null) {
            Intrinsics.x("deleteEntryBtn");
            view3 = null;
        }
        view3.setVisibility(viewVisibilityState.getDeleteEntryBtnVisible() ? 0 : 8);
        View view4 = this.decreaseQuantityBtn;
        if (view4 == null) {
            Intrinsics.x("decreaseQuantityBtn");
            view4 = null;
        }
        view4.setVisibility(viewVisibilityState.getDecreaseQuantityBtnVisible() ? 0 : 8);
        if (!viewVisibilityState.getIncrementEnabled()) {
            ImageButton imageButton2 = this.increaseQuantityBtn;
            if (imageButton2 == null) {
                Intrinsics.x("increaseQuantityBtn");
                imageButton2 = null;
            }
            c.a(imageButton2);
            ?? r62 = this.limitReachedText;
            if (r62 == 0) {
                Intrinsics.x("limitReachedText");
            } else {
                imageButton = r62;
            }
            imageButton.setVisibility(0);
            return;
        }
        TextView textView = this.limitReachedText;
        if (textView == null) {
            Intrinsics.x("limitReachedText");
            textView = null;
        }
        textView.setVisibility(8);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new TypedValue().data, new int[]{C6503b.f61552q});
        Intrinsics.i(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        ImageButton imageButton3 = this.increaseQuantityBtn;
        if (imageButton3 == null) {
            Intrinsics.x("increaseQuantityBtn");
        } else {
            imageButton = imageButton3;
        }
        c.b(imageButton, typedArrayObtainStyledAttributes.getColor(typedArrayObtainStyledAttributes.getIndex(0), 0));
        Unit unit = Unit.f143329a;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepperView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, p.f5118q);
        Intrinsics.j(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(StepperView stepperView, View view) {
        stepperView.O();
        stepperView.c();
        stepperView.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(StepperView stepperView, View view) {
        stepperView.O();
        stepperView.i();
        stepperView.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(StepperView stepperView, View view) {
        stepperView.O();
        stepperView.h();
        stepperView.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(StepperView stepperView, View view) {
        stepperView.O();
        stepperView.a();
        stepperView.N();
    }

    private final void M(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        H(defStyleRes);
        int[] Stepper = q.f5147Z;
        Intrinsics.i(Stepper, "Stepper");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, Stepper, defStyleAttr, defStyleRes);
        setLoadingText(typedArrayObtainStyledAttributes.getString(q.f5151b0));
        setAddButtonText(typedArrayObtainStyledAttributes.getString(q.f5149a0));
        typedArrayObtainStyledAttributes.recycle();
        G();
    }

    private final void N() {
        Handler handler = getHandler();
        if (handler != null) {
            this.debouncing = true;
            handler.removeCallbacks(this.debounceRunnable);
            handler.postDelayed(this.debounceRunnable, Xj.o.a());
        }
    }

    private final void O() {
        Vibrator vibrator = (Vibrator) b.j(getContext(), Vibrator.class);
        if (vibrator != null) {
            Lk.c.a(vibrator, 50L, 50);
        }
    }

    public void G() {
        com.meijer.mobile.core.design.widget.stepperview.a multipleQuantity;
        if (getValueState().getIsLoading()) {
            multipleQuantity = new a.Loading(getValueState());
        } else if (getValueState().getQuantity() == 0.0d) {
            multipleQuantity = new a.NotAdded(getValueState());
        } else if (getValueState().getQuantity() == getValueState().getStepperValue()) {
            multipleQuantity = new a.SingleQuantity(getValueState());
        } else {
            multipleQuantity = new a.MultipleQuantity(getValueState());
        }
        this.controlState = multipleQuantity;
        f();
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.j(context, "context");
        this.controlState = new a.NotAdded(new ValueState(0.0d, 0.0d, false, "", false, 2.147483647E9d, 3, null));
        this.valueState = new ValueState(1.0d, 0.0d, false, "Each", false, 2.147483647E9d);
        this.debounceRunnable = new a();
        M(context, attributeSet, i10, i11);
    }
}
