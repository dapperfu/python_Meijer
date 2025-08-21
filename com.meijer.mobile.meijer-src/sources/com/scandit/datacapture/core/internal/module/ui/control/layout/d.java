package com.scandit.datacapture.core.internal.module.ui.control.layout;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FloatWithUnitExtensionsKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final Anchor[] f126154a;

    /* renamed from: b, reason: collision with root package name */
    public static final Anchor[] f126155b;

    /* renamed from: c, reason: collision with root package name */
    public static final Anchor[] f126156c;

    /* renamed from: d, reason: collision with root package name */
    public static final Anchor[] f126157d;

    static {
        Anchor anchor = Anchor.TOP_LEFT;
        Anchor anchor2 = Anchor.TOP_CENTER;
        Anchor anchor3 = Anchor.CENTER_LEFT;
        Anchor anchor4 = Anchor.CENTER;
        Anchor anchor5 = Anchor.BOTTOM_LEFT;
        Anchor anchor6 = Anchor.BOTTOM_CENTER;
        f126154a = new Anchor[]{anchor, anchor2, anchor3, anchor4, anchor5, anchor6};
        Anchor anchor7 = Anchor.TOP_RIGHT;
        Anchor anchor8 = Anchor.CENTER_RIGHT;
        Anchor anchor9 = Anchor.BOTTOM_RIGHT;
        f126155b = new Anchor[]{anchor7, anchor8, anchor9};
        f126156c = new Anchor[]{anchor7, anchor2, anchor};
        f126157d = new Anchor[]{anchor3, anchor4, anchor8, anchor5, anchor6, anchor9};
    }

    public final void a(View view, Anchor anchor, PointWithUnit offset, Size2 containerSize) {
        Intrinsics.j(view, "view");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        Intrinsics.j(containerSize, "containerSize");
        Context context = view.getContext();
        Intrinsics.i(context, "getContext(...)");
        float displayDensity = ContextExtensionsKt.getDisplayDensity(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams.gravity = AnchorExtensionsKt.toGravity(anchor);
        FloatWithUnit x10 = offset.getX();
        Intrinsics.i(x10, "getX(...)");
        float width = containerSize.getWidth();
        if (ArraysKt.Y(f126154a, anchor)) {
            layoutParams.setMarginStart((int) FloatWithUnitExtensionsKt.toPixels(x10, width, displayDensity));
        }
        FloatWithUnit x11 = offset.getX();
        Intrinsics.i(x11, "getX(...)");
        float width2 = containerSize.getWidth();
        if (ArraysKt.Y(f126155b, anchor)) {
            layoutParams.setMarginEnd((int) FloatWithUnitExtensionsKt.toPixels(x11, width2, displayDensity));
        }
        FloatWithUnit y10 = offset.getY();
        Intrinsics.i(y10, "getY(...)");
        float height = containerSize.getHeight();
        if (ArraysKt.Y(f126156c, anchor)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) FloatWithUnitExtensionsKt.toPixels(y10, height, displayDensity);
        }
        FloatWithUnit y11 = offset.getY();
        Intrinsics.i(y11, "getY(...)");
        float height2 = containerSize.getHeight();
        if (ArraysKt.Y(f126157d, anchor)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) FloatWithUnitExtensionsKt.toPixels(y11, height2, displayDensity);
        }
        view.setLayoutParams(layoutParams);
        view.invalidate();
    }
}
