package com.scandit.datacapture.barcode.internal.module.ar.ui.annotations.statusicon;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Segment;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class n implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f121168a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f121169b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f121170c;

    public n(p referenceQuadGetter, q anchorGetter, r sizeGetter) {
        Intrinsics.j(referenceQuadGetter, "referenceQuadGetter");
        Intrinsics.j(anchorGetter, "anchorGetter");
        Intrinsics.j(sizeGetter, "sizeGetter");
        this.f121168a = referenceQuadGetter;
        this.f121169b = anchorGetter;
        this.f121170c = sizeGetter;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        Segment segment;
        Pair pairA;
        s view2 = (s) view;
        FrameLayout parent = (FrameLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        Quadrilateral quadrilateral = (Quadrilateral) this.f121168a.invoke();
        if (quadrilateral == null) {
            return;
        }
        Anchor anchor = (Anchor) this.f121169b.invoke();
        Size2 size2 = (Size2) this.f121170c.invoke();
        if (size2 == null) {
            Intrinsics.j(view2, "view");
            view2.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            size2 = new Size2(view2.getMeasuredWidth(), view2.getMeasuredHeight());
        }
        int[] iArr = m.f121167a;
        int i10 = iArr[anchor.ordinal()];
        if (i10 == 1) {
            Point topLeft = quadrilateral.getTopLeft();
            Intrinsics.i(topLeft, "getTopLeft(...)");
            Point topRight = quadrilateral.getTopRight();
            Intrinsics.i(topRight, "getTopRight(...)");
            segment = new Segment(topLeft, topRight);
        } else if (i10 == 2) {
            Point bottomLeft = quadrilateral.getBottomLeft();
            Intrinsics.i(bottomLeft, "getBottomLeft(...)");
            Point bottomRight = quadrilateral.getBottomRight();
            Intrinsics.i(bottomRight, "getBottomRight(...)");
            segment = new Segment(bottomLeft, bottomRight);
        } else if (i10 == 3) {
            Point topLeft2 = quadrilateral.getTopLeft();
            Intrinsics.i(topLeft2, "getTopLeft(...)");
            Point bottomLeft2 = quadrilateral.getBottomLeft();
            Intrinsics.i(bottomLeft2, "getBottomLeft(...)");
            segment = new Segment(topLeft2, bottomLeft2);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("Unsupported anchor: " + anchor);
            }
            Point topRight2 = quadrilateral.getTopRight();
            Intrinsics.i(topRight2, "getTopRight(...)");
            Point bottomRight2 = quadrilateral.getBottomRight();
            Intrinsics.i(bottomRight2, "getBottomRight(...)");
            segment = new Segment(topRight2, bottomRight2);
        }
        Point center = segment.getCenter();
        int i11 = iArr[anchor.ordinal()];
        if (i11 == 1) {
            pairA = TuplesKt.a(Float.valueOf(center.getX() - ((Number) l.f121161e.getValue()).floatValue()), Float.valueOf(center.getY() - size2.getHeight()));
        } else if (i11 == 2) {
            pairA = TuplesKt.a(Float.valueOf(center.getX() - ((Number) l.f121161e.getValue()).floatValue()), Float.valueOf(center.getY()));
        } else if (i11 == 3) {
            pairA = TuplesKt.a(Float.valueOf(center.getX() - size2.getWidth()), Float.valueOf(center.getY() - (size2.getHeight() / 2)));
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("Unsupported anchor: " + anchor);
            }
            pairA = TuplesKt.a(Float.valueOf(center.getX()), Float.valueOf(center.getY() - (size2.getHeight() / 2)));
        }
        float fFloatValue = ((Number) pairA.a()).floatValue();
        float fFloatValue2 = ((Number) pairA.b()).floatValue();
        view2.setX(fFloatValue);
        view2.setY(fFloatValue2);
        if (anchor == Anchor.TOP_CENTER || anchor == Anchor.BOTTOM_CENTER) {
            view2.f121175a.setX((center.getX() - fFloatValue) - ((Number) l.f121162f.getValue()).floatValue());
        }
    }
}
