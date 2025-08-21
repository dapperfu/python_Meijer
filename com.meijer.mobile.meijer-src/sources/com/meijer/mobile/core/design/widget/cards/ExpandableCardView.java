package com.meijer.mobile.core.design.widget.cards;

import Cj.f;
import Cj.k;
import Cj.p;
import Cj.q;
import I4.C3821b;
import I4.C3822c;
import I4.t;
import I4.w;
import Oj.v;
import Z.n0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.cards.ExpandableCardView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import de.C13661a;
import ej.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import ne.InterfaceC15937a;
import ne.b;
import qw.a;
import ve.C17667a;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001bB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001b\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020'H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\f2\b\b\u0001\u0010-\u001a\u00020\nH\u0016¢\u0006\u0004\b.\u0010\u0010J\u000f\u0010/\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\nH\u0014¢\u0006\u0004\b3\u00104J-\u00107\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u00108R\u0016\u0010;\u001a\u0002098\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010I\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\b\r\u0010HR(\u0010N\u001a\u0004\u0018\u00010J2\b\u0010E\u001a\u0004\u0018\u00010J8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010L\"\u0004\b\u000f\u0010MR(\u0010P\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bO\u0010G\"\u0004\b\u0011\u0010HR\u0014\u0010T\u001a\u00020Q8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/meijer/mobile/core/design/widget/cards/ExpandableCardView;", "Lcom/google/android/material/card/MaterialCardView;", "Lne/a;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "resId", "", "setTitle", "(Ljava/lang/Integer;)V", "setIcon", "(I)V", "setIconContentDescription", "Lkotlin/Function0;", "clickAction", "o", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "", "expanded", "s", "(Z)Z", "c", "()Z", "expandedComponentIdHint", "setExpandedComponentIdHint", "getExpandedComponentIdHint", "()I", "extraSpace", "", "onCreateDrawableState", "(I)[I", "defStyleAttr", "defStyleRes", "m", "(Landroid/util/AttributeSet;II)V", "Lne/b;", "Lne/b;", "expandableWidgetHelper", "LOj/v;", "t", "LOj/v;", "binding", "", "u", "Ljava/util/List;", "internalIds", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "title", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", BarcodePickDeserializer.FIELD_ICON, "getIconContentDescription", "iconContentDescription", "Lcom/google/android/material/textview/MaterialTextView;", "getTitleTextView", "()Lcom/google/android/material/textview/MaterialTextView;", "titleTextView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "iconView", "Landroid/widget/FrameLayout;", "getContentView", "()Landroid/widget/FrameLayout;", "contentView", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "getExpandedIndicator", "()Lcom/google/android/material/checkbox/MaterialCheckBox;", "expandedIndicator", "v", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ExpandableCardView extends MaterialCardView implements InterfaceC15937a {

    /* renamed from: w, reason: collision with root package name */
    public static final int f96862w = 8;

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f96863x = {f.f4653g};

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private b expandableWidgetHelper;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private v binding;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> internalIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public final void setIcon(Drawable drawable) {
        getIconView().setImageDrawable(drawable);
        getIconView().setVisibility(drawable != null ? 0 : 8);
    }

    public final void setIconContentDescription(CharSequence charSequence) {
        getIconView().setContentDescription(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        getTitleTextView().setText(charSequence);
        getTitleTextView().setVisibility(charSequence == null || StringsKt.s0(charSequence) ? 8 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.j(context, "context");
        Intrinsics.j(attrs, "attrs");
        this.internalIds = CollectionsKt.p(Integer.valueOf(k.f4943n), Integer.valueOf(k.f4932j0), Integer.valueOf(k.f4926h0), Integer.valueOf(k.f4876M), Integer.valueOf(k.f4874L));
        n(this, attrs, 0, 0, 4, null);
    }

    private final FrameLayout getContentView() {
        v vVar = this.binding;
        if (vVar == null) {
            Intrinsics.x("binding");
            vVar = null;
        }
        FrameLayout expandableCardContent = vVar.f24437d;
        Intrinsics.i(expandableCardContent, "expandableCardContent");
        return expandableCardContent;
    }

    private final MaterialCheckBox getExpandedIndicator() {
        v vVar = this.binding;
        if (vVar == null) {
            Intrinsics.x("binding");
            vVar = null;
        }
        MaterialCheckBox expandableCardExpandableIcon = vVar.f24438e;
        Intrinsics.i(expandableCardExpandableIcon, "expandableCardExpandableIcon");
        return expandableCardExpandableIcon;
    }

    private final ImageView getIconView() {
        v vVar = this.binding;
        if (vVar == null) {
            Intrinsics.x("binding");
            vVar = null;
        }
        ImageView itemIcon = vVar.f24440g;
        Intrinsics.i(itemIcon, "itemIcon");
        return itemIcon;
    }

    private final MaterialTextView getTitleTextView() {
        v vVar = this.binding;
        if (vVar == null) {
            Intrinsics.x("binding");
            vVar = null;
        }
        MaterialTextView itemTitle = vVar.f24441h;
        Intrinsics.i(itemTitle, "itemTitle");
        return itemTitle;
    }

    private final void m(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        this.expandableWidgetHelper = new b(this);
        this.binding = v.b(c.b(this), this);
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        int[] ExpandableCardView = q.f5166q;
        Intrinsics.i(ExpandableCardView, "ExpandableCardView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, ExpandableCardView, defStyleAttr, defStyleRes);
        setCardElevation(typedArrayObtainStyledAttributes.getDimension(q.f5168s, 0.0f));
        setRadius(typedArrayObtainStyledAttributes.getDimension(q.f5167r, 0.0f));
        setTitle(typedArrayObtainStyledAttributes.getString(q.f5173x));
        setIcon(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, q.f5171v));
        setIconContentDescription(typedArrayObtainStyledAttributes.getString(q.f5172w));
        s(typedArrayObtainStyledAttributes.getBoolean(q.f5170u, false));
        setUseCompatPadding(typedArrayObtainStyledAttributes.getBoolean(q.f5169t, false));
        p(this, null, 1, null);
        typedArrayObtainStyledAttributes.recycle();
    }

    static /* synthetic */ void n(ExpandableCardView expandableCardView, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = f.f4652f;
        }
        if ((i12 & 4) != 0) {
            i11 = p.f5113l;
        }
        expandableCardView.m(attributeSet, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void p(ExpandableCardView expandableCardView, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function0 = new Function0() { // from class: Tj.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ExpandableCardView.q();
                }
            };
        }
        expandableCardView.o(function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q() {
        return Unit.f143329a;
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        a.INSTANCE.a(String.valueOf(child), new Object[0]);
        if (CollectionsKt.h0(this.internalIds, child != null ? Integer.valueOf(child.getId()) : null)) {
            super.addView(child, index, params);
        } else {
            getContentView().addView(child, index, params);
        }
    }

    @Override // ne.InterfaceC15937a
    public boolean c() {
        b bVar = this.expandableWidgetHelper;
        if (bVar == null) {
            return false;
        }
        if (bVar == null) {
            Intrinsics.x("expandableWidgetHelper");
            bVar = null;
        }
        return bVar.c();
    }

    public int getExpandedComponentIdHint() {
        b bVar = this.expandableWidgetHelper;
        if (bVar == null) {
            Intrinsics.x("expandableWidgetHelper");
            bVar = null;
        }
        return bVar.b();
    }

    public final void o(final Function0<Unit> clickAction) {
        Intrinsics.j(clickAction, "clickAction");
        v vVar = this.binding;
        if (vVar == null) {
            Intrinsics.x("binding");
            vVar = null;
        }
        vVar.getRoot().setOnClickListener(new View.OnClickListener() { // from class: Tj.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExpandableCardView.r(this.f36407a, clickAction, view);
            }
        });
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int extraSpace) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(extraSpace + 1);
        if (c()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f96863x);
        }
        Intrinsics.g(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.j(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        ViewCompat.m0(this, new Tj.a());
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof C17667a)) {
            super.onRestoreInstanceState(state);
            return;
        }
        C17667a c17667a = (C17667a) state;
        super.onRestoreInstanceState(c17667a.a());
        b bVar = this.expandableWidgetHelper;
        if (bVar == null) {
            Intrinsics.x("expandableWidgetHelper");
            bVar = null;
        }
        bVar.d(c17667a.f165811c.getOrDefault("expandableWidgetHelper", Bundle.EMPTY));
        s(c());
    }

    public void setExpandedComponentIdHint(int expandedComponentIdHint) {
        b bVar = this.expandableWidgetHelper;
        if (bVar == null) {
            Intrinsics.x("expandableWidgetHelper");
            bVar = null;
        }
        bVar.g(expandedComponentIdHint);
    }

    public final void setIconContentDescription(int resId) {
        setIconContentDescription(getContext().getString(resId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(ExpandableCardView expandableCardView, Function0 function0, View view) {
        expandableCardView.s(!expandableCardView.c());
        function0.invoke();
    }

    public final Drawable getIcon() {
        return getIconView().getDrawable();
    }

    public final CharSequence getIconContentDescription() {
        return getIconView().getContentDescription();
    }

    public final CharSequence getTitle() {
        return getTitleTextView().getText();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C17667a c17667a = new C17667a(super.onSaveInstanceState());
        n0<String, Bundle> n0Var = c17667a.f165811c;
        b bVar = this.expandableWidgetHelper;
        if (bVar == null) {
            Intrinsics.x("expandableWidgetHelper");
            bVar = null;
        }
        n0Var.put("expandableWidgetHelper", bVar.e());
        return c17667a;
    }

    public boolean s(boolean expanded) {
        int i10;
        if (c() != expanded) {
            w wVarS0 = new w().t0(new C3822c(2)).t0(new C3821b()).t0(new C3822c(1)).k0(C13661a.f128354e).i0(500L).n0(100L).d(getContentView());
            Intrinsics.i(wVarS0, "addTarget(...)");
            t.a(this, wVarS0);
        }
        FrameLayout contentView = getContentView();
        if (expanded) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        contentView.setVisibility(i10);
        getExpandedIndicator().setChecked(expanded);
        notifySubtreeAccessibilityStateChanged(this, getContentView(), 1);
        refreshDrawableState();
        b bVar = this.expandableWidgetHelper;
        if (bVar == null) {
            Intrinsics.x("expandableWidgetHelper");
            bVar = null;
        }
        return bVar.f(expanded);
    }

    public final void setIcon(int resId) {
        setIcon(Z1.b.e(getContext(), resId));
    }

    public final void setTitle(Integer resId) {
        String string;
        if (resId != null) {
            string = getContext().getString(resId.intValue());
        } else {
            string = null;
        }
        setTitle(string);
    }
}
