package com.meijer.mobile.core.design.widget.stepperview;

import Cj.c;
import Cj.f;
import Cj.i;
import Cj.k;
import Cj.m;
import Cj.o;
import Cj.p;
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
import com.meijer.mobile.core.design.widget.stepperview.CollapsibleStepperView;
import com.meijer.mobile.core.design.widget.stepperview.a;
import com.scandit.datacapture.core.internal.sdk.ui.cardscarousel.AnimatedGradientTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001dB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bB+\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\b\b\u0003\u0010\u0013\u001a\u00020\t2\b\b\u0003\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010\u001cJ\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J1\u0010&\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b&\u0010\rJ\u0017\u0010'\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u001cJ\u000f\u0010*\u001a\u00020\u0010H\u0002¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010+\u001a\u00020\u0010H\u0002¢\u0006\u0004\b+\u0010\u001cJ\u000f\u0010,\u001a\u00020\u0017H\u0002¢\u0006\u0004\b,\u0010-R$\u00104\u001a\u00020.2\u0006\u0010/\u001a\u00020.8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R*\u0010<\u001a\u0002052\u0006\u0010/\u001a\u0002058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R$\u0010B\u001a\u0004\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010\u0012R\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010H\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010ER\u0016\u0010J\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010ER\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010P\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010R\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bQ\u0010ER\u0016\u0010V\u001a\u00020S8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010[\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010YR\u0016\u0010\\\u001a\u00020W8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010YR\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010]R\u0018\u0010a\u001a\u00060^R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R$\u0010c\u001a\u00020\u00172\u0006\u0010/\u001a\u00020\u00178\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010]\u001a\u0004\bb\u0010-¨\u0006e"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/CollapsibleStepperView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "LXj/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "LXj/a;", "listener", "", "setOnActionListener", "(LXj/a;)V", "resId", "description", "U", "(II)V", "", "expandDisabled", "setExpandDisabled", "(Z)V", "J", "()V", "f", "LXj/u;", "viewVisibilityState", "setViewVisibility", "(LXj/u;)V", "I", "Landroid/graphics/Rect;", "getViewBoundsInWindow", "()Landroid/graphics/Rect;", "S", "M", "(I)V", "Y", "K", "X", "T", "()Z", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "value", "x", "Lcom/meijer/mobile/core/design/widget/stepperview/a;", "getControlState", "()Lcom/meijer/mobile/core/design/widget/stepperview/a;", "controlState", "LXj/t;", "y", "LXj/t;", "getValueState", "()LXj/t;", "setValueState", "(LXj/t;)V", "valueState", "z", "LXj/a;", "getActionListener", "()LXj/a;", "setActionListener", "actionListener", "Landroid/view/View;", "A", "Landroid/view/View;", "updateLoadingView", "B", "updateEntryView", "C", "addButton", "Landroid/widget/ImageButton;", "D", "Landroid/widget/ImageButton;", "increaseQuantityBtn", "E", "decreaseQuantityBtn", "F", "deleteEntryBtn", "Lcom/google/android/material/button/MaterialButton;", "G", "Lcom/google/android/material/button/MaterialButton;", "entryCountBtn", "Landroid/widget/TextView;", "H", "Landroid/widget/TextView;", "quantityText", "quantityLabelText", "limitReachedText", "Z", "Lcom/meijer/mobile/core/design/widget/stepperview/CollapsibleStepperView$a;", "L", "Lcom/meijer/mobile/core/design/widget/stepperview/CollapsibleStepperView$a;", "debounceRunnable", "getDebouncing", "debouncing", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CollapsibleStepperView extends ConstraintLayout implements n {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private View updateLoadingView;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private View updateEntryView;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private View addButton;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private ImageButton increaseQuantityBtn;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private View decreaseQuantityBtn;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private View deleteEntryBtn;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private MaterialButton entryCountBtn;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private TextView quantityText;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private TextView quantityLabelText;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private TextView limitReachedText;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    private boolean expandDisabled;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private final a debounceRunnable;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    private boolean debouncing;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private com.meijer.mobile.core.design.widget.stepperview.a controlState;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private ValueState valueState;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private Xj.a actionListener;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/core/design/widget/stepperview/CollapsibleStepperView$a;", "Ljava/lang/Runnable;", "<init>", "(Lcom/meijer/mobile/core/design/widget/stepperview/CollapsibleStepperView;)V", "", "run", "()V", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollapsibleStepperView.this.debouncing = false;
            Xj.a actionListener = CollapsibleStepperView.this.getActionListener();
            if (actionListener != null) {
                actionListener.a(CollapsibleStepperView.this.getControlState(), CollapsibleStepperView.this.getViewBoundsInWindow());
            }
            CollapsibleStepperView.this.I();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CollapsibleStepperView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.f4658l);
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

    private final void M(int defStyleRes) {
        LayoutInflater.from(new ContextThemeWrapper(getContext(), defStyleRes)).inflate(m.f4998w, this);
        this.addButton = findViewById(k.f4907b);
        this.updateLoadingView = findViewById(k.f4947o0);
        this.updateEntryView = findViewById(k.f4868I);
        this.increaseQuantityBtn = (ImageButton) findViewById(k.f4902Z);
        this.decreaseQuantityBtn = findViewById(k.f4858D);
        this.deleteEntryBtn = findViewById(k.f4862F);
        this.quantityText = (TextView) findViewById(k.f4867H0);
        this.quantityLabelText = (TextView) findViewById(k.f4865G0);
        this.entryCountBtn = (MaterialButton) findViewById(k.f4870J);
        this.limitReachedText = (TextView) findViewById(k.f4944n0);
        View view = this.addButton;
        View view2 = null;
        if (view == null) {
            Intrinsics.x("addButton");
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: Xj.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                CollapsibleStepperView.N(this.f42292a, view3);
            }
        });
        MaterialButton materialButton = this.entryCountBtn;
        if (materialButton == null) {
            Intrinsics.x("entryCountBtn");
            materialButton = null;
        }
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: Xj.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                CollapsibleStepperView.O(this.f42293a, view3);
            }
        });
        View view3 = this.deleteEntryBtn;
        if (view3 == null) {
            Intrinsics.x("deleteEntryBtn");
            view3 = null;
        }
        view3.setOnClickListener(new View.OnClickListener() { // from class: Xj.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CollapsibleStepperView.P(this.f42294a, view4);
            }
        });
        ImageButton imageButton = this.increaseQuantityBtn;
        if (imageButton == null) {
            Intrinsics.x("increaseQuantityBtn");
            imageButton = null;
        }
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: Xj.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CollapsibleStepperView.Q(this.f42295a, view4);
            }
        });
        View view4 = this.decreaseQuantityBtn;
        if (view4 == null) {
            Intrinsics.x("decreaseQuantityBtn");
        } else {
            view2 = view4;
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: Xj.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view5) {
                CollapsibleStepperView.R(this.f42296a, view5);
            }
        });
    }

    public static /* synthetic */ void V(CollapsibleStepperView collapsibleStepperView, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = i.f4803l;
        }
        if ((i12 & 2) != 0) {
            i11 = o.f5054c;
        }
        collapsibleStepperView.U(i10, i11);
    }

    public static /* synthetic */ void W(CollapsibleStepperView collapsibleStepperView, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        collapsibleStepperView.setExpandDisabled(z10);
    }

    public final void U(int resId, int description) {
        View view = this.addButton;
        View view2 = null;
        if (view == null) {
            Intrinsics.x("addButton");
            view = null;
        }
        if (view instanceof MaterialButton) {
            View view3 = this.addButton;
            if (view3 == null) {
                Intrinsics.x("addButton");
            } else {
                view2 = view3;
            }
            MaterialButton materialButton = (MaterialButton) view2;
            materialButton.setIcon(b.e(materialButton.getContext(), resId));
            materialButton.setContentDescription(materialButton.getResources().getString(description));
        }
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
        MaterialButton materialButton = this.entryCountBtn;
        if (materialButton == null) {
            Intrinsics.x("entryCountBtn");
            materialButton = null;
        }
        materialButton.setText(getQuantityText());
        if (StringsKt.b0(getValueState().getUnitOfMeasure(), "pound", true)) {
            TextView textView3 = this.quantityLabelText;
            if (textView3 == null) {
                Intrinsics.x("quantityLabelText");
                textView3 = null;
            }
            textView3.setText(getResources().getString(o.f5087s0));
            MaterialButton materialButton2 = this.entryCountBtn;
            if (materialButton2 == null) {
                Intrinsics.x("entryCountBtn");
                materialButton2 = null;
            }
            Context context = getContext();
            int i10 = o.f5032N0;
            TextView textView4 = this.quantityText;
            if (textView4 == null) {
                Intrinsics.x("quantityText");
            } else {
                textView2 = textView4;
            }
            materialButton2.setContentDescription(context.getString(i10, textView2.getText()));
        } else {
            TextView textView5 = this.quantityLabelText;
            if (textView5 == null) {
                Intrinsics.x("quantityLabelText");
                textView5 = null;
            }
            textView5.setText(getResources().getString(o.f5085r0));
            MaterialButton materialButton3 = this.entryCountBtn;
            if (materialButton3 == null) {
                Intrinsics.x("entryCountBtn");
                materialButton3 = null;
            }
            Context context2 = getContext();
            int i11 = o.f5030M0;
            TextView textView6 = this.quantityText;
            if (textView6 == null) {
                Intrinsics.x("quantityText");
            } else {
                textView2 = textView6;
            }
            materialButton3.setContentDescription(context2.getString(i11, textView2.getText()));
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

    @Override // Xj.n
    public ValueState getValueState() {
        return this.valueState;
    }

    public void setActionListener(Xj.a aVar) {
        this.actionListener = aVar;
    }

    public final void setExpandDisabled(boolean expandDisabled) {
        this.expandDisabled = expandDisabled;
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
        View view2 = this.addButton;
        if (view2 == null) {
            Intrinsics.x("addButton");
            view2 = null;
        }
        view2.setVisibility(viewVisibilityState.getAddButtonVisible() ? 0 : 8);
        View view3 = this.updateEntryView;
        if (view3 == null) {
            Intrinsics.x("updateEntryView");
            view3 = null;
        }
        view3.setVisibility(viewVisibilityState.getUpdateEntryViewVisible() ? 0 : 8);
        MaterialButton materialButton = this.entryCountBtn;
        if (materialButton == null) {
            Intrinsics.x("entryCountBtn");
            materialButton = null;
        }
        materialButton.setVisibility(viewVisibilityState.getEntryCountBtnVisible() ? 0 : 8);
        View view4 = this.deleteEntryBtn;
        if (view4 == null) {
            Intrinsics.x("deleteEntryBtn");
            view4 = null;
        }
        view4.setVisibility(viewVisibilityState.getDeleteEntryBtnVisible() ? 0 : 8);
        View view5 = this.decreaseQuantityBtn;
        if (view5 == null) {
            Intrinsics.x("decreaseQuantityBtn");
            view5 = null;
        }
        view5.setVisibility(viewVisibilityState.getDecreaseQuantityBtnVisible() ? 0 : 8);
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
    public CollapsibleStepperView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, p.f5119r);
        Intrinsics.j(context, "context");
    }

    private final void K() {
        announceForAccessibility(getResources().getString(o.f5028L0));
        setValueState(ValueState.b(getControlState().getValueState(), 0.0d, 0.0d, false, null, true, 0.0d, 47, null));
        post(new Runnable() { // from class: Xj.m
            @Override // java.lang.Runnable
            public final void run() {
                CollapsibleStepperView.L(this.f42297a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(CollapsibleStepperView collapsibleStepperView) {
        Xj.a actionListener = collapsibleStepperView.getActionListener();
        if (actionListener != null) {
            actionListener.b(collapsibleStepperView.getControlState(), collapsibleStepperView.getViewBoundsInWindow());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(CollapsibleStepperView collapsibleStepperView, View view) {
        collapsibleStepperView.Y();
        collapsibleStepperView.c();
        collapsibleStepperView.X();
        if (!collapsibleStepperView.expandDisabled) {
            collapsibleStepperView.K();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(CollapsibleStepperView collapsibleStepperView, View view) {
        collapsibleStepperView.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(CollapsibleStepperView collapsibleStepperView, View view) {
        collapsibleStepperView.Y();
        collapsibleStepperView.i();
        collapsibleStepperView.X();
        collapsibleStepperView.I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(CollapsibleStepperView collapsibleStepperView, View view) {
        collapsibleStepperView.Y();
        collapsibleStepperView.h();
        collapsibleStepperView.X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(CollapsibleStepperView collapsibleStepperView, View view) {
        collapsibleStepperView.Y();
        collapsibleStepperView.a();
        collapsibleStepperView.X();
    }

    private final void S(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        M(defStyleRes);
        J();
        setImportantForAccessibility(1);
    }

    private final boolean T() {
        return getControlState().getValueState().getIsInTransition();
    }

    private final void X() {
        Handler handler = getHandler();
        if (handler != null) {
            this.debouncing = true;
            handler.removeCallbacks(this.debounceRunnable);
            handler.postDelayed(this.debounceRunnable, AnimatedGradientTextView.ANIMATION_DURATION);
        }
    }

    private final void Y() {
        Vibrator vibrator = (Vibrator) b.j(getContext(), Vibrator.class);
        if (vibrator != null) {
            Lk.c.a(vibrator, 50L, 50);
        }
    }

    public final void I() {
        if (T()) {
            announceForAccessibility(getResources().getString(o.f5026K0));
            setValueState(ValueState.b(getControlState().getValueState(), 0.0d, 0.0d, false, null, false, 0.0d, 47, null));
            Xj.a actionListener = getActionListener();
            if (actionListener != null) {
                actionListener.b(getControlState(), getViewBoundsInWindow());
            }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollapsibleStepperView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.j(context, "context");
        this.controlState = new a.NotAdded(new ValueState(0.0d, 0.0d, false, "", false, 2.147483647E9d, 3, null));
        this.valueState = new ValueState(1.0d, 0.0d, false, "Each", false, 2.147483647E9d);
        this.debounceRunnable = new a();
        S(context, attributeSet, i10, i11);
    }
}
