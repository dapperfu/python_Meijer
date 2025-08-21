package com.meijer.mobile.core.design.widget.calloutview;

import Cj.f;
import Cj.k;
import Cj.m;
import Cj.p;
import Cj.q;
import Cj.r;
import Z1.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ce.C6503b;
import com.fullstory.FS;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.meijer.mobile.core.design.widget.calloutview.ListCardView;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import ej.c;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qw.a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u000b2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u0010J\u0019\u0010\u001d\u001a\u00020\u000b2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u0018J+\u0010#\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010,\u001a\u00020%8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010&\u001a\u0004\b+\u0010(R\u001b\u00100\u001a\u00020-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b2\u0010&\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R(\u0010D\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bA\u0010B\"\u0004\b\u0017\u0010CR(\u0010F\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010B\"\u0004\b\u0019\u0010CR(\u0010J\u001a\u0004\u0018\u00010\u00112\b\u0010@\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\b\u001a\u0010IR(\u0010L\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bK\u0010B\"\u0004\b\u001b\u0010C¨\u0006M"}, d2 = {"Lcom/meijer/mobile/core/design/widget/calloutview/ListCardView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "defStyleRes", "", "s", "(Landroid/util/AttributeSet;II)V", "resId", "setTitleTextStyle", "(I)V", "Landroid/graphics/drawable/Drawable;", "actionButtonIcon", "", "actionButtonContentDescription", "u", "(Landroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "setTitle", "(Ljava/lang/Integer;)V", "setSubtitle", "setIcon", "setIconContentDescription", "tint", "setIconTint", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "Lcom/google/android/material/textview/MaterialTextView;", "Lkotlin/Lazy;", "getTitleTextView", "()Lcom/google/android/material/textview/MaterialTextView;", "titleTextView", "t", "getSubtitleTextView", "subtitleTextView", "Landroid/widget/ImageView;", "getIconView", "()Landroid/widget/ImageView;", "iconView", "Landroid/widget/FrameLayout;", "v", "getContentView", "()Landroid/widget/FrameLayout;", "contentView", "Lcom/google/android/material/button/MaterialButton;", "w", "getActionButton", "()Lcom/google/android/material/button/MaterialButton;", "actionButton", "", "x", "Ljava/util/List;", "internalIds", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "(Ljava/lang/CharSequence;)V", "title", "getSubtitle", "subtitle", "getIcon", "()Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", BarcodePickDeserializer.FIELD_ICON, "getIconContentDescription", "iconContentDescription", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class ListCardView extends MaterialCardView {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final Lazy titleTextView;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Lazy subtitleTextView;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Lazy iconView;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final Lazy contentView;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Lazy actionButton;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
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

    public final void setSubtitle(CharSequence charSequence) {
        getSubtitleTextView().setText(charSequence);
        getSubtitleTextView().setVisibility(charSequence == null || StringsKt.s0(charSequence) ? 8 : 0);
    }

    public final void setTitle(CharSequence charSequence) {
        getTitleTextView().setText(charSequence);
        getTitleTextView().setVisibility(charSequence == null || StringsKt.s0(charSequence) ? 8 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListCardView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.j(context, "context");
        Intrinsics.j(attrs, "attrs");
        this.titleTextView = LazyKt.b(new Function0() { // from class: Sj.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListCardView.w(this.f34610a);
            }
        });
        this.subtitleTextView = LazyKt.b(new Function0() { // from class: Sj.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListCardView.v(this.f34611a);
            }
        });
        this.iconView = LazyKt.b(new Function0() { // from class: Sj.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListCardView.r(this.f34612a);
            }
        });
        this.contentView = LazyKt.b(new Function0() { // from class: Sj.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListCardView.q(this.f34613a);
            }
        });
        this.actionButton = LazyKt.b(new Function0() { // from class: Sj.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ListCardView.p(this.f34614a);
            }
        });
        this.internalIds = CollectionsKt.p(Integer.valueOf(k.f4943n), Integer.valueOf(k.f4932j0), Integer.valueOf(k.f4929i0), Integer.valueOf(k.f4926h0), Integer.valueOf(k.f4920f0), Integer.valueOf(k.f4923g0));
        t(this, attrs, 0, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialButton p(ListCardView listCardView) {
        return (MaterialButton) listCardView.findViewById(k.f4920f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout q(ListCardView listCardView) {
        return (FrameLayout) listCardView.findViewById(k.f4923g0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView r(ListCardView listCardView) {
        return (ImageView) listCardView.findViewById(k.f4926h0);
    }

    private final void s(AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        c.d(this, m.f4974A, true);
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        int[] ListCardView = q.f5174y;
        Intrinsics.i(ListCardView, "ListCardView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, ListCardView, defStyleAttr, defStyleRes);
        setCardElevation(typedArrayObtainStyledAttributes.getDimension(q.f5125D, 0.0f));
        setRadius(typedArrayObtainStyledAttributes.getDimension(q.f5124C, 0.0f));
        setTitle(typedArrayObtainStyledAttributes.getString(q.f5131J));
        setSubtitle(typedArrayObtainStyledAttributes.getString(q.f5130I));
        setIcon(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, q.f5126E));
        setIconContentDescription(typedArrayObtainStyledAttributes.getString(q.f5127F));
        getActionButton().setText(typedArrayObtainStyledAttributes.getString(q.f5123B));
        if (typedArrayObtainStyledAttributes.getBoolean(q.f5129H, true)) {
            int i10 = q.f5128G;
            Context context2 = getContext();
            Intrinsics.i(context2, "getContext(...)");
            setIconTint(Integer.valueOf(typedArrayObtainStyledAttributes.getColor(i10, r.b(context2, C6503b.f61552q, null, false, 6, null))));
        } else {
            setIconTint(null);
        }
        setTitleTextStyle(typedArrayObtainStyledAttributes.getResourceId(q.f5132K, p.f5121t));
        u(__fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(typedArrayObtainStyledAttributes, q.f5122A), typedArrayObtainStyledAttributes.getString(q.f5175z));
        typedArrayObtainStyledAttributes.recycle();
    }

    static /* synthetic */ void t(ListCardView listCardView, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = f.f4654h;
        }
        if ((i12 & 4) != 0) {
            i11 = p.f5116o;
        }
        listCardView.s(attributeSet, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialTextView v(ListCardView listCardView) {
        return (MaterialTextView) listCardView.findViewById(k.f4929i0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MaterialTextView w(ListCardView listCardView) {
        return (MaterialTextView) listCardView.findViewById(k.f4932j0);
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

    public final MaterialButton getActionButton() {
        Object value = this.actionButton.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (MaterialButton) value;
    }

    public final FrameLayout getContentView() {
        Object value = this.contentView.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (FrameLayout) value;
    }

    public final ImageView getIconView() {
        Object value = this.iconView.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (ImageView) value;
    }

    public final MaterialTextView getSubtitleTextView() {
        Object value = this.subtitleTextView.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (MaterialTextView) value;
    }

    public final MaterialTextView getTitleTextView() {
        Object value = this.titleTextView.getValue();
        Intrinsics.i(value, "getValue(...)");
        return (MaterialTextView) value;
    }

    public final void setIconContentDescription(int resId) {
        setIconContentDescription(getContext().getString(resId));
    }

    public final void setIconTint(Integer tint) {
        if (tint != null) {
            getIconView().setColorFilter(tint.intValue(), PorterDuff.Mode.SRC_ATOP);
        } else {
            getIconView().setColorFilter((ColorFilter) null);
        }
    }

    private final void setTitleTextStyle(int resId) {
        androidx.core.widget.k.p(getTitleTextView(), resId);
    }

    private final void u(Drawable actionButtonIcon, String actionButtonContentDescription) {
        getActionButton().setIcon(actionButtonIcon);
        getActionButton().setIconGravity(3);
        MaterialButton actionButton = getActionButton();
        Context context = getContext();
        Intrinsics.i(context, "getContext(...)");
        actionButton.setIconTint(ColorStateList.valueOf(r.b(context, C6503b.f61552q, null, false, 6, null)));
        getActionButton().setIconTintMode(PorterDuff.Mode.SRC_IN);
        getActionButton().setContentDescription(actionButtonContentDescription);
    }

    public final Drawable getIcon() {
        return getIconView().getDrawable();
    }

    public final CharSequence getIconContentDescription() {
        return getIconView().getContentDescription();
    }

    public final CharSequence getSubtitle() {
        return getSubtitleTextView().getText();
    }

    public final CharSequence getTitle() {
        return getTitleTextView().getText();
    }

    public final void setIcon(int resId) {
        setIcon(b.e(getContext(), resId));
    }

    public final void setSubtitle(Integer resId) {
        String string;
        if (resId != null) {
            string = getContext().getString(resId.intValue());
        } else {
            string = null;
        }
        setSubtitle(string);
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
