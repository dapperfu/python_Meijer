package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.brushprovider;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.k;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.p;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f122737a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f122738b;

    public j(Function1 brushGetter, Function1 selectedBrushGetter) {
        Intrinsics.j(brushGetter, "brushGetter");
        Intrinsics.j(selectedBrushGetter, "selectedBrushGetter");
        this.f122737a = brushGetter;
        this.f122738b = selectedBrushGetter;
    }

    public final BarcodePickBrush a(BarcodePickState state) {
        Intrinsics.j(state, "state");
        Brush brush = (Brush) this.f122737a.invoke(state);
        if (brush == null) {
            return k.f122779b;
        }
        Intrinsics.j(brush, "brush");
        return new p(brush);
    }
}
