package com.meijer.mobile.core.base.ui.behavior;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zj.d;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0013\b\u0017\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/core/base/ui/behavior/MatchSizeBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "", "relatedViewId", "<init>", "(I)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "dependency", "", "i", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/View;Landroid/view/View;)Z", "gradientOverlay", "promotionImage", "l", "a", "I", "viewIdToMatch", "base-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MatchSizeBehavior extends CoordinatorLayout.c<View> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int viewIdToMatch;

    @JvmOverloads
    public MatchSizeBehavior() {
        this(0, 1, null);
    }

    public /* synthetic */ MatchSizeBehavior(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean i(CoordinatorLayout parent, View child, View dependency) {
        Intrinsics.j(parent, "parent");
        Intrinsics.j(child, "child");
        Intrinsics.j(dependency, "dependency");
        return this.viewIdToMatch > 0 && dependency.getId() == this.viewIdToMatch;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout parent, View gradientOverlay, View promotionImage) {
        Intrinsics.j(parent, "parent");
        Intrinsics.j(gradientOverlay, "gradientOverlay");
        Intrinsics.j(promotionImage, "promotionImage");
        gradientOverlay.getLayoutParams().height = promotionImage.getMeasuredHeight();
        gradientOverlay.setLayoutParams(gradientOverlay.getLayoutParams());
        return true;
    }

    @JvmOverloads
    public MatchSizeBehavior(int i10) {
        this.viewIdToMatch = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchSizeBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.j(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{d.f172831a}, 0, 0);
        this.viewIdToMatch = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
    }
}
