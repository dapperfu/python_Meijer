package com.scandit.datacapture.barcode.internal.module.ui.viewpositioner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Segment;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f123424a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f123425b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f123426c;

    public b(Function0 referenceQuadGetter, Function0 anchorGetter, Function0 sizeGetter) {
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f123424a = referenceQuadGetter;
        this.f123425b = anchorGetter;
        this.f123426c = sizeGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        Segment segment;
        Point point;
        FrameLayout parent = (FrameLayout) viewGroup;
        Intrinsics.j(view, "view");
        Intrinsics.j(parent, "parent");
        Quadrilateral quadrilateral = (Quadrilateral) this.f123424a.invoke();
        if (quadrilateral == null) {
            return;
        }
        Anchor anchor = (Anchor) this.f123425b.invoke();
        Size2 size2 = (Size2) this.f123426c.invoke();
        if (size2 == null) {
            Intrinsics.j(view, "view");
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            size2 = new Size2(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        int[] iArr = a.f123423a;
        int i10 = iArr[anchor.ordinal()];
        if (i10 == 1) {
            Point bottomLeft = quadrilateral.getBottomLeft();
            Intrinsics.i(bottomLeft, "getBottomLeft(...)");
            Point bottomRight = quadrilateral.getBottomRight();
            Intrinsics.i(bottomRight, "getBottomRight(...)");
            segment = new Segment(bottomLeft, bottomRight);
        } else if (i10 == 2) {
            Point topLeft = quadrilateral.getTopLeft();
            Intrinsics.i(topLeft, "getTopLeft(...)");
            Point topRight = quadrilateral.getTopRight();
            Intrinsics.i(topRight, "getTopRight(...)");
            segment = new Segment(topLeft, topRight);
        } else if (i10 == 3) {
            Point bottomRight2 = quadrilateral.getBottomRight();
            Intrinsics.i(bottomRight2, "getBottomRight(...)");
            Point topRight2 = quadrilateral.getTopRight();
            Intrinsics.i(topRight2, "getTopRight(...)");
            segment = new Segment(bottomRight2, topRight2);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unsupported anchor: " + anchor);
            }
            Point bottomLeft2 = quadrilateral.getBottomLeft();
            Intrinsics.i(bottomLeft2, "getBottomLeft(...)");
            Point topLeft2 = quadrilateral.getTopLeft();
            Intrinsics.i(topLeft2, "getTopLeft(...)");
            segment = new Segment(bottomLeft2, topLeft2);
        }
        int i11 = iArr[anchor.ordinal()];
        if (i11 == 1) {
            point = new Point(size2.getWidth() / 2, 0.0f);
        } else if (i11 == 2) {
            point = new Point(size2.getWidth() / 2, size2.getHeight());
        } else if (i11 == 3) {
            point = new Point(0.0f, size2.getHeight() / 2);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Unsupported anchor: " + anchor);
            }
            point = new Point(size2.getWidth(), size2.getHeight() / 2);
        }
        Point pointMinus = PointExtensionsKt.minus(segment.getCenter(), point);
        view.setX(pointMinus.getX());
        view.setY(pointMinus.getY());
    }
}
