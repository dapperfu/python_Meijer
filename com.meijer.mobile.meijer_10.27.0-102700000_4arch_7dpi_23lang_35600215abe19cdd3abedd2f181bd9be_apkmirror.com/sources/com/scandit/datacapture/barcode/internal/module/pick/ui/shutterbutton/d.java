package com.scandit.datacapture.barcode.internal.module.pick.ui.shutterbutton;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.f;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FloatWithUnitExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* loaded from: classes11.dex */
public final class d implements com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d {

    /* renamed from: b, reason: collision with root package name */
    public static final Lazy f122808b = LazyKt.b(a.f122805a);

    /* renamed from: c, reason: collision with root package name */
    public static final Lazy f122809c = LazyKt.b(c.f122807a);

    /* renamed from: d, reason: collision with root package name */
    public static final Lazy f122810d = LazyKt.b(b.f122806a);

    /* renamed from: a, reason: collision with root package name */
    public final FloatWithUnit f122811a;

    public final int a(Context context, int i10, boolean z10) {
        int i11;
        int iIntValue;
        if (i10 == 0) {
            return (int) FloatWithUnitExtensionsKt.toPixels((FloatWithUnit) f122808b.getValue(), 0.0f, ContextExtensionsKt.getDisplayDensity(context));
        }
        int iF = RangesKt.f((int) FloatWithUnitExtensionsKt.toPixels(this.f122811a, i10, ContextExtensionsKt.getDisplayDensity(context)), 0);
        if (z10) {
            i11 = i10 / 2;
            iIntValue = ((Number) f122809c.getValue()).intValue();
        } else {
            i11 = i10 / 2;
            iIntValue = ((Number) f122810d.getValue()).intValue();
        }
        return RangesKt.k(iF, i11 - iIntValue);
    }

    public d(FloatWithUnit offset) {
        Intrinsics.j(offset, "offset");
        this.f122811a = offset;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.viewpositioner.d
    public final void a(View view, ViewGroup viewGroup) {
        f view2 = (f) view;
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.j(view2, "view");
        Intrinsics.j(parent, "parent");
        Context context = view2.getContext();
        Intrinsics.i(context, "getContext(...)");
        Size2 size = ObjectOverlayUtilsKt.getSize(parent);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        if (size.getHeight() >= size.getWidth()) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
            layoutParams.setMargins(0, 0, 0, a(context, MathKt.d(Math.max(size.getWidth(), size.getHeight())), true));
        } else {
            layoutParams.addRule(21);
            layoutParams.addRule(15);
            layoutParams.setMargins(0, 0, a(context, MathKt.d(Math.max(size.getWidth(), size.getHeight())), false), 0);
        }
        view2.setLayoutParams(layoutParams);
    }
}
