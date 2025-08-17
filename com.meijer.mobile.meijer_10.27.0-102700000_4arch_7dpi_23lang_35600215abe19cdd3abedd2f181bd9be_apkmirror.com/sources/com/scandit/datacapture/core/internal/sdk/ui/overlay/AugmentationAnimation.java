package com.scandit.datacapture.core.internal.sdk.ui.overlay;

import android.view.View;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.ui.animation.DynamicAnimation;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/overlay/AugmentationAnimation;", "", "Landroid/view/View;", "view", "Lcom/scandit/datacapture/core/common/geometry/Point;", "start", "<init>", "(Landroid/view/View;Lcom/scandit/datacapture/core/common/geometry/Point;)V", "final", "", "animateTo", "(Lcom/scandit/datacapture/core/common/geometry/Point;)V", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class AugmentationAnimation {

    /* renamed from: a, reason: collision with root package name */
    private final SpringAnimation f125759a;

    /* renamed from: b, reason: collision with root package name */
    private final SpringAnimation f125760b;

    public AugmentationAnimation(View view, Point start) {
        Intrinsics.j(view, "view");
        Intrinsics.j(start, "start");
        SpringAnimation springAnimation = new SpringAnimation(view, DynamicAnimation.f125976X);
        springAnimation.setStartValue(start.getX());
        this.f125759a = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(view, DynamicAnimation.f125977Y);
        springAnimation2.setStartValue(start.getY());
        this.f125760b = springAnimation2;
    }

    public final void animateTo(Point point) {
        Intrinsics.j(point, "final");
        this.f125759a.animateToFinalPosition(point.getX());
        this.f125760b.animateToFinalPosition(point.getY());
    }
}
